.class public abstract Lj/c/a/a;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field public static final ACTION_TOKEN_UPDATE:Ljava/lang/String; = "com.garena.android.msdk.TOKEN_UPDATE"

.field public static final EXTRA_TOKEN:Ljava/lang/String; = "token"

.field public static final EXTRA_TOKEN_TYPE:Ljava/lang/String; = "token_type"

.field public static final PERMISSION_SUFFIX:Ljava/lang/String; = ".permission.PUSH_NOTIFICATION_TOKEN_UPDATE"

.field public static final TOKEN_TYPE_FCM:I = 0x4

.field public static final TOKEN_TYPE_GCM:I = 0x3

.field public static final TOKEN_TYPE_GPNS:I = 0x2

.field private static final UPDATE_EXECUTOR:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lj/c/a/a;->UPDATE_EXECUTOR:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lj/c/a/a;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/c/a/a;->serialExecBg(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private serialExecBg(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    if-nez p2, :cond_0

    return-void

    :cond_0
    const-string v0, "token_type"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    const/4 v0, 0x3

    if-eq v7, v0, :cond_2

    const/4 v0, 0x4

    if-eq v7, v0, :cond_2

    const/4 v0, 0x2

    if-eq v7, v0, :cond_2

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "err: unknown service type"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string v0, "token"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "err: token is empty"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "err: app id is empty"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Lcom/beetalk/sdk/t/j;

    invoke-direct {p2, p1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/beetalk/sdk/t/k;->h()Lcom/beetalk/sdk/u/a;

    move-result-object p2

    if-nez p2, :cond_5

    const-string p2, ""

    goto :goto_0

    :cond_5
    invoke-virtual {p2}, Lcom/beetalk/sdk/u/a;->f()Ljava/lang/String;

    move-result-object p2

    :goto_0
    move-object v5, p2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "user not logged in, ignored"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lj/c/a/a;->getPushAppKey()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_7

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "err: app push key is empty"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_7
    invoke-static {p1}, Lj/c/a/e/l/c;->a(Landroid/content/Context;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "err: device id is empty"

    invoke-static {p2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_8
    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "submitting new token to beepost"

    invoke-static {v0, p2}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v2, p1

    :try_start_0
    invoke-static/range {v2 .. v8}, Lj/c/a/c/a/a;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method


# virtual methods
.method protected abstract getPushAppKey()Ljava/lang/String;
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    new-instance v0, Lj/c/a/a$a;

    invoke-direct {v0, p0, p1, p2}, Lj/c/a/a$a;-><init>(Lj/c/a/a;Landroid/content/Context;Landroid/content/Intent;)V

    sget-object p1, Lj/c/a/a;->UPDATE_EXECUTOR:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, p1}, Li/i;->c(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Li/i;

    return-void
.end method
