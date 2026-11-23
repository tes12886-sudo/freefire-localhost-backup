.class Lcom/beetalk/sdk/plugin/e/b/c$a;
.super Lcom/beetalk/sdk/plugin/PluginResult;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/c;->i(Ljava/lang/Exception;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Exception;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/c;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/c$a;->b:Lcom/beetalk/sdk/plugin/e/b/c;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/c$a;->a:Ljava/lang/Exception;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    sget-object p1, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    return-void
.end method
