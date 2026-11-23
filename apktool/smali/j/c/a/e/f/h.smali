.class public Lj/c/a/e/f/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lj/c/a/e/f/e;

.field private final b:Lj/c/a/e/f/j;

.field private final c:I


# direct methods
.method public constructor <init>(ILj/c/a/e/f/j;Lj/c/a/e/f/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj/c/a/e/f/h;->c:I

    iput-object p2, p0, Lj/c/a/e/f/h;->b:Lj/c/a/e/f/j;

    iput-object p3, p0, Lj/c/a/e/f/h;->a:Lj/c/a/e/f/e;

    return-void
.end method

.method private a()V
    .locals 2

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/h;->b:Lj/c/a/e/f/j;

    invoke-virtual {v0}, Lj/c/a/e/f/j;->c()Lj/c/a/e/f/l/b;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/f/h;->a:Lj/c/a/e/f/e;

    invoke-interface {v1, v0}, Lj/c/a/e/f/e;->e(Lj/c/a/e/f/l/b;)V
    :try_end_0
    .catch Lj/c/a/e/f/k/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lj/c/a/e/f/h;->a:Lj/c/a/e/f/e;

    iget v1, p0, Lj/c/a/e/f/h;->c:I

    invoke-interface {v0, v1}, Lj/c/a/e/f/e;->g(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    invoke-direct {p0}, Lj/c/a/e/f/h;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
