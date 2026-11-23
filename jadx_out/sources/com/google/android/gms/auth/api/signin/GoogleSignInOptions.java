package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends com.google.android.gms.common.internal.y.a implements com.google.android.gms.common.api.a.d.c, com.google.android.gms.common.api.a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Scope f901l = new Scope("profile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Scope f902m = new Scope("email");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f903n = new Scope("openid");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope f904o;
    public static final Scope p;
    private static Comparator q;
    final int a;
    private final ArrayList b;
    private Account c;
    private boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f908j;

    public static final class a {
        private Set a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f910h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f911i;

        public a() {
            this.a = new HashSet();
            this.f910h = new HashMap();
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.f910h = new HashMap();
            q.k(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.b);
            this.b = googleSignInOptions.e;
            this.c = googleSignInOptions.f;
            this.d = googleSignInOptions.d;
            this.e = googleSignInOptions.f905g;
            this.f = googleSignInOptions.c;
            this.f909g = googleSignInOptions.f906h;
            this.f910h = GoogleSignInOptions.E(googleSignInOptions.f907i);
            this.f911i = googleSignInOptions.f908j;
        }

        private final String g(String str) {
            q.g(str);
            String str2 = this.e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            q.b(z, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.p)) {
                Set set = this.a;
                Scope scope = GoogleSignInOptions.f904o;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.f909g, this.f910h, this.f911i);
        }

        @CanIgnoreReturnValue
        public a b() {
            this.a.add(GoogleSignInOptions.f902m);
            return this;
        }

        @CanIgnoreReturnValue
        public a c() {
            this.a.add(GoogleSignInOptions.f903n);
            return this;
        }

        @CanIgnoreReturnValue
        public a d(String str) {
            this.d = true;
            g(str);
            this.e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public a e() {
            this.a.add(GoogleSignInOptions.f901l);
            return this;
        }

        @CanIgnoreReturnValue
        public a f(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f904o = scope;
        p = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f900k = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        aVar2.a();
        CREATOR = new i();
        q = new g();
    }

    GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i2, arrayList, account, z, z2, z3, str, str2, E(arrayList2), str3);
    }

    private GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.a = i2;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.f905g = str;
        this.f906h = str2;
        this.f907i = new ArrayList(map.values());
        this.f908j = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map E(List list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.auth.api.signin.internal.a aVar = (com.google.android.gms.auth.api.signin.internal.a) it.next();
            map.put(Integer.valueOf(aVar.f()), aVar);
        }
        return map;
    }

    public static GoogleSignInOptions t(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public Account b() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f907i.size() <= 0 && googleSignInOptions.f907i.size() <= 0 && this.b.size() == googleSignInOptions.j().size() && this.b.containsAll(googleSignInOptions.j())) {
                Account account = this.c;
                if (account == null) {
                    if (googleSignInOptions.b() == null) {
                        if (TextUtils.isEmpty(this.f905g)) {
                            if (TextUtils.isEmpty(googleSignInOptions.l())) {
                                if (this.f != googleSignInOptions.n() && this.d == googleSignInOptions.q() && this.e == googleSignInOptions.r() && TextUtils.equals(this.f908j, googleSignInOptions.h())) {
                                    return true;
                                }
                            }
                        } else if (!this.f905g.equals(googleSignInOptions.l())) {
                            if (this.f != googleSignInOptions.n()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.b())) {
                    if (TextUtils.isEmpty(this.f905g)) {
                        if (TextUtils.isEmpty(googleSignInOptions.l())) {
                            if (this.f != googleSignInOptions.n()) {
                            }
                        }
                    } else if (!this.f905g.equals(googleSignInOptions.l())) {
                        if (this.f != googleSignInOptions.n()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public ArrayList<com.google.android.gms.auth.api.signin.internal.a> f() {
        return this.f907i;
    }

    public String h() {
        return this.f908j;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).f());
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.b bVar = new com.google.android.gms.auth.api.signin.internal.b();
        bVar.a(arrayList);
        bVar.a(this.c);
        bVar.a(this.f905g);
        bVar.c(this.f);
        bVar.c(this.d);
        bVar.c(this.e);
        bVar.a(this.f908j);
        return bVar.b();
    }

    public ArrayList<Scope> j() {
        return new ArrayList<>(this.b);
    }

    public String l() {
        return this.f905g;
    }

    public boolean n() {
        return this.f;
    }

    public boolean q() {
        return this.d;
    }

    public boolean r() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.q(parcel, 2, j(), false);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, b(), i2, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 4, q());
        com.google.android.gms.common.internal.y.c.c(parcel, 5, r());
        com.google.android.gms.common.internal.y.c.c(parcel, 6, n());
        com.google.android.gms.common.internal.y.c.n(parcel, 7, l(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 8, this.f906h, false);
        com.google.android.gms.common.internal.y.c.q(parcel, 9, f(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 10, h(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    public final String x() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.b, q);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).f());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.d);
            jSONObject.put("forceCodeForRefreshToken", this.f);
            jSONObject.put("serverAuthRequested", this.e);
            if (!TextUtils.isEmpty(this.f905g)) {
                jSONObject.put("serverClientId", this.f905g);
            }
            if (!TextUtils.isEmpty(this.f906h)) {
                jSONObject.put("hostedDomain", this.f906h);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
