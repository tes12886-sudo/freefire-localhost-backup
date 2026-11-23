.class public Lcom/beetalk/sdk/networking/model/SaveTokenResponse;
.super Lcom/beetalk/sdk/networking/model/BaseResponse;
.source ""


# instance fields
.field private result:Lcom/beetalk/sdk/z/f;
    .annotation runtime Lj/d/d/y/b;
        value = Lcom/beetalk/sdk/z/g;
    .end annotation

    .annotation runtime Lj/d/d/y/c;
        value = "result"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/networking/model/BaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getResult()Lcom/beetalk/sdk/z/f;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/networking/model/SaveTokenResponse;->result:Lcom/beetalk/sdk/z/f;

    return-object v0
.end method

.method public isFailure()Z
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/networking/model/SaveTokenResponse;->result:Lcom/beetalk/sdk/z/f;

    sget-object v1, Lcom/beetalk/sdk/z/f;->d:Lcom/beetalk/sdk/z/f;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSuccess()Z
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/networking/model/SaveTokenResponse;->result:Lcom/beetalk/sdk/z/f;

    sget-object v1, Lcom/beetalk/sdk/z/f;->d:Lcom/beetalk/sdk/z/f;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setResult(Lcom/beetalk/sdk/z/f;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/networking/model/SaveTokenResponse;->result:Lcom/beetalk/sdk/z/f;

    return-void
.end method
