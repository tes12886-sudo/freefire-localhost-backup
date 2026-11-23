.class Lj/d/d/z/d$a;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/d;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lj/d/d/e;

.field final synthetic e:Lj/d/d/a0/a;

.field final synthetic f:Lj/d/d/z/d;


# direct methods
.method constructor <init>(Lj/d/d/z/d;ZZLj/d/d/e;Lj/d/d/a0/a;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/d$a;->f:Lj/d/d/z/d;

    iput-boolean p2, p0, Lj/d/d/z/d$a;->b:Z

    iput-boolean p3, p0, Lj/d/d/z/d$a;->c:Z

    iput-object p4, p0, Lj/d/d/z/d$a;->d:Lj/d/d/e;

    iput-object p5, p0, Lj/d/d/z/d$a;->e:Lj/d/d/a0/a;

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method

.method private e()Lj/d/d/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/d$a;->a:Lj/d/d/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/d/d/z/d$a;->d:Lj/d/d/e;

    iget-object v1, p0, Lj/d/d/z/d$a;->f:Lj/d/d/z/d;

    iget-object v2, p0, Lj/d/d/z/d$a;->e:Lj/d/d/a0/a;

    invoke-virtual {v0, v1, v2}, Lj/d/d/e;->o(Lj/d/d/x;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v0

    iput-object v0, p0, Lj/d/d/z/d$a;->a:Lj/d/d/w;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lj/d/d/z/d$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/a;->x0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lj/d/d/z/d$a;->e()Lj/d/d/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lj/d/d/z/d$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    return-void

    :cond_0
    invoke-direct {p0}, Lj/d/d/z/d$a;->e()Lj/d/d/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
