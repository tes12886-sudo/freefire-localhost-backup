//@category Export
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExportDecompiled extends GhidraScript {
    @Override
    public void run() throws Exception {
        String[] args = getScriptArgs();
        String outPath = args.length > 0 ? args[0] : "decompiled.c";
        int max = args.length > 1 ? Integer.parseInt(args[1]) : 5000;
        java.io.File outFile = new java.io.File(outPath);
        if (outFile.isDirectory() || outPath.endsWith("\\") || outPath.endsWith("/")) {
            outFile = new java.io.File(outFile, currentProgram.getName().replaceAll("[^A-Za-z0-9_.-]", "_") + ".c");
            outPath = outFile.getAbsolutePath();
        }

        DecompInterface di = new DecompInterface();
        di.openProgram(currentProgram);
        int n = 0, ok = 0;
        try (PrintWriter w = new PrintWriter(new FileWriter(outPath, true))) {
            w.println("// Program: " + currentProgram.getName());
            w.println("// ImageBase: " + currentProgram.getImageBase());
            for (Function f : currentProgram.getFunctionManager().getFunctions(true)) {
                if (n >= max) break;
                n++;
                try {
                    DecompileResults r = di.decompileFunction(f, 60, monitor);
                    if (r != null && r.decompileCompleted()) {
                        w.println("\n// ===== " + f.getName() + " @ " + f.getEntryPoint() + " =====");
                        w.println(r.getDecompiledFunction().getC());
                        ok++;
                    }
                } catch (Exception e) {
                    w.println("\n// ERROR " + f.getName() + ": " + e.getMessage());
                }
                if (ok % 250 == 0 && ok > 0) println("decompiled " + ok);
            }
        }
        println("DONE " + currentProgram.getName() + " functions=" + n + " ok=" + ok);
    }
}
