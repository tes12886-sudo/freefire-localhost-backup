.class public final Lj/d/a/d/a/b/a;
.super Lj/d/a/d/a/b/j0;
.source ""

# interfaces
.implements Lj/d/a/d/a/b/c;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.inappreview.protocol.IInAppReviewService"

    invoke-direct {p0, p1, v0}, Lj/d/a/d/a/b/j0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a0(Ljava/lang/String;Landroid/os/Bundle;Lj/d/a/d/a/b/e;)V
    .locals 1

    invoke-virtual {p0}, Lj/d/a/d/a/b/j0;->j()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj/d/a/d/a/b/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lj/d/a/d/a/b/l0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lj/d/a/d/a/b/j0;->m(ILandroid/os/Parcel;)V

    return-void
.end method
