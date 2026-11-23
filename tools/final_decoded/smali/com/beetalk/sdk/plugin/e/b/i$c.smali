.class Lcom/beetalk/sdk/plugin/e/b/i$c;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/i;->o(Landroid/app/Activity;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/i;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/i;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/i$c;->b:Lcom/beetalk/sdk/plugin/e/b/i;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/i$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/i;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    return-void
.end method
