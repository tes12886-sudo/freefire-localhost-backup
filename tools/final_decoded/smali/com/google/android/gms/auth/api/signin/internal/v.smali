.class public final Lcom/google/android/gms/auth/api/signin/internal/v;
.super Lj/d/a/c/f/b/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/auth/api/signin/internal/u;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lj/d/a/c/f/b/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M0(Lcom/google/android/gms/auth/api/signin/internal/s;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/b/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/b/c;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lj/d/a/c/f/b/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x66

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/b/a;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final g1(Lcom/google/android/gms/auth/api/signin/internal/s;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/b/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/b/c;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lj/d/a/c/f/b/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x67

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/b/a;->m(ILandroid/os/Parcel;)V

    return-void
.end method
