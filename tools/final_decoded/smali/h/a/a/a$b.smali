.class final Lh/a/a/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/a/a/a;->g(Landroid/content/Context;Lh/g/a/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lh/g/a/b$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lh/g/a/b$a;)V
    .locals 0

    iput-object p1, p0, Lh/a/a/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lh/a/a/a$b;->b:Lh/g/a/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lh/a/a/a$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lh/a/a/a;->b(Landroid/content/Context;)Lh/a/a/a$e;

    move-result-object v0

    invoke-static {v0}, Lh/a/a/a;->e(Lh/a/a/a$e;)V

    iget-object v1, p0, Lh/a/a/a$b;->b:Lh/g/a/b$a;

    invoke-virtual {v0}, Lh/a/a/a$e;->a()Lh/a/a/g/a;

    move-result-object v0

    invoke-static {v0}, Lh/a/a/a;->c(Lh/a/a/g/a;)Lh/a/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/g/a/b$a;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lh/a/a/c; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    :goto_0
    iget-object v1, p0, Lh/a/a/a$b;->b:Lh/g/a/b$a;

    invoke-virtual {v1, v0}, Lh/g/a/b$a;->d(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
