.class public Lcom/facebook/share/c/c$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Object<",
        "Lcom/facebook/share/c/c;",
        "Lcom/facebook/share/c/c$c;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/facebook/share/c/c$b;

.field private g:Ljava/lang/String;

.field private h:Lcom/facebook/share/c/c$d;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/share/c/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/facebook/share/c/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/facebook/share/c/c$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->c:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d(Lcom/facebook/share/c/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/facebook/share/c/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/facebook/share/c/c$c;)Lcom/facebook/share/c/c$b;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->f:Lcom/facebook/share/c/c$b;

    return-object p0
.end method

.method static synthetic g(Lcom/facebook/share/c/c$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lcom/facebook/share/c/c$c;)Lcom/facebook/share/c/c$d;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->h:Lcom/facebook/share/c/c$d;

    return-object p0
.end method

.method static synthetic i(Lcom/facebook/share/c/c$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/c$c;->i:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public j()Lcom/facebook/share/c/c;
    .locals 2

    new-instance v0, Lcom/facebook/share/c/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/c/c;-><init>(Lcom/facebook/share/c/c$c;Lcom/facebook/share/c/c$a;)V

    return-object v0
.end method

.method public k(Lcom/facebook/share/c/c$b;)Lcom/facebook/share/c/c$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->f:Lcom/facebook/share/c/c$b;

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lcom/facebook/share/c/c$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/facebook/share/c/c$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/facebook/share/c/c$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/util/List;)Lcom/facebook/share/c/c$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/share/c/c$c;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->c:Ljava/util/List;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/facebook/share/c/c$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/c$c;->e:Ljava/lang/String;

    return-object p0
.end method
