.class Lcom/beetalk/sdk/plugin/e/f/a$c$b;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/f/a$c;->a([Lcom/beetalk/sdk/plugin/e/f/a$b;)Lcom/beetalk/sdk/plugin/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/f/a$c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/f/a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/f/a$c$b;->a:Lcom/beetalk/sdk/plugin/e/f/a$c;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/f/a$c;->a:Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/f/a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const-string p1, "Request Failed. Network Error or Server Error"

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    return-void
.end method
