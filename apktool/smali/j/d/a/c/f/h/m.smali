.class public abstract Lj/d/a/c/f/h/m;
.super Lj/d/a/c/f/h/p;
.source ""

# interfaces
.implements Lj/d/a/c/f/h/n;


# direct methods
.method public static j(Landroid/os/IBinder;)Lj/d/a/c/f/h/n;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lj/d/a/c/f/h/n;

    if-eqz v1, :cond_1

    check-cast v0, Lj/d/a/c/f/h/n;

    return-object v0

    :cond_1
    new-instance v0, Lj/d/a/c/f/h/l;

    invoke-direct {v0, p0}, Lj/d/a/c/f/h/l;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
