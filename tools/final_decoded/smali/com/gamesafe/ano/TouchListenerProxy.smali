.class public Lcom/gamesafe/ano/TouchListenerProxy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field private static volatile f:Lcom/gamesafe/ano/TouchListenerProxy;


# instance fields
.field private a:Landroid/view/View$OnTouchListener;

.field private b:I

.field private c:I

.field private d:I

.field private e:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->e:Z

    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 10

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getTouchMinor()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getTouchMajor()F

    move-result p1

    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v7, "VyyVijOjpxcZqzio:dy=%y|zo=%y|yo=%y|hd=%.1a|hv=%.1a"

    invoke-static {v7}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x5

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v9, 0x0

    aput-object v0, v8, v9

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 v0, 0x4

    aput-object p1, v8, v0

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/gamesafe/ano/AnoSdk;->ioctl(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*#06#:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "utf-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    array-length v0, p1

    invoke-static {p1, v0}, Lcom/gamesafe/ano/AnoSdk;->onruntimeinfo([BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 11

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->b:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->c:I

    if-nez v0, :cond_3

    :cond_1
    invoke-static {}, Lcom/gamesafe/ano/c;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/gamesafe/ano/TouchListenerProxy;->b:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    iput v1, p0, Lcom/gamesafe/ano/TouchListenerProxy;->b:I

    iput v1, p0, Lcom/gamesafe/ano/TouchListenerProxy;->c:I

    :cond_3
    :goto_0
    iget v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->b:I

    const/4 v2, 0x2

    if-lt v0, v2, :cond_6

    iget v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->c:I

    if-ge v0, v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    float-to-int v3, v3

    iget v4, p0, Lcom/gamesafe/ano/TouchListenerProxy;->b:I

    iget v5, p0, Lcom/gamesafe/ano/TouchListenerProxy;->c:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v7

    if-nez v7, :cond_5

    const-string v7, "unavailable"

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/16 v9, 0x8

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v10, 0x0

    aput-object v0, v9, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v2

    const/4 v0, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v9, v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v9, v1

    const/4 v0, 0x5

    aput-object v7, v9, v0

    const/4 v0, 0x6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v9, v0

    const/4 p1, 0x7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, p1

    const-string p1, "AddTouchEvent:col=%d|row=%d|col_max=%d|row_max=%d|id=%d|name=%s|source=%d|external=%d"

    invoke-static {v8, p1, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/gamesafe/ano/AnoSdk;->ioctl(Ljava/lang/String;)Ljava/lang/String;

    iget v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->d:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/gamesafe/ano/TouchListenerProxy;->d:I

    if-ge v0, v1, :cond_6

    invoke-direct {p0, p1}, Lcom/gamesafe/ano/TouchListenerProxy;->a(Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public static getInstance()Lcom/gamesafe/ano/TouchListenerProxy;
    .locals 2

    sget-object v0, Lcom/gamesafe/ano/TouchListenerProxy;->f:Lcom/gamesafe/ano/TouchListenerProxy;

    if-nez v0, :cond_1

    const-class v0, Lcom/gamesafe/ano/TouchListenerProxy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/gamesafe/ano/TouchListenerProxy;->f:Lcom/gamesafe/ano/TouchListenerProxy;

    if-nez v1, :cond_0

    new-instance v1, Lcom/gamesafe/ano/TouchListenerProxy;

    invoke-direct {v1}, Lcom/gamesafe/ano/TouchListenerProxy;-><init>()V

    sput-object v1, Lcom/gamesafe/ano/TouchListenerProxy;->f:Lcom/gamesafe/ano/TouchListenerProxy;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/gamesafe/ano/TouchListenerProxy;->f:Lcom/gamesafe/ano/TouchListenerProxy;

    return-object v0
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Lcom/gamesafe/ano/TouchListenerProxy;->b(Landroid/view/MotionEvent;)V

    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_2

    :cond_1
    invoke-direct {p0, p2}, Lcom/gamesafe/ano/TouchListenerProxy;->a(Landroid/view/MotionEvent;)V

    :cond_2
    iget-object v0, p0, Lcom/gamesafe/ano/TouchListenerProxy;->a:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3
    iget-boolean p1, p0, Lcom/gamesafe/ano/TouchListenerProxy;->e:Z

    return p1
.end method

.method public setOntouchRetVal(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/gamesafe/ano/TouchListenerProxy;->e:Z

    return-void
.end method

.method public setRawListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    iput-object p1, p0, Lcom/gamesafe/ano/TouchListenerProxy;->a:Landroid/view/View$OnTouchListener;

    return-void
.end method
