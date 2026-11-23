.class Lcom/beetalk/sdk/plugin/e/f/a$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/f/a;->j(Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/f/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/f/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/f/a$a;->a:Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/f/a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const-string p1, "Required params missing. Have you logged in?"

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    return-void
.end method
