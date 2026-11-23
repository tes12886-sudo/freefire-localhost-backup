package com.google.android.vending.licensing;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes.dex */
class g {
    private final j a;
    private final f b;
    private final int c;
    private final String d;
    private final String e;
    private final c f;

    g(j jVar, c cVar, f fVar, int i2, String str, String str2) {
        this.a = jVar;
        this.f = cVar;
        this.b = fVar;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    private void d(int i2) {
        this.b.b(i2);
    }

    private void e() {
        this.b.c(561);
    }

    private void f(int i2, l lVar) {
        this.a.b(i2, lVar);
        if (this.a.a()) {
            this.b.a(i2);
        } else {
            this.b.c(i2);
        }
    }

    public f a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public void g(PublicKey publicKey, int i2, String str, String str2) {
        String str3;
        l lVar;
        int iA;
        String str4;
        String str5 = null;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(com.google.android.vending.licensing.n.a.a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    e();
                    return;
                }
                try {
                    l lVarA = l.a(str);
                    if (lVarA.a != i2) {
                        str3 = "Response codes don't match.";
                    } else if (lVarA.b != this.c) {
                        str3 = "Nonce doesn't match.";
                    } else if (!lVarA.c.equals(this.d)) {
                        str3 = "Package name doesn't match.";
                    } else if (lVarA.d.equals(this.e)) {
                        String str6 = lVarA.e;
                        if (TextUtils.isEmpty(str6)) {
                            str3 = "User identifier is empty.";
                        } else {
                            str5 = str6;
                            lVar = lVarA;
                        }
                    } else {
                        str3 = "Version codes don't match.";
                    }
                } catch (IllegalArgumentException unused) {
                    str3 = "Could not parse response.";
                }
            } catch (com.google.android.vending.licensing.n.b unused2) {
                str3 = "Could not Base64-decode signature.";
            } catch (NullPointerException unused3) {
                e();
                return;
            } catch (InvalidKeyException unused4) {
                d(5);
                return;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException e2) {
                throw new RuntimeException(e2);
            }
            Log.e("LicenseValidator", str3);
            e();
            return;
        }
        lVar = null;
        if (i2 == 0) {
            iA = this.f.a(str5);
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    d(3);
                    return;
                }
                if (i2 == 4) {
                    str4 = "An error has occurred on the licensing server.";
                } else if (i2 != 5) {
                    switch (i2) {
                        case 257:
                            str4 = "Error contacting licensing server.";
                            break;
                        case 258:
                            d(1);
                            return;
                        case 259:
                            d(2);
                            return;
                        default:
                            Log.e("LicenseValidator", "Unknown response code for license check.");
                            e();
                            return;
                    }
                } else {
                    str4 = "Licensing server is refusing to talk to this device, over quota.";
                }
                Log.w("LicenseValidator", str4);
                f(291, lVar);
                return;
            }
            iA = this.f.a(str5);
        } else {
            iA = 561;
        }
        f(iA, lVar);
    }
}
