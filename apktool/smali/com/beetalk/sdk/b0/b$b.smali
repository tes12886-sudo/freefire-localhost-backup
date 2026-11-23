.class public Lcom/beetalk/sdk/b0/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/b0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/b0/b$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/b0/b$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/beetalk/sdk/b0/b$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/b0/b$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/beetalk/sdk/b0/b$b;)[B
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/b0/b$b;->c:[B

    return-object p0
.end method


# virtual methods
.method public d()Lcom/beetalk/sdk/b0/b;
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/b0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/beetalk/sdk/b0/b;-><init>(Lcom/beetalk/sdk/b0/b$b;Lcom/beetalk/sdk/b0/b$a;)V

    return-object v0
.end method

.method public e([B)Lcom/beetalk/sdk/b0/b$b;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/b$b;->c:[B

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/beetalk/sdk/b0/b$b;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/b$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/beetalk/sdk/b0/b$b;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/b$b;->a:Ljava/lang/String;

    return-object p0
.end method
