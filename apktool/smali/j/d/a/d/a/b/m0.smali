.class public final Lj/d/a/d/a/b/m0;
.super Lj/d/a/d/a/b/j0;
.source ""

# interfaces
.implements Lj/d/a/d/a/b/o0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService"

    invoke-direct {p0, p1, v0}, Lj/d/a/d/a/b/j0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/String;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            "Lj/d/a/d/a/b/q0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xe

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final E0(Ljava/lang/String;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final H0(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final S0(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final b0(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final y(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method
