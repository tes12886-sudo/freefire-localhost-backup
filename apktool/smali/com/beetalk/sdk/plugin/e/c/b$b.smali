.class Lcom/beetalk/sdk/plugin/e/c/b$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/plugin/e/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/beetalk/sdk/plugin/e/c/b$c;",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/c/b;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/plugin/e/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/c/b$b;->a:Lcom/beetalk/sdk/plugin/e/c/b;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/e/c/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b$b;-><init>(Lcom/beetalk/sdk/plugin/e/c/b;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Lcom/beetalk/sdk/plugin/e/c/b$c;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/c/b$b;->a:Lcom/beetalk/sdk/plugin/e/c/b;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/plugin/e/c/b;->j(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/e/c/b$c;)I

    move-result p1

    sget-object v0, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/b$b$a;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b$b$a;-><init>(Lcom/beetalk/sdk/plugin/e/c/b$b;I)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/b$b$b;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b$b$b;-><init>(Lcom/beetalk/sdk/plugin/e/c/b$b;I)V

    return-object v0
.end method

.method protected b(Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/c/b$b;->a:Lcom/beetalk/sdk/plugin/e/c/b;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/plugin/e/c/b;->k(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lcom/beetalk/sdk/plugin/e/c/b$c;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b$b;->a([Lcom/beetalk/sdk/plugin/e/c/b$c;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b$b;->b(Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method
