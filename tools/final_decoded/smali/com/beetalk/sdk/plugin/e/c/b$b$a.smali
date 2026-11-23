.class Lcom/beetalk/sdk/plugin/e/c/b$b$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/c/b$b;->a([Lcom/beetalk/sdk/plugin/e/c/b$c;)Lcom/beetalk/sdk/plugin/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/c/b$b;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/c/b$b;I)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/c/b$b$a;->b:Lcom/beetalk/sdk/plugin/e/c/b$b;

    iput p2, p0, Lcom/beetalk/sdk/plugin/e/c/b$b$a;->a:I

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/c/b$b;->a:Lcom/beetalk/sdk/plugin/e/c/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/c/b;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const-string p1, "Successfully sent"

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    return-void
.end method
