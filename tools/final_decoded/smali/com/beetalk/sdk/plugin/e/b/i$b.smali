.class Lcom/beetalk/sdk/plugin/e/b/i$b;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/i;->p(Landroid/app/Activity;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/i;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/i;Lorg/json/JSONObject;)V
    .locals 1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/i$b;->b:Lcom/beetalk/sdk/plugin/e/b/i;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/i$b;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput v0, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/i;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    return-void
.end method
