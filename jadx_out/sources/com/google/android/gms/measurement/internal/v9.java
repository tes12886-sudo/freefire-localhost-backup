package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.hd;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.td;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v9 implements w5 {
    private static volatile v9 B;
    private final s4 a;
    private final x3 b;
    private j c;
    private z3 d;
    private k9 e;
    private sa f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x9 f1288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i7 f1289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s8 f1290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n9 f1291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a5 f1292k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f1295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<Runnable> f1296o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;
    private final Map<String, g> z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1293l = false;
    private final ba A = new t9(this);

    v9(w9 w9Var, a5 a5Var) {
        com.google.android.gms.common.internal.q.k(w9Var);
        this.f1292k = a5.h(w9Var.a, null, null);
        this.y = -1L;
        this.f1291j = new n9(this);
        x9 x9Var = new x9(this);
        x9Var.l();
        this.f1288g = x9Var;
        x3 x3Var = new x3(this);
        x3Var.l();
        this.b = x3Var;
        s4 s4Var = new s4(this);
        s4Var.l();
        this.a = s4Var;
        this.z = new HashMap();
        f().r(new o9(this, w9Var));
    }

    static /* synthetic */ void B(v9 v9Var, w9 w9Var) {
        v9Var.f().h();
        j jVar = new j(v9Var);
        jVar.l();
        v9Var.c = jVar;
        f fVarS = v9Var.S();
        s4 s4Var = v9Var.a;
        com.google.android.gms.common.internal.q.k(s4Var);
        fVarS.k(s4Var);
        s8 s8Var = new s8(v9Var);
        s8Var.l();
        v9Var.f1290i = s8Var;
        sa saVar = new sa(v9Var);
        saVar.l();
        v9Var.f = saVar;
        i7 i7Var = new i7(v9Var);
        i7Var.l();
        v9Var.f1289h = i7Var;
        k9 k9Var = new k9(v9Var);
        k9Var.l();
        v9Var.e = k9Var;
        v9Var.d = new z3(v9Var);
        if (v9Var.p != v9Var.q) {
            v9Var.d().o().c("Not all upload components initialized", Integer.valueOf(v9Var.p), Integer.valueOf(v9Var.q));
        }
        v9Var.f1293l = true;
    }

    static final void D(com.google.android.gms.internal.measurement.j4 j4Var, int i2, String str) {
        List<com.google.android.gms.internal.measurement.o4> listW = j4Var.w();
        for (int i3 = 0; i3 < listW.size(); i3++) {
            if ("_err".equals(listW.get(i3).y())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.n4 n4VarK = com.google.android.gms.internal.measurement.o4.K();
        n4VarK.w("_err");
        n4VarK.z(Long.valueOf(i2).longValue());
        com.google.android.gms.internal.measurement.o4 o4VarP = n4VarK.p();
        com.google.android.gms.internal.measurement.n4 n4VarK2 = com.google.android.gms.internal.measurement.o4.K();
        n4VarK2.w("_ev");
        n4VarK2.x(str);
        com.google.android.gms.internal.measurement.o4 o4VarP2 = n4VarK2.p();
        j4Var.B(o4VarP);
        j4Var.B(o4VarP2);
    }

    static final void E(com.google.android.gms.internal.measurement.j4 j4Var, String str) {
        List<com.google.android.gms.internal.measurement.o4> listW = j4Var.w();
        for (int i2 = 0; i2 < listW.size(); i2++) {
            if (str.equals(listW.get(i2).y())) {
                j4Var.G(i2);
                return;
            }
        }
    }

    public static v9 F(Context context) {
        com.google.android.gms.common.internal.q.k(context);
        com.google.android.gms.common.internal.q.k(context.getApplicationContext());
        if (B == null) {
            synchronized (v9.class) {
                if (B == null) {
                    w9 w9Var = new w9(context);
                    com.google.android.gms.common.internal.q.k(w9Var);
                    B = new v9(w9Var, null);
                }
            }
        }
        return B;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0396 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x03ae A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03c7 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03dd A[Catch: all -> 0x0d4b, TRY_ENTER, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x03ef A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0406  */
    /* JADX WARN: Code duplicated, block: B:125:0x0408 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x043c  */
    /* JADX WARN: Code duplicated, block: B:133:0x043d A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x044e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0455 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x045f A[Catch: all -> 0x0d4b, LOOP:3: B:136:0x044f->B:140:0x045f, LOOP_END, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x047e  */
    /* JADX WARN: Code duplicated, block: B:145:0x048b A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x049c  */
    /* JADX WARN: Code duplicated, block: B:155:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x04df  */
    /* JADX WARN: Code duplicated, block: B:158:0x04e5 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x04f4 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0507  */
    /* JADX WARN: Code duplicated, block: B:170:0x0538  */
    /* JADX WARN: Code duplicated, block: B:172:0x0544  */
    /* JADX WARN: Code duplicated, block: B:173:0x0547 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0630 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0648 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x065b A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0670 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x06cb A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x06d6 A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x06dc A[Catch: all -> 0x0d4b, TryCatch #2 {all -> 0x0d4b, blocks: (B:3:0x0012, B:5:0x002a, B:8:0x0032, B:9:0x005a, B:12:0x006e, B:15:0x0095, B:17:0x00cb, B:20:0x00dd, B:22:0x00e7, B:210:0x068b, B:24:0x011c, B:26:0x012a, B:29:0x014a, B:31:0x0150, B:33:0x0162, B:35:0x0170, B:37:0x0180, B:38:0x018d, B:39:0x0192, B:42:0x01ab, B:111:0x03c7, B:112:0x03d3, B:115:0x03dd, B:121:0x0400, B:118:0x03ef, B:143:0x047f, B:145:0x048b, B:148:0x049e, B:150:0x04af, B:152:0x04bb, B:199:0x0620, B:201:0x062a, B:203:0x0630, B:204:0x0644, B:205:0x0648, B:207:0x065b, B:208:0x0670, B:209:0x0678, B:158:0x04e5, B:160:0x04f4, B:163:0x0509, B:165:0x051b, B:167:0x0527, B:173:0x0547, B:175:0x055d, B:177:0x0569, B:180:0x057c, B:182:0x0590, B:184:0x05d9, B:186:0x05e0, B:188:0x05e6, B:190:0x05f0, B:192:0x05f7, B:194:0x05fd, B:196:0x0607, B:197:0x0619, B:125:0x0408, B:127:0x0414, B:129:0x0420, B:141:0x0465, B:133:0x043d, B:136:0x044f, B:138:0x0455, B:140:0x045f, B:68:0x0209, B:71:0x0213, B:73:0x0221, B:77:0x0262, B:74:0x023b, B:76:0x0249, B:80:0x026b, B:83:0x029c, B:84:0x02c6, B:86:0x02fd, B:88:0x0303, B:91:0x030f, B:93:0x0345, B:94:0x0360, B:96:0x0366, B:98:0x0374, B:102:0x0388, B:99:0x037d, B:105:0x038f, B:108:0x0396, B:109:0x03ae, B:215:0x06aa, B:217:0x06b8, B:219:0x06c3, B:230:0x06f7, B:220:0x06cb, B:222:0x06d6, B:224:0x06dc, B:227:0x06e8, B:229:0x06f2, B:233:0x06fe, B:234:0x070a, B:237:0x0712, B:239:0x0724, B:240:0x0730, B:242:0x0738, B:246:0x075d, B:248:0x0782, B:250:0x0793, B:252:0x0799, B:254:0x07a5, B:255:0x07d6, B:257:0x07dc, B:259:0x07ea, B:260:0x07ee, B:261:0x07f1, B:262:0x07f4, B:263:0x0802, B:265:0x0808, B:267:0x0818, B:268:0x081f, B:270:0x082b, B:271:0x0832, B:272:0x0835, B:274:0x0873, B:275:0x0886, B:277:0x088c, B:280:0x08a4, B:282:0x08bf, B:284:0x08d6, B:286:0x08db, B:288:0x08df, B:290:0x08e3, B:292:0x08ed, B:293:0x08f7, B:295:0x08fb, B:297:0x0901, B:298:0x0911, B:299:0x091a, B:366:0x0b63, B:300:0x0926, B:302:0x093d, B:308:0x0959, B:310:0x097b, B:311:0x0983, B:313:0x0989, B:315:0x099b, B:322:0x09c4, B:323:0x09e4, B:325:0x09f0, B:327:0x0a05, B:329:0x0a46, B:333:0x0a5e, B:335:0x0a65, B:337:0x0a74, B:339:0x0a78, B:341:0x0a7c, B:343:0x0a80, B:344:0x0a8e, B:346:0x0a94, B:348:0x0ab0, B:349:0x0ab5, B:365:0x0b60, B:350:0x0acf, B:352:0x0ad7, B:356:0x0afe, B:358:0x0b2a, B:360:0x0b36, B:361:0x0b46, B:363:0x0b50, B:353:0x0ae4, B:320:0x09af, B:306:0x0944, B:367:0x0b6c, B:369:0x0b79, B:370:0x0b7f, B:371:0x0b87, B:373:0x0b8d, B:376:0x0ba7, B:378:0x0bb8, B:398:0x0c2c, B:400:0x0c32, B:402:0x0c48, B:405:0x0c4f, B:410:0x0c80, B:406:0x0c57, B:408:0x0c63, B:409:0x0c69, B:411:0x0c90, B:412:0x0ca8, B:415:0x0cb0, B:416:0x0cb5, B:417:0x0cc5, B:419:0x0cdf, B:420:0x0cfa, B:422:0x0d04, B:427:0x0d27, B:426:0x0d14, B:379:0x0bd0, B:381:0x0bd6, B:383:0x0be0, B:385:0x0be7, B:391:0x0bf7, B:393:0x0bfe, B:395:0x0c1d, B:397:0x0c24, B:396:0x0c21, B:392:0x0bfb, B:384:0x0be4, B:243:0x073d, B:245:0x0743, B:430:0x0d39), top: B:441:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:328:0x0a44 A[PHI: r11
  0x0a44: PHI (r11v17 com.google.android.gms.measurement.internal.p) = (r11v16 com.google.android.gms.measurement.internal.p), (r11v30 com.google.android.gms.measurement.internal.p) binds: [B:324:0x09ee, B:326:0x0a03] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:453:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ed  */
    private final boolean G(String str, long j2) {
        String str2;
        long j3;
        com.google.android.gms.internal.measurement.r4 r4Var;
        u9 u9Var;
        long j4;
        int iV;
        com.google.android.gms.internal.measurement.o4 o4VarM;
        Long lValueOf;
        String str3;
        long jLongValue;
        boolean z;
        int i2;
        String str4;
        int i3;
        int i4;
        com.google.android.gms.internal.measurement.r4 r4Var2;
        String str5;
        String str6;
        String str7;
        com.google.android.gms.internal.measurement.j4 j4Var;
        int i5;
        Long l2;
        p3 p3VarR;
        String str8;
        Object objX;
        com.google.android.gms.internal.measurement.j4 j4Var2;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        String strA;
        int iCharCount;
        int iCodePointAt;
        byte b;
        String str9 = "_sc";
        String str10 = "_sn";
        String str11 = "_npa";
        String str12 = "_ai";
        j jVar = this.c;
        Q(jVar);
        jVar.M();
        try {
            u9 u9Var2 = new u9(this, null);
            j jVar2 = this.c;
            Q(jVar2);
            jVar2.I(null, j2, this.y, u9Var2);
            List<com.google.android.gms.internal.measurement.k4> list = u9Var2.c;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.r4 r4VarS = u9Var2.a.s();
                r4VarS.w0();
                boolean zW = S().w(u9Var2.a.x(), f3.U);
                com.google.android.gms.internal.measurement.j4 j4Var3 = null;
                com.google.android.gms.internal.measurement.j4 j4Var4 = null;
                int i9 = -1;
                int i10 = -1;
                int i11 = 0;
                long j5 = 0;
                int i12 = 0;
                boolean z2 = false;
                while (true) {
                    String str13 = "_et";
                    str2 = str11;
                    String str14 = str9;
                    String str15 = str10;
                    if (i11 >= u9Var2.c.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.j4 j4VarS = u9Var2.c.get(i11).s();
                    s4 s4Var = this.a;
                    Q(s4Var);
                    int i13 = i11;
                    if (s4Var.t(u9Var2.a.x(), j4VarS.H())) {
                        d().r().c("Dropping blacklisted raw event. appId", r3.x(u9Var2.a.x()), this.f1292k.H().p(j4VarS.H()));
                        s4 s4Var2 = this.a;
                        Q(s4Var2);
                        if (!s4Var2.w(u9Var2.a.x())) {
                            s4 s4Var3 = this.a;
                            Q(s4Var3);
                            if (!s4Var3.x(u9Var2.a.x()) && !"_err".equals(j4VarS.H())) {
                                b0().A(this.A, u9Var2.a.x(), 11, "_ev", j4VarS.H(), 0, S().w(null, f3.v0));
                            }
                        }
                        str3 = str12;
                        r4Var2 = r4VarS;
                        jLongValue = j5;
                        str7 = str14;
                        str6 = str15;
                        i5 = i13;
                        z = zW;
                    } else {
                        if (j4VarS.H().equals(y5.a(str12))) {
                            j4VarS.I(str12);
                            d().w().a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(d().z(), 5)) {
                                int i14 = 0;
                                while (i14 < j4VarS.x()) {
                                    String str16 = str12;
                                    if ("ad_platform".equals(j4VarS.y(i14).y()) && !TextUtils.isEmpty(j4VarS.y(i14).A()) && "admob".equalsIgnoreCase(j4VarS.y(i14).A())) {
                                        d().t().a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i14++;
                                    str12 = str16;
                                }
                            }
                        }
                        str3 = str12;
                        s4 s4Var4 = this.a;
                        Q(s4Var4);
                        boolean zU = s4Var4.u(u9Var2.a.x(), j4VarS.H());
                        if (zU) {
                            jLongValue = j5;
                            z = zW;
                        } else {
                            Q(this.f1288g);
                            String strH = j4VarS.H();
                            com.google.android.gms.common.internal.q.g(strH);
                            jLongValue = j5;
                            int iHashCode = strH.hashCode();
                            z = zW;
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strH.equals("_ui")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strH.equals("_ug")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strH.equals("_in")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b != 0 && b != 1 && b != 2) {
                                r4VarS = r4VarS;
                                i2 = i9;
                                i3 = i10;
                                str4 = "_et";
                                zU = false;
                            }
                            if (zU) {
                                arrayList = new ArrayList(j4VarS.w());
                                i7 = -1;
                                i8 = -1;
                                for (i6 = 0; i6 < arrayList.size(); i6++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.o4) arrayList.get(i6)).y())) {
                                        i7 = i6;
                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.o4) arrayList.get(i6)).y())) {
                                        i8 = i6;
                                    }
                                }
                                if (i7 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.o4) arrayList.get(i7)).B() || ((com.google.android.gms.internal.measurement.o4) arrayList.get(i7)).G()) {
                                        if (i8 == -1) {
                                            strA = ((com.google.android.gms.internal.measurement.o4) arrayList.get(i8)).A();
                                            if (strA.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strA.length()) {
                                                    iCodePointAt = strA.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        d().t().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        j4VarS.G(i7);
                                        E(j4VarS, "_c");
                                        D(j4VarS, 19, "currency");
                                        break;
                                    }
                                    d().t().a("Value must be specified with a numeric type.");
                                    j4VarS.G(i7);
                                    E(j4VarS, "_c");
                                    D(j4VarS, 18, "value");
                                }
                            }
                            if ("_e".equals(j4VarS.H())) {
                                Q(this.f1288g);
                                if (x9.m(j4VarS.p(), "_fr") == null) {
                                    i4 = i3;
                                    r4Var2 = r4VarS;
                                    i9 = i2;
                                } else if (j4Var4 != null || Math.abs(j4Var4.J() - j4VarS.J()) > 1000) {
                                    i4 = i3;
                                    r4Var2 = r4VarS;
                                    j4Var3 = j4VarS;
                                    i9 = i12;
                                } else {
                                    com.google.android.gms.internal.measurement.j4 j4VarClone = j4Var4.clone();
                                    if (I(j4VarS, j4VarClone)) {
                                        i4 = i3;
                                        r4Var2 = r4VarS;
                                        r4Var2.t0(i4, j4VarClone);
                                        i9 = i2;
                                        j4Var2 = null;
                                        j4Var4 = null;
                                    } else {
                                        i4 = i3;
                                        r4Var2 = r4VarS;
                                        j4Var2 = j4VarS;
                                        i9 = i12;
                                    }
                                    j4Var3 = j4Var2;
                                }
                                str7 = str14;
                                str6 = str15;
                                str5 = str4;
                            } else {
                                i4 = i3;
                                r4Var2 = r4VarS;
                                if ("_vs".equals(j4VarS.H())) {
                                    Q(this.f1288g);
                                    str5 = str4;
                                    if (x9.m(j4VarS.p(), str5) == null) {
                                        i9 = i2;
                                    } else if (j4Var3 != null || Math.abs(j4Var3.J() - j4VarS.J()) > 1000) {
                                        i9 = i2;
                                        j4Var4 = j4VarS;
                                        i4 = i12;
                                    } else {
                                        com.google.android.gms.internal.measurement.j4 j4VarClone2 = j4Var3.clone();
                                        if (I(j4VarClone2, j4VarS)) {
                                            i9 = i2;
                                            r4Var2.t0(i9, j4VarClone2);
                                            j4Var = null;
                                            j4Var3 = null;
                                        } else {
                                            i9 = i2;
                                            j4Var = j4VarS;
                                            i4 = i12;
                                        }
                                        j4Var4 = j4Var;
                                    }
                                } else {
                                    i9 = i2;
                                    str5 = str4;
                                    if (!S().w(u9Var2.a.x(), f3.k0) && "_ab".equals(j4VarS.H())) {
                                        Q(this.f1288g);
                                        if (x9.m(j4VarS.p(), str5) == null && j4Var3 != null && Math.abs(j4Var3.J() - j4VarS.J()) <= 4000) {
                                            com.google.android.gms.internal.measurement.j4 j4VarClone3 = j4Var3.clone();
                                            J(j4VarClone3, j4VarS);
                                            com.google.android.gms.common.internal.q.a("_e".equals(j4VarClone3.H()));
                                            Q(this.f1288g);
                                            str6 = str15;
                                            com.google.android.gms.internal.measurement.o4 o4VarM2 = x9.m(j4VarClone3.p(), str6);
                                            Q(this.f1288g);
                                            str7 = str14;
                                            com.google.android.gms.internal.measurement.o4 o4VarM3 = x9.m(j4VarClone3.p(), str7);
                                            Q(this.f1288g);
                                            com.google.android.gms.internal.measurement.o4 o4VarM4 = x9.m(j4VarClone3.p(), "_si");
                                            String strA2 = o4VarM2 != null ? o4VarM2.A() : "";
                                            if (!TextUtils.isEmpty(strA2)) {
                                                Q(this.f1288g);
                                                x9.N(j4VarS, str6, strA2);
                                            }
                                            String strA3 = o4VarM3 != null ? o4VarM3.A() : "";
                                            if (!TextUtils.isEmpty(strA3)) {
                                                Q(this.f1288g);
                                                x9.N(j4VarS, str7, strA3);
                                            }
                                            if (o4VarM4 != null) {
                                                Q(this.f1288g);
                                                x9.N(j4VarS, "_si", Long.valueOf(o4VarM4.C()));
                                            }
                                            r4Var2.t0(i9, j4VarClone3);
                                            j4Var3 = null;
                                        }
                                    }
                                }
                                str7 = str14;
                                str6 = str15;
                            }
                            if (!z && "_e".equals(j4VarS.H())) {
                                if (j4VarS.x() == 0) {
                                    p3VarR = d().r();
                                    str8 = "Engagement event does not contain any parameters. appId";
                                    objX = r3.x(u9Var2.a.x());
                                } else {
                                    Q(this.f1288g);
                                    l2 = (Long) x9.n(j4VarS.p(), str5);
                                    if (l2 == null) {
                                        p3VarR = d().r();
                                        str8 = "Engagement event does not include duration. appId";
                                        objX = r3.x(u9Var2.a.x());
                                    } else {
                                        jLongValue += l2.longValue();
                                    }
                                }
                                p3VarR.b(str8, objX);
                            }
                            i5 = i13;
                            u9Var2.c.set(i5, j4VarS.p());
                            i12++;
                            r4Var2.u0(j4VarS);
                            i10 = i4;
                        }
                        i2 = i9;
                        int i15 = 0;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            str4 = str13;
                            if (i15 >= j4VarS.x()) {
                                break;
                            }
                            if ("_c".equals(j4VarS.y(i15).y())) {
                                com.google.android.gms.internal.measurement.n4 n4VarS = j4VarS.y(i15).s();
                                n4VarS.z(1L);
                                j4VarS.z(i15, n4VarS.p());
                                z3 = true;
                            } else if ("_r".equals(j4VarS.y(i15).y())) {
                                com.google.android.gms.internal.measurement.n4 n4VarS2 = j4VarS.y(i15).s();
                                n4VarS2.z(1L);
                                j4VarS.z(i15, n4VarS2.p());
                                z4 = true;
                            }
                            i15++;
                            str13 = str4;
                        }
                        if (!z3 && zU) {
                            d().w().b("Marking event as conversion", this.f1292k.H().p(j4VarS.H()));
                            com.google.android.gms.internal.measurement.n4 n4VarK = com.google.android.gms.internal.measurement.o4.K();
                            n4VarK.w("_c");
                            n4VarK.z(1L);
                            j4VarS.C(n4VarK);
                        }
                        if (!z4) {
                            d().w().b("Marking event as real-time", this.f1292k.H().p(j4VarS.H()));
                            com.google.android.gms.internal.measurement.n4 n4VarK2 = com.google.android.gms.internal.measurement.o4.K();
                            n4VarK2.w("_r");
                            n4VarK2.z(1L);
                            j4VarS.C(n4VarK2);
                        }
                        j jVar3 = this.c;
                        Q(jVar3);
                        i3 = i10;
                        if (jVar3.e0(f0(), u9Var2.a.x(), false, false, false, false, true).e > S().t(u9Var2.a.x(), f3.f1200o)) {
                            E(j4VarS, "_r");
                        } else {
                            z2 = true;
                        }
                        if (ca.j0(j4VarS.H()) && zU) {
                            j jVar4 = this.c;
                            Q(jVar4);
                            if (jVar4.e0(f0(), u9Var2.a.x(), false, false, true, false, false).c > S().t(u9Var2.a.x(), f3.f1199n)) {
                                d().r().b("Too many conversions. Not logging as conversion. appId", r3.x(u9Var2.a.x()));
                                boolean z5 = false;
                                int i16 = -1;
                                com.google.android.gms.internal.measurement.n4 n4VarS3 = null;
                                for (int i17 = 0; i17 < j4VarS.x(); i17++) {
                                    com.google.android.gms.internal.measurement.o4 o4VarY = j4VarS.y(i17);
                                    if ("_c".equals(o4VarY.y())) {
                                        n4VarS3 = o4VarY.s();
                                        i16 = i17;
                                    } else if ("_err".equals(o4VarY.y())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (n4VarS3 != null) {
                                        j4VarS.G(i16);
                                    } else {
                                        n4VarS3 = null;
                                        if (n4VarS3 != null) {
                                            com.google.android.gms.internal.measurement.n4 n4Var = (com.google.android.gms.internal.measurement.n4) n4VarS3.clone();
                                            n4Var.w("_err");
                                            n4Var.z(10L);
                                            j4VarS.z(i16, n4Var.p());
                                        } else {
                                            d().o().b("Did not find conversion parameter. appId", r3.x(u9Var2.a.x()));
                                        }
                                    }
                                } else if (n4VarS3 != null) {
                                    com.google.android.gms.internal.measurement.n4 n4Var2 = (com.google.android.gms.internal.measurement.n4) n4VarS3.clone();
                                    n4Var2.w("_err");
                                    n4Var2.z(10L);
                                    j4VarS.z(i16, n4Var2.p());
                                } else {
                                    d().o().b("Did not find conversion parameter. appId", r3.x(u9Var2.a.x()));
                                }
                            }
                        }
                        if (zU) {
                            arrayList = new ArrayList(j4VarS.w());
                            i7 = -1;
                            i8 = -1;
                            while (i6 < arrayList.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.o4) arrayList.get(i6)).y())) {
                                    i7 = i6;
                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.o4) arrayList.get(i6)).y())) {
                                    i8 = i6;
                                }
                            }
                            if (i7 != -1) {
                                if (((com.google.android.gms.internal.measurement.o4) arrayList.get(i7)).B()) {
                                }
                                if (i8 == -1) {
                                    strA = ((com.google.android.gms.internal.measurement.o4) arrayList.get(i8)).A();
                                    if (strA.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strA.length()) {
                                            iCodePointAt = strA.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                d().t().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                j4VarS.G(i7);
                                E(j4VarS, "_c");
                                D(j4VarS, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(j4VarS.H())) {
                            Q(this.f1288g);
                            if (x9.m(j4VarS.p(), "_fr") == null) {
                                i4 = i3;
                                r4Var2 = r4VarS;
                                i9 = i2;
                            } else if (j4Var4 != null) {
                                i4 = i3;
                                r4Var2 = r4VarS;
                                j4Var3 = j4VarS;
                                i9 = i12;
                            } else {
                                i4 = i3;
                                r4Var2 = r4VarS;
                                j4Var3 = j4VarS;
                                i9 = i12;
                            }
                            str7 = str14;
                            str6 = str15;
                            str5 = str4;
                        } else {
                            i4 = i3;
                            r4Var2 = r4VarS;
                            if ("_vs".equals(j4VarS.H())) {
                                Q(this.f1288g);
                                str5 = str4;
                                if (x9.m(j4VarS.p(), str5) == null) {
                                    i9 = i2;
                                } else if (j4Var3 != null) {
                                    i9 = i2;
                                    j4Var4 = j4VarS;
                                    i4 = i12;
                                } else {
                                    i9 = i2;
                                    j4Var4 = j4VarS;
                                    i4 = i12;
                                }
                            } else {
                                i9 = i2;
                                str5 = str4;
                                if (!S().w(u9Var2.a.x(), f3.k0)) {
                                }
                            }
                            str7 = str14;
                            str6 = str15;
                        }
                        if (!z) {
                            if (j4VarS.x() == 0) {
                                p3VarR = d().r();
                                str8 = "Engagement event does not contain any parameters. appId";
                                objX = r3.x(u9Var2.a.x());
                            } else {
                                Q(this.f1288g);
                                l2 = (Long) x9.n(j4VarS.p(), str5);
                                if (l2 == null) {
                                    p3VarR = d().r();
                                    str8 = "Engagement event does not include duration. appId";
                                    objX = r3.x(u9Var2.a.x());
                                } else {
                                    jLongValue += l2.longValue();
                                }
                            }
                            p3VarR.b(str8, objX);
                        }
                        i5 = i13;
                        u9Var2.c.set(i5, j4VarS.p());
                        i12++;
                        r4Var2.u0(j4VarS);
                        i10 = i4;
                    }
                    i11 = i5 + 1;
                    r4VarS = r4Var2;
                    str10 = str6;
                    str9 = str7;
                    zW = z;
                    str11 = str2;
                    str12 = str3;
                    j5 = jLongValue;
                }
                com.google.android.gms.internal.measurement.r4 r4Var3 = r4VarS;
                long j6 = j5;
                if (zW) {
                    int i18 = i12;
                    long jLongValue2 = j6;
                    int i19 = 0;
                    while (i19 < i18) {
                        com.google.android.gms.internal.measurement.k4 k4VarS0 = r4Var3.s0(i19);
                        if ("_e".equals(k4VarS0.A())) {
                            Q(this.f1288g);
                            if (x9.m(k4VarS0, "_fr") != null) {
                                r4Var3.x0(i19);
                                i18--;
                                i19--;
                            } else {
                                Q(this.f1288g);
                                o4VarM = x9.m(k4VarS0, "_et");
                                if (o4VarM == null) {
                                    if (o4VarM.B()) {
                                        lValueOf = Long.valueOf(o4VarM.C());
                                    } else {
                                        lValueOf = null;
                                    }
                                    if (lValueOf == null && lValueOf.longValue() > 0) {
                                        jLongValue2 += lValueOf.longValue();
                                    }
                                }
                            }
                        } else {
                            Q(this.f1288g);
                            o4VarM = x9.m(k4VarS0, "_et");
                            if (o4VarM == null) {
                                if (o4VarM.B()) {
                                    lValueOf = Long.valueOf(o4VarM.C());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null) {
                                }
                            }
                        }
                        i19++;
                    }
                    j3 = jLongValue2;
                } else {
                    j3 = j6;
                }
                H(r4Var3, j3, false);
                Iterator<com.google.android.gms.internal.measurement.k4> it = r4Var3.q0().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(it.next().A())) {
                        j jVar5 = this.c;
                        Q(jVar5);
                        jVar5.S(r4Var3.C(), "_se");
                        break;
                    }
                }
                if (x9.K(r4Var3, "_sid") >= 0) {
                    H(r4Var3, j3, true);
                } else {
                    int iK = x9.K(r4Var3, "_se");
                    if (iK >= 0) {
                        r4Var3.E0(iK);
                        d().o().b("Session engagement user property is in the bundle without session ID. appId", r3.x(u9Var2.a.x()));
                    }
                }
                x9 x9Var = this.f1288g;
                Q(x9Var);
                x9Var.a.d().w().a("Checking account type status for ad personalization signals");
                s4 s4Var5 = x9Var.b.a;
                Q(s4Var5);
                if (s4Var5.q(r4Var3.C())) {
                    j jVar6 = x9Var.b.c;
                    Q(jVar6);
                    g5 g5VarC0 = jVar6.c0(r4Var3.C());
                    if (g5VarC0 != null && g5VarC0.G() && x9Var.a.S().s()) {
                        x9Var.a.d().v().a("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.c5 c5VarH = com.google.android.gms.internal.measurement.d5.H();
                        c5VarH.x(str2);
                        c5VarH.w(x9Var.a.S().q());
                        c5VarH.A(1L);
                        com.google.android.gms.internal.measurement.d5 d5VarP = c5VarH.p();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= r4Var3.z0()) {
                                r4Var3.C0(d5VarP);
                                break;
                            }
                            if (str2.equals(r4Var3.A0(i20).z())) {
                                r4Var3.B0(i20, d5VarP);
                                break;
                            }
                            i20++;
                        }
                    }
                }
                r4Var3.H0(Long.MAX_VALUE);
                r4Var3.J0(Long.MIN_VALUE);
                for (int i21 = 0; i21 < r4Var3.r0(); i21++) {
                    com.google.android.gms.internal.measurement.k4 k4VarS1 = r4Var3.s0(i21);
                    if (k4VarS1.C() < r4Var3.G0()) {
                        r4Var3.H0(k4VarS1.C());
                    }
                    if (k4VarS1.C() > r4Var3.I0()) {
                        r4Var3.J0(k4VarS1.C());
                    }
                }
                r4Var3.d0();
                r4Var3.Z();
                sa saVar = this.f;
                Q(saVar);
                r4Var3.Y(saVar.m(r4Var3.C(), r4Var3.q0(), r4Var3.y0(), Long.valueOf(r4Var3.G0()), Long.valueOf(r4Var3.I0())));
                if (S().G(u9Var2.a.x())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomI0 = b0().i0();
                    int i22 = 0;
                    while (i22 < r4Var3.r0()) {
                        com.google.android.gms.internal.measurement.j4 j4VarS2 = r4Var3.s0(i22).s();
                        if (j4VarS2.H().equals("_ep")) {
                            Q(this.f1288g);
                            String str17 = (String) x9.n(j4VarS2.p(), "_en");
                            p pVarQ = (p) map.get(str17);
                            if (pVarQ == null) {
                                j jVar7 = this.c;
                                Q(jVar7);
                                String strX = u9Var2.a.x();
                                com.google.android.gms.common.internal.q.k(str17);
                                pVarQ = jVar7.Q(strX, str17);
                                if (pVarQ != null) {
                                    map.put(str17, pVarQ);
                                }
                            }
                            if (pVarQ != null && pVarQ.f1250i == null) {
                                Long l3 = pVarQ.f1251j;
                                if (l3 != null && l3.longValue() > 1) {
                                    Q(this.f1288g);
                                    x9.N(j4VarS2, "_sr", pVarQ.f1251j);
                                }
                                Boolean bool = pVarQ.f1252k;
                                if (bool != null && bool.booleanValue()) {
                                    Q(this.f1288g);
                                    x9.N(j4VarS2, "_efs", 1L);
                                }
                                arrayList2.add(j4VarS2.p());
                            }
                        } else {
                            s4 s4Var6 = this.a;
                            Q(s4Var6);
                            String strX2 = u9Var2.a.x();
                            String strB = s4Var6.b(strX2, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strB)) {
                                j4 = 0;
                            } else {
                                try {
                                    j4 = Long.parseLong(strB);
                                } catch (NumberFormatException e) {
                                    s4Var6.a.d().r().c("Unable to parse timezone offset. appId", r3.x(strX2), e);
                                    j4 = 0;
                                }
                            }
                            long jP = b0().P(j4VarS2.J(), j4);
                            com.google.android.gms.internal.measurement.k4 k4VarP = j4VarS2.p();
                            long j7 = j4;
                            Long l4 = 1L;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator<com.google.android.gms.internal.measurement.o4> it2 = k4VarP.x().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.o4 next = it2.next();
                                        Iterator<com.google.android.gms.internal.measurement.o4> it3 = it2;
                                        if ("_dbg".equals(next.y())) {
                                            if (l4.equals(Long.valueOf(next.C()))) {
                                                iV = 1;
                                                break;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                    s4 s4Var7 = this.a;
                                    Q(s4Var7);
                                    iV = s4Var7.v(u9Var2.a.x(), j4VarS2.H());
                                    break;
                                }
                            }
                            s4 s4Var8 = this.a;
                            Q(s4Var8);
                            iV = s4Var8.v(u9Var2.a.x(), j4VarS2.H());
                            break;
                            if (iV <= 0) {
                                d().r().c("Sample rate must be positive. event, rate", j4VarS2.H(), Integer.valueOf(iV));
                                arrayList2.add(j4VarS2.p());
                            } else {
                                p pVarC = (p) map.get(j4VarS2.H());
                                if (pVarC == null) {
                                    j jVar8 = this.c;
                                    Q(jVar8);
                                    pVarC = jVar8.Q(u9Var2.a.x(), j4VarS2.H());
                                    if (pVarC == null) {
                                        d().r().c("Event being bundled has no eventAggregate. appId, eventName", u9Var2.a.x(), j4VarS2.H());
                                        pVarC = new p(u9Var2.a.x(), j4VarS2.H(), 1L, 1L, 1L, j4VarS2.J(), 0L, null, null, null, null);
                                    }
                                }
                                Q(this.f1288g);
                                Long l5 = (Long) x9.n(j4VarS2.p(), "_eid");
                                Boolean boolValueOf = Boolean.valueOf(l5 != null);
                                if (iV == 1) {
                                    arrayList2.add(j4VarS2.p());
                                    if (boolValueOf.booleanValue() && (pVarC.f1250i != null || pVarC.f1251j != null || pVarC.f1252k != null)) {
                                        map.put(j4VarS2.H(), pVarC.c(null, null, null));
                                    }
                                } else {
                                    if (secureRandomI0.nextInt(iV) == 0) {
                                        Q(this.f1288g);
                                        Long lValueOf2 = Long.valueOf(iV);
                                        x9.N(j4VarS2, "_sr", lValueOf2);
                                        arrayList2.add(j4VarS2.p());
                                        if (boolValueOf.booleanValue()) {
                                            pVarC = pVarC.c(null, lValueOf2, null);
                                        }
                                        map.put(j4VarS2.H(), pVarC.b(j4VarS2.J(), jP));
                                        u9Var2 = u9Var2;
                                    } else {
                                        Long l6 = pVarC.f1249h;
                                        if ((l6 != null ? l6.longValue() : b0().P(j4VarS2.L(), j7)) != jP) {
                                            Q(this.f1288g);
                                            x9.N(j4VarS2, "_efs", 1L);
                                            Q(this.f1288g);
                                            Long lValueOf3 = Long.valueOf(iV);
                                            x9.N(j4VarS2, "_sr", lValueOf3);
                                            arrayList2.add(j4VarS2.p());
                                            map.put(j4VarS2.H(), (boolValueOf.booleanValue() ? pVarC.c(null, lValueOf3, Boolean.TRUE) : pVarC).b(j4VarS2.J(), jP));
                                        } else {
                                            p pVar = pVarC;
                                            if (boolValueOf.booleanValue()) {
                                                map.put(j4VarS2.H(), pVar.c(l5, null, null));
                                            }
                                        }
                                    }
                                    r4Var3.t0(i22, j4VarS2);
                                }
                                i22++;
                                r4Var3 = r4Var3;
                                secureRandomI0 = secureRandomI0;
                                u9Var2 = u9Var2;
                            }
                        }
                        r4Var3.t0(i22, j4VarS2);
                        secureRandomI0 = secureRandomI0;
                        r4Var3 = r4Var3;
                        u9Var2 = u9Var2;
                        i22++;
                        r4Var3 = r4Var3;
                        secureRandomI0 = secureRandomI0;
                        u9Var2 = u9Var2;
                    }
                    r4Var = r4Var3;
                    u9 u9Var3 = u9Var2;
                    if (arrayList2.size() < r4Var.r0()) {
                        r4Var.w0();
                        r4Var.v0(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        j jVar9 = this.c;
                        Q(jVar9);
                        jVar9.R((p) entry.getValue());
                    }
                    u9Var = u9Var3;
                } else {
                    r4Var = r4Var3;
                    u9Var = u9Var2;
                }
                String strX3 = u9Var.a.x();
                j jVar10 = this.c;
                Q(jVar10);
                g5 g5VarC1 = jVar10.c0(strX3);
                if (g5VarC1 == null) {
                    d().o().b("Bundling raw events w/o app info. appId", r3.x(u9Var.a.x()));
                } else if (r4Var.r0() > 0) {
                    long jC0 = g5VarC1.c0();
                    if (jC0 != 0) {
                        r4Var.M0(jC0);
                    } else {
                        r4Var.N0();
                    }
                    long jA0 = g5VarC1.a0();
                    if (jA0 != 0) {
                        jC0 = jA0;
                    }
                    if (jC0 != 0) {
                        r4Var.K0(jC0);
                    } else {
                        r4Var.L0();
                    }
                    g5VarC1.n();
                    r4Var.R((int) g5VarC1.i());
                    g5VarC1.b0(r4Var.G0());
                    g5VarC1.d0(r4Var.I0());
                    String strC = g5VarC1.C();
                    if (strC != null) {
                        r4Var.S(strC);
                    } else {
                        r4Var.U();
                    }
                    j jVar11 = this.c;
                    Q(jVar11);
                    jVar11.d0(g5VarC1);
                }
                if (r4Var.r0() > 0) {
                    this.f1292k.a();
                    s4 s4Var9 = this.a;
                    Q(s4Var9);
                    com.google.android.gms.internal.measurement.z3 z3VarM = s4Var9.m(u9Var.a.x());
                    if (z3VarM != null && z3VarM.x()) {
                        r4Var.e0(z3VarM.y());
                    } else if (TextUtils.isEmpty(u9Var.a.N())) {
                        r4Var.e0(-1L);
                    } else {
                        d().r().b("Did not find measurement config or missing version info. appId", r3.x(u9Var.a.x()));
                    }
                    j jVar12 = this.c;
                    Q(jVar12);
                    jVar12.h0((com.google.android.gms.internal.measurement.s4) r4Var.p(), z2);
                }
                j jVar13 = this.c;
                Q(jVar13);
                List<Long> list2 = u9Var.b;
                com.google.android.gms.common.internal.q.k(list2);
                jVar13.h();
                jVar13.j();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i23 = 0; i23 < list2.size(); i23++) {
                    if (i23 != 0) {
                        sb.append(",");
                    }
                    sb.append(list2.get(i23).longValue());
                }
                sb.append(")");
                int iDelete = jVar13.P().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    jVar13.a.d().o().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                j jVar14 = this.c;
                Q(jVar14);
                try {
                    jVar14.P().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strX3, strX3});
                } catch (SQLiteException e2) {
                    jVar14.a.d().o().c("Failed to remove unused event metadata. appId", r3.x(strX3), e2);
                }
                j jVar15 = this.c;
                Q(jVar15);
                jVar15.N();
                j jVar16 = this.c;
                Q(jVar16);
                jVar16.O();
                return true;
            }
            j jVar17 = this.c;
            Q(jVar17);
            jVar17.N();
            j jVar18 = this.c;
            Q(jVar18);
            jVar18.O();
            return false;
        } catch (Throwable th) {
            j jVar19 = this.c;
            Q(jVar19);
            jVar19.O();
            throw th;
        }
    }

    private final void H(com.google.android.gms.internal.measurement.r4 r4Var, long j2, boolean z) {
        aa aaVar;
        String str = true != z ? "_lte" : "_se";
        j jVar = this.c;
        Q(jVar);
        aa aaVarU = jVar.U(r4Var.C(), str);
        if (aaVarU == null || aaVarU.e == null) {
            aaVar = new aa(r4Var.C(), "auto", str, e().a(), Long.valueOf(j2));
        } else {
            aaVar = new aa(r4Var.C(), "auto", str, e().a(), Long.valueOf(((Long) aaVarU.e).longValue() + j2));
        }
        com.google.android.gms.internal.measurement.c5 c5VarH = com.google.android.gms.internal.measurement.d5.H();
        c5VarH.x(str);
        c5VarH.w(e().a());
        c5VarH.A(((Long) aaVar.e).longValue());
        com.google.android.gms.internal.measurement.d5 d5VarP = c5VarH.p();
        int iK = x9.K(r4Var, str);
        if (iK >= 0) {
            r4Var.B0(iK, d5VarP);
        } else {
            r4Var.C0(d5VarP);
        }
        if (j2 > 0) {
            j jVar2 = this.c;
            Q(jVar2);
            jVar2.T(aaVar);
            d().w().c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", aaVar.e);
        }
    }

    private final boolean I(com.google.android.gms.internal.measurement.j4 j4Var, com.google.android.gms.internal.measurement.j4 j4Var2) {
        com.google.android.gms.common.internal.q.a("_e".equals(j4Var.H()));
        Q(this.f1288g);
        com.google.android.gms.internal.measurement.o4 o4VarM = x9.m(j4Var.p(), "_sc");
        String strA = o4VarM == null ? null : o4VarM.A();
        Q(this.f1288g);
        com.google.android.gms.internal.measurement.o4 o4VarM2 = x9.m(j4Var2.p(), "_pc");
        String strA2 = o4VarM2 != null ? o4VarM2.A() : null;
        if (strA2 == null || !strA2.equals(strA)) {
            return false;
        }
        J(j4Var, j4Var2);
        return true;
    }

    private final void J(com.google.android.gms.internal.measurement.j4 j4Var, com.google.android.gms.internal.measurement.j4 j4Var2) {
        com.google.android.gms.common.internal.q.a("_e".equals(j4Var.H()));
        Q(this.f1288g);
        com.google.android.gms.internal.measurement.o4 o4VarM = x9.m(j4Var.p(), "_et");
        if (o4VarM == null || !o4VarM.B() || o4VarM.C() <= 0) {
            return;
        }
        long jC = o4VarM.C();
        Q(this.f1288g);
        com.google.android.gms.internal.measurement.o4 o4VarM2 = x9.m(j4Var2.p(), "_et");
        if (o4VarM2 != null && o4VarM2.C() > 0) {
            jC += o4VarM2.C();
        }
        Q(this.f1288g);
        x9.N(j4Var2, "_et", Long.valueOf(jC));
        Q(this.f1288g);
        x9.N(j4Var, "_fr", 1L);
    }

    private final boolean K() {
        f().h();
        c0();
        j jVar = this.c;
        Q(jVar);
        if (jVar.s()) {
            return true;
        }
        j jVar2 = this.c;
        Q(jVar2);
        return !TextUtils.isEmpty(jVar2.i0());
    }

    private final void L() {
        d3<Long> d3Var;
        long jMax;
        f().h();
        c0();
        if (this.f1295n > 0) {
            long jAbs = 3600000 - Math.abs(e().c() - this.f1295n);
            if (jAbs > 0) {
                d().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                W().b();
                k9 k9Var = this.e;
                Q(k9Var);
                k9Var.n();
                return;
            }
            this.f1295n = 0L;
        }
        if (!this.f1292k.q() || !K()) {
            d().w().a("Nothing to upload or uploading impossible");
            W().b();
            k9 k9Var2 = this.e;
            Q(k9Var2);
            k9Var2.n();
            return;
        }
        long jA = e().a();
        S();
        long jMax2 = Math.max(0L, f3.A.b(null).longValue());
        j jVar = this.c;
        Q(jVar);
        boolean z = true;
        if (!jVar.t()) {
            j jVar2 = this.c;
            Q(jVar2);
            if (!jVar2.j0()) {
                z = false;
            }
        }
        if (z) {
            String strD = S().D();
            if (TextUtils.isEmpty(strD) || ".none.".equals(strD)) {
                S();
                d3Var = f3.u;
            } else {
                S();
                d3Var = f3.v;
            }
        } else {
            S();
            d3Var = f3.t;
        }
        long jMax3 = Math.max(0L, d3Var.b(null).longValue());
        long jA2 = this.f1290i.f1283i.a();
        long jA3 = this.f1290i.f1284j.a();
        j jVar3 = this.c;
        Q(jVar3);
        boolean z2 = z;
        long jP = jVar3.p();
        j jVar4 = this.c;
        Q(jVar4);
        long jMax4 = Math.max(jP, jVar4.r());
        if (jMax4 != 0) {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jA - jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z2 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            x9 x9Var = this.f1288g;
            Q(x9Var);
            if (!x9Var.G(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    S();
                    if (i2 >= Math.min(20, Math.max(0, f3.C.b(null).intValue()))) {
                        jMax = 0;
                        break;
                    }
                    S();
                    jMax += Math.max(0L, f3.B.b(null).longValue()) * (1 << i2);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            jMax = 0;
            break;
        }
        if (jMax == 0) {
            d().w().a("Next upload time is 0");
            W().b();
            k9 k9Var3 = this.e;
            Q(k9Var3);
            k9Var3.n();
            return;
        }
        x3 x3Var = this.b;
        Q(x3Var);
        if (!x3Var.m()) {
            d().w().a("No network");
            W().a();
            k9 k9Var4 = this.e;
            Q(k9Var4);
            k9Var4.n();
            return;
        }
        long jA4 = this.f1290i.f1282h.a();
        S();
        long jMax6 = Math.max(0L, f3.r.b(null).longValue());
        x9 x9Var2 = this.f1288g;
        Q(x9Var2);
        if (!x9Var2.G(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        W().b();
        long jA5 = jMax - e().a();
        if (jA5 <= 0) {
            S();
            jA5 = Math.max(0L, f3.w.b(null).longValue());
            this.f1290i.f1283i.b(e().a());
        }
        d().w().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        k9 k9Var5 = this.e;
        Q(k9Var5);
        k9Var5.m(jA5);
    }

    private final void M() {
        f().h();
        if (this.r || this.s || this.t) {
            d().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        d().w().a("Stopping uploading service(s)");
        List<Runnable> list = this.f1296o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        List<Runnable> list2 = this.f1296o;
        com.google.android.gms.common.internal.q.k(list2);
        list2.clear();
    }

    private final Boolean N(g5 g5Var) {
        Boolean bool = Boolean.TRUE;
        try {
            if (g5Var.g0() != -2147483648L) {
                if (g5Var.g0() == com.google.android.gms.common.o.c.a(this.f1292k.c()).e(g5Var.N(), 0).versionCode) {
                    return bool;
                }
            } else {
                String str = com.google.android.gms.common.o.c.a(this.f1292k.c()).e(g5Var.N(), 0).versionName;
                String strE0 = g5Var.e0();
                if (strE0 != null && strE0.equals(str)) {
                    return bool;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final ja O(String str) {
        String str2;
        Object objX;
        p3 p3VarV;
        String str3 = str;
        j jVar = this.c;
        Q(jVar);
        g5 g5VarC0 = jVar.c0(str3);
        if (g5VarC0 == null || TextUtils.isEmpty(g5VarC0.e0())) {
            str2 = "No app data available; dropping";
            p3VarV = d().v();
            objX = str3;
        } else {
            Boolean boolN = N(g5VarC0);
            if (boolN == null || boolN.booleanValue()) {
                String strQ = g5VarC0.Q();
                String strE0 = g5VarC0.e0();
                long jG0 = g5VarC0.g0();
                String strI0 = g5VarC0.i0();
                long jK0 = g5VarC0.k0();
                long jB = g5VarC0.b();
                boolean zF = g5VarC0.f();
                String strY = g5VarC0.Y();
                long jE = g5VarC0.E();
                boolean zG = g5VarC0.G();
                String strS = g5VarC0.S();
                Boolean boolI = g5VarC0.I();
                long jD = g5VarC0.d();
                List<String> listK = g5VarC0.K();
                td.a();
                return new ja(str, strQ, strE0, jG0, strI0, jK0, jB, (String) null, zF, false, strY, jE, 0L, 0, zG, false, strS, boolI, jD, listK, S().w(str3, f3.h0) ? g5VarC0.U() : null, e0(str).d());
            }
            str2 = "App version does not match; dropping. appId";
            p3VarV = d().o();
            objX = r3.x(str);
        }
        p3VarV.b(str2, objX);
        return null;
    }

    private final boolean P(ja jaVar) {
        td.a();
        if (S().w(jaVar.a, f3.h0)) {
            return (TextUtils.isEmpty(jaVar.b) && TextUtils.isEmpty(jaVar.u) && TextUtils.isEmpty(jaVar.q)) ? false : true;
        }
        return (TextUtils.isEmpty(jaVar.b) && TextUtils.isEmpty(jaVar.q)) ? false : true;
    }

    private static final m9 Q(m9 m9Var) {
        if (m9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (m9Var.i()) {
            return m9Var;
        }
        String strValueOf = String.valueOf(m9Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    final void A(boolean z) {
        L();
    }

    protected final void R() {
        f().h();
        j jVar = this.c;
        Q(jVar);
        jVar.m();
        if (this.f1290i.f1283i.a() == 0) {
            this.f1290i.f1283i.b(e().a());
        }
        L();
    }

    public final f S() {
        a5 a5Var = this.f1292k;
        com.google.android.gms.common.internal.q.k(a5Var);
        return a5Var.z();
    }

    public final s4 T() {
        s4 s4Var = this.a;
        Q(s4Var);
        return s4Var;
    }

    public final x3 U() {
        x3 x3Var = this.b;
        Q(x3Var);
        return x3Var;
    }

    public final j V() {
        j jVar = this.c;
        Q(jVar);
        return jVar;
    }

    public final z3 W() {
        z3 z3Var = this.d;
        if (z3Var != null) {
            return z3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final i7 X() {
        i7 i7Var = this.f1289h;
        Q(i7Var);
        return i7Var;
    }

    public final x9 Y() {
        x9 x9Var = this.f1288g;
        Q(x9Var);
        return x9Var;
    }

    public final s8 Z() {
        return this.f1290i;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final ta a() {
        throw null;
    }

    public final m3 a0() {
        return this.f1292k.H();
    }

    final String b(g gVar) {
        if (!gVar.h()) {
            return null;
        }
        byte[] bArr = new byte[16];
        b0().i0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final ca b0() {
        a5 a5Var = this.f1292k;
        com.google.android.gms.common.internal.q.k(a5Var);
        return a5Var.G();
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final Context c() {
        return this.f1292k.c();
    }

    final void c0() {
        if (!this.f1293l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final r3 d() {
        a5 a5Var = this.f1292k;
        com.google.android.gms.common.internal.q.k(a5Var);
        return a5Var.d();
    }

    final void d0(String str, g gVar) {
        f().h();
        c0();
        this.z.put(str, gVar);
        j jVar = this.c;
        Q(jVar);
        com.google.android.gms.common.internal.q.k(str);
        com.google.android.gms.common.internal.q.k(gVar);
        jVar.h();
        jVar.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", gVar.d());
        try {
            if (jVar.P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                jVar.a.d().o().b("Failed to insert/update consent setting (got -1). appId", r3.x(str));
            }
        } catch (SQLiteException e) {
            jVar.a.d().o().c("Error storing consent setting. appId, error", r3.x(str), e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final com.google.android.gms.common.util.e e() {
        a5 a5Var = this.f1292k;
        com.google.android.gms.common.internal.q.k(a5Var);
        return a5Var.e();
    }

    final g e0(String str) {
        String string;
        f().h();
        c0();
        g gVar = this.z.get(str);
        if (gVar != null) {
            return gVar;
        }
        j jVar = this.c;
        Q(jVar);
        com.google.android.gms.common.internal.q.k(str);
        jVar.h();
        jVar.j();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = jVar.P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    string = "G1";
                }
                g gVarC = g.c(string);
                d0(str, gVarC);
                return gVarC;
            } catch (SQLiteException e) {
                jVar.a.d().o().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.w5
    public final x4 f() {
        a5 a5Var = this.f1292k;
        com.google.android.gms.common.internal.q.k(a5Var);
        return a5Var.f();
    }

    final long f0() {
        long jA = e().a();
        s8 s8Var = this.f1290i;
        s8Var.j();
        s8Var.h();
        long jA2 = s8Var.f1285k.a();
        if (jA2 == 0) {
            jA2 = ((long) s8Var.a.G().i0().nextInt(86400000)) + 1;
            s8Var.f1285k.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Removed unreachable split cross block B:239:0x0030 */
    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:116:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0263 A[Catch: all -> 0x0503, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0298 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02a2 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02ac A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cf A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e4 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0312 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x031e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0332 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x036c A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0371 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0379 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0388 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03b7 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f5 A[Catch: MalformedURLException -> 0x0461, all -> 0x0503, TryCatch #3 {MalformedURLException -> 0x0461, blocks: (B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403), top: B:233:0x03e3, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0403 A[Catch: MalformedURLException -> 0x0461, all -> 0x0503, TryCatch #3 {MalformedURLException -> 0x0461, blocks: (B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403), top: B:233:0x03e3, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0415 A[Catch: MalformedURLException -> 0x0461, all -> 0x0503, TryCatch #3 {MalformedURLException -> 0x0461, blocks: (B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403), top: B:233:0x03e3, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x04be A[Catch: all -> 0x0503, PHI: r3 r9
  0x04be: PHI (r3v6 android.database.Cursor) = (r3v51 android.database.Cursor), (r3v52 android.database.Cursor), (r3v53 android.database.Cursor) binds: [B:213:0x04df, B:204:0x04c7, B:199:0x04bc] A[DONT_GENERATE, DONT_INLINE]
  0x04be: PHI (r9v2 java.lang.String) = (r9v18 java.lang.String), (r9v3 java.lang.String), (r9v19 java.lang.String) binds: [B:213:0x04df, B:204:0x04c7, B:199:0x04bc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x04e8 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x04f3 A[Catch: all -> 0x0503, TRY_LEAVE, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[LOOP:1: B:138:0x02a6->B:263:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0261 A[ADDED_TO_REGION, EDGE_INSN: B:273:0x0261->B:119:0x0261 BREAK  A[LOOP:4: B:77:0x01a0->B:118:0x0259], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01ca A[EDGE_INSN: B:275:0x01ca->B:83:0x01ca BREAK  A[LOOP:5: B:237:0x01c4->B:101:0x0221], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[Catch: all -> 0x0503, PHI: r7 r11
  0x00f9: PHI (r7v16 long) = (r7v0 long), (r7v18 long), (r7v0 long) binds: [B:51:0x0119, B:42:0x0101, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00f9: PHI (r11v17 android.database.Cursor) = (r11v16 android.database.Cursor), (r11v19 android.database.Cursor), (r11v19 android.database.Cursor) binds: [B:51:0x0119, B:42:0x0101, B:38:0x00f7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0123 A[Catch: all -> 0x0503, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d A[Catch: SQLiteException -> 0x026a, all -> 0x0474, TRY_LEAVE, TryCatch #11 {SQLiteException -> 0x026a, blocks: (B:70:0x0187, B:72:0x018d, B:76:0x019a, B:77:0x01a0, B:78:0x01a4, B:79:0x01af), top: B:244:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: all -> 0x0503, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0503, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:39:0x00f9, B:53:0x011c, B:57:0x0123, B:58:0x0126, B:59:0x0127, B:63:0x014f, B:67:0x0157, B:74:0x0193, B:133:0x0292, B:135:0x0298, B:137:0x02a2, B:138:0x02a6, B:140:0x02ac, B:142:0x02c0, B:146:0x02c9, B:148:0x02cf, B:154:0x02f4, B:151:0x02e4, B:153:0x02ee, B:155:0x02f7, B:157:0x0312, B:161:0x031f, B:163:0x0332, B:165:0x036c, B:167:0x0371, B:169:0x0379, B:170:0x037c, B:172:0x0388, B:173:0x039e, B:174:0x03a6, B:176:0x03b7, B:178:0x03c8, B:179:0x03e3, B:181:0x03f5, B:183:0x040a, B:185:0x0415, B:186:0x041e, B:182:0x0403, B:188:0x0461, B:120:0x0263, B:132:0x028f, B:192:0x0478, B:193:0x047b, B:194:0x047c, B:200:0x04be, B:215:0x04e2, B:217:0x04e8, B:219:0x04f3, B:224:0x04ff, B:225:0x0502), top: B:232:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019a A[Catch: SQLiteException -> 0x026a, all -> 0x0474, TRY_ENTER, TryCatch #11 {SQLiteException -> 0x026a, blocks: (B:70:0x0187, B:72:0x018d, B:76:0x019a, B:77:0x01a0, B:78:0x01a4, B:79:0x01af), top: B:244:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f0 A[Catch: SQLiteException -> 0x0268, all -> 0x0474, TryCatch #7 {SQLiteException -> 0x0268, blocks: (B:81:0x01c4, B:83:0x01ca, B:84:0x01d4, B:86:0x01da, B:90:0x01e0, B:92:0x01ea, B:94:0x01f0, B:95:0x01f7, B:114:0x0250, B:97:0x020c, B:98:0x021c, B:101:0x0221, B:107:0x022a, B:108:0x0239, B:113:0x023f), top: B:237:0x01c4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void g() {
        Cursor cursorRawQuery;
        Cursor cursor;
        g5 g5VarC0;
        Cursor cursor2;
        int iT;
        int iMax;
        j jVar;
        boolean z;
        boolean z2;
        Cursor cursor3;
        long j2;
        Cursor cursorQuery;
        List listEmptyList;
        com.google.android.gms.internal.measurement.p4 p4VarZ;
        int size;
        ArrayList arrayList;
        boolean z3;
        boolean zF;
        boolean zH;
        int i2;
        String strY;
        String strB;
        com.google.android.gms.internal.measurement.r4 r4VarS;
        Iterator it;
        String strD;
        int i3;
        com.google.android.gms.internal.measurement.s4 s4Var;
        com.google.android.gms.internal.measurement.s4 s4Var2;
        ArrayList arrayList2;
        int length;
        long j3;
        Object objX;
        String str;
        p3 p3Var;
        ?? byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        int i4;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.r4 r4Var;
        Cursor cursorRawQuery2;
        p3 p3VarW;
        String str2;
        f().h();
        c0();
        int i5 = 1;
        this.t = true;
        ?? r3 = 0;
        ?? r4 = 0;
        int i6 = 0;
        try {
            this.f1292k.a();
            Boolean boolQ = this.f1292k.R().q();
            if (boolQ == null) {
                p3VarW = d().r();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolQ.booleanValue()) {
                    if (this.f1295n <= 0) {
                        f().h();
                        if (this.w != null) {
                            p3VarW = d().w();
                            str2 = "Uploading requested multiple times";
                        } else {
                            x3 x3Var = this.b;
                            Q(x3Var);
                            if (x3Var.m()) {
                                long jA = e().a();
                                ?? r9 = 0;
                                Cursor cursor4 = null;
                                string = null;
                                string = null;
                                string = null;
                                String string = null;
                                int iT2 = S().t(null, f3.Q);
                                S();
                                long jI = jA - f.I();
                                for (int i7 = 0; i7 < iT2 && G(null, jI); i7++) {
                                }
                                long jA2 = this.f1290i.f1283i.a();
                                if (jA2 != 0) {
                                    d().v().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jA - jA2)));
                                }
                                j jVar2 = this.c;
                                Q(jVar2);
                                String strI0 = jVar2.i0();
                                long j4 = -1;
                                if (TextUtils.isEmpty(strI0)) {
                                    try {
                                        this.y = -1L;
                                        j jVar3 = this.c;
                                        Q(jVar3);
                                        S();
                                        long jI2 = jA - f.I();
                                        jVar3.h();
                                        jVar3.j();
                                        try {
                                            cursorRawQuery = jVar3.P().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jI2)});
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    string = cursorRawQuery.getString(0);
                                                    cursor2 = cursorRawQuery;
                                                    cursor = cursorRawQuery;
                                                    if (cursorRawQuery != null) {
                                                        cursor2.close();
                                                        cursor = cursor2;
                                                    }
                                                } else {
                                                    jVar3.a.d().w().a("No expired configs for apps with pending events");
                                                    cursor2 = cursorRawQuery;
                                                    cursor = cursorRawQuery;
                                                    if (cursorRawQuery != null) {
                                                        cursor2.close();
                                                        cursor = cursor2;
                                                    }
                                                }
                                            } catch (SQLiteException e) {
                                                e = e;
                                                jVar3.a.d().o().b("Error selecting expired configs", e);
                                                cursor2 = cursorRawQuery;
                                                cursor = cursorRawQuery;
                                                if (cursorRawQuery != null) {
                                                }
                                                r3 = cursor;
                                                if (!TextUtils.isEmpty(string)) {
                                                    j jVar4 = this.c;
                                                    Q(jVar4);
                                                    g5VarC0 = jVar4.c0(string);
                                                    r3 = cursor;
                                                    if (g5VarC0 != null) {
                                                        i(g5VarC0);
                                                        r3 = cursor;
                                                    }
                                                }
                                                this.t = false;
                                                M();
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            cursorRawQuery = null;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (r9 != 0) {
                                                r9.close();
                                            }
                                            throw th;
                                        }
                                        r3 = cursor;
                                        if (!TextUtils.isEmpty(string)) {
                                            j jVar5 = this.c;
                                            Q(jVar5);
                                            g5VarC0 = jVar5.c0(string);
                                            r3 = cursor;
                                            if (g5VarC0 != null) {
                                                i(g5VarC0);
                                                r3 = cursor;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r9 = r3;
                                    }
                                } else {
                                    if (this.y == -1) {
                                        j jVar6 = this.c;
                                        Q(jVar6);
                                        try {
                                            cursorRawQuery2 = jVar6.P().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                            try {
                                                try {
                                                    if (cursorRawQuery2.moveToFirst()) {
                                                        j4 = cursorRawQuery2.getLong(0);
                                                        if (cursorRawQuery2 != null) {
                                                            cursorRawQuery2.close();
                                                        }
                                                    } else if (cursorRawQuery2 != null) {
                                                        cursorRawQuery2.close();
                                                    }
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    jVar6.a.d().o().b("Error querying raw events", e);
                                                    if (cursorRawQuery2 != null) {
                                                    }
                                                    this.y = j4;
                                                    iT = S().t(strI0, f3.f1192g);
                                                    iMax = Math.max(0, S().t(strI0, f3.f1193h));
                                                    jVar = this.c;
                                                    Q(jVar);
                                                    jVar.h();
                                                    jVar.j();
                                                    if (iT > 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    com.google.android.gms.common.internal.q.a(z);
                                                    if (iMax > 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    com.google.android.gms.common.internal.q.a(z2);
                                                    com.google.android.gms.common.internal.q.g(strI0);
                                                    cursorQuery = jVar.P().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strI0}, null, null, "rowid", String.valueOf(iT));
                                                    try {
                                                        try {
                                                            if (cursorQuery.moveToFirst()) {
                                                                arrayList2 = new ArrayList();
                                                                length = 0;
                                                                while (true) {
                                                                    j3 = cursorQuery.getLong(i6);
                                                                    try {
                                                                        byte[] blob = cursorQuery.getBlob(i5);
                                                                        x9 x9Var = jVar.b.f1288g;
                                                                        Q(x9Var);
                                                                        try {
                                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                                                            bArr = new byte[1024];
                                                                            j2 = jA;
                                                                            while (true) {
                                                                                try {
                                                                                    try {
                                                                                        i4 = gZIPInputStream.read(bArr);
                                                                                        if (i4 <= 0) {
                                                                                            break;
                                                                                        } else {
                                                                                            byteArrayOutputStream.write(bArr, 0, i4);
                                                                                        }
                                                                                    } catch (SQLiteException e4) {
                                                                                        e = e4;
                                                                                        String str3 = "Error querying bundles. appId";
                                                                                        jVar.a.d().o().c("Error querying bundles. appId", r3.x(strI0), e);
                                                                                        listEmptyList = Collections.emptyList();
                                                                                        r4 = str3;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                            r4 = str3;
                                                                                        }
                                                                                    }
                                                                                } catch (IOException e5) {
                                                                                    e = e5;
                                                                                    try {
                                                                                        x9Var.a.d().o().b("Failed to ungzip content", e);
                                                                                        throw e;
                                                                                    } catch (IOException e6) {
                                                                                        e = e6;
                                                                                        p3 p3VarO = jVar.a.d().o();
                                                                                        objX = r3.x(strI0);
                                                                                        p3Var = p3VarO;
                                                                                        str = "Failed to unzip queued bundle. appId";
                                                                                        p3Var.c(str, objX, e);
                                                                                        byteArrayOutputStream = str;
                                                                                        if (cursorQuery.moveToNext()) {
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        listEmptyList = arrayList2;
                                                                                        r4 = byteArrayOutputStream;
                                                                                        r3 = r4;
                                                                                        if (!listEmptyList.isEmpty()) {
                                                                                            if (e0(strI0).f()) {
                                                                                                it = listEmptyList.iterator();
                                                                                                while (true) {
                                                                                                    if (!it.hasNext()) {
                                                                                                        strD = null;
                                                                                                        break;
                                                                                                    }
                                                                                                    s4Var2 = (com.google.android.gms.internal.measurement.s4) ((Pair) it.next()).first;
                                                                                                    if (!TextUtils.isEmpty(s4Var2.D())) {
                                                                                                        strD = s4Var2.D();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (strD != null) {
                                                                                                    for (i3 = 0; i3 < listEmptyList.size(); i3++) {
                                                                                                        s4Var = (com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i3)).first;
                                                                                                        if (TextUtils.isEmpty(s4Var.D())) {
                                                                                                            listEmptyList = listEmptyList.subList(0, i3);
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            p4VarZ = com.google.android.gms.internal.measurement.q4.z();
                                                                                            size = listEmptyList.size();
                                                                                            arrayList = new ArrayList(listEmptyList.size());
                                                                                            if (S().F(strI0)) {
                                                                                                z3 = false;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            zF = e0(strI0).f();
                                                                                            zH = e0(strI0).h();
                                                                                            i2 = 0;
                                                                                            while (i2 < size) {
                                                                                                r4VarS = ((com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i2)).first).s();
                                                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i2)).second);
                                                                                                S().p();
                                                                                                r4VarS.H(42004L);
                                                                                                long j5 = j2;
                                                                                                r4VarS.F0(j5);
                                                                                                this.f1292k.a();
                                                                                                r4VarS.X(false);
                                                                                                if (!z3) {
                                                                                                    r4VarS.h0();
                                                                                                }
                                                                                                if (!zF) {
                                                                                                    r4VarS.J();
                                                                                                    r4VarS.L();
                                                                                                }
                                                                                                if (!zH) {
                                                                                                    r4VarS.N();
                                                                                                }
                                                                                                if (S().w(strI0, f3.W)) {
                                                                                                    byte[] bArrB = r4VarS.p().b();
                                                                                                    x9 x9Var2 = this.f1288g;
                                                                                                    Q(x9Var2);
                                                                                                    r4VarS.m0(x9Var2.H(bArrB));
                                                                                                }
                                                                                                p4VarZ.x(r4VarS);
                                                                                                i2++;
                                                                                                j2 = j5;
                                                                                            }
                                                                                            long j6 = j2;
                                                                                            if (Log.isLoggable(d().z(), 2)) {
                                                                                                x9 x9Var3 = this.f1288g;
                                                                                                Q(x9Var3);
                                                                                                strY = x9Var3.y(p4VarZ.p());
                                                                                            } else {
                                                                                                strY = null;
                                                                                            }
                                                                                            Q(this.f1288g);
                                                                                            byte[] bArrB2 = p4VarZ.p().b();
                                                                                            S();
                                                                                            strB = f3.q.b(null);
                                                                                            try {
                                                                                                URL url = new URL(strB);
                                                                                                com.google.android.gms.common.internal.q.a(!arrayList.isEmpty());
                                                                                                if (this.w != null) {
                                                                                                    d().o().a("Set uploading progress before finishing the previous upload");
                                                                                                } else {
                                                                                                    this.w = new ArrayList(arrayList);
                                                                                                }
                                                                                                this.f1290i.f1284j.b(j6);
                                                                                                d().w().d("Uploading data. app, uncompressed size, data", size > 0 ? p4VarZ.w(0).x() : "?", Integer.valueOf(bArrB2.length), strY);
                                                                                                this.s = true;
                                                                                                x3 x3Var2 = this.b;
                                                                                                Q(x3Var2);
                                                                                                p9 p9Var = new p9(this, strI0);
                                                                                                x3Var2.h();
                                                                                                x3Var2.j();
                                                                                                com.google.android.gms.common.internal.q.k(url);
                                                                                                com.google.android.gms.common.internal.q.k(bArrB2);
                                                                                                com.google.android.gms.common.internal.q.k(p9Var);
                                                                                                x4 x4VarF = x3Var2.a.f();
                                                                                                w3 w3Var = new w3(x3Var2, strI0, url, bArrB2, null, p9Var);
                                                                                                x4VarF.u(w3Var);
                                                                                                r3 = w3Var;
                                                                                            } catch (MalformedURLException unused) {
                                                                                                p3 p3VarO2 = d().o();
                                                                                                Object objX2 = r3.x(strI0);
                                                                                                p3VarO2.c("Failed to parse upload URL. Not uploading. appId", objX2, strB);
                                                                                                r3 = objX2;
                                                                                            }
                                                                                        }
                                                                                        this.t = false;
                                                                                        M();
                                                                                    }
                                                                                }
                                                                            }
                                                                            gZIPInputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            byteArray = byteArrayOutputStream.toByteArray();
                                                                            if (arrayList2.isEmpty()) {
                                                                            }
                                                                            try {
                                                                                com.google.android.gms.internal.measurement.r4 r4VarK0 = com.google.android.gms.internal.measurement.s4.K0();
                                                                                x9.J(r4VarK0, byteArray);
                                                                                r4Var = r4VarK0;
                                                                                byteArrayOutputStream = 2;
                                                                                if (!cursorQuery.isNull(2)) {
                                                                                    r4Var.i0(cursorQuery.getInt(2));
                                                                                }
                                                                                length += byteArray.length;
                                                                                arrayList2.add(Pair.create(r4Var.p(), Long.valueOf(j3)));
                                                                            } catch (IOException e7) {
                                                                                e = e7;
                                                                                p3 p3VarO3 = jVar.a.d().o();
                                                                                objX = r3.x(strI0);
                                                                                p3Var = p3VarO3;
                                                                                str = "Failed to merge queued bundle. appId";
                                                                                p3Var.c(str, objX, e);
                                                                                byteArrayOutputStream = str;
                                                                            }
                                                                        } catch (IOException e8) {
                                                                            e = e8;
                                                                            j2 = jA;
                                                                        }
                                                                    } catch (IOException e9) {
                                                                        e = e9;
                                                                        j2 = jA;
                                                                    }
                                                                    if (cursorQuery.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    jA = j2;
                                                                    i5 = 1;
                                                                    i6 = 0;
                                                                }
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                listEmptyList = arrayList2;
                                                                r4 = byteArrayOutputStream;
                                                            } else {
                                                                listEmptyList = Collections.emptyList();
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                j2 = jA;
                                                            }
                                                        } catch (SQLiteException e10) {
                                                            e = e10;
                                                            j2 = jA;
                                                        }
                                                        r3 = r4;
                                                        if (!listEmptyList.isEmpty()) {
                                                            if (e0(strI0).f()) {
                                                                it = listEmptyList.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        strD = null;
                                                                        break;
                                                                    }
                                                                    s4Var2 = (com.google.android.gms.internal.measurement.s4) ((Pair) it.next()).first;
                                                                    if (!TextUtils.isEmpty(s4Var2.D())) {
                                                                        strD = s4Var2.D();
                                                                        break;
                                                                    }
                                                                }
                                                                if (strD != null) {
                                                                    while (i3 < listEmptyList.size()) {
                                                                        s4Var = (com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i3)).first;
                                                                        if (TextUtils.isEmpty(s4Var.D())) {
                                                                            listEmptyList = listEmptyList.subList(0, i3);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            p4VarZ = com.google.android.gms.internal.measurement.q4.z();
                                                            size = listEmptyList.size();
                                                            arrayList = new ArrayList(listEmptyList.size());
                                                            if (S().F(strI0)) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            zF = e0(strI0).f();
                                                            zH = e0(strI0).h();
                                                            i2 = 0;
                                                            while (i2 < size) {
                                                                r4VarS = ((com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i2)).first).s();
                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i2)).second);
                                                                S().p();
                                                                r4VarS.H(42004L);
                                                                long j7 = j2;
                                                                r4VarS.F0(j7);
                                                                this.f1292k.a();
                                                                r4VarS.X(false);
                                                                if (!z3) {
                                                                    r4VarS.h0();
                                                                }
                                                                if (!zF) {
                                                                    r4VarS.J();
                                                                    r4VarS.L();
                                                                }
                                                                if (!zH) {
                                                                    r4VarS.N();
                                                                }
                                                                if (S().w(strI0, f3.W)) {
                                                                    byte[] bArrB3 = r4VarS.p().b();
                                                                    x9 x9Var4 = this.f1288g;
                                                                    Q(x9Var4);
                                                                    r4VarS.m0(x9Var4.H(bArrB3));
                                                                }
                                                                p4VarZ.x(r4VarS);
                                                                i2++;
                                                                j2 = j7;
                                                            }
                                                            long j8 = j2;
                                                            if (Log.isLoggable(d().z(), 2)) {
                                                                x9 x9Var5 = this.f1288g;
                                                                Q(x9Var5);
                                                                strY = x9Var5.y(p4VarZ.p());
                                                            } else {
                                                                strY = null;
                                                            }
                                                            Q(this.f1288g);
                                                            byte[] bArrB4 = p4VarZ.p().b();
                                                            S();
                                                            strB = f3.q.b(null);
                                                            URL url2 = new URL(strB);
                                                            com.google.android.gms.common.internal.q.a(!arrayList.isEmpty());
                                                            if (this.w != null) {
                                                                d().o().a("Set uploading progress before finishing the previous upload");
                                                            } else {
                                                                this.w = new ArrayList(arrayList);
                                                            }
                                                            this.f1290i.f1284j.b(j8);
                                                            d().w().d("Uploading data. app, uncompressed size, data", size > 0 ? p4VarZ.w(0).x() : "?", Integer.valueOf(bArrB4.length), strY);
                                                            this.s = true;
                                                            x3 x3Var3 = this.b;
                                                            Q(x3Var3);
                                                            p9 p9Var2 = new p9(this, strI0);
                                                            x3Var3.h();
                                                            x3Var3.j();
                                                            com.google.android.gms.common.internal.q.k(url2);
                                                            com.google.android.gms.common.internal.q.k(bArrB4);
                                                            com.google.android.gms.common.internal.q.k(p9Var2);
                                                            x4 x4VarF2 = x3Var3.a.f();
                                                            w3 w3Var2 = new w3(x3Var3, strI0, url2, bArrB4, null, p9Var2);
                                                            x4VarF2.u(w3Var2);
                                                            r3 = w3Var2;
                                                        }
                                                        this.t = false;
                                                        M();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor3 = cursorQuery;
                                                        if (cursor3 != null) {
                                                            cursor3.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor4 = cursorRawQuery2;
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            cursorRawQuery2 = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            throw th;
                                        }
                                        this.y = j4;
                                    }
                                    iT = S().t(strI0, f3.f1192g);
                                    iMax = Math.max(0, S().t(strI0, f3.f1193h));
                                    jVar = this.c;
                                    Q(jVar);
                                    jVar.h();
                                    jVar.j();
                                    if (iT > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    com.google.android.gms.common.internal.q.a(z);
                                    if (iMax > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    com.google.android.gms.common.internal.q.a(z2);
                                    com.google.android.gms.common.internal.q.g(strI0);
                                    try {
                                        cursorQuery = jVar.P().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strI0}, null, null, "rowid", String.valueOf(iT));
                                        if (cursorQuery.moveToFirst()) {
                                            listEmptyList = Collections.emptyList();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            j2 = jA;
                                        } else {
                                            arrayList2 = new ArrayList();
                                            length = 0;
                                            while (true) {
                                                j3 = cursorQuery.getLong(i6);
                                                byte[] blob2 = cursorQuery.getBlob(i5);
                                                x9 x9Var6 = jVar.b.f1288g;
                                                Q(x9Var6);
                                                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                bArr = new byte[1024];
                                                j2 = jA;
                                                while (true) {
                                                    i4 = gZIPInputStream.read(bArr);
                                                    if (i4 <= 0) {
                                                        break;
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr, 0, i4);
                                                }
                                                gZIPInputStream.close();
                                                byteArrayInputStream2.close();
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.r4 r4VarK1 = com.google.android.gms.internal.measurement.s4.K0();
                                                x9.J(r4VarK1, byteArray);
                                                r4Var = r4VarK1;
                                                byteArrayOutputStream = 2;
                                                if (!cursorQuery.isNull(2)) {
                                                    r4Var.i0(cursorQuery.getInt(2));
                                                }
                                                length += byteArray.length;
                                                arrayList2.add(Pair.create(r4Var.p(), Long.valueOf(j3)));
                                                if (cursorQuery.moveToNext() || length > iMax) {
                                                    break;
                                                    break;
                                                } else {
                                                    jA = j2;
                                                    i5 = 1;
                                                    i6 = 0;
                                                }
                                            }
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            listEmptyList = arrayList2;
                                            r4 = byteArrayOutputStream;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        j2 = jA;
                                        cursorQuery = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        cursor3 = null;
                                    }
                                    r3 = r4;
                                    if (!listEmptyList.isEmpty()) {
                                        if (e0(strI0).f()) {
                                            it = listEmptyList.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    strD = null;
                                                    break;
                                                }
                                                s4Var2 = (com.google.android.gms.internal.measurement.s4) ((Pair) it.next()).first;
                                                if (!TextUtils.isEmpty(s4Var2.D())) {
                                                    strD = s4Var2.D();
                                                    break;
                                                }
                                            }
                                            if (strD != null) {
                                                while (i3 < listEmptyList.size()) {
                                                    s4Var = (com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i3)).first;
                                                    if (TextUtils.isEmpty(s4Var.D()) && !s4Var.D().equals(strD)) {
                                                        listEmptyList = listEmptyList.subList(0, i3);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        p4VarZ = com.google.android.gms.internal.measurement.q4.z();
                                        size = listEmptyList.size();
                                        arrayList = new ArrayList(listEmptyList.size());
                                        if (S().F(strI0) || !e0(strI0).f()) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        zF = e0(strI0).f();
                                        zH = e0(strI0).h();
                                        i2 = 0;
                                        while (i2 < size) {
                                            r4VarS = ((com.google.android.gms.internal.measurement.s4) ((Pair) listEmptyList.get(i2)).first).s();
                                            arrayList.add((Long) ((Pair) listEmptyList.get(i2)).second);
                                            S().p();
                                            r4VarS.H(42004L);
                                            long j9 = j2;
                                            r4VarS.F0(j9);
                                            this.f1292k.a();
                                            r4VarS.X(false);
                                            if (!z3) {
                                                r4VarS.h0();
                                            }
                                            if (!zF) {
                                                r4VarS.J();
                                                r4VarS.L();
                                            }
                                            if (!zH) {
                                                r4VarS.N();
                                            }
                                            if (S().w(strI0, f3.W)) {
                                                byte[] bArrB5 = r4VarS.p().b();
                                                x9 x9Var7 = this.f1288g;
                                                Q(x9Var7);
                                                r4VarS.m0(x9Var7.H(bArrB5));
                                            }
                                            p4VarZ.x(r4VarS);
                                            i2++;
                                            j2 = j9;
                                        }
                                        long j10 = j2;
                                        if (Log.isLoggable(d().z(), 2)) {
                                            x9 x9Var8 = this.f1288g;
                                            Q(x9Var8);
                                            strY = x9Var8.y(p4VarZ.p());
                                        } else {
                                            strY = null;
                                        }
                                        Q(this.f1288g);
                                        byte[] bArrB6 = p4VarZ.p().b();
                                        S();
                                        strB = f3.q.b(null);
                                        URL url3 = new URL(strB);
                                        com.google.android.gms.common.internal.q.a(!arrayList.isEmpty());
                                        if (this.w != null) {
                                            d().o().a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.w = new ArrayList(arrayList);
                                        }
                                        this.f1290i.f1284j.b(j10);
                                        d().w().d("Uploading data. app, uncompressed size, data", size > 0 ? p4VarZ.w(0).x() : "?", Integer.valueOf(bArrB6.length), strY);
                                        this.s = true;
                                        x3 x3Var4 = this.b;
                                        Q(x3Var4);
                                        p9 p9Var3 = new p9(this, strI0);
                                        x3Var4.h();
                                        x3Var4.j();
                                        com.google.android.gms.common.internal.q.k(url3);
                                        com.google.android.gms.common.internal.q.k(bArrB6);
                                        com.google.android.gms.common.internal.q.k(p9Var3);
                                        x4 x4VarF3 = x3Var4.a.f();
                                        w3 w3Var3 = new w3(x3Var4, strI0, url3, bArrB6, null, p9Var3);
                                        x4VarF3.u(w3Var3);
                                        r3 = w3Var3;
                                    }
                                }
                                this.t = false;
                            } else {
                                d().w().a("Network not connected, ignoring upload request");
                            }
                        }
                        M();
                    }
                    L();
                    this.t = false;
                    M();
                }
                p3VarW = d().o();
                str2 = "Upload called in the client side when service should be used";
            }
            p3VarW.a(str2);
            this.t = false;
            M();
        } catch (Throwable th7) {
            this.t = false;
            M();
            throw th7;
        }
    }

    final void g0(t tVar, String str) {
        j jVar = this.c;
        Q(jVar);
        g5 g5VarC0 = jVar.c0(str);
        if (g5VarC0 == null || TextUtils.isEmpty(g5VarC0.e0())) {
            d().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolN = N(g5VarC0);
        if (boolN == null) {
            if (!"_ui".equals(tVar.a)) {
                d().r().b("Could not find package. appId", r3.x(str));
            }
        } else if (!boolN.booleanValue()) {
            d().o().b("App version does not match; dropping event. appId", r3.x(str));
            return;
        }
        String strQ = g5VarC0.Q();
        String strE0 = g5VarC0.e0();
        long jG0 = g5VarC0.g0();
        String strI0 = g5VarC0.i0();
        long jK0 = g5VarC0.k0();
        long jB = g5VarC0.b();
        boolean zF = g5VarC0.f();
        String strY = g5VarC0.Y();
        long jE = g5VarC0.E();
        boolean zG = g5VarC0.G();
        String strS = g5VarC0.S();
        Boolean boolI = g5VarC0.I();
        long jD = g5VarC0.d();
        List<String> listK = g5VarC0.K();
        td.a();
        h0(tVar, new ja(str, strQ, strE0, jG0, strI0, jK0, jB, (String) null, zF, false, strY, jE, 0L, 0, zG, false, strS, boolI, jD, listK, S().w(g5VarC0.N(), f3.h0) ? g5VarC0.U() : null, e0(str).d()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #2 {all -> 0x00ec, blocks: (B:12:0x005e, B:13:0x0062, B:15:0x0068, B:16:0x006e, B:17:0x008a, B:20:0x0095, B:21:0x009c, B:23:0x009e, B:24:0x00ad, B:26:0x00af, B:28:0x00b3, B:31:0x00ba, B:32:0x00bb), top: B:59:0x005e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[Catch: SQLiteException -> 0x00f6, all -> 0x016a, TryCatch #0 {SQLiteException -> 0x00f6, blocks: (B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5), top: B:57:0x0025, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0122 A[Catch: all -> 0x016a, PHI: r9
  0x0122: PHI (r9v18 int) = (r9v2 int), (r9v0 int) binds: [B:10:0x0023, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:45:0x0122, B:50:0x0159, B:49:0x014a, B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5, B:44:0x00f7), top: B:58:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:45:0x0122, B:50:0x0159, B:49:0x014a, B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5, B:44:0x00f7), top: B:58:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0094 A[SYNTHETIC] */
    final void h(int i2, Throwable th, byte[] bArr, String str) {
        x3 x3Var;
        j jVar;
        long jLongValue;
        f().h();
        c0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.s = false;
                M();
                throw th2;
            }
        }
        List<Long> list = this.w;
        com.google.android.gms.common.internal.q.k(list);
        List<Long> list2 = list;
        this.w = null;
        if (i2 == 200) {
            if (th == null) {
                try {
                    this.f1290i.f1283i.b(e().a());
                    this.f1290i.f1284j.b(0L);
                    L();
                    d().w().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                    j jVar2 = this.c;
                    Q(jVar2);
                    jVar2.M();
                    try {
                        for (Long l2 : list2) {
                            try {
                                jVar = this.c;
                                Q(jVar);
                                jLongValue = l2.longValue();
                                jVar.h();
                                jVar.j();
                                try {
                                    if (jVar.P().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    jVar.a.d().o().b("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                List<Long> list3 = this.x;
                                if (list3 == null || !list3.contains(l2)) {
                                    throw e2;
                                }
                            }
                        }
                        j jVar3 = this.c;
                        Q(jVar3);
                        jVar3.N();
                        j jVar4 = this.c;
                        Q(jVar4);
                        jVar4.O();
                        this.x = null;
                        x3Var = this.b;
                        Q(x3Var);
                        if (x3Var.m() || !K()) {
                            this.y = -1L;
                            L();
                        } else {
                            g();
                        }
                        this.f1295n = 0L;
                    } catch (Throwable th3) {
                        j jVar5 = this.c;
                        Q(jVar5);
                        jVar5.O();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    d().o().b("Database error while trying to delete uploaded bundles", e3);
                    this.f1295n = e().c();
                    d().w().b("Disable upload, time", Long.valueOf(this.f1295n));
                }
            } else {
                d().w().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
                this.f1290i.f1284j.b(e().a());
                if (i2 != 503 || i2 == 429) {
                    this.f1290i.f1282h.b(e().a());
                }
                j jVar6 = this.c;
                Q(jVar6);
                jVar6.n(list2);
                L();
            }
        } else if (i2 == 204) {
            i2 = 204;
            if (th == null) {
                this.f1290i.f1283i.b(e().a());
                this.f1290i.f1284j.b(0L);
                L();
                d().w().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                j jVar7 = this.c;
                Q(jVar7);
                jVar7.M();
                while (r9.hasNext()) {
                    jVar = this.c;
                    Q(jVar);
                    jLongValue = l2.longValue();
                    jVar.h();
                    jVar.j();
                    if (jVar.P().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                j jVar8 = this.c;
                Q(jVar8);
                jVar8.N();
                j jVar9 = this.c;
                Q(jVar9);
                jVar9.O();
                this.x = null;
                x3Var = this.b;
                Q(x3Var);
                if (x3Var.m()) {
                    this.y = -1L;
                    L();
                } else {
                    this.y = -1L;
                    L();
                }
                this.f1295n = 0L;
            } else {
                d().w().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
                this.f1290i.f1284j.b(e().a());
                if (i2 != 503) {
                    this.f1290i.f1282h.b(e().a());
                } else {
                    this.f1290i.f1282h.b(e().a());
                }
                j jVar10 = this.c;
                Q(jVar10);
                jVar10.n(list2);
                L();
            }
        } else {
            d().w().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.f1290i.f1284j.b(e().a());
            if (i2 != 503) {
                this.f1290i.f1282h.b(e().a());
            } else {
                this.f1290i.f1282h.b(e().a());
            }
            j jVar11 = this.c;
            Q(jVar11);
            jVar11.n(list2);
            L();
        }
        this.s = false;
        M();
    }

    final void h0(t tVar, ja jaVar) {
        com.google.android.gms.common.internal.q.g(jaVar.a);
        s3 s3VarA = s3.a(tVar);
        ca caVarB0 = b0();
        Bundle bundle = s3VarA.d;
        j jVar = this.c;
        Q(jVar);
        caVarB0.v(bundle, jVar.w(jaVar.a));
        b0().u(s3VarA, S().n(jaVar.a));
        t tVarB = s3VarA.b();
        if (S().w(null, f3.c0) && "_cmp".equals(tVarB.a) && "referrer API v2".equals(tVarB.b.l("_cis"))) {
            String strL = tVarB.b.l("gclid");
            if (!TextUtils.isEmpty(strL)) {
                o(new y9("_lgclid", tVarB.d, strL, "auto"), jaVar);
            }
        }
        i0(tVarB, jaVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    final void i(g5 g5Var) {
        f().h();
        td.a();
        f fVarS = S();
        String strN = g5Var.N();
        d3<Boolean> d3Var = f3.h0;
        if (fVarS.w(strN, d3Var)) {
            if (TextUtils.isEmpty(g5Var.Q()) && TextUtils.isEmpty(g5Var.U()) && TextUtils.isEmpty(g5Var.S())) {
                String strN2 = g5Var.N();
                com.google.android.gms.common.internal.q.k(strN2);
                j(strN2, 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(g5Var.Q()) && TextUtils.isEmpty(g5Var.S())) {
            String strN3 = g5Var.N();
            com.google.android.gms.common.internal.q.k(strN3);
            j(strN3, 204, null, null, null);
            return;
        }
        n9 n9Var = this.f1291j;
        Uri.Builder builder = new Uri.Builder();
        String strQ = g5Var.Q();
        if (TextUtils.isEmpty(strQ)) {
            td.a();
            if (n9Var.a.z().w(g5Var.N(), d3Var)) {
                strQ = g5Var.U();
                if (TextUtils.isEmpty(strQ)) {
                    strQ = g5Var.S();
                }
            } else {
                strQ = g5Var.S();
            }
        }
        h.f.a aVar = null;
        Uri.Builder builderEncodedAuthority = builder.scheme(f3.e.b(null)).encodedAuthority(f3.f.b(null));
        String strValueOf = String.valueOf(strQ);
        Uri.Builder builderAppendQueryParameter = builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", g5Var.O()).appendQueryParameter("platform", "android");
        n9Var.a.z().p();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(42004L));
        se.a();
        if (n9Var.a.z().w(g5Var.N(), f3.B0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String string = builder.build().toString();
        try {
            String strN4 = g5Var.N();
            com.google.android.gms.common.internal.q.k(strN4);
            String str = strN4;
            URL url = new URL(string);
            d().w().b("Fetching remote configuration", str);
            s4 s4Var = this.a;
            Q(s4Var);
            com.google.android.gms.internal.measurement.z3 z3VarM = s4Var.m(str);
            s4 s4Var2 = this.a;
            Q(s4Var2);
            String strN5 = s4Var2.n(str);
            if (z3VarM != null && !TextUtils.isEmpty(strN5)) {
                aVar = new h.f.a();
                aVar.put("If-Modified-Since", strN5);
            }
            this.r = true;
            x3 x3Var = this.b;
            Q(x3Var);
            q9 q9Var = new q9(this);
            x3Var.h();
            x3Var.j();
            com.google.android.gms.common.internal.q.k(url);
            com.google.android.gms.common.internal.q.k(q9Var);
            x3Var.a.f().u(new w3(x3Var, str, url, null, aVar, q9Var));
        } catch (MalformedURLException unused) {
            d().o().c("Failed to parse config URL. Not fetching. appId", r3.x(g5Var.N()), string);
        }
    }

    final void i0(t tVar, ja jaVar) {
        List<b> listB0;
        List<b> listB1;
        List<b> listB2;
        p3 p3VarO;
        String str;
        Object objX;
        String strR;
        Object obj;
        t tVar2 = tVar;
        com.google.android.gms.common.internal.q.k(jaVar);
        com.google.android.gms.common.internal.q.g(jaVar.a);
        f().h();
        c0();
        String str2 = jaVar.a;
        long j2 = tVar2.d;
        Q(this.f1288g);
        if (x9.O(tVar, jaVar)) {
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            List<String> list = jaVar.t;
            if (list != null) {
                if (!list.contains(tVar2.a)) {
                    d().v().d("Dropping non-safelisted event. appId, event name, origin", str2, tVar2.a, tVar2.c);
                    return;
                } else {
                    Bundle bundleQ = tVar2.b.q();
                    bundleQ.putLong("ga_safelisted", 1L);
                    tVar2 = new t(tVar2.a, new r(bundleQ), tVar2.c, tVar2.d);
                }
            }
            j jVar = this.c;
            Q(jVar);
            jVar.M();
            try {
                j jVar2 = this.c;
                Q(jVar2);
                com.google.android.gms.common.internal.q.g(str2);
                jVar2.h();
                jVar2.j();
                if (j2 < 0) {
                    jVar2.a.d().r().c("Invalid time querying timed out conditional properties", r3.x(str2), Long.valueOf(j2));
                    listB0 = Collections.emptyList();
                } else {
                    listB0 = jVar2.b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (b bVar : listB0) {
                    if (bVar != null) {
                        d().w().d("User property timed out", bVar.a, this.f1292k.H().r(bVar.c.b), bVar.c.f());
                        t tVar3 = bVar.f1169g;
                        if (tVar3 != null) {
                            j0(new t(tVar3, j2), jaVar);
                        }
                        j jVar3 = this.c;
                        Q(jVar3);
                        jVar3.Z(str2, bVar.c.b);
                    }
                }
                j jVar4 = this.c;
                Q(jVar4);
                com.google.android.gms.common.internal.q.g(str2);
                jVar4.h();
                jVar4.j();
                if (j2 < 0) {
                    jVar4.a.d().r().c("Invalid time querying expired conditional properties", r3.x(str2), Long.valueOf(j2));
                    listB1 = Collections.emptyList();
                } else {
                    listB1 = jVar4.b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listB1.size());
                for (b bVar2 : listB1) {
                    if (bVar2 != null) {
                        d().w().d("User property expired", bVar2.a, this.f1292k.H().r(bVar2.c.b), bVar2.c.f());
                        j jVar5 = this.c;
                        Q(jVar5);
                        jVar5.S(str2, bVar2.c.b);
                        t tVar4 = bVar2.f1173k;
                        if (tVar4 != null) {
                            arrayList.add(tVar4);
                        }
                        j jVar6 = this.c;
                        Q(jVar6);
                        jVar6.Z(str2, bVar2.c.b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j0(new t((t) it.next(), j2), jaVar);
                }
                j jVar7 = this.c;
                Q(jVar7);
                String str3 = tVar2.a;
                com.google.android.gms.common.internal.q.g(str2);
                com.google.android.gms.common.internal.q.g(str3);
                jVar7.h();
                jVar7.j();
                if (j2 < 0) {
                    jVar7.a.d().r().d("Invalid time querying triggered conditional properties", r3.x(str2), jVar7.a.H().p(str3), Long.valueOf(j2));
                    listB2 = Collections.emptyList();
                } else {
                    listB2 = jVar7.b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listB2.size());
                for (b bVar3 : listB2) {
                    if (bVar3 != null) {
                        y9 y9Var = bVar3.c;
                        String str4 = bVar3.a;
                        com.google.android.gms.common.internal.q.k(str4);
                        String str5 = bVar3.b;
                        String str6 = y9Var.b;
                        Object objF = y9Var.f();
                        com.google.android.gms.common.internal.q.k(objF);
                        aa aaVar = new aa(str4, str5, str6, j2, objF);
                        j jVar8 = this.c;
                        Q(jVar8);
                        if (jVar8.T(aaVar)) {
                            p3VarO = d().w();
                            str = "User property triggered";
                            objX = bVar3.a;
                            strR = this.f1292k.H().r(aaVar.c);
                            obj = aaVar.e;
                        } else {
                            p3VarO = d().o();
                            str = "Too many active user properties, ignoring";
                            objX = r3.x(bVar3.a);
                            strR = this.f1292k.H().r(aaVar.c);
                            obj = aaVar.e;
                        }
                        p3VarO.d(str, objX, strR, obj);
                        t tVar5 = bVar3.f1171i;
                        if (tVar5 != null) {
                            arrayList2.add(tVar5);
                        }
                        bVar3.c = new y9(aaVar);
                        bVar3.e = true;
                        j jVar9 = this.c;
                        Q(jVar9);
                        jVar9.X(bVar3);
                    }
                }
                j0(tVar2, jaVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    j0(new t((t) it2.next(), j2), jaVar);
                }
                j jVar10 = this.c;
                Q(jVar10);
                jVar10.N();
            } finally {
                j jVar11 = this.c;
                Q(jVar11);
                jVar11.O();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r8
  0x0047: PHI (r8v11 int) = (r8v2 int), (r8v0 int) binds: [B:12:0x0043, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0127 A[Catch: all -> 0x0168, TryCatch #1 {all -> 0x0168, blocks: (B:6:0x002c, B:16:0x004a, B:60:0x015a, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:39:0x00dd, B:51:0x0112, B:53:0x0127, B:55:0x0146, B:57:0x0151, B:59:0x0157, B:54:0x0135, B:45:0x00f6, B:47:0x0101), top: B:70:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[Catch: all -> 0x0168, TryCatch #1 {all -> 0x0168, blocks: (B:6:0x002c, B:16:0x004a, B:60:0x015a, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:39:0x00dd, B:51:0x0112, B:53:0x0127, B:55:0x0146, B:57:0x0151, B:59:0x0157, B:54:0x0135, B:45:0x00f6, B:47:0x0101), top: B:70:0x002c, outer: #0 }] */
    final void j(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        boolean z;
        j jVar;
        x3 x3Var;
        f().h();
        c0();
        com.google.android.gms.common.internal.q.g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                M();
                throw th2;
            }
        }
        p3 p3VarW = d().w();
        Integer numValueOf = Integer.valueOf(bArr.length);
        p3VarW.b("onConfigFetched. Response size", numValueOf);
        j jVar2 = this.c;
        Q(jVar2);
        jVar2.M();
        try {
            j jVar3 = this.c;
            Q(jVar3);
            g5 g5VarC0 = jVar3.c0(str);
            if (i2 == 200 || i2 == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i2 == 304) {
                i2 = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (g5VarC0 == null) {
                d().r().b("App does not exist in onConfigFetched. appId", r3.x(str));
            } else {
                if (z || i2 == 404) {
                    List<String> list = map != null ? map.get("Last-Modified") : null;
                    String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                    if (i2 == 404 || i2 == 304) {
                        s4 s4Var = this.a;
                        Q(s4Var);
                        if (s4Var.m(str) == null) {
                            s4 s4Var2 = this.a;
                            Q(s4Var2);
                            if (!s4Var2.s(str, null, null)) {
                                jVar = this.c;
                                Q(jVar);
                            }
                        }
                        g5VarC0.k(e().a());
                        j jVar4 = this.c;
                        Q(jVar4);
                        jVar4.d0(g5VarC0);
                        if (i2 == 404) {
                            d().t().b("Config not found. Using empty config. appId", str);
                        } else {
                            d().w().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), numValueOf);
                        }
                        x3Var = this.b;
                        Q(x3Var);
                        if (!x3Var.m() && K()) {
                            g();
                        }
                    } else {
                        s4 s4Var3 = this.a;
                        Q(s4Var3);
                        if (s4Var3.s(str, bArr, str2)) {
                            g5VarC0.k(e().a());
                            j jVar5 = this.c;
                            Q(jVar5);
                            jVar5.d0(g5VarC0);
                            if (i2 == 404) {
                                d().t().b("Config not found. Using empty config. appId", str);
                            } else {
                                d().w().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), numValueOf);
                            }
                            x3Var = this.b;
                            Q(x3Var);
                            if (!x3Var.m()) {
                            }
                        } else {
                            jVar = this.c;
                            Q(jVar);
                        }
                    }
                    jVar.O();
                    this.r = false;
                    M();
                }
                g5VarC0.m(e().a());
                j jVar6 = this.c;
                Q(jVar6);
                jVar6.d0(g5VarC0);
                d().w().c("Fetching config failed. code, error", Integer.valueOf(i2), th);
                s4 s4Var4 = this.a;
                Q(s4Var4);
                s4Var4.o(str);
                this.f1290i.f1284j.b(e().a());
                if (i2 == 503 || i2 == 429) {
                    this.f1290i.f1282h.b(e().a());
                }
                L();
            }
            j jVar7 = this.c;
            Q(jVar7);
            jVar7.N();
            jVar = this.c;
            Q(jVar);
            jVar.O();
            this.r = false;
            M();
        } catch (Throwable th3) {
            j jVar8 = this.c;
            Q(jVar8);
            jVar8.O();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0325 A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01be A[Catch: all -> 0x0b31, TRY_ENTER, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d5 A[Catch: all -> 0x0b31, TRY_LEAVE, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x022a  */
    /* JADX WARN: Code duplicated, block: B:77:0x023c A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x024a A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0256 A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x025c A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x026d A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0273  */
    /* JADX WARN: Code duplicated, block: B:89:0x0274 A[Catch: all -> 0x0b31, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02a8 A[Catch: all -> 0x0b31, TRY_LEAVE, TryCatch #1 {all -> 0x0b31, blocks: (B:39:0x0178, B:42:0x0187, B:44:0x0191, B:49:0x019d, B:106:0x0367, B:115:0x039f, B:117:0x03e1, B:119:0x03e6, B:120:0x03fd, B:124:0x0410, B:126:0x0428, B:128:0x042f, B:129:0x0446, B:134:0x047b, B:138:0x049e, B:139:0x04b5, B:142:0x04c6, B:145:0x04e3, B:146:0x04f7, B:148:0x0501, B:150:0x050e, B:152:0x0514, B:153:0x051d, B:154:0x052b, B:156:0x0540, B:166:0x0578, B:167:0x058d, B:169:0x05b6, B:172:0x05ce, B:175:0x061c, B:177:0x0648, B:179:0x0685, B:180:0x068a, B:182:0x0692, B:183:0x0697, B:185:0x069f, B:186:0x06a4, B:188:0x06ad, B:189:0x06b1, B:191:0x06be, B:192:0x06c3, B:194:0x06f0, B:196:0x06fa, B:198:0x0702, B:199:0x0707, B:201:0x0711, B:203:0x071b, B:205:0x0723, B:206:0x0725, B:212:0x073e, B:214:0x0746, B:215:0x0749, B:217:0x0761, B:220:0x0769, B:221:0x0783, B:223:0x0789, B:225:0x079d, B:227:0x07a9, B:229:0x07b6, B:233:0x07d0, B:234:0x07e0, B:238:0x07e9, B:239:0x07ec, B:241:0x0807, B:243:0x0819, B:245:0x081d, B:247:0x0828, B:248:0x0831, B:250:0x0875, B:251:0x087a, B:253:0x0882, B:256:0x088d, B:258:0x0891, B:260:0x089e, B:262:0x08be, B:263:0x08c9, B:265:0x08fd, B:266:0x0902, B:267:0x090f, B:269:0x0915, B:271:0x091f, B:272:0x092b, B:274:0x0935, B:275:0x0941, B:276:0x094d, B:278:0x0953, B:280:0x0983, B:281:0x09c9, B:283:0x09d3, B:284:0x09d6, B:285:0x09e2, B:287:0x09e8, B:296:0x0a37, B:297:0x0a85, B:299:0x0a94, B:320:0x0afe, B:302:0x0aac, B:304:0x0ab0, B:305:0x0ac3, B:290:0x09f5, B:292:0x0a21, B:319:0x0aeb, B:314:0x0acf, B:315:0x0ae6, B:207:0x0729, B:209:0x0733, B:211:0x073b, B:176:0x063a, B:163:0x055d, B:109:0x037f, B:110:0x0386, B:112:0x038c, B:114:0x0398, B:55:0x01b2, B:58:0x01be, B:60:0x01d5, B:67:0x01f6, B:75:0x0236, B:77:0x023c, B:79:0x024a, B:81:0x0256, B:84:0x0262, B:86:0x026d, B:89:0x0274, B:102:0x031a, B:104:0x0325, B:90:0x02a8, B:91:0x02ca, B:93:0x02dc, B:101:0x02fc, B:100:0x02e9, B:83:0x025c, B:70:0x0204, B:74:0x022c), top: B:330:0x0178, inners: #8, #9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v21 */
    final void j0(t tVar, ja jaVar) {
        String strL;
        long jLongValue;
        String upperCase;
        String strValueOf;
        String str;
        String str2;
        aa aaVarU;
        j jVar;
        aa aaVar;
        j jVar2;
        Object obj;
        double dDoubleValue;
        long length;
        long jDelete;
        p pVarA;
        com.google.android.gms.internal.measurement.r4 r4Var;
        String str3;
        ArrayList arrayList;
        Object obj2;
        p3 p3VarO;
        String str4;
        Object objX;
        int i2;
        String string;
        com.google.android.gms.common.internal.q.k(jaVar);
        com.google.android.gms.common.internal.q.g(jaVar.a);
        System.nanoTime();
        f().h();
        c0();
        String str5 = jaVar.a;
        Q(this.f1288g);
        if (!x9.O(tVar, jaVar)) {
            return;
        }
        if (!jaVar.f1234h) {
            y(jaVar);
            return;
        }
        s4 s4Var = this.a;
        Q(s4Var);
        String str6 = "_err";
        if (s4Var.t(str5, tVar.a)) {
            d().r().c("Dropping blacklisted event. appId", r3.x(str5), this.f1292k.H().p(tVar.a));
            s4 s4Var2 = this.a;
            Q(s4Var2);
            if (!s4Var2.w(str5)) {
                s4 s4Var3 = this.a;
                Q(s4Var3);
                if (!s4Var3.x(str5)) {
                    if ("_err".equals(tVar.a)) {
                        return;
                    }
                    b0().A(this.A, str5, 11, "_ev", tVar.a, 0, S().w(null, f3.v0));
                    return;
                }
            }
            j jVar3 = this.c;
            Q(jVar3);
            g5 g5VarC0 = jVar3.c0(str5);
            if (g5VarC0 != null) {
                long jAbs = Math.abs(e().a() - Math.max(g5VarC0.l(), g5VarC0.j()));
                S();
                if (jAbs > f3.z.b(null).longValue()) {
                    d().v().a("Fetching config for blacklisted app");
                    i(g5VarC0);
                    return;
                }
                return;
            }
            return;
        }
        s3 s3VarA = s3.a(tVar);
        b0().u(s3VarA, S().n(str5));
        t tVarB = s3VarA.b();
        if (Log.isLoggable(d().z(), 2)) {
            p3 p3VarW = d().w();
            m3 m3VarH = this.f1292k.H();
            if (m3VarH.o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("origin=");
                sb.append(tVarB.c);
                sb.append(",name=");
                sb.append(m3VarH.p(tVarB.a));
                sb.append(",params=");
                r rVar = tVarB.b;
                sb.append(rVar == null ? null : !m3VarH.o() ? rVar.toString() : m3VarH.s(rVar.q()));
                string = sb.toString();
            } else {
                string = tVarB.toString();
            }
            p3VarW.b("Logging event", string);
        }
        j jVar4 = this.c;
        Q(jVar4);
        jVar4.M();
        try {
            y(jaVar);
            boolean z = "ecommerce_purchase".equals(tVarB.a) || "purchase".equals(tVarB.a) || "refund".equals(tVarB.a);
            if ("_iap".equals(tVarB.a)) {
                strL = tVarB.b.l("currency");
                if (z) {
                    dDoubleValue = tVarB.b.j("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue = tVarB.b.h("value").longValue();
                        Double.isNaN(dLongValue);
                        dDoubleValue = dLongValue * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                        d().r().c("Data lost. Currency value is too big. appId", r3.x(str5), Double.valueOf(dDoubleValue));
                        j jVar5 = this.c;
                        Q(jVar5);
                        jVar5.N();
                        j jVar6 = this.c;
                        Q(jVar6);
                        jVar6.O();
                        return;
                    }
                    jLongValue = Math.round(dDoubleValue);
                    if ("refund".equals(tVarB.a)) {
                        jLongValue = -jLongValue;
                    }
                } else {
                    str6 = "_err";
                    jLongValue = tVarB.b.h("value").longValue();
                }
                if (!TextUtils.isEmpty(strL)) {
                    upperCase = strL.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strValueOf = String.valueOf(upperCase);
                        if (strValueOf.length() != 0) {
                            str = "_ltv_".concat(strValueOf);
                        } else {
                            str = new String("_ltv_");
                        }
                        str2 = str;
                        j jVar7 = this.c;
                        Q(jVar7);
                        aaVarU = jVar7.U(str5, str2);
                        if (aaVarU != null) {
                            obj = aaVarU.e;
                            if (obj instanceof Long) {
                                aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                            } else {
                                jVar = this.c;
                                Q(jVar);
                                int iT = S().t(str5, f3.E) - 1;
                                com.google.android.gms.common.internal.q.g(str5);
                                jVar.h();
                                jVar.j();
                                try {
                                    SQLiteDatabase sQLiteDatabaseP = jVar.P();
                                    String[] strArr = new String[3];
                                    strArr[0] = str5;
                                    strArr[1] = str5;
                                    try {
                                        strArr[2] = String.valueOf(iT);
                                        sQLiteDatabaseP.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                                    } catch (SQLiteException e) {
                                        e = e;
                                        jVar.a.d().o().c("Error pruning currencies. appId", r3.x(str5), e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                }
                                aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(jLongValue));
                            }
                        } else {
                            jVar = this.c;
                            Q(jVar);
                            int iT2 = S().t(str5, f3.E) - 1;
                            com.google.android.gms.common.internal.q.g(str5);
                            jVar.h();
                            jVar.j();
                            SQLiteDatabase sQLiteDatabaseP2 = jVar.P();
                            String[] strArr2 = new String[3];
                            strArr2[0] = str5;
                            strArr2[1] = str5;
                            strArr2[2] = String.valueOf(iT2);
                            sQLiteDatabaseP2.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr2);
                            aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(jLongValue));
                        }
                        jVar2 = this.c;
                        Q(jVar2);
                        if (!jVar2.T(aaVar)) {
                            d().o().d("Too many unique user properties are set. Ignoring user property. appId", r3.x(str5), this.f1292k.H().r(aaVar.c), aaVar.e);
                            b0().A(this.A, str5, 9, null, null, 0, S().w(null, f3.v0));
                        }
                    }
                }
                str6 = str6;
            } else if (z) {
                z = true;
                strL = tVarB.b.l("currency");
                if (z) {
                    dDoubleValue = tVarB.b.j("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue2 = tVarB.b.h("value").longValue();
                        Double.isNaN(dLongValue2);
                        dDoubleValue = dLongValue2 * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d) {
                    }
                    d().r().c("Data lost. Currency value is too big. appId", r3.x(str5), Double.valueOf(dDoubleValue));
                    j jVar8 = this.c;
                    Q(jVar8);
                    jVar8.N();
                    j jVar9 = this.c;
                    Q(jVar9);
                    jVar9.O();
                    return;
                }
                str6 = "_err";
                jLongValue = tVarB.b.h("value").longValue();
                if (!TextUtils.isEmpty(strL)) {
                    upperCase = strL.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strValueOf = String.valueOf(upperCase);
                        if (strValueOf.length() != 0) {
                            str = "_ltv_".concat(strValueOf);
                        } else {
                            str = new String("_ltv_");
                        }
                        str2 = str;
                        j jVar10 = this.c;
                        Q(jVar10);
                        aaVarU = jVar10.U(str5, str2);
                        if (aaVarU != null) {
                            obj = aaVarU.e;
                            if (obj instanceof Long) {
                                jVar = this.c;
                                Q(jVar);
                                int iT3 = S().t(str5, f3.E) - 1;
                                com.google.android.gms.common.internal.q.g(str5);
                                jVar.h();
                                jVar.j();
                                SQLiteDatabase sQLiteDatabaseP3 = jVar.P();
                                String[] strArr3 = new String[3];
                                strArr3[0] = str5;
                                strArr3[1] = str5;
                                strArr3[2] = String.valueOf(iT3);
                                sQLiteDatabaseP3.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr3);
                                aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(jLongValue));
                            } else {
                                aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                            }
                        } else {
                            jVar = this.c;
                            Q(jVar);
                            int iT4 = S().t(str5, f3.E) - 1;
                            com.google.android.gms.common.internal.q.g(str5);
                            jVar.h();
                            jVar.j();
                            SQLiteDatabase sQLiteDatabaseP4 = jVar.P();
                            String[] strArr4 = new String[3];
                            strArr4[0] = str5;
                            strArr4[1] = str5;
                            strArr4[2] = String.valueOf(iT4);
                            sQLiteDatabaseP4.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr4);
                            aaVar = new aa(str5, tVarB.c, str2, e().a(), Long.valueOf(jLongValue));
                        }
                        jVar2 = this.c;
                        Q(jVar2);
                        if (!jVar2.T(aaVar)) {
                            d().o().d("Too many unique user properties are set. Ignoring user property. appId", r3.x(str5), this.f1292k.H().r(aaVar.c), aaVar.e);
                            b0().A(this.A, str5, 9, null, null, 0, S().w(null, f3.v0));
                        }
                    }
                }
                str6 = str6;
            } else {
                str6 = "_err";
            }
            boolean zJ0 = ca.j0(tVarB.a);
            boolean zEquals = str6.equals(tVarB.a);
            b0();
            r rVar2 = tVarB.b;
            if (rVar2 == null) {
                length = 0;
            } else {
                q qVar = new q(rVar2);
                length = 0;
                while (qVar.hasNext()) {
                    Object objF = rVar2.f(qVar.next());
                    if (objF instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objF).length;
                    }
                }
            }
            j jVar11 = this.c;
            Q(jVar11);
            h hVarF0 = jVar11.f0(f0(), str5, length + 1, true, zJ0, false, zEquals, false);
            long j2 = hVarF0.b;
            S();
            long jIntValue = j2 - ((long) f3.f1196k.b(null).intValue());
            if (jIntValue > 0) {
                if (jIntValue % 1000 == 1) {
                    d().o().c("Data loss. Too many events logged. appId, count", r3.x(str5), Long.valueOf(hVarF0.b));
                }
                j jVar12 = this.c;
                Q(jVar12);
                jVar12.N();
                j jVar13 = this.c;
                Q(jVar13);
                jVar13.O();
                return;
            }
            if (zJ0) {
                long j3 = hVarF0.a;
                S();
                long jIntValue2 = j3 - ((long) f3.f1198m.b(null).intValue());
                if (jIntValue2 > 0) {
                    if (jIntValue2 % 1000 == 1) {
                        d().o().c("Data loss. Too many public events logged. appId, count", r3.x(str5), Long.valueOf(hVarF0.a));
                    }
                    b0().A(this.A, str5, 16, "_ev", tVarB.a, 0, S().w(null, f3.v0));
                    j jVar14 = this.c;
                    Q(jVar14);
                    jVar14.N();
                    j jVar15 = this.c;
                    Q(jVar15);
                    jVar15.O();
                    return;
                }
            }
            if (zEquals) {
                long jMax = hVarF0.d - ((long) Math.max(0, Math.min(1000000, S().t(jaVar.a, f3.f1197l))));
                if (jMax > 0) {
                    if (jMax == 1) {
                        d().o().c("Too many error events logged. appId, count", r3.x(str5), Long.valueOf(hVarF0.d));
                    }
                    j jVar16 = this.c;
                    Q(jVar16);
                    jVar16.N();
                    j jVar17 = this.c;
                    Q(jVar17);
                    jVar17.O();
                    return;
                }
            }
            Bundle bundleQ = tVarB.b.q();
            b0().z(bundleQ, "_o", tVarB.c);
            if (b0().H(str5)) {
                b0().z(bundleQ, "_dbg", 1L);
                b0().z(bundleQ, "_r", 1L);
            }
            if ("_s".equals(tVarB.a)) {
                j jVar18 = this.c;
                Q(jVar18);
                aa aaVarU2 = jVar18.U(jaVar.a, "_sno");
                if (aaVarU2 != null && (aaVarU2.e instanceof Long)) {
                    b0().z(bundleQ, "_sno", aaVarU2.e);
                }
            }
            j jVar19 = this.c;
            Q(jVar19);
            com.google.android.gms.common.internal.q.g(str5);
            jVar19.h();
            jVar19.j();
            try {
                try {
                    jDelete = jVar19.P().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str5, String.valueOf(Math.max(0, Math.min(1000000, jVar19.a.z().t(str5, f3.p))))});
                } catch (SQLiteException e3) {
                    e = e3;
                    jVar19.a.d().o().c("Error deleting over the limit events. appId", r3.x(str5), e);
                    jDelete = 0;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
            if (jDelete > 0) {
                d().r().c("Data lost. Too many events stored on disk, deleted. appId", r3.x(str5), Long.valueOf(jDelete));
            }
            a5 a5Var = this.f1292k;
            String str7 = tVarB.c;
            String str8 = tVarB.a;
            long j4 = tVarB.d;
            o oVar = new o(a5Var, str7, str5, str8, j4, 0L, bundleQ);
            j jVar20 = this.c;
            Q(jVar20);
            p pVarQ = jVar20.Q(str5, oVar.b);
            if (pVarQ == null) {
                j jVar21 = this.c;
                Q(jVar21);
                if (jVar21.u(str5) >= S().o(str5) && zJ0) {
                    d().o().d("Too many event names used, ignoring event. appId, name, supported count", r3.x(str5), this.f1292k.H().p(oVar.b), Integer.valueOf(S().o(str5)));
                    b0().A(this.A, str5, 8, null, null, 0, S().w(null, f3.v0));
                    j jVar22 = this.c;
                    Q(jVar22);
                    jVar22.O();
                    return;
                }
                r4Var = 0;
                pVarA = new p(str5, oVar.b, 0L, 0L, 0L, oVar.d, 0L, null, null, null, null);
            } else {
                oVar = oVar.a(this.f1292k, pVarQ.f);
                pVarA = pVarQ.a(oVar.d);
                r4Var = j4;
            }
            j jVar23 = this.c;
            Q(jVar23);
            jVar23.R(pVarA);
            f().h();
            c0();
            com.google.android.gms.common.internal.q.k(oVar);
            com.google.android.gms.common.internal.q.k(jaVar);
            com.google.android.gms.common.internal.q.g(oVar.a);
            com.google.android.gms.common.internal.q.a(oVar.a.equals(jaVar.a));
            com.google.android.gms.internal.measurement.r4 r4VarK0 = com.google.android.gms.internal.measurement.s4.K0();
            r4VarK0.a0(1);
            r4VarK0.w("android");
            if (!TextUtils.isEmpty(jaVar.a)) {
                r4VarK0.D(jaVar.a);
            }
            if (!TextUtils.isEmpty(jaVar.d)) {
                r4VarK0.B(jaVar.d);
            }
            if (!TextUtils.isEmpty(jaVar.c)) {
                r4VarK0.E(jaVar.c);
            }
            long j5 = jaVar.f1236j;
            if (j5 != -2147483648L) {
                r4VarK0.c0((int) j5);
            }
            r4VarK0.G(jaVar.e);
            if (!TextUtils.isEmpty(jaVar.b)) {
                r4VarK0.W(jaVar.b);
            }
            String str9 = jaVar.a;
            com.google.android.gms.common.internal.q.k(str9);
            r4VarK0.p0(e0(str9).k(g.c(jaVar.v)).d());
            td.a();
            if (!S().w(jaVar.a, f3.h0)) {
                if (TextUtils.isEmpty(r4VarK0.V()) && !TextUtils.isEmpty(jaVar.q)) {
                    str3 = jaVar.q;
                    r4VarK0.j0(str3);
                }
                j jVar24 = this.c;
                Q(jVar24);
                jVar24.O();
                throw th;
            }
            if (TextUtils.isEmpty(r4VarK0.V()) && !TextUtils.isEmpty(jaVar.u)) {
                r4VarK0.o0(jaVar.u);
            }
            if (TextUtils.isEmpty(r4VarK0.V()) && TextUtils.isEmpty(r4VarK0.n0()) && !TextUtils.isEmpty(jaVar.q)) {
                str3 = jaVar.q;
                r4VarK0.j0(str3);
            }
            j jVar25 = this.c;
            Q(jVar25);
            jVar25.O();
            throw th;
            long j6 = jaVar.f;
            if (j6 != 0) {
                r4VarK0.P(j6);
            }
            r4VarK0.l0(jaVar.s);
            x9 x9Var = this.f1288g;
            Q(x9Var);
            Map<String, String> mapA = f3.a(x9Var.b.f1292k.c());
            if (mapA == null || mapA.size() == 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int iIntValue = f3.P.b(null).intValue();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    if (entry.getKey().startsWith("measurement.id.")) {
                        try {
                            int i3 = Integer.parseInt(entry.getValue());
                            if (i3 != 0) {
                                arrayList.add(Integer.valueOf(i3));
                                if (arrayList.size() >= iIntValue) {
                                    x9Var.a.d().r().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } catch (NumberFormatException e5) {
                            x9Var.a.d().r().b("Experiment ID NumberFormatException", e5);
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                r4VarK0.k0(arrayList);
            }
            String str10 = jaVar.a;
            com.google.android.gms.common.internal.q.k(str10);
            g gVarK = e0(str10).k(g.c(jaVar.v));
            if (gVarK.f()) {
                Pair<String, Boolean> pairM = this.f1290i.m(jaVar.a, gVarK);
                if (!TextUtils.isEmpty((CharSequence) pairM.first) && jaVar.f1241o) {
                    r4VarK0.I((String) pairM.first);
                    Object obj3 = pairM.second;
                    if (obj3 != null) {
                        r4VarK0.K(((Boolean) obj3).booleanValue());
                    }
                }
            }
            this.f1292k.S().l();
            r4VarK0.y(Build.MODEL);
            this.f1292k.S().l();
            r4VarK0.x(Build.VERSION.RELEASE);
            r4VarK0.A((int) this.f1292k.S().o());
            r4VarK0.z(this.f1292k.S().p());
            f fVarS = S();
            d3<Boolean> d3Var = f3.t0;
            if (!fVarS.w(null, d3Var)) {
                r4VarK0.f0(jaVar.f1238l);
            }
            if (this.f1292k.k()) {
                r4VarK0.C();
                if (!TextUtils.isEmpty(null)) {
                    r4VarK0.g0(null);
                    throw null;
                }
            }
            j jVar26 = this.c;
            Q(jVar26);
            g5 g5VarC1 = jVar26.c0(jaVar.a);
            if (g5VarC1 == null) {
                g5VarC1 = new g5(this.f1292k, jaVar.a);
                g5VarC1.P(b(gVarK));
                g5VarC1.Z(jaVar.f1237k);
                g5VarC1.R(jaVar.b);
                if (gVarK.f()) {
                    g5VarC1.X(this.f1290i.o(jaVar.a));
                }
                g5VarC1.h(0L);
                g5VarC1.b0(0L);
                g5VarC1.d0(0L);
                g5VarC1.f0(jaVar.c);
                g5VarC1.h0(jaVar.f1236j);
                g5VarC1.j0(jaVar.d);
                g5VarC1.a(jaVar.e);
                g5VarC1.c(jaVar.f);
                g5VarC1.g(jaVar.f1234h);
                if (!S().w(null, d3Var)) {
                    g5VarC1.F(jaVar.f1238l);
                }
                g5VarC1.e(jaVar.s);
                j jVar27 = this.c;
                Q(jVar27);
                jVar27.d0(g5VarC1);
            }
            if (gVarK.h() && !TextUtils.isEmpty(g5VarC1.O())) {
                String strO = g5VarC1.O();
                com.google.android.gms.common.internal.q.k(strO);
                r4VarK0.M(strO);
            }
            if (!TextUtils.isEmpty(g5VarC1.Y())) {
                String strY = g5VarC1.Y();
                com.google.android.gms.common.internal.q.k(strY);
                r4VarK0.b0(strY);
            }
            j jVar28 = this.c;
            Q(jVar28);
            List<aa> listV = jVar28.V(jaVar.a);
            for (int i4 = 0; i4 < listV.size(); i4++) {
                com.google.android.gms.internal.measurement.c5 c5VarH = com.google.android.gms.internal.measurement.d5.H();
                c5VarH.x(listV.get(i4).c);
                c5VarH.w(listV.get(i4).d);
                x9 x9Var2 = this.f1288g;
                Q(x9Var2);
                x9Var2.v(c5VarH, listV.get(i4).e);
                r4VarK0.D0(c5VarH);
            }
            try {
                try {
                    j jVar29 = this.c;
                    Q(jVar29);
                    com.google.android.gms.internal.measurement.s4 s4Var4 = (com.google.android.gms.internal.measurement.s4) r4VarK0.p();
                    jVar29.h();
                    jVar29.j();
                    com.google.android.gms.common.internal.q.k(s4Var4);
                    com.google.android.gms.common.internal.q.g(s4Var4.x());
                    byte[] bArrB = s4Var4.b();
                    x9 x9Var3 = jVar29.b.f1288g;
                    Q(x9Var3);
                    long jH = x9Var3.H(bArrB);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", s4Var4.x());
                    contentValues.put("metadata_fingerprint", Long.valueOf(jH));
                    contentValues.put("metadata", bArrB);
                    try {
                        try {
                            jVar29.P().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                            j jVar30 = this.c;
                            Q(jVar30);
                            q qVar2 = new q(oVar.f);
                            while (true) {
                                if (!qVar2.hasNext()) {
                                    s4 s4Var5 = this.a;
                                    Q(s4Var5);
                                    boolean zU = s4Var5.u(oVar.a, oVar.b);
                                    j jVar31 = this.c;
                                    Q(jVar31);
                                    h hVarE0 = jVar31.e0(f0(), oVar.a, false, false, false, false, false);
                                    if (!zU || hVarE0.e >= S().t(oVar.a, f3.f1200o)) {
                                        i2 = 0;
                                        break;
                                    }
                                } else if ("_r".equals(qVar2.next())) {
                                }
                                i2 = 1;
                                break;
                            }
                            jVar30.h();
                            jVar30.j();
                            com.google.android.gms.common.internal.q.k(oVar);
                            com.google.android.gms.common.internal.q.g(oVar.a);
                            x9 x9Var4 = jVar30.b.f1288g;
                            Q(x9Var4);
                            byte[] bArrB2 = x9Var4.x(oVar).b();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", oVar.a);
                            contentValues2.put("name", oVar.b);
                            contentValues2.put("timestamp", Long.valueOf(oVar.d));
                            contentValues2.put("metadata_fingerprint", Long.valueOf(jH));
                            contentValues2.put("data", bArrB2);
                            contentValues2.put("realtime", Integer.valueOf(i2));
                            try {
                                if (jVar30.P().insert("raw_events", null, contentValues2) == -1) {
                                    jVar30.a.d().o().b("Failed to insert raw event (got -1). appId", r3.x(oVar.a));
                                } else {
                                    this.f1295n = 0L;
                                }
                            } catch (SQLiteException e6) {
                                obj2 = e6;
                                p3VarO = jVar30.a.d().o();
                                str4 = "Error storing raw event. appId";
                                objX = r3.x(oVar.a);
                                p3VarO.c(str4, objX, obj2);
                            }
                            j jVar32 = this.c;
                            Q(jVar32);
                            jVar32.N();
                            j jVar33 = this.c;
                            Q(jVar33);
                            jVar33.O();
                            L();
                            d().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - r8) + 500000) / 1000000));
                        } catch (SQLiteException e7) {
                            e = e7;
                            SQLiteException sQLiteException = e;
                            jVar29.a.d().o().c("Error storing raw event metadata. appId", r3.x(s4Var4.x()), sQLiteException);
                            throw sQLiteException;
                        }
                    } catch (SQLiteException e8) {
                        e = e8;
                    }
                } catch (IOException e9) {
                    e = e9;
                    obj2 = e;
                    p3VarO = d().o();
                    str4 = "Data loss. Failed to insert raw event metadata. appId";
                    objX = r3.x(r4Var.C());
                    p3VarO.c(str4, objX, obj2);
                    j jVar34 = this.c;
                    Q(jVar34);
                    jVar34.N();
                    j jVar35 = this.c;
                    Q(jVar35);
                    jVar35.O();
                    L();
                    d().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - r8) + 500000) / 1000000));
                }
            } catch (IOException e10) {
                e = e10;
                r4Var = r4VarK0;
                obj2 = e;
                p3VarO = d().o();
                str4 = "Data loss. Failed to insert raw event metadata. appId";
                objX = r3.x(r4Var.C());
                p3VarO.c(str4, objX, obj2);
                j jVar36 = this.c;
                Q(jVar36);
                jVar36.N();
                j jVar37 = this.c;
                Q(jVar37);
                jVar37.O();
                L();
                d().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - r8) + 500000) / 1000000));
            }
        } catch (Throwable th) {
            j jVar210 = this.c;
            Q(jVar210);
            jVar210.O();
            throw th;
        }
    }

    final void k(Runnable runnable) {
        f().h();
        if (this.f1296o == null) {
            this.f1296o = new ArrayList();
        }
        this.f1296o.add(runnable);
    }

    final void l() {
        p3 p3VarO;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        f().h();
        c0();
        if (this.f1294m) {
            return;
        }
        this.f1294m = true;
        if (m()) {
            FileChannel fileChannel = this.v;
            f().h();
            int i2 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                d().o().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i3 = fileChannel.read(byteBufferAllocate);
                    if (i3 == 4) {
                        byteBufferAllocate.flip();
                        i2 = byteBufferAllocate.getInt();
                    } else if (i3 != -1) {
                        d().r().b("Unexpected data length. Bytes read", Integer.valueOf(i3));
                    }
                } catch (IOException e) {
                    d().o().b("Failed to read from channel", e);
                }
            }
            int iT = this.f1292k.b().t();
            f().h();
            if (i2 > iT) {
                p3VarO = d().o();
                numValueOf = Integer.valueOf(i2);
                numValueOf2 = Integer.valueOf(iT);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (i2 >= iT) {
                    return;
                }
                FileChannel fileChannel2 = this.v;
                f().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    d().o().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iT);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        if (S().w(null, f3.q0) && Build.VERSION.SDK_INT <= 19) {
                            fileChannel2.position(0L);
                        }
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            d().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        p3VarO = d().w();
                        numValueOf = Integer.valueOf(i2);
                        numValueOf2 = Integer.valueOf(iT);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e2) {
                        d().o().b("Failed to write to channel", e2);
                        p3VarO = d().o();
                        numValueOf = Integer.valueOf(i2);
                        numValueOf2 = Integer.valueOf(iT);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                p3VarO = d().o();
                numValueOf = Integer.valueOf(i2);
                numValueOf2 = Integer.valueOf(iT);
                str = "Storage version upgrade failed. Previous, current version";
            }
            p3VarO.c(str, numValueOf, numValueOf2);
        }
    }

    final boolean m() {
        p3 p3VarR;
        String str;
        FileLock fileLock;
        f().h();
        if (S().w(null, f3.g0) && (fileLock = this.u) != null && fileLock.isValid()) {
            d().w().a("Storage concurrent access okay");
            return true;
        }
        this.c.a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f1292k.c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.v = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.u = fileLockTryLock;
            if (fileLockTryLock != null) {
                d().w().a("Storage concurrent access okay");
                return true;
            }
            d().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            p3VarR = d().o();
            str = "Failed to acquire storage lock";
            p3VarR.b(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            p3VarR = d().o();
            str = "Failed to access storage lock file";
            p3VarR.b(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            p3VarR = d().r();
            str = "Storage lock already acquired";
            p3VarR.b(str, e);
            return false;
        }
    }

    final void n(ja jaVar) {
        if (this.w != null) {
            ArrayList arrayList = new ArrayList();
            this.x = arrayList;
            arrayList.addAll(this.w);
        }
        j jVar = this.c;
        Q(jVar);
        String str = jaVar.a;
        com.google.android.gms.common.internal.q.k(str);
        String str2 = str;
        com.google.android.gms.common.internal.q.g(str2);
        jVar.h();
        jVar.j();
        try {
            SQLiteDatabase sQLiteDatabaseP = jVar.P();
            String[] strArr = {str2};
            int iDelete = sQLiteDatabaseP.delete("apps", "app_id=?", strArr) + sQLiteDatabaseP.delete("events", "app_id=?", strArr) + sQLiteDatabaseP.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseP.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseP.delete("queue", "app_id=?", strArr) + sQLiteDatabaseP.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseP.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseP.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                jVar.a.d().w().c("Reset analytics data. app, records", str2, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            jVar.a.d().o().c("Error resetting analytics data. appId, error", r3.x(str2), e);
        }
        if (jaVar.f1234h) {
            t(jaVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    final void o(y9 y9Var, ja jaVar) {
        p pVarQ;
        long jLongValue;
        f().h();
        c0();
        if (P(jaVar)) {
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            int iQ0 = b0().q0(y9Var.b);
            ca caVarB0 = b0();
            if (iQ0 != 0) {
                String str = y9Var.b;
                S();
                String strQ = caVarB0.q(str, 24, true);
                String str2 = y9Var.b;
                b0().A(this.A, jaVar.a, iQ0, "_ev", strQ, str2 != null ? str2.length() : 0, S().w(null, f3.v0));
                return;
            }
            int iX = caVarB0.x(y9Var.b, y9Var.f());
            if (iX != 0) {
                ca caVarB1 = b0();
                String str3 = y9Var.b;
                S();
                String strQ2 = caVarB1.q(str3, 24, true);
                Object objF = y9Var.f();
                b0().A(this.A, jaVar.a, iX, "_ev", strQ2, (objF == null || !((objF instanceof String) || (objF instanceof CharSequence))) ? 0 : String.valueOf(objF).length(), S().w(null, f3.v0));
                return;
            }
            Object objY = b0().y(y9Var.b, y9Var.f());
            if (objY == null) {
                return;
            }
            if ("_sid".equals(y9Var.b)) {
                long j2 = y9Var.c;
                String str4 = y9Var.f;
                String str5 = jaVar.a;
                com.google.android.gms.common.internal.q.k(str5);
                String str6 = str5;
                j jVar = this.c;
                Q(jVar);
                aa aaVarU = jVar.U(str6, "_sno");
                if (aaVarU != null) {
                    Object obj = aaVarU.e;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (aaVarU != null) {
                            d().r().b("Retrieved last session number from database does not contain a valid (long) value", aaVarU.e);
                        }
                        j jVar2 = this.c;
                        Q(jVar2);
                        pVarQ = jVar2.Q(str6, "_s");
                        if (pVarQ != null) {
                            jLongValue = pVarQ.c;
                            d().w().b("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (aaVarU != null) {
                        d().r().b("Retrieved last session number from database does not contain a valid (long) value", aaVarU.e);
                    }
                    j jVar3 = this.c;
                    Q(jVar3);
                    pVarQ = jVar3.Q(str6, "_s");
                    if (pVarQ != null) {
                        jLongValue = pVarQ.c;
                        d().w().b("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                o(new y9("_sno", j2, Long.valueOf(jLongValue + 1), str4), jaVar);
            }
            String str7 = jaVar.a;
            com.google.android.gms.common.internal.q.k(str7);
            String str8 = str7;
            String str9 = y9Var.f;
            com.google.android.gms.common.internal.q.k(str9);
            aa aaVar = new aa(str8, str9, y9Var.b, y9Var.c, objY);
            d().w().c("Setting user property", this.f1292k.H().r(aaVar.c), objY);
            j jVar4 = this.c;
            Q(jVar4);
            jVar4.M();
            try {
                y(jaVar);
                j jVar5 = this.c;
                Q(jVar5);
                boolean zT = jVar5.T(aaVar);
                j jVar6 = this.c;
                Q(jVar6);
                jVar6.N();
                if (!zT) {
                    d().o().c("Too many unique user properties are set. Ignoring user property", this.f1292k.H().r(aaVar.c), aaVar.e);
                    b0().A(this.A, jaVar.a, 9, null, null, 0, S().w(null, f3.v0));
                }
            } finally {
                j jVar7 = this.c;
                Q(jVar7);
                jVar7.O();
            }
        }
    }

    final void p(y9 y9Var, ja jaVar) {
        f().h();
        c0();
        if (P(jaVar)) {
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            if ("_npa".equals(y9Var.b) && jaVar.r != null) {
                d().v().a("Falling back to manifest metadata value for ad personalization");
                o(new y9("_npa", e().a(), Long.valueOf(true != jaVar.r.booleanValue() ? 0L : 1L), "auto"), jaVar);
                return;
            }
            d().v().b("Removing user property", this.f1292k.H().r(y9Var.b));
            j jVar = this.c;
            Q(jVar);
            jVar.M();
            try {
                y(jaVar);
                j jVar2 = this.c;
                Q(jVar2);
                String str = jaVar.a;
                com.google.android.gms.common.internal.q.k(str);
                jVar2.S(str, y9Var.b);
                j jVar3 = this.c;
                Q(jVar3);
                jVar3.N();
                d().v().b("User property removed", this.f1292k.H().r(y9Var.b));
            } finally {
                j jVar4 = this.c;
                Q(jVar4);
                jVar4.O();
            }
        }
    }

    final void q() {
        this.p++;
    }

    final void r() {
        this.q++;
    }

    final a5 s() {
        return this.f1292k;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03c9 A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03f4 A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0434 A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x043c A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0446 A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0463  */
    /* JADX WARN: Code duplicated, block: B:148:0x046c  */
    /* JADX WARN: Code duplicated, block: B:149:0x046f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0482  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ae A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x04b4 A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x04c1 A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x04cc A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x040b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0216  */
    /* JADX WARN: Code duplicated, block: B:72:0x021a A[Catch: all -> 0x058f, TryCatch #4 {all -> 0x058f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0118, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01b7, B:53:0x01cc, B:56:0x01e2, B:58:0x01ed, B:63:0x01fe, B:66:0x020c, B:70:0x0217, B:72:0x021a, B:74:0x023b, B:76:0x0240, B:79:0x025f, B:82:0x0273, B:84:0x029c, B:87:0x02a4, B:89:0x02b3, B:90:0x02bf, B:120:0x0397, B:122:0x03c9, B:123:0x03cc, B:125:0x03f4, B:166:0x04cc, B:167:0x04cf, B:172:0x0531, B:174:0x053f, B:175:0x055f, B:179:0x057e, B:128:0x040b, B:133:0x0434, B:135:0x043c, B:137:0x0446, B:142:0x045b, B:146:0x0465, B:150:0x0471, B:153:0x0489, B:158:0x04ae, B:160:0x04b4, B:161:0x04bb, B:163:0x04c1, B:156:0x049a, B:131:0x041e, B:91:0x02c4, B:93:0x02f1, B:94:0x02fe, B:96:0x0305, B:98:0x030b, B:100:0x0315, B:102:0x031b, B:104:0x0321, B:106:0x0327, B:107:0x032c, B:113:0x0354, B:116:0x0359, B:117:0x036d, B:118:0x037b, B:119:0x0389, B:168:0x04e6, B:170:0x051a, B:171:0x051d, B:176:0x0563, B:178:0x0567, B:77:0x024f, B:29:0x00c4, B:31:0x00c8, B:35:0x00d7, B:37:0x00f3, B:39:0x00fd, B:42:0x0108), top: B:194:0x00a4, inners: #0, #1, #2, #3 }] */
    final void t(ja jaVar) {
        String str;
        String str2;
        int i2;
        String str3;
        p pVarQ;
        boolean z;
        t tVar;
        String str4;
        p3 p3VarS;
        String str5;
        Bundle bundle;
        String str6;
        String str7;
        String str8;
        long jQ;
        PackageInfo packageInfoE;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfoC;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        String strE0;
        boolean z4;
        f().h();
        c0();
        com.google.android.gms.common.internal.q.k(jaVar);
        com.google.android.gms.common.internal.q.g(jaVar.a);
        if (P(jaVar)) {
            j jVar = this.c;
            Q(jVar);
            g5 g5VarC0 = jVar.c0(jaVar.a);
            if (g5VarC0 != null && TextUtils.isEmpty(g5VarC0.Q()) && !TextUtils.isEmpty(jaVar.b)) {
                g5VarC0.k(0L);
                j jVar2 = this.c;
                Q(jVar2);
                jVar2.d0(g5VarC0);
                s4 s4Var = this.a;
                Q(s4Var);
                s4Var.p(jaVar.a);
            }
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            long jA = jaVar.f1239m;
            if (jA == 0) {
                jA = e().a();
            }
            this.f1292k.S().r();
            int i3 = jaVar.f1240n;
            if (i3 != 0 && i3 != 1) {
                d().r().c("Incorrect app type, assuming installed app. appId, appType", r3.x(jaVar.a), Integer.valueOf(i3));
                i3 = 0;
            }
            j jVar3 = this.c;
            Q(jVar3);
            jVar3.M();
            try {
                j jVar4 = this.c;
                Q(jVar4);
                aa aaVarU = jVar4.U(jaVar.a, "_npa");
                if (aaVarU == null || "auto".equals(aaVarU.b)) {
                    Boolean bool = jaVar.r;
                    if (bool != null) {
                        str = "_sysu";
                        str2 = "_sys";
                        i2 = 1;
                        y9 y9Var = new y9("_npa", jA, Long.valueOf(true != bool.booleanValue() ? 0L : 1L), "auto");
                        if (aaVarU == null || !aaVarU.e.equals(y9Var.d)) {
                            o(y9Var, jaVar);
                        }
                    } else {
                        str = "_sysu";
                        str2 = "_sys";
                        i2 = 1;
                        if (aaVarU != null) {
                            p(new y9("_npa", jA, null, "auto"), jaVar);
                        }
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    i2 = 1;
                }
                j jVar5 = this.c;
                Q(jVar5);
                String str9 = jaVar.a;
                com.google.android.gms.common.internal.q.k(str9);
                g5 g5VarC1 = jVar5.c0(str9);
                if (g5VarC1 != null && b0().p(jaVar.b, g5VarC1.Q(), jaVar.q, g5VarC1.S())) {
                    d().r().b("New GMP App Id passed in. Removing cached database data. appId", r3.x(g5VarC1.N()));
                    j jVar6 = this.c;
                    Q(jVar6);
                    String strN = g5VarC1.N();
                    jVar6.j();
                    jVar6.h();
                    com.google.android.gms.common.internal.q.g(strN);
                    try {
                        SQLiteDatabase sQLiteDatabaseP = jVar6.P();
                        String[] strArr = new String[i2];
                        strArr[0] = strN;
                        int iDelete = sQLiteDatabaseP.delete("events", "app_id=?", strArr) + sQLiteDatabaseP.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseP.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseP.delete("apps", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseP.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseP.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseP.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseP.delete("consent_settings", "app_id=?", strArr);
                        if (iDelete > 0) {
                            jVar6.a.d().w().c("Deleted application data. app, records", strN, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e) {
                        jVar6.a.d().o().c("Error deleting application data. appId, error", r3.x(strN), e);
                    }
                    g5VarC1 = null;
                }
                if (g5VarC1 != null) {
                    if (g5VarC1.g0() != -2147483648L) {
                        long jG0 = g5VarC1.g0();
                        str3 = GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE;
                        z3 = jG0 != jaVar.f1236j;
                        strE0 = g5VarC1.e0();
                        if (g5VarC1.g0() == -2147483648L || strE0 == null || strE0.equals(jaVar.c)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4 | z3) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_pv", strE0);
                            i0(new t("_au", new r(bundle2), "auto", jA), jaVar);
                        }
                    } else {
                        str3 = GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE;
                    }
                    strE0 = g5VarC1.e0();
                    if (g5VarC1.g0() == -2147483648L) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4 | z3) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("_pv", strE0);
                        i0(new t("_au", new r(bundle3), "auto", jA), jaVar);
                    }
                } else {
                    str3 = GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE;
                }
                y(jaVar);
                if (i3 == 0) {
                    j jVar7 = this.c;
                    Q(jVar7);
                    pVarQ = jVar7.Q(jaVar.a, "_f");
                    z = false;
                } else {
                    j jVar8 = this.c;
                    Q(jVar8);
                    pVarQ = jVar8.Q(jaVar.a, "_v");
                    z = true;
                }
                if (pVarQ == null) {
                    long j4 = ((jA / 3600000) + 1) * 3600000;
                    String str10 = "_et";
                    if (z) {
                        o(new y9("_fvt", jA, Long.valueOf(j4), "auto"), jaVar);
                        f().h();
                        c0();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1L);
                        bundle4.putLong("_r", 1L);
                        str4 = "_et";
                        bundle4.putLong(str4, 1L);
                        if (jaVar.p) {
                            bundle4.putLong("_dac", 1L);
                        }
                        h0(new t("_v", new r(bundle4), "auto", jA), jaVar);
                    } else {
                        o(new y9("_fot", jA, Long.valueOf(j4), "auto"), jaVar);
                        f().h();
                        k4 k4VarD = this.f1292k.D();
                        com.google.android.gms.common.internal.q.k(k4VarD);
                        k4 k4Var = k4VarD;
                        String str11 = jaVar.a;
                        if (str11 == null || str11.isEmpty()) {
                            p3VarS = k4Var.a.d().s();
                            str5 = "Install Referrer Reporter was called with invalid app package name";
                        } else {
                            k4Var.a.f().h();
                            if (k4Var.a()) {
                                j4 j4Var = new j4(k4Var, str11);
                                k4Var.a.f().h();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                String str12 = str3;
                                intent.setComponent(new ComponentName(str12, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = k4Var.a.c().getPackageManager();
                                if (packageManager == null) {
                                    p3VarS = k4Var.a.d().s();
                                    str5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        p3VarS = k4Var.a.d().u();
                                        str5 = "Play Service for fetching Install Referrer is unavailable on device";
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str13 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && str12.equals(str13) && k4Var.a()) {
                                                try {
                                                    k4Var.a.d().w().b("Install Referrer Service is", true != com.google.android.gms.common.n.a.b().a(k4Var.a.c(), new Intent(intent), j4Var, 1) ? "not available" : "available");
                                                } catch (RuntimeException e2) {
                                                    k4Var.a.d().o().b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
                                                }
                                            } else {
                                                p3VarS = k4Var.a.d().r();
                                                str5 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                            }
                                        }
                                        f().h();
                                        c0();
                                        bundle = new Bundle();
                                        bundle.putLong("_c", 1L);
                                        bundle.putLong("_r", 1L);
                                        bundle.putLong("_uwa", 0L);
                                        bundle.putLong("_pfo", 0L);
                                        str6 = str2;
                                        bundle.putLong(str6, 0L);
                                        str7 = str;
                                        bundle.putLong(str7, 0L);
                                        bundle.putLong("_et", 1L);
                                        if (jaVar.p) {
                                            bundle.putLong("_dac", 1L);
                                        }
                                        String str14 = jaVar.a;
                                        com.google.android.gms.common.internal.q.k(str14);
                                        str8 = str14;
                                        j jVar9 = this.c;
                                        Q(jVar9);
                                        com.google.android.gms.common.internal.q.g(str8);
                                        jVar9.h();
                                        jVar9.j();
                                        jQ = jVar9.q(str8, "first_open_count");
                                        if (this.f1292k.c().getPackageManager() == null) {
                                            d().o().b("PackageManager is null, first open report might be inaccurate. appId", r3.x(str8));
                                            str10 = "_et";
                                        } else {
                                            try {
                                                packageInfoE = com.google.android.gms.common.o.c.a(this.f1292k.c()).e(str8, 0);
                                            } catch (PackageManager.NameNotFoundException e3) {
                                                d().o().c("Package info is null, first open report might be inaccurate. appId", r3.x(str8), e3);
                                                packageInfoE = null;
                                            }
                                            if (packageInfoE != null) {
                                                j2 = packageInfoE.firstInstallTime;
                                                if (j2 != 0) {
                                                    if (j2 != packageInfoE.lastUpdateTime) {
                                                        applicationInfo = null;
                                                        if (S().w(null, f3.l0) || jQ == 0) {
                                                            bundle.putLong("_uwa", j);
                                                        }
                                                        z2 = false;
                                                    } else {
                                                        applicationInfo = null;
                                                        z2 = true;
                                                    }
                                                    if (true != z2) {
                                                        j3 = 0;
                                                    } else {
                                                        j3 = 1;
                                                    }
                                                    o(new y9("_fi", jA, Long.valueOf(j3), "auto"), jaVar);
                                                } else {
                                                    applicationInfo = null;
                                                }
                                            } else {
                                                applicationInfo = null;
                                            }
                                            try {
                                                applicationInfoC = com.google.android.gms.common.o.c.a(this.f1292k.c()).c(str8, 0);
                                            } catch (PackageManager.NameNotFoundException e4) {
                                                d().o().c("Application info is null, first open report might be inaccurate. appId", r3.x(str8), e4);
                                                applicationInfoC = applicationInfo;
                                            }
                                            if (applicationInfoC != null) {
                                                if ((applicationInfoC.flags & 1) != 0) {
                                                    bundle.putLong(str6, 1L);
                                                }
                                                if ((applicationInfoC.flags & 128) != 0) {
                                                    bundle.putLong(str7, 1L);
                                                }
                                            }
                                        }
                                        if (jQ >= 0) {
                                            bundle.putLong("_pfo", jQ);
                                        }
                                        h0(new t("_f", new r(bundle), "auto", jA), jaVar);
                                        str4 = str10;
                                    }
                                }
                            } else {
                                p3VarS = k4Var.a.d().u();
                                str5 = "Install Referrer Reporter is not available";
                            }
                        }
                        p3VarS.a(str5);
                        f().h();
                        c0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_uwa", 0L);
                        bundle.putLong("_pfo", 0L);
                        str6 = str2;
                        bundle.putLong(str6, 0L);
                        str7 = str;
                        bundle.putLong(str7, 0L);
                        bundle.putLong("_et", 1L);
                        if (jaVar.p) {
                            bundle.putLong("_dac", 1L);
                        }
                        String str15 = jaVar.a;
                        com.google.android.gms.common.internal.q.k(str15);
                        str8 = str15;
                        j jVar10 = this.c;
                        Q(jVar10);
                        com.google.android.gms.common.internal.q.g(str8);
                        jVar10.h();
                        jVar10.j();
                        jQ = jVar10.q(str8, "first_open_count");
                        if (this.f1292k.c().getPackageManager() == null) {
                            d().o().b("PackageManager is null, first open report might be inaccurate. appId", r3.x(str8));
                            str10 = "_et";
                        } else {
                            packageInfoE = com.google.android.gms.common.o.c.a(this.f1292k.c()).e(str8, 0);
                            if (packageInfoE != null) {
                                j2 = packageInfoE.firstInstallTime;
                                if (j2 != 0) {
                                    if (j2 != packageInfoE.lastUpdateTime) {
                                        applicationInfo = null;
                                        long j5 = S().w(null, f3.l0) ? 1L : 1L;
                                        bundle.putLong("_uwa", j5);
                                        z2 = false;
                                    } else {
                                        applicationInfo = null;
                                        z2 = true;
                                    }
                                    if (true != z2) {
                                        j3 = 0;
                                    } else {
                                        j3 = 1;
                                    }
                                    o(new y9("_fi", jA, Long.valueOf(j3), "auto"), jaVar);
                                } else {
                                    applicationInfo = null;
                                }
                            } else {
                                applicationInfo = null;
                            }
                            applicationInfoC = com.google.android.gms.common.o.c.a(this.f1292k.c()).c(str8, 0);
                            if (applicationInfoC != null) {
                                if ((applicationInfoC.flags & 1) != 0) {
                                    bundle.putLong(str6, 1L);
                                }
                                if ((applicationInfoC.flags & 128) != 0) {
                                    bundle.putLong(str7, 1L);
                                }
                            }
                        }
                        if (jQ >= 0) {
                            bundle.putLong("_pfo", jQ);
                        }
                        h0(new t("_f", new r(bundle), "auto", jA), jaVar);
                        str4 = str10;
                    }
                    if (!S().w(jaVar.a, f3.U)) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong(str4, 1L);
                        bundle5.putLong("_fr", 1L);
                        tVar = new t("_e", new r(bundle5), "auto", jA);
                        h0(tVar, jaVar);
                    }
                } else if (jaVar.f1235i) {
                    tVar = new t("_cd", new r(new Bundle()), "auto", jA);
                    h0(tVar, jaVar);
                }
                j jVar11 = this.c;
                Q(jVar11);
                jVar11.N();
                j jVar12 = this.c;
                Q(jVar12);
                jVar12.O();
            } catch (Throwable th) {
                j jVar13 = this.c;
                Q(jVar13);
                jVar13.O();
                throw th;
            }
        }
    }

    final void u(b bVar) {
        String str = bVar.a;
        com.google.android.gms.common.internal.q.k(str);
        ja jaVarO = O(str);
        if (jaVarO != null) {
            v(bVar, jaVarO);
        }
    }

    final void v(b bVar, ja jaVar) {
        p3 p3VarO;
        String str;
        Object objX;
        String strR;
        Object objF;
        p3 p3VarO2;
        String str2;
        Object objX2;
        String strR2;
        Object obj;
        t tVar;
        com.google.android.gms.common.internal.q.k(bVar);
        com.google.android.gms.common.internal.q.g(bVar.a);
        com.google.android.gms.common.internal.q.k(bVar.b);
        com.google.android.gms.common.internal.q.k(bVar.c);
        com.google.android.gms.common.internal.q.g(bVar.c.b);
        f().h();
        c0();
        if (P(jaVar)) {
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            b bVar2 = new b(bVar);
            boolean z = false;
            bVar2.e = false;
            j jVar = this.c;
            Q(jVar);
            jVar.M();
            try {
                j jVar2 = this.c;
                Q(jVar2);
                String str3 = bVar2.a;
                com.google.android.gms.common.internal.q.k(str3);
                b bVarY = jVar2.Y(str3, bVar2.c.b);
                if (bVarY != null && !bVarY.b.equals(bVar2.b)) {
                    d().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f1292k.H().r(bVar2.c.b), bVar2.b, bVarY.b);
                }
                if (bVarY != null && bVarY.e) {
                    bVar2.b = bVarY.b;
                    bVar2.d = bVarY.d;
                    bVar2.f1170h = bVarY.f1170h;
                    bVar2.f = bVarY.f;
                    bVar2.f1171i = bVarY.f1171i;
                    bVar2.e = true;
                    y9 y9Var = bVar2.c;
                    bVar2.c = new y9(y9Var.b, bVarY.c.c, y9Var.f(), bVarY.c.f);
                } else if (TextUtils.isEmpty(bVar2.f)) {
                    y9 y9Var2 = bVar2.c;
                    bVar2.c = new y9(y9Var2.b, bVar2.d, y9Var2.f(), bVar2.c.f);
                    bVar2.e = true;
                    z = true;
                }
                if (bVar2.e) {
                    y9 y9Var3 = bVar2.c;
                    String str4 = bVar2.a;
                    com.google.android.gms.common.internal.q.k(str4);
                    String str5 = bVar2.b;
                    String str6 = y9Var3.b;
                    long j2 = y9Var3.c;
                    Object objF2 = y9Var3.f();
                    com.google.android.gms.common.internal.q.k(objF2);
                    aa aaVar = new aa(str4, str5, str6, j2, objF2);
                    j jVar3 = this.c;
                    Q(jVar3);
                    if (jVar3.T(aaVar)) {
                        p3VarO2 = d().v();
                        str2 = "User property updated immediately";
                        objX2 = bVar2.a;
                        strR2 = this.f1292k.H().r(aaVar.c);
                        obj = aaVar.e;
                    } else {
                        p3VarO2 = d().o();
                        str2 = "(2)Too many active user properties, ignoring";
                        objX2 = r3.x(bVar2.a);
                        strR2 = this.f1292k.H().r(aaVar.c);
                        obj = aaVar.e;
                    }
                    p3VarO2.d(str2, objX2, strR2, obj);
                    if (z && (tVar = bVar2.f1171i) != null) {
                        j0(new t(tVar, bVar2.d), jaVar);
                    }
                }
                j jVar4 = this.c;
                Q(jVar4);
                if (jVar4.X(bVar2)) {
                    p3VarO = d().v();
                    str = "Conditional property added";
                    objX = bVar2.a;
                    strR = this.f1292k.H().r(bVar2.c.b);
                    objF = bVar2.c.f();
                } else {
                    p3VarO = d().o();
                    str = "Too many conditional properties, ignoring";
                    objX = r3.x(bVar2.a);
                    strR = this.f1292k.H().r(bVar2.c.b);
                    objF = bVar2.c.f();
                }
                p3VarO.d(str, objX, strR, objF);
                j jVar5 = this.c;
                Q(jVar5);
                jVar5.N();
            } finally {
                j jVar6 = this.c;
                Q(jVar6);
                jVar6.O();
            }
        }
    }

    final void w(b bVar) {
        String str = bVar.a;
        com.google.android.gms.common.internal.q.k(str);
        ja jaVarO = O(str);
        if (jaVarO != null) {
            x(bVar, jaVarO);
        }
    }

    final void x(b bVar, ja jaVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        com.google.android.gms.common.internal.q.g(bVar.a);
        com.google.android.gms.common.internal.q.k(bVar.c);
        com.google.android.gms.common.internal.q.g(bVar.c.b);
        f().h();
        c0();
        if (P(jaVar)) {
            if (!jaVar.f1234h) {
                y(jaVar);
                return;
            }
            j jVar = this.c;
            Q(jVar);
            jVar.M();
            try {
                y(jaVar);
                String str = bVar.a;
                com.google.android.gms.common.internal.q.k(str);
                String str2 = str;
                j jVar2 = this.c;
                Q(jVar2);
                b bVarY = jVar2.Y(str2, bVar.c.b);
                if (bVarY != null) {
                    d().v().c("Removing conditional user property", bVar.a, this.f1292k.H().r(bVar.c.b));
                    j jVar3 = this.c;
                    Q(jVar3);
                    jVar3.Z(str2, bVar.c.b);
                    if (bVarY.e) {
                        j jVar4 = this.c;
                        Q(jVar4);
                        jVar4.S(str2, bVar.c.b);
                    }
                    t tVar = bVar.f1173k;
                    if (tVar != null) {
                        r rVar = tVar.b;
                        Bundle bundleQ = rVar != null ? rVar.q() : null;
                        ca caVarB0 = b0();
                        t tVar2 = bVar.f1173k;
                        com.google.android.gms.common.internal.q.k(tVar2);
                        t tVarJ = caVarB0.J(str2, tVar2.a, bundleQ, bVarY.b, bVar.f1173k.d, true, false);
                        com.google.android.gms.common.internal.q.k(tVarJ);
                        j0(tVarJ, jaVar);
                    }
                } else {
                    d().r().c("Conditional user property doesn't exist", r3.x(bVar.a), this.f1292k.H().r(bVar.c.b));
                }
                j jVar5 = this.c;
                Q(jVar5);
                jVar5.N();
            } finally {
                j jVar6 = this.c;
                Q(jVar6);
                jVar6.O();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0261  */
    /* JADX WARN: Code duplicated, block: B:112:0x026f  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c0  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
    
        if (r3.h() != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final g5 y(ja jaVar) {
        long j2;
        String str;
        long j3;
        f().h();
        c0();
        com.google.android.gms.common.internal.q.k(jaVar);
        com.google.android.gms.common.internal.q.g(jaVar.a);
        j jVar = this.c;
        Q(jVar);
        g5 g5VarC0 = jVar.c0(jaVar.a);
        g gVarK = e0(jaVar.a).k(g.c(jaVar.v));
        String strO = gVarK.f() ? this.f1290i.o(jaVar.a) : "";
        hd.a();
        if (S().w(null, f3.m0)) {
            if (g5VarC0 == null) {
                g5VarC0 = new g5(this.f1292k, jaVar.a);
                if (gVarK.h()) {
                    g5VarC0.P(b(gVarK));
                }
                if (gVarK.f()) {
                    g5VarC0.X(strO);
                }
            } else {
                if (gVarK.f() && strO != null && !strO.equals(g5VarC0.W())) {
                    g5VarC0.X(strO);
                } else if (TextUtils.isEmpty(g5VarC0.O()) && gVarK.h()) {
                }
                g5VarC0.P(b(gVarK));
            }
            g5VarC0.R(jaVar.b);
            g5VarC0.T(jaVar.q);
            td.a();
            if (S().w(g5VarC0.N(), f3.h0)) {
                g5VarC0.V(jaVar.u);
            }
            if (!TextUtils.isEmpty(jaVar.f1237k)) {
                g5VarC0.Z(jaVar.f1237k);
            }
            long j4 = jaVar.e;
            if (j4 != 0) {
                g5VarC0.a(j4);
            }
            if (!TextUtils.isEmpty(jaVar.c)) {
                g5VarC0.f0(jaVar.c);
            }
            g5VarC0.h0(jaVar.f1236j);
            String str2 = jaVar.d;
            if (str2 != null) {
                g5VarC0.j0(str2);
            }
            g5VarC0.c(jaVar.f);
            g5VarC0.g(jaVar.f1234h);
            if (!TextUtils.isEmpty(jaVar.f1233g)) {
                g5VarC0.D(jaVar.f1233g);
            }
            if (!S().w(null, f3.t0)) {
                g5VarC0.F(jaVar.f1238l);
            }
            g5VarC0.H(jaVar.f1241o);
            g5VarC0.J(jaVar.r);
            g5VarC0.e(jaVar.s);
            if (g5VarC0.A()) {
                j jVar2 = this.c;
                Q(jVar2);
                jVar2.d0(g5VarC0);
            }
            return g5VarC0;
        }
        String str3 = jaVar.a;
        com.google.android.gms.common.internal.q.k(str3);
        String str4 = str3;
        g gVarK2 = e0(str4).k(g.c(jaVar.v));
        boolean z = false;
        boolean z2 = true;
        if (g5VarC0 == null) {
            g5VarC0 = new g5(this.f1292k, str4);
            if (gVarK2.h()) {
                g5VarC0.P(b(gVarK2));
            }
            if (gVarK2.f()) {
                g5VarC0.X(strO);
            }
        } else {
            if (!gVarK2.f() || strO == null || strO.equals(g5VarC0.W())) {
                if (TextUtils.isEmpty(g5VarC0.O())) {
                }
                if (!TextUtils.equals(jaVar.b, g5VarC0.Q())) {
                    g5VarC0.R(jaVar.b);
                    z = true;
                }
                if (!TextUtils.equals(jaVar.q, g5VarC0.S())) {
                    g5VarC0.T(jaVar.q);
                    z = true;
                }
                td.a();
                if (S().w(g5VarC0.N(), f3.h0) && !TextUtils.equals(jaVar.u, g5VarC0.U())) {
                    g5VarC0.V(jaVar.u);
                    z = true;
                }
                if (!TextUtils.isEmpty(jaVar.f1237k) && !jaVar.f1237k.equals(g5VarC0.Y())) {
                    g5VarC0.Z(jaVar.f1237k);
                    z = true;
                }
                j2 = jaVar.e;
                if (j2 != 0 && j2 != g5VarC0.k0()) {
                    g5VarC0.a(jaVar.e);
                    z = true;
                }
                if (!TextUtils.isEmpty(jaVar.c) && !jaVar.c.equals(g5VarC0.e0())) {
                    g5VarC0.f0(jaVar.c);
                    z = true;
                }
                if (jaVar.f1236j != g5VarC0.g0()) {
                    g5VarC0.h0(jaVar.f1236j);
                    z = true;
                }
                str = jaVar.d;
                if (str != null && !str.equals(g5VarC0.i0())) {
                    g5VarC0.j0(jaVar.d);
                    z = true;
                }
                if (jaVar.f != g5VarC0.b()) {
                    g5VarC0.c(jaVar.f);
                    z = true;
                }
                if (jaVar.f1234h != g5VarC0.f()) {
                    g5VarC0.g(jaVar.f1234h);
                    z = true;
                }
                if (!TextUtils.isEmpty(jaVar.f1233g) && !jaVar.f1233g.equals(g5VarC0.B())) {
                    g5VarC0.D(jaVar.f1233g);
                    z = true;
                }
                if (!S().w(null, f3.t0) && jaVar.f1238l != g5VarC0.E()) {
                    g5VarC0.F(jaVar.f1238l);
                    z = true;
                }
                if (jaVar.f1241o != g5VarC0.G()) {
                    g5VarC0.H(jaVar.f1241o);
                    z = true;
                }
                if (jaVar.r != g5VarC0.I()) {
                    g5VarC0.J(jaVar.r);
                } else {
                    z2 = z;
                }
                j3 = jaVar.s;
                if (j3 != 0 || j3 == g5VarC0.d()) {
                    if (z2) {
                    }
                    return g5VarC0;
                }
                g5VarC0.e(jaVar.s);
                j jVar3 = this.c;
                Q(jVar3);
                jVar3.d0(g5VarC0);
                return g5VarC0;
            }
            g5VarC0.X(strO);
            if (gVarK2.h()) {
            }
            g5VarC0.P(b(gVarK2));
        }
        z = true;
        if (!TextUtils.equals(jaVar.b, g5VarC0.Q())) {
            g5VarC0.R(jaVar.b);
            z = true;
        }
        if (!TextUtils.equals(jaVar.q, g5VarC0.S())) {
            g5VarC0.T(jaVar.q);
            z = true;
        }
        td.a();
        if (S().w(g5VarC0.N(), f3.h0)) {
            g5VarC0.V(jaVar.u);
            z = true;
        }
        if (!TextUtils.isEmpty(jaVar.f1237k)) {
            g5VarC0.Z(jaVar.f1237k);
            z = true;
        }
        j2 = jaVar.e;
        if (j2 != 0) {
            g5VarC0.a(jaVar.e);
            z = true;
        }
        if (!TextUtils.isEmpty(jaVar.c)) {
            g5VarC0.f0(jaVar.c);
            z = true;
        }
        if (jaVar.f1236j != g5VarC0.g0()) {
            g5VarC0.h0(jaVar.f1236j);
            z = true;
        }
        str = jaVar.d;
        if (str != null) {
            g5VarC0.j0(jaVar.d);
            z = true;
        }
        if (jaVar.f != g5VarC0.b()) {
            g5VarC0.c(jaVar.f);
            z = true;
        }
        if (jaVar.f1234h != g5VarC0.f()) {
            g5VarC0.g(jaVar.f1234h);
            z = true;
        }
        if (!TextUtils.isEmpty(jaVar.f1233g)) {
            g5VarC0.D(jaVar.f1233g);
            z = true;
        }
        if (!S().w(null, f3.t0)) {
            g5VarC0.F(jaVar.f1238l);
            z = true;
        }
        if (jaVar.f1241o != g5VarC0.G()) {
            g5VarC0.H(jaVar.f1241o);
            z = true;
        }
        if (jaVar.r != g5VarC0.I()) {
            g5VarC0.J(jaVar.r);
        } else {
            z2 = z;
        }
        j3 = jaVar.s;
        if (j3 != 0) {
            if (z2) {
                j jVar4 = this.c;
                Q(jVar4);
                jVar4.d0(g5VarC0);
            }
        } else if (z2) {
            j jVar5 = this.c;
            Q(jVar5);
            jVar5.d0(g5VarC0);
        }
        return g5VarC0;
    }

    final String z(ja jaVar) {
        try {
            return (String) f().p(new r9(this, jaVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            d().o().c("Failed to get app instance id. appId", r3.x(jaVar.a), e);
            return null;
        }
    }
}
