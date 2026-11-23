package com.FF.voiceengine.mgr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    public static void SaveLogcat(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -v time -d ").getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedWriter.close();
                    return;
                } else {
                    bufferedWriter.write(line);
                    bufferedWriter.write("\n");
                }
            }
        } catch (Exception unused) {
        }
    }
}
