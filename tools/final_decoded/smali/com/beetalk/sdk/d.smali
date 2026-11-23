.class public Lcom/beetalk/sdk/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Lcom/beetalk/sdk/a;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Lcom/beetalk/sdk/g$n;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private j:Lcom/beetalk/sdk/g;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V
    .locals 7

    sget-object v0, Lcom/beetalk/sdk/p;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x0

    const-string v6, ""

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/beetalk/sdk/d;-><init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;IZLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/d;->b:Ljava/lang/String;

    sget-object v0, Lcom/beetalk/sdk/p;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/d;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/beetalk/sdk/d;->e:Z

    iput p3, p0, Lcom/beetalk/sdk/d;->c:I

    iput-object p2, p0, Lcom/beetalk/sdk/d;->d:Lcom/beetalk/sdk/g$n;

    iput-boolean p4, p0, Lcom/beetalk/sdk/d;->e:Z

    iput-object p5, p0, Lcom/beetalk/sdk/d;->f:Ljava/lang/String;

    new-instance p2, Lcom/beetalk/sdk/d$a;

    invoke-direct {p2, p0, p1}, Lcom/beetalk/sdk/d$a;-><init>(Lcom/beetalk/sdk/d;Landroid/app/Activity;)V

    iput-object p2, p0, Lcom/beetalk/sdk/d;->a:Lcom/beetalk/sdk/a;

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/a;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/d;->a:Lcom/beetalk/sdk/a;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/beetalk/sdk/a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/d;->a:Lcom/beetalk/sdk/a;

    return-object v0
.end method

.method public c()Lcom/beetalk/sdk/b$c;
    .locals 8

    new-instance v1, Lcom/beetalk/sdk/d$b;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/d$b;-><init>(Lcom/beetalk/sdk/d;)V

    new-instance v7, Lcom/beetalk/sdk/b$c;

    iget-object v2, p0, Lcom/beetalk/sdk/d;->b:Ljava/lang/String;

    iget v3, p0, Lcom/beetalk/sdk/d;->c:I

    iget-boolean v4, p0, Lcom/beetalk/sdk/d;->e:Z

    iget-object v5, p0, Lcom/beetalk/sdk/d;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/beetalk/sdk/d;->g:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/beetalk/sdk/b$c;-><init>(Lcom/beetalk/sdk/a;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/d;->i:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/beetalk/sdk/b$c;->j(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/d;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Lcom/beetalk/sdk/b$c;->i(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lcom/beetalk/sdk/d;->j:Lcom/beetalk/sdk/g;

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/beetalk/sdk/b$c;->h(Lcom/beetalk/sdk/u/a;)V

    iget-object v0, p0, Lcom/beetalk/sdk/d;->j:Lcom/beetalk/sdk/g;

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->F()Lcom/beetalk/sdk/g$o;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/beetalk/sdk/b$c;->k(Lcom/beetalk/sdk/g$o;)V

    return-object v7
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/d;->c:I

    return v0
.end method

.method public e()Lcom/beetalk/sdk/g;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/d;->j:Lcom/beetalk/sdk/g;

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/d;->f:Ljava/lang/String;

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/d;->g:Ljava/lang/String;

    return-void
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/beetalk/sdk/d;->e:Z

    return-void
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, Lcom/beetalk/sdk/d;->c:I

    return-void
.end method

.method public j(Lcom/beetalk/sdk/g;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/d;->j:Lcom/beetalk/sdk/g;

    return-void
.end method
