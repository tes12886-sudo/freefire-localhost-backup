.class Lcom/beetalk/sdk/plugin/e/f/a$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/plugin/e/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/beetalk/sdk/plugin/e/f/a$b;",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/f/a;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/plugin/e/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/f/a$c;->a:Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/plugin/e/f/a;Lcom/beetalk/sdk/plugin/e/f/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/f/a$c;-><init>(Lcom/beetalk/sdk/plugin/e/f/a;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Lcom/beetalk/sdk/plugin/e/f/a$b;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 5

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v1, p1, Lcom/beetalk/sdk/plugin/e/f/a$b;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/beetalk/sdk/plugin/e/f/a$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/beetalk/sdk/plugin/e/f/a$b;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/beetalk/sdk/z/i/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, -0x1

    :try_start_0
    const-string v3, "Response From Server: Feedback %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    const-string v0, "result"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-eq v0, v2, :cond_1

    new-instance v1, Lcom/beetalk/sdk/plugin/e/f/a$c$a;

    invoke-direct {v1, p0, p1, v0}, Lcom/beetalk/sdk/plugin/e/f/a$c$a;-><init>(Lcom/beetalk/sdk/plugin/e/f/a$c;Lcom/beetalk/sdk/plugin/e/f/a$b;I)V

    return-object v1

    :cond_1
    new-instance p1, Lcom/beetalk/sdk/plugin/e/f/a$c$b;

    invoke-direct {p1, p0}, Lcom/beetalk/sdk/plugin/e/f/a$c$b;-><init>(Lcom/beetalk/sdk/plugin/e/f/a$c;)V

    return-object p1
.end method

.method protected b(Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/f/a$c;->a:Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/plugin/e/f/a;->i(Lcom/beetalk/sdk/plugin/e/f/a;Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lcom/beetalk/sdk/plugin/e/f/a$b;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/f/a$c;->a([Lcom/beetalk/sdk/plugin/e/f/a$b;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/f/a$c;->b(Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method
