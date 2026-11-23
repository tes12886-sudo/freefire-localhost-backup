.class public Lj/g/a/a/a/y/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/g/a/a/a/y/d$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lj/g/a/a/a/k;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Lj/g/a/a/a/y/d$c;

.field private final b:Lj/g/a/a/a/y/f;

.field private final c:Lj/g/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private final e:Lj/g/a/a/a/y/e;


# direct methods
.method constructor <init>(Lj/g/a/a/a/l;Lj/g/a/a/a/y/f;Ljava/util/concurrent/ExecutorService;Lj/g/a/a/a/y/d$c;Lj/g/a/a/a/y/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/l<",
            "TT;>;",
            "Lj/g/a/a/a/y/f;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lj/g/a/a/a/y/d$c;",
            "Lj/g/a/a/a/y/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj/g/a/a/a/y/d;->b:Lj/g/a/a/a/y/f;

    iput-object p1, p0, Lj/g/a/a/a/y/d;->c:Lj/g/a/a/a/l;

    iput-object p3, p0, Lj/g/a/a/a/y/d;->d:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Lj/g/a/a/a/y/d;->a:Lj/g/a/a/a/y/d$c;

    iput-object p5, p0, Lj/g/a/a/a/y/d;->e:Lj/g/a/a/a/y/e;

    return-void
.end method

.method public constructor <init>(Lj/g/a/a/a/l;Ljava/util/concurrent/ExecutorService;Lj/g/a/a/a/y/e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/l<",
            "TT;>;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lj/g/a/a/a/y/e<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v2, Lj/g/a/a/a/y/f;

    invoke-direct {v2}, Lj/g/a/a/a/y/f;-><init>()V

    new-instance v4, Lj/g/a/a/a/y/d$c;

    invoke-direct {v4}, Lj/g/a/a/a/y/d$c;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lj/g/a/a/a/y/d;-><init>(Lj/g/a/a/a/l;Lj/g/a/a/a/y/f;Ljava/util/concurrent/ExecutorService;Lj/g/a/a/a/y/d$c;Lj/g/a/a/a/y/e;)V

    return-void
.end method


# virtual methods
.method public a(Lj/g/a/a/a/y/a;)V
    .locals 1

    new-instance v0, Lj/g/a/a/a/y/d$a;

    invoke-direct {v0, p0}, Lj/g/a/a/a/y/d$a;-><init>(Lj/g/a/a/a/y/d;)V

    invoke-virtual {p1, v0}, Lj/g/a/a/a/y/a;->a(Lj/g/a/a/a/y/a$b;)Z

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lj/g/a/a/a/y/d;->c:Lj/g/a/a/a/l;

    invoke-interface {v0}, Lj/g/a/a/a/l;->c()Lj/g/a/a/a/k;

    move-result-object v0

    iget-object v1, p0, Lj/g/a/a/a/y/d;->b:Lj/g/a/a/a/y/f;

    invoke-virtual {v1}, Lj/g/a/a/a/y/f;->a()J

    move-result-wide v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/g/a/a/a/y/d;->a:Lj/g/a/a/a/y/d$c;

    invoke-virtual {v0, v1, v2}, Lj/g/a/a/a/y/d$c;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lj/g/a/a/a/y/d;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lj/g/a/a/a/y/d$b;

    invoke-direct {v1, p0}, Lj/g/a/a/a/y/d$b;-><init>(Lj/g/a/a/a/y/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method

.method protected c()V
    .locals 3

    iget-object v0, p0, Lj/g/a/a/a/y/d;->c:Lj/g/a/a/a/l;

    invoke-interface {v0}, Lj/g/a/a/a/l;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/g/a/a/a/k;

    iget-object v2, p0, Lj/g/a/a/a/y/d;->e:Lj/g/a/a/a/y/e;

    invoke-interface {v2, v1}, Lj/g/a/a/a/y/e;->a(Lj/g/a/a/a/k;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/g/a/a/a/y/d;->a:Lj/g/a/a/a/y/d$c;

    iget-object v1, p0, Lj/g/a/a/a/y/d;->b:Lj/g/a/a/a/y/f;

    invoke-virtual {v1}, Lj/g/a/a/a/y/f;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lj/g/a/a/a/y/d$c;->b(J)V

    return-void
.end method
