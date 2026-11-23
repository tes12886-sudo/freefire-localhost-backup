.class Lcom/beetalk/sdk/plugin/e/b/d$b;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/d;->m(ILjava/lang/String;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/b/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$b;->c:Lcom/beetalk/sdk/plugin/e/b/d;

    iput p2, p0, Lcom/beetalk/sdk/plugin/e/b/d$b;->a:I

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/e/b/d$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iput p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    return-void
.end method
