.class public final Lcom/google/android/gms/common/internal/z0;
.super Lj/d/a/c/f/f/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/b1;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-direct {p0, p1, v0}, Lj/d/a/c/f/f/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final T(Lcom/google/android/gms/common/j0;Lj/d/a/c/e/a;)Z
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/f/a;->m()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/f/c;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lj/d/a/c/f/f/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/f/a;->j(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, Lj/d/a/c/f/f/c;->f(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final U0(Lcom/google/android/gms/common/f0;)Lcom/google/android/gms/common/h0;
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/f/a;->m()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/f/c;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/f/a;->j(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/common/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lj/d/a/c/f/f/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/h0;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final a()Z
    .locals 2

    invoke-virtual {p0}, Lj/d/a/c/f/f/a;->m()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {p0, v1, v0}, Lj/d/a/c/f/f/a;->j(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, Lj/d/a/c/f/f/c;->f(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final s(Lcom/google/android/gms/common/f0;)Lcom/google/android/gms/common/h0;
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/f/a;->m()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/f/c;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/f/a;->j(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/common/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lj/d/a/c/f/f/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/h0;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method
