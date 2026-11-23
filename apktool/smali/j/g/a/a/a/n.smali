.class public Lj/g/a/a/a/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lo/u;


# direct methods
.method public constructor <init>(Lj/g/a/a/a/x;)V
    .locals 1

    invoke-static {}, Lj/g/a/a/a/u;->f()Lj/g/a/a/a/u;

    move-result-object v0

    invoke-virtual {v0}, Lj/g/a/a/a/u;->c()Lj/g/a/a/a/p;

    move-result-object v0

    invoke-static {p1, v0}, Lj/g/a/a/a/y/i/b;->c(Lj/g/a/a/a/k;Lj/g/a/a/a/p;)Lm/z;

    move-result-object p1

    new-instance v0, Lj/g/a/a/a/y/g;

    invoke-direct {v0}, Lj/g/a/a/a/y/g;-><init>()V

    invoke-direct {p0, p1, v0}, Lj/g/a/a/a/n;-><init>(Lm/z;Lj/g/a/a/a/y/g;)V

    return-void
.end method

.method constructor <init>(Lm/z;Lj/g/a/a/a/y/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Lj/g/a/a/a/n;->a()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, p0, Lj/g/a/a/a/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1, p2}, Lj/g/a/a/a/n;->c(Lm/z;Lj/g/a/a/a/y/g;)Lo/u;

    move-result-object p1

    iput-object p1, p0, Lj/g/a/a/a/n;->b:Lo/u;

    return-void
.end method

.method private a()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0
.end method

.method private b()Lj/d/d/e;
    .locals 3

    new-instance v0, Lj/d/d/f;

    invoke-direct {v0}, Lj/d/d/f;-><init>()V

    new-instance v1, Lj/g/a/a/a/z/g;

    invoke-direct {v1}, Lj/g/a/a/a/z/g;-><init>()V

    invoke-virtual {v0, v1}, Lj/d/d/f;->d(Lj/d/d/x;)Lj/d/d/f;

    new-instance v1, Lj/g/a/a/a/z/h;

    invoke-direct {v1}, Lj/g/a/a/a/z/h;-><init>()V

    invoke-virtual {v0, v1}, Lj/d/d/f;->d(Lj/d/d/x;)Lj/d/d/f;

    const-class v1, Lj/g/a/a/a/z/c;

    new-instance v2, Lj/g/a/a/a/z/d;

    invoke-direct {v2}, Lj/g/a/a/a/z/d;-><init>()V

    invoke-virtual {v0, v1, v2}, Lj/d/d/f;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lj/d/d/f;

    invoke-virtual {v0}, Lj/d/d/f;->b()Lj/d/d/e;

    move-result-object v0

    return-object v0
.end method

.method private c(Lm/z;Lj/g/a/a/a/y/g;)Lo/u;
    .locals 1

    new-instance v0, Lo/u$b;

    invoke-direct {v0}, Lo/u$b;-><init>()V

    invoke-virtual {v0, p1}, Lo/u$b;->f(Lm/z;)Lo/u$b;

    invoke-virtual {p2}, Lj/g/a/a/a/y/g;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo/u$b;->b(Ljava/lang/String;)Lo/u$b;

    invoke-direct {p0}, Lj/g/a/a/a/n;->b()Lj/d/d/e;

    move-result-object p1

    invoke-static {p1}, Lo/z/a/a;->g(Lj/d/d/e;)Lo/z/a/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo/u$b;->a(Lo/h$a;)Lo/u$b;

    invoke-virtual {v0}, Lo/u$b;->d()Lo/u;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d()Lj/g/a/a/a/a0/a;
    .locals 1

    const-class v0, Lj/g/a/a/a/a0/a;

    invoke-virtual {p0, v0}, Lj/g/a/a/a/n;->e(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/g/a/a/a/a0/a;

    return-object v0
.end method

.method protected e(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/g/a/a/a/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lj/g/a/a/a/n;->b:Lo/u;

    invoke-virtual {v1, p1}, Lo/u;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lj/g/a/a/a/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
