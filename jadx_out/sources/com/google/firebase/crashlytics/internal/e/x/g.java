package com.google.firebase.crashlytics.internal.e.x;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.e.v;
import com.google.firebase.crashlytics.internal.e.w;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private static final com.google.firebase.i.a a;

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        com.google.firebase.i.i.d dVar = new com.google.firebase.i.i.d();
        dVar.g(com.google.firebase.crashlytics.internal.e.a.a);
        dVar.h(true);
        a = dVar.f();
    }

    private static v.d A(JsonReader jsonReader) throws IOException {
        v.d.b bVarA = v.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarA.l(jsonReader.nextLong());
                    break;
                case "identifier":
                    bVarA.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.d(l(jsonReader));
                    break;
                case "events":
                    bVarA.f(j(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.e.x.a
                        @Override // com.google.firebase.crashlytics.internal.e.x.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.m(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.k(y(jsonReader));
                    break;
                case "app":
                    bVarA.b(i(jsonReader));
                    break;
                case "user":
                    bVarA.m(B(jsonReader));
                    break;
                case "generator":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.c(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static v.d.f B(JsonReader jsonReader) throws IOException {
        v.d.f.a aVarA = v.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.d.a i(JsonReader jsonReader) throws IOException {
        v.d.a.AbstractC0136a abstractC0136aA = v.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0136aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0136aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0136aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0136aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0136aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0136aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0136aA.a();
    }

    private static <T> w<T> j(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return w.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.b k(JsonReader jsonReader) throws IOException {
        v.b.a aVarA = v.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.d.c l(JsonReader jsonReader) throws IOException {
        v.d.c.a aVarA = v.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0137d m(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.b bVarA = v.d.AbstractC0137d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarA.c(p(jsonReader));
                    break;
                case "app":
                    bVarA.b(n(jsonReader));
                    break;
                case "log":
                    bVarA.d(t(jsonReader));
                    break;
                case "type":
                    bVarA.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static v.d.AbstractC0137d.a n(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.AbstractC0138a abstractC0138aA = v.d.AbstractC0137d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "background":
                    abstractC0138aA.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0138aA.d(q(jsonReader));
                    break;
                case "customAttributes":
                    abstractC0138aA.c(j(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.e.x.f
                        @Override // com.google.firebase.crashlytics.internal.e.x.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.k(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0138aA.e(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0138aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0137d.a.b.AbstractC0139a o(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a abstractC0140aA = v.d.AbstractC0137d.a.b.AbstractC0139a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC0140aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0140aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0140aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0140aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0140aA.a();
    }

    private static v.d.AbstractC0137d.c p(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.c.a aVarA = v.d.AbstractC0137d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.d.AbstractC0137d.a.b q(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.AbstractC0141b abstractC0141bA = v.d.AbstractC0137d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "threads":
                    abstractC0141bA.e(j(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.e.x.c
                        @Override // com.google.firebase.crashlytics.internal.e.x.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.v(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0141bA.d(u(jsonReader));
                    break;
                case "binaries":
                    abstractC0141bA.b(j(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.e.x.e
                        @Override // com.google.firebase.crashlytics.internal.e.x.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.o(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0141bA.c(r(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0141bA.a();
    }

    private static v.d.AbstractC0137d.a.b.c r(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.c.AbstractC0142a abstractC0142aA = v.d.AbstractC0137d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0142aA.c(j(jsonReader, b.a));
                    break;
                case "reason":
                    abstractC0142aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0142aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0142aA.b(r(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0142aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0142aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0137d.a.b.e.AbstractC0146b s(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a abstractC0147aA = v.d.AbstractC0137d.a.b.e.AbstractC0146b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0147aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0147aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0147aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0147aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0147aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0147aA.a();
    }

    private static v.d.AbstractC0137d.AbstractC0148d t(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.AbstractC0148d.a aVarA = v.d.AbstractC0137d.AbstractC0148d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.d.AbstractC0137d.a.b.AbstractC0143d u(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a abstractC0144aA = v.d.AbstractC0137d.a.b.AbstractC0143d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0144aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0144aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0144aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0144aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0137d.a.b.e v(JsonReader jsonReader) throws IOException {
        v.d.AbstractC0137d.a.b.e.AbstractC0145a abstractC0145aA = v.d.AbstractC0137d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0145aA.b(j(jsonReader, b.a));
                    break;
                case "name":
                    abstractC0145aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0145aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0145aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.c.b w(JsonReader jsonReader) throws IOException {
        v.c.b.a aVarA = v.c.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.c x(JsonReader jsonReader) throws IOException {
        v.c.a aVarA = v.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarA.b(j(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.e.x.d
                    @Override // com.google.firebase.crashlytics.internal.e.x.g.a
                    public final Object a(JsonReader jsonReader2) {
                        return g.w(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v.d.e y(JsonReader jsonReader) throws IOException {
        v.d.e.a aVarA = v.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static v z(JsonReader jsonReader) throws IOException {
        v.a aVarB = v.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    aVarB.f(x(jsonReader));
                    break;
                case "sdkVersion":
                    aVarB.h(jsonReader.nextString());
                    break;
                case "buildVersion":
                    aVarB.b(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    aVarB.d(jsonReader.nextString());
                    break;
                case "installationUuid":
                    aVarB.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarB.g(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    aVarB.c(jsonReader.nextString());
                    break;
                case "session":
                    aVarB.i(A(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarB.a();
    }

    public v C(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                v vVarZ = z(jsonReader);
                jsonReader.close();
                return vVarZ;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String D(v vVar) {
        return a.a(vVar);
    }

    public v.d.AbstractC0137d a(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                v.d.AbstractC0137d abstractC0137dM = m(jsonReader);
                jsonReader.close();
                return abstractC0137dM;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String b(v.d.AbstractC0137d abstractC0137d) {
        return a.a(abstractC0137d);
    }
}
