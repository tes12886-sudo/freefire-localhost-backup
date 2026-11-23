.class Lcom/beetalk/sdk/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/z/e$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/m;->e(Lcom/beetalk/sdk/b$c;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/u/i;

.field final synthetic b:Lcom/beetalk/sdk/m;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/m;Lcom/beetalk/sdk/u/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/m$a;->b:Lcom/beetalk/sdk/m;

    iput-object p2, p0, Lcom/beetalk/sdk/m$a;->a:Lcom/beetalk/sdk/u/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/m$a;->b:Lcom/beetalk/sdk/m;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/m;->f(Lcom/beetalk/sdk/m;Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/m$a;->b:Lcom/beetalk/sdk/m;

    iget-object p1, p1, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    goto :goto_1

    :cond_0
    :try_start_0
    const-string v0, "uid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object p1

    iget-object v2, p0, Lcom/beetalk/sdk/m$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v2, v2, Lcom/beetalk/sdk/u/i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/t/a;->j(JLjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object p1

    iget-object v2, p0, Lcom/beetalk/sdk/m$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v2, v2, Lcom/beetalk/sdk/u/i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/t/k;->j(JLjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_0
    iget-object p1, p0, Lcom/beetalk/sdk/m$a;->b:Lcom/beetalk/sdk/m;

    iget-object v2, p0, Lcom/beetalk/sdk/m$a;->a:Lcom/beetalk/sdk/u/i;

    iget-object v2, v2, Lcom/beetalk/sdk/u/i;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lcom/beetalk/sdk/m;->g(Lcom/beetalk/sdk/m;JLjava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_1
    return-void
.end method
