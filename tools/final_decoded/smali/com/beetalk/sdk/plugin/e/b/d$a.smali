.class Lcom/beetalk/sdk/plugin/e/b/d$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/d;->i(Ljava/lang/Exception;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Exception;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/lang/Exception;)V
    .locals 1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$a;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/d$a;->a:Ljava/lang/Exception;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    sget-object v0, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, "Error"

    :goto_0
    iput-object p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    return-void
.end method
