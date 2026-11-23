.class final Lcom/google/android/datatransport/h/e;
.super Lcom/google/android/datatransport/h/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/h/e$b;
    }
.end annotation


# instance fields
.field private a:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lk/a/a;

.field private d:Lk/a/a;

.field private e:Lk/a/a;

.field private f:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/n;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/s;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/c;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/o;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/q;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/datatransport/h/s;-><init>()V

    invoke-direct {p0, p1}, Lcom/google/android/datatransport/h/e;->j(Landroid/content/Context;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/datatransport/h/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/datatransport/h/e;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static f()Lcom/google/android/datatransport/h/s$a;
    .locals 2

    new-instance v0, Lcom/google/android/datatransport/h/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/datatransport/h/e$b;-><init>(Lcom/google/android/datatransport/h/e$a;)V

    return-object v0
.end method

.method private j(Landroid/content/Context;)V
    .locals 7

    invoke-static {}, Lcom/google/android/datatransport/h/k;->a()Lcom/google/android/datatransport/h/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/h/u/a/a;->a(Lk/a/a;)Lk/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/datatransport/h/e;->a:Lk/a/a;

    invoke-static {p1}, Lcom/google/android/datatransport/h/u/a/c;->a(Ljava/lang/Object;)Lcom/google/android/datatransport/h/u/a/b;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->b:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object v0

    invoke-static {}, Lcom/google/android/datatransport/h/z/d;->a()Lcom/google/android/datatransport/h/z/d;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/datatransport/runtime/backends/j;->a(Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/runtime/backends/j;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->c:Lk/a/a;

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->b:Lk/a/a;

    invoke-static {v0, p1}, Lcom/google/android/datatransport/runtime/backends/l;->a(Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/runtime/backends/l;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/datatransport/h/u/a/a;->a(Lk/a/a;)Lk/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->d:Lk/a/a;

    iget-object p1, p0, Lcom/google/android/datatransport/h/e;->b:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/x/j/b0;->a()Lcom/google/android/datatransport/h/x/j/b0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/datatransport/h/x/j/c0;->a()Lcom/google/android/datatransport/h/x/j/c0;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/datatransport/h/x/j/i0;->a(Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/x/j/i0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->e:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object p1

    invoke-static {}, Lcom/google/android/datatransport/h/z/d;->a()Lcom/google/android/datatransport/h/z/d;

    move-result-object v0

    invoke-static {}, Lcom/google/android/datatransport/h/x/j/d0;->a()Lcom/google/android/datatransport/h/x/j/d0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/datatransport/h/e;->e:Lk/a/a;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/datatransport/h/x/j/g0;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/x/j/g0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/datatransport/h/u/a/a;->a(Lk/a/a;)Lk/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/datatransport/h/x/g;->b(Lk/a/a;)Lcom/google/android/datatransport/h/x/g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->g:Lk/a/a;

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->b:Lk/a/a;

    iget-object v1, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/d;->a()Lcom/google/android/datatransport/h/z/d;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/datatransport/h/x/i;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/x/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->h:Lk/a/a;

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->a:Lk/a/a;

    iget-object v1, p0, Lcom/google/android/datatransport/h/e;->d:Lk/a/a;

    iget-object v2, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    invoke-static {v0, v1, p1, v2, v2}, Lcom/google/android/datatransport/h/x/d;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/x/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->i:Lk/a/a;

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->b:Lk/a/a;

    iget-object v1, p0, Lcom/google/android/datatransport/h/e;->d:Lk/a/a;

    iget-object v5, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    iget-object v3, p0, Lcom/google/android/datatransport/h/e;->h:Lk/a/a;

    iget-object v4, p0, Lcom/google/android/datatransport/h/e;->a:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object v6

    move-object v2, v5

    invoke-static/range {v0 .. v6}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/p;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/p;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->j:Lk/a/a;

    iget-object p1, p0, Lcom/google/android/datatransport/h/e;->a:Lk/a/a;

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    iget-object v1, p0, Lcom/google/android/datatransport/h/e;->h:Lk/a/a;

    invoke-static {p1, v0, v1, v0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/r;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/r;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->k:Lk/a/a;

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object p1

    invoke-static {}, Lcom/google/android/datatransport/h/z/d;->a()Lcom/google/android/datatransport/h/z/d;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/datatransport/h/e;->i:Lk/a/a;

    iget-object v2, p0, Lcom/google/android/datatransport/h/e;->j:Lk/a/a;

    iget-object v3, p0, Lcom/google/android/datatransport/h/e;->k:Lk/a/a;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/google/android/datatransport/h/t;->a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/t;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/datatransport/h/u/a/a;->a(Lk/a/a;)Lk/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/datatransport/h/e;->l:Lk/a/a;

    return-void
.end method


# virtual methods
.method b()Lcom/google/android/datatransport/h/x/j/y;
    .locals 1

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->f:Lk/a/a;

    invoke-interface {v0}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/datatransport/h/x/j/y;

    return-object v0
.end method

.method c()Lcom/google/android/datatransport/h/r;
    .locals 1

    iget-object v0, p0, Lcom/google/android/datatransport/h/e;->l:Lk/a/a;

    invoke-interface {v0}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/datatransport/h/r;

    return-object v0
.end method
