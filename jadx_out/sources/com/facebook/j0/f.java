package com.facebook.j0;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.h0;
import com.facebook.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final String a;

    private static final class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            Class cls;
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            l.y.c.i.d(classDescriptor, "resultClassDescriptor");
            if (!l.y.c.i.a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = l.y.c.i.a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? c.b.class : com.facebook.j0.a.C0068a.class;
                l.y.c.i.d(classDescriptor, "resultClassDescriptor");
                return classDescriptor;
            }
            classDescriptor = ObjectStreamClass.lookup(cls);
            l.y.c.i.d(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    static {
        String name = f.class.getName();
        l.y.c.i.d(name, "AppEventStore::class.java.name");
        a = name;
    }

    private f() {
    }

    public static final synchronized void a(com.facebook.j0.a aVar, o oVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppIdPair");
            l.y.c.i.e(oVar, "appEvents");
            com.facebook.j0.v.b.b();
            n nVarC = c();
            nVarC.a(aVar, oVar.d());
            d(nVarC);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final synchronized void b(d dVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            l.y.c.i.e(dVar, "eventsToPersist");
            com.facebook.j0.v.b.b();
            n nVarC = c();
            for (com.facebook.j0.a aVar : dVar.f()) {
                o oVarC = dVar.c(aVar);
                if (oVarC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                nVarC.a(aVar, oVarC.d());
            }
            d(nVarC);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #6 {all -> 0x00a7, blocks: (B:9:0x000c, B:14:0x0030, B:15:0x0033, B:50:0x00a0, B:18:0x003e, B:29:0x005c, B:30:0x005f, B:33:0x006a, B:34:0x006e, B:36:0x0073, B:37:0x0076, B:41:0x0088, B:40:0x0081, B:43:0x008a, B:44:0x008d, B:47:0x0098), top: B:65:0x000c, outer: #10, inners: #0, #4, #5, #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context] */
    public static final synchronized n c() {
        a aVar;
        String str;
        String str2;
        n nVar;
        ?? D = com.facebook.internal.m0.i.a.d(f.class);
        if (D != 0) {
            return null;
        }
        try {
            try {
                com.facebook.j0.v.b.b();
                D = r.f();
                try {
                    FileInputStream fileInputStreamOpenFileInput = D.openFileInput("AppEventsLogger.persistedevents");
                    l.y.c.i.d(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = aVar.readObject();
                        if (object == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        }
                        nVar = (n) object;
                        h0.i(aVar);
                        try {
                            D.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e) {
                            Log.w(a, "Got unexpected exception when removing events file: ", e);
                        }
                        if (nVar == null) {
                            nVar = new n();
                        }
                        return nVar;
                    } catch (FileNotFoundException unused) {
                        h0.i(aVar);
                        try {
                            D.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e2) {
                            e = e2;
                            str = a;
                            str2 = "Got unexpected exception when removing events file: ";
                            Log.w(str, str2, e);
                            nVar = null;
                            if (nVar == null) {
                                nVar = new n();
                            }
                            return nVar;
                        }
                        nVar = null;
                        if (nVar == null) {
                            nVar = new n();
                        }
                        return nVar;
                    } catch (Exception e3) {
                        e = e3;
                        Log.w(a, "Got unexpected exception while reading events: ", e);
                        h0.i(aVar);
                        try {
                            D.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e4) {
                            e = e4;
                            str = a;
                            str2 = "Got unexpected exception when removing events file: ";
                            Log.w(str, str2, e);
                            nVar = null;
                            if (nVar == null) {
                                nVar = new n();
                            }
                            return nVar;
                        }
                        nVar = null;
                        if (nVar == null) {
                            nVar = new n();
                        }
                        return nVar;
                    }
                } catch (FileNotFoundException unused2) {
                    aVar = null;
                } catch (Exception e5) {
                    e = e5;
                    aVar = null;
                } catch (Throwable th) {
                    th = th;
                    h0.i(null);
                    try {
                        D.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e6) {
                        Log.w(a, "Got unexpected exception when removing events file: ", e6);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.m0.i.a.b(th3, f.class);
            return null;
        }
    }

    public static final void d(n nVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            Context contextF = r.f();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextF.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream2.writeObject(nVar);
                    h0.i(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        Log.w(a, "Got unexpected exception while persisting events: ", th);
                        try {
                            contextF.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception unused) {
                        }
                    } finally {
                        h0.i(objectOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.m0.i.a.b(th3, f.class);
        }
    }
}
