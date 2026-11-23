.class public Lcom/beetalk/sdk/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final transient a:Lcom/beetalk/sdk/a;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/beetalk/sdk/g$o;

.field private g:Lcom/beetalk/sdk/u/a;


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/a;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/b$c;->a:Lcom/beetalk/sdk/a;

    iput-object p2, p0, Lcom/beetalk/sdk/b$c;->b:Ljava/lang/String;

    iput p3, p0, Lcom/beetalk/sdk/b$c;->c:I

    iput-object p5, p0, Lcom/beetalk/sdk/b$c;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/beetalk/sdk/b$c;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/beetalk/sdk/u/a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->g:Lcom/beetalk/sdk/u/a;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/b$c;->c:I

    return v0
.end method

.method public f()Lcom/beetalk/sdk/g$o;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->f:Lcom/beetalk/sdk/g$o;

    return-object v0
.end method

.method public g()Lcom/beetalk/sdk/a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/b$c;->a:Lcom/beetalk/sdk/a;

    return-object v0
.end method

.method public h(Lcom/beetalk/sdk/u/a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b$c;->g:Lcom/beetalk/sdk/u/a;

    return-void
.end method

.method public i(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public k(Lcom/beetalk/sdk/g$o;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b$c;->f:Lcom/beetalk/sdk/g$o;

    return-void
.end method
