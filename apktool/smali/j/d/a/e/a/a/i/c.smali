.class public Lj/d/a/e/a/a/i/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lj/d/a/e/a/a/i/e$a;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-le v0, v1, :cond_0

    new-instance v0, Lj/d/a/e/a/a/i/i;

    invoke-direct {v0}, Lj/d/a/e/a/a/i/i;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Lj/d/a/e/a/a/i/j;

    invoke-direct {v0}, Lj/d/a/e/a/a/i/j;-><init>()V

    return-object v0
.end method
