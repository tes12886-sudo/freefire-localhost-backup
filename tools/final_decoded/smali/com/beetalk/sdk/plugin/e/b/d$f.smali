.class Lcom/beetalk/sdk/plugin/e/b/d$f;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/plugin/e/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/beetalk/sdk/plugin/e/b/d$d;",
        "Ljava/lang/Void;",
        "Ljava/util/List<",
        "Lcom/beetalk/sdk/plugin/e/b/d$e;",
        ">;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/d;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->a:Landroid/app/Activity;

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/b/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/d$f;-><init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;)V

    return-void
.end method

.method private b(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/plugin/e/b/d$e;",
            ">;"
        }
    .end annotation

    const-string v0, "friends"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "uid"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/beetalk/sdk/plugin/e/b/d$f$a;

    invoke-direct {v3, p0, v2}, Lcom/beetalk/sdk/plugin/e/b/d$f$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/d$f;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected varargs a([Lcom/beetalk/sdk/plugin/e/b/d$d;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/beetalk/sdk/plugin/e/b/d$d;",
            ")",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/plugin/e/b/d$e;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/b/d$d;->e:Ljava/util/List;

    invoke-static {p1}, Lcom/beetalk/sdk/z/i/d;->c(Ljava/util/List;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "friends"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/d$f;->b(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->a:Landroid/app/Activity;

    const-string v1, "Exception raised. Cannot Parse the Data"

    invoke-static {p1, v1, v0}, Lcom/beetalk/sdk/plugin/e/b/d;->p(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    sget-object v0, Lcom/garena/pay/android/b;->n:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->a:Landroid/app/Activity;

    const-string v2, "Cannot Reach Server"

    invoke-static {p1, v0, v2, v1}, Lcom/beetalk/sdk/plugin/e/b/d;->o(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;Landroid/app/Activity;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/plugin/e/b/d$e;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/d$f;->a:Landroid/app/Activity;

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/plugin/e/b/d;->q(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/util/List;Landroid/app/Activity;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lcom/beetalk/sdk/plugin/e/b/d$d;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/d$f;->a([Lcom/beetalk/sdk/plugin/e/b/d$d;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/d$f;->c(Ljava/util/List;)V

    return-void
.end method
