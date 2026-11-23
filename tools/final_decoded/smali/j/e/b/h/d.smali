.class public final Lj/e/b/h/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/e/b/h/d$a;
    }
.end annotation


# static fields
.field private static final a:Lj/e/a/a/a$d;

.field private static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/e/a/a/a$d;

    const-string v1, "com.linecorp.linesdk.sharedpreference.encryptionsalt"

    invoke-direct {v0, v1}, Lj/e/a/a/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/e/b/h/d;->a:Lj/e/a/a/a$d;

    const/4 v0, 0x0

    sput-boolean v0, Lj/e/b/h/d;->b:Z

    return-void
.end method

.method public static a()Lj/e/a/a/a$d;
    .locals 1

    sget-object v0, Lj/e/b/h/d;->a:Lj/e/a/a/a$d;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    sget-boolean v0, Lj/e/b/h/d;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lj/e/b/h/d;->b:Z

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lj/e/b/h/d$a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lj/e/b/h/d$a;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method static synthetic c()Lj/e/a/a/a$d;
    .locals 1

    sget-object v0, Lj/e/b/h/d;->a:Lj/e/a/a/a$d;

    return-object v0
.end method
