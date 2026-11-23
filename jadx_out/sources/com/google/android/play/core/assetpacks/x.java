package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class x extends j.d.a.d.a.b.v {
    private final File a;
    private final File b;
    private final NavigableMap<Long, File> c = new TreeMap();

    x(File file, File file2) throws IOException {
        this.a = file;
        this.b = file2;
        List<File> listA = a2.a(file, file2);
        if (listA.isEmpty()) {
            throw new k0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : listA) {
            this.c.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    private final InputStream j(long j2, Long l2) {
        FileInputStream fileInputStream = new FileInputStream((File) this.c.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new k0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l2));
    }

    @Override // j.d.a.d.a.b.v
    public final long b() {
        Map.Entry<Long, File> entryLastEntry = this.c.lastEntry();
        return entryLastEntry.getKey().longValue() + entryLastEntry.getValue().length();
    }

    @Override // j.d.a.d.a.b.v
    protected final InputStream c(long j2, long j3) {
        if (j2 < 0 || j3 < 0) {
            throw new k0(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2 + j3;
        if (j4 > b()) {
            throw new k0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(b()), Long.valueOf(j4)));
        }
        Long lFloorKey = this.c.floorKey(Long.valueOf(j2));
        Long lFloorKey2 = this.c.floorKey(Long.valueOf(j4));
        if (lFloorKey.equals(lFloorKey2)) {
            return new w(j(j2, lFloorKey), j3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(j(j2, lFloorKey));
        Collection<File> collectionValues = this.c.subMap(lFloorKey, false, lFloorKey2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new k1(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new w(new FileInputStream((File) this.c.get(lFloorKey2)), j3 - (lFloorKey2.longValue() - j2)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
