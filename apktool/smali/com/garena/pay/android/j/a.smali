.class public Lcom/garena/pay/android/j/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:F

.field private static b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/garena/pay/android/j/a;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/garena/pay/android/j/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p0}, Lcom/garena/pay/android/j/a;->b(Landroid/util/DisplayMetrics;)V

    :cond_1
    return-void
.end method

.method public static b(Landroid/util/DisplayMetrics;)V
    .locals 1

    iget v0, p0, Landroid/util/DisplayMetrics;->density:F

    sput v0, Lcom/garena/pay/android/j/a;->a:F

    iget v0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    iget p0, p0, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/16 p0, 0x78

    if-eq v0, p0, :cond_0

    const/16 p0, 0xa0

    if-eq v0, p0, :cond_0

    const/16 p0, 0xf0

    if-eq v0, p0, :cond_0

    const/16 p0, 0x140

    :cond_0
    return-void
.end method
