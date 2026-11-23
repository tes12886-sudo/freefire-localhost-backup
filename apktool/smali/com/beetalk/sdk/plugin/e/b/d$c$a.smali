.class Lcom/beetalk/sdk/plugin/e/b/d$c$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/d$c;->c(Lcom/facebook/share/d/a$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/b/d$c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d$c;)V
    .locals 1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c$a;->a:Lcom/beetalk/sdk/plugin/e/b/d$c;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    sget-object v0, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    const-string v0, "Successfully shared"

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    return-void
.end method
