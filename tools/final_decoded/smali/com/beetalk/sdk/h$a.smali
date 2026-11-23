.class public Lcom/beetalk/sdk/h$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/beetalk/sdk/h;


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/h;

    invoke-direct {v0}, Lcom/beetalk/sdk/h;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/h$a;->a:Lcom/beetalk/sdk/h;

    iput p1, v0, Lcom/beetalk/sdk/h;->a:I

    iput-object p2, v0, Lcom/beetalk/sdk/h;->g:Ljava/lang/String;

    iput p3, v0, Lcom/beetalk/sdk/h;->c:I

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/h;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h$a;->a:Lcom/beetalk/sdk/h;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/beetalk/sdk/h$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h$a;->a:Lcom/beetalk/sdk/h;

    iput-object p1, v0, Lcom/beetalk/sdk/h;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beetalk/sdk/h$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h$a;->a:Lcom/beetalk/sdk/h;

    iput-object p1, v0, Lcom/beetalk/sdk/h;->e:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/beetalk/sdk/h$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h$a;->a:Lcom/beetalk/sdk/h;

    iput-object p1, v0, Lcom/beetalk/sdk/h;->f:Ljava/lang/String;

    return-object p0
.end method
