.class public Lcom/garena/sdkunity/Utility;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getProvider(I)Lcom/beetalk/sdk/g$o;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/16 v0, 0x8

    if-eq p0, v0, :cond_4

    const/16 v0, 0xb

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    return-object p0

    :cond_1
    sget-object p0, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    return-object p0

    :cond_2
    sget-object p0, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    return-object p0

    :cond_3
    sget-object p0, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    return-object p0

    :cond_4
    sget-object p0, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    return-object p0

    :cond_5
    sget-object p0, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    return-object p0
.end method
