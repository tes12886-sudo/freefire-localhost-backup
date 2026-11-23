.class Lcom/beetalk/sdk/m$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/m$b;->onCompleted(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/g;->p()Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/a;->q()Ljava/lang/String;

    return-void
.end method
