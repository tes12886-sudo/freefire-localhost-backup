.class Lcom/beetalk/sdk/plugin/a$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/beetalk/sdk/plugin/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/a;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/a$a;->c:Lcom/beetalk/sdk/plugin/a;

    iput p2, p0, Lcom/beetalk/sdk/plugin/a$a;->a:I

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/a$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iput p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p2, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    return-void
.end method
