.class public abstract Lh/a/a/h/a$a;
.super Landroid/os/Binder;
.source ""

# interfaces
.implements Lh/a/a/h/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/a/a/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/a/a/h/a$a$a;
    }
.end annotation


# direct methods
.method public static j(Landroid/os/IBinder;)Lh/a/a/h/a;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "androidx.ads.identifier.provider.IAdvertisingIdService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lh/a/a/h/a;

    if-eqz v1, :cond_1

    check-cast v0, Lh/a/a/h/a;

    return-object v0

    :cond_1
    new-instance v0, Lh/a/a/h/a$a$a;

    invoke-direct {v0, p0}, Lh/a/a/h/a$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
