.class public final Lcom/google/android/gms/common/internal/z/j;
.super Lj/d/a/c/f/d/a;
.source ""

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-direct {p0, p1, v0}, Lj/d/a/c/f/d/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c1(Lcom/google/android/gms/common/internal/u;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/d/a;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj/d/a/c/f/d/c;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lj/d/a/c/f/d/a;->o(ILandroid/os/Parcel;)V

    return-void
.end method
