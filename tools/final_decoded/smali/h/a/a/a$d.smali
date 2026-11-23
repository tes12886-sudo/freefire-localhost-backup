.class final Lh/a/a/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/a/a/a;->e(Lh/a/a/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh/a/a/a$e;


# direct methods
.method constructor <init>(Lh/a/a/a$e;)V
    .locals 0

    iput-object p1, p0, Lh/a/a/a$d;->a:Lh/a/a/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lh/a/a/a$d;->a:Lh/a/a/a$e;

    invoke-virtual {v0}, Lh/a/a/a$e;->a()Lh/a/a/g/a;

    move-result-object v0

    iget-object v1, p0, Lh/a/a/a$d;->a:Lh/a/a/a$e;

    invoke-virtual {v1}, Lh/a/a/a$e;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh/a/a/g/a;->i(J)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lh/a/a/a;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
