.class public Lj/d/a/e/a/a/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/a/e/a/a/c$b;,
        Lj/d/a/e/a/a/c$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/os/Messenger;)Lj/d/a/e/a/a/f;
    .locals 1

    new-instance v0, Lj/d/a/e/a/a/c$a;

    invoke-direct {v0, p0}, Lj/d/a/e/a/a/c$a;-><init>(Landroid/os/Messenger;)V

    return-object v0
.end method

.method public static b(Lj/d/a/e/a/a/f;Ljava/lang/Class;)Lj/d/a/e/a/a/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/e/a/a/f;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lj/d/a/e/a/a/h;"
        }
    .end annotation

    new-instance v0, Lj/d/a/e/a/a/c$b;

    invoke-direct {v0, p0, p1}, Lj/d/a/e/a/a/c$b;-><init>(Lj/d/a/e/a/a/f;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/PendingIntent;",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj/d/a/e/a/a/i/g;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I

    move-result p0

    return p0
.end method

.method public static d(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj/d/a/e/a/a/i/g;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)I

    move-result p0

    return p0
.end method
