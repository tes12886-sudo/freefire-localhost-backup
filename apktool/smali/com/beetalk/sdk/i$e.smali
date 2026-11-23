.class Lcom/beetalk/sdk/i$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/g$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/i;->J(Lcom/beetalk/sdk/g$n;Z)Lcom/beetalk/sdk/g$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g$n;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/i$e;->a:Lcom/beetalk/sdk/g$n;

    iput-boolean p2, p0, Lcom/beetalk/sdk/i$e;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lcom/beetalk/sdk/i$d;->a:[I

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->z()I

    move-result v0

    invoke-static {v0}, Lcom/garena/pay/android/b;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/beetalk/sdk/i$e;->b:Z

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/beetalk/sdk/i$e;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {p1, p2}, Lcom/beetalk/sdk/i;->s(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V

    goto :goto_1

    :cond_0
    :goto_0
    :pswitch_1
    iget-object v0, p0, Lcom/beetalk/sdk/i$e;->a:Lcom/beetalk/sdk/g$n;

    invoke-interface {v0, p1, p2}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
