.class public Lh/h/i/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/h/i/f$c;,
        Lh/h/i/f$a;,
        Lh/h/i/f$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/os/CancellationSignal;[Lh/h/i/f$b;)Landroid/graphics/Typeface;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lh/h/e/e;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lh/h/i/f$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;Lh/h/i/d;)Lh/h/i/f$a;
    .locals 0

    invoke-static {p0, p2, p1}, Lh/h/i/c;->d(Landroid/content/Context;Lh/h/i/d;Landroid/os/CancellationSignal;)Lh/h/i/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lh/h/i/d;IZILandroid/os/Handler;Lh/h/i/f$c;)Landroid/graphics/Typeface;
    .locals 1

    new-instance v0, Lh/h/i/a;

    invoke-direct {v0, p6, p5}, Lh/h/i/a;-><init>(Lh/h/i/f$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    invoke-static {p0, p1, v0, p2, p4}, Lh/h/i/e;->e(Landroid/content/Context;Lh/h/i/d;Lh/h/i/a;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lh/h/i/e;->d(Landroid/content/Context;Lh/h/i/d;ILjava/util/concurrent/Executor;Lh/h/i/a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
