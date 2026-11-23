.class public Lcom/beetalk/sdk/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/h$a;
    }
.end annotation


# instance fields
.field protected a:I

.field protected b:Ljava/lang/String;

.field protected c:I

.field protected d:[B

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/beetalk/sdk/h;->a:I

    const-string v1, ""

    iput-object v1, p0, Lcom/beetalk/sdk/h;->b:Ljava/lang/String;

    iput v0, p0, Lcom/beetalk/sdk/h;->c:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/beetalk/sdk/h;->d:[B

    iput-object v1, p0, Lcom/beetalk/sdk/h;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/h;->c:I

    return v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h;->d:[B

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/h;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/h;->a:I

    return v0
.end method
