package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    q[] a;
    int b;
    Fragment c;
    c d;
    b e;
    boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, String> f693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, String> f694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o f695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f697l;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    interface b {
        void a();

        void b();
    }

    public interface c {
        void a(e eVar);
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private final k a;
        private Set<String> b;
        private final com.facebook.login.c c;
        private final String d;
        private String e;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f701j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f702k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final s f703l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f704m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f705n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f706o;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        private d(Parcel parcel) {
            this.f = false;
            this.f704m = false;
            this.f705n = false;
            String string = parcel.readString();
            this.a = string != null ? k.valueOf(string) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.c = string2 != null ? com.facebook.login.c.valueOf(string2) : null;
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readByte() != 0;
            this.f698g = parcel.readString();
            this.f699h = parcel.readString();
            this.f700i = parcel.readString();
            this.f701j = parcel.readString();
            this.f702k = parcel.readByte() != 0;
            String string3 = parcel.readString();
            this.f703l = string3 != null ? s.valueOf(string3) : null;
            this.f704m = parcel.readByte() != 0;
            this.f705n = parcel.readByte() != 0;
            this.f706o = parcel.readString();
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        d(k kVar, Set<String> set, com.facebook.login.c cVar, String str, String str2, String str3, s sVar, String str4) {
            this.f = false;
            this.f704m = false;
            this.f705n = false;
            this.a = kVar;
            this.b = set == null ? new HashSet<>() : set;
            this.c = cVar;
            this.f699h = str;
            this.d = str2;
            this.e = str3;
            this.f703l = sVar;
            this.f706o = str4;
        }

        String a() {
            return this.d;
        }

        String b() {
            return this.e;
        }

        String c() {
            return this.f699h;
        }

        com.facebook.login.c d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        String e() {
            return this.f700i;
        }

        String f() {
            return this.f698g;
        }

        k g() {
            return this.a;
        }

        s h() {
            return this.f703l;
        }

        public String i() {
            return this.f701j;
        }

        public String j() {
            return this.f706o;
        }

        Set<String> k() {
            return this.b;
        }

        public boolean l() {
            return this.f702k;
        }

        boolean m() {
            Iterator<String> it = this.b.iterator();
            while (it.hasNext()) {
                if (p.g(it.next())) {
                    return true;
                }
            }
            return false;
        }

        boolean n() {
            return this.f704m;
        }

        boolean o() {
            return this.f703l == s.INSTAGRAM;
        }

        boolean p() {
            return this.f;
        }

        void q(boolean z) {
            this.f704m = z;
        }

        public void r(String str) {
            this.f701j = str;
        }

        void s(Set<String> set) {
            i0.m(set, "permissions");
            this.b = set;
        }

        void t(boolean z) {
            this.f = z;
        }

        public void u(boolean z) {
            this.f702k = z;
        }

        void v(boolean z) {
            this.f705n = z;
        }

        boolean w() {
            return this.f705n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            k kVar = this.a;
            parcel.writeString(kVar != null ? kVar.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            com.facebook.login.c cVar = this.c;
            parcel.writeString(cVar != null ? cVar.name() : null);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f698g);
            parcel.writeString(this.f699h);
            parcel.writeString(this.f700i);
            parcel.writeString(this.f701j);
            parcel.writeByte(this.f702k ? (byte) 1 : (byte) 0);
            s sVar = this.f703l;
            parcel.writeString(sVar != null ? sVar.name() : null);
            parcel.writeByte(this.f704m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f705n ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f706o);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        final b a;
        final com.facebook.a b;
        final com.facebook.f c;
        final String d;
        final String e;
        final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, String> f707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map<String, String> f708h;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        enum b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String a;

            b(String str) {
                this.a = str;
            }

            String a() {
                return this.a;
            }
        }

        private e(Parcel parcel) {
            this.a = b.valueOf(parcel.readString());
            this.b = (com.facebook.a) parcel.readParcelable(com.facebook.a.class.getClassLoader());
            this.c = (com.facebook.f) parcel.readParcelable(com.facebook.f.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (d) parcel.readParcelable(d.class.getClassLoader());
            this.f707g = h0.r0(parcel);
            this.f708h = h0.r0(parcel);
        }

        /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        e(d dVar, b bVar, com.facebook.a aVar, com.facebook.f fVar, String str, String str2) {
            i0.m(bVar, "code");
            this.f = dVar;
            this.b = aVar;
            this.c = fVar;
            this.d = str;
            this.a = bVar;
            this.e = str2;
        }

        e(d dVar, b bVar, com.facebook.a aVar, String str, String str2) {
            this(dVar, bVar, aVar, null, str, str2);
        }

        static e a(d dVar, String str) {
            return new e(dVar, b.CANCEL, null, str, null);
        }

        static e b(d dVar, com.facebook.a aVar, com.facebook.f fVar) {
            return new e(dVar, b.SUCCESS, aVar, fVar, null, null);
        }

        static e c(d dVar, String str, String str2) {
            return d(dVar, str, str2, null);
        }

        static e d(d dVar, String str, String str2, String str3) {
            return new e(dVar, b.ERROR, null, TextUtils.join(": ", h0.d(str, str2)), str3);
        }

        static e e(d dVar, com.facebook.a aVar) {
            return new e(dVar, b.SUCCESS, aVar, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i2);
            parcel.writeParcelable(this.c, i2);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i2);
            h0.E0(parcel, this.f707g);
            h0.E0(parcel, this.f708h);
        }
    }

    public l(Parcel parcel) {
        this.b = -1;
        this.f696k = 0;
        this.f697l = 0;
        Parcelable[] parcelableArray = parcel.readParcelableArray(q.class.getClassLoader());
        this.a = new q[parcelableArray.length];
        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
            q[] qVarArr = this.a;
            qVarArr[i2] = (q) parcelableArray[i2];
            qVarArr[i2].o(this);
        }
        this.b = parcel.readInt();
        this.f692g = (d) parcel.readParcelable(d.class.getClassLoader());
        this.f693h = h0.r0(parcel);
        this.f694i = h0.r0(parcel);
    }

    public l(Fragment fragment) {
        this.b = -1;
        this.f696k = 0;
        this.f697l = 0;
        this.c = fragment;
    }

    private void a(String str, String str2, boolean z) {
        if (this.f693h == null) {
            this.f693h = new HashMap();
        }
        if (this.f693h.containsKey(str) && z) {
            str2 = this.f693h.get(str) + "," + str2;
        }
        this.f693h.put(str, str2);
    }

    private void h() {
        f(e.c(this.f692g, "Login attempt failed.", null));
    }

    static String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private o o() {
        o oVar = this.f695j;
        if (oVar == null || !oVar.b().equals(this.f692g.a())) {
            this.f695j = new o(i(), this.f692g.a());
        }
        return this.f695j;
    }

    public static int p() {
        return com.facebook.internal.e.c.Login.a();
    }

    private void r(String str, e eVar, Map<String, String> map) {
        s(str, eVar.a.a(), eVar.d, eVar.e, map);
    }

    private void s(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f692g == null) {
            o().j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            o().c(this.f692g.b(), str, str2, str3, str4, map, this.f692g.n() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private void v(e eVar) {
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(eVar);
        }
    }

    void A(d dVar) {
        if (n()) {
            return;
        }
        b(dVar);
    }

    boolean B() {
        q qVarJ = j();
        if (qVarJ.l() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        int iQ = qVarJ.q(this.f692g);
        this.f696k = 0;
        o oVarO = o();
        String strB = this.f692g.b();
        if (iQ > 0) {
            oVarO.e(strB, qVarJ.j(), this.f692g.n() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f697l = iQ;
        } else {
            oVarO.d(strB, qVarJ.j(), this.f692g.n() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", qVarJ.j(), true);
        }
        return iQ > 0;
    }

    void C() {
        int i2;
        if (this.b >= 0) {
            s(j().j(), "skipped", null, null, j().i());
        }
        do {
            q[] qVarArr = this.a;
            if (qVarArr == null || (i2 = this.b) >= qVarArr.length - 1) {
                if (this.f692g != null) {
                    h();
                    return;
                }
                return;
            }
            this.b = i2 + 1;
        } while (!B());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:7:0x000e, B:9:0x001c, B:11:0x0030, B:10:0x0027), top: B:18:0x000e }] */
    void D(e eVar) {
        e eVarC;
        if (eVar.b == null) {
            throw new com.facebook.n("Can't validate without a token");
        }
        com.facebook.a aVarD = com.facebook.a.d();
        com.facebook.a aVar = eVar.b;
        if (aVarD == null || aVar == null) {
            eVarC = e.c(this.f692g, "User logged in as different Facebook user.", null);
        } else {
            try {
                if (aVarD.n().equals(aVar.n())) {
                    eVarC = e.b(this.f692g, eVar.b, eVar.c);
                } else {
                    eVarC = e.c(this.f692g, "User logged in as different Facebook user.", null);
                }
            } catch (Exception e2) {
                f(e.c(this.f692g, "Caught exception", e2.getMessage()));
                return;
            }
        }
        f(eVarC);
    }

    void b(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f692g != null) {
            throw new com.facebook.n("Attempted to authorize while a request is pending.");
        }
        if (!com.facebook.a.o() || d()) {
            this.f692g = dVar;
            this.a = m(dVar);
            C();
        }
    }

    void c() {
        if (this.b >= 0) {
            j().b();
        }
    }

    boolean d() {
        if (this.f) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.f = true;
            return true;
        }
        androidx.fragment.app.e eVarI = i();
        f(e.c(this.f692g, eVarI.getString(com.facebook.common.d.c), eVarI.getString(com.facebook.common.d.b)));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(String str) {
        return i().checkCallingOrSelfPermission(str);
    }

    void f(e eVar) {
        q qVarJ = j();
        if (qVarJ != null) {
            r(qVarJ.j(), eVar, qVarJ.i());
        }
        Map<String, String> map = this.f693h;
        if (map != null) {
            eVar.f707g = map;
        }
        Map<String, String> map2 = this.f694i;
        if (map2 != null) {
            eVar.f708h = map2;
        }
        this.a = null;
        this.b = -1;
        this.f692g = null;
        this.f693h = null;
        this.f696k = 0;
        this.f697l = 0;
        v(eVar);
    }

    void g(e eVar) {
        if (eVar.b == null || !com.facebook.a.o()) {
            f(eVar);
        } else {
            D(eVar);
        }
    }

    androidx.fragment.app.e i() {
        return this.c.m();
    }

    q j() {
        int i2 = this.b;
        if (i2 >= 0) {
            return this.a[i2];
        }
        return null;
    }

    public Fragment l() {
        return this.c;
    }

    protected q[] m(d dVar) {
        Parcelable fVar;
        ArrayList arrayList = new ArrayList();
        k kVarG = dVar.g();
        if (!dVar.o()) {
            if (kVarG.e()) {
                arrayList.add(new h(this));
            }
            if (!com.facebook.r.q && kVarG.g()) {
                arrayList.add(new j(this));
            }
            if (!com.facebook.r.q && kVarG.d()) {
                fVar = new f(this);
                arrayList.add(fVar);
            }
        } else if (!com.facebook.r.q && kVarG.f()) {
            fVar = new i(this);
            arrayList.add(fVar);
        }
        if (kVarG.a()) {
            arrayList.add(new com.facebook.login.a(this));
        }
        if (kVarG.h()) {
            arrayList.add(new y(this));
        }
        if (!dVar.o() && kVarG.c()) {
            arrayList.add(new com.facebook.login.e(this));
        }
        q[] qVarArr = new q[arrayList.size()];
        arrayList.toArray(qVarArr);
        return qVarArr;
    }

    boolean n() {
        return this.f692g != null && this.b >= 0;
    }

    public d q() {
        return this.f692g;
    }

    void t() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
    }

    void u() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.b();
        }
    }

    public boolean w(int i2, int i3, Intent intent) {
        this.f696k++;
        if (this.f692g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f556i, false)) {
                C();
                return false;
            }
            if (!j().p() || intent != null || this.f696k >= this.f697l) {
                return j().m(i2, i3, intent);
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.a, i2);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.f692g, i2);
        h0.E0(parcel, this.f693h);
        h0.E0(parcel, this.f694i);
    }

    void x(b bVar) {
        this.e = bVar;
    }

    void y(Fragment fragment) {
        if (this.c != null) {
            throw new com.facebook.n("Can't set fragment once it is already set.");
        }
        this.c = fragment;
    }

    void z(c cVar) {
        this.d = cVar;
    }
}
