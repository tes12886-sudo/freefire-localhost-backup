.class Lcom/beetalk/sdk/plugin/e/f/a$c$a;
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
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/f/a$b;

.field final synthetic b:I

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/f/a$c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/f/a$c;Lcom/beetalk/sdk/plugin/e/f/a$b;I)V
    .locals 1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/f/a$c$a;->c:Lcom/beetalk/sdk/plugin/e/f/a$c;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/f/a$c$a;->a:Lcom/beetalk/sdk/plugin/e/f/a$b;

    iput p3, p0, Lcom/beetalk/sdk/plugin/e/f/a$c$a;->b:I

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/f/a$c;->a:Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/e/f/a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "feedback: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/beetalk/sdk/plugin/e/f/a$b;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    iput p3, p0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput p3, p0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    return-void
.end method
