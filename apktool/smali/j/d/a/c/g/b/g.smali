.class public final Lj/d/a/c/g/b/g;
.super Lj/d/a/c/f/d/a;
.source ""

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lj/d/a/c/f/d/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c1(I)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/d/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/d/a;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final p1(Lcom/google/android/gms/common/internal/j;IZ)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/d/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/d/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p3}, Lj/d/a/c/f/d/c;->c(Landroid/os/Parcel;Z)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/d/a;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final q1(Lj/d/a/c/g/b/j;Lj/d/a/c/g/b/f;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/d/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/d/c;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lj/d/a/c/f/d/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/d/a;->m(ILandroid/os/Parcel;)V

    return-void
.end method
