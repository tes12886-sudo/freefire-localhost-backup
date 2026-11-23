.class public Lcom/beetalk/sdk/j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/beetalk/sdk/j;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/j;

    invoke-direct {v0}, Lcom/beetalk/sdk/j;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    const/4 v1, 0x0

    iput v1, v0, Lcom/beetalk/sdk/j;->a:I

    iput p1, v0, Lcom/beetalk/sdk/j;->c:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/j;

    invoke-direct {v0}, Lcom/beetalk/sdk/j;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    const/4 v1, 0x0

    iput v1, v0, Lcom/beetalk/sdk/j;->a:I

    iput-object p1, v0, Lcom/beetalk/sdk/j;->d:[B

    iput p2, v0, Lcom/beetalk/sdk/j;->c:I

    array-length p1, p1

    iput p1, v0, Lcom/beetalk/sdk/j;->e:I

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/j;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    iput-object p1, v0, Lcom/beetalk/sdk/j;->g:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    iput-object p1, v0, Lcom/beetalk/sdk/j;->h:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    iput-object p1, v0, Lcom/beetalk/sdk/j;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/Integer;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/beetalk/sdk/j;->a:I

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    iput-object p1, v0, Lcom/beetalk/sdk/j;->i:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/j$a;->a:Lcom/beetalk/sdk/j;

    iput-object p1, v0, Lcom/beetalk/sdk/j;->f:Ljava/lang/String;

    return-object p0
.end method
