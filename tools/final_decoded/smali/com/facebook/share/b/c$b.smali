.class Lcom/facebook/share/b/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/c;->g2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/share/b/c;


# direct methods
.method constructor <init>(Lcom/facebook/share/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/b/c$b;->a:Lcom/facebook/share/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/x;)V
    .locals 4

    invoke-virtual {p1}, Lcom/facebook/x;->b()Lcom/facebook/q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/facebook/share/b/c$b;->a:Lcom/facebook/share/b/c;

    invoke-static {p1, v0}, Lcom/facebook/share/b/c;->X1(Lcom/facebook/share/b/c;Lcom/facebook/q;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/x;->c()Lorg/json/JSONObject;

    move-result-object p1

    new-instance v0, Lcom/facebook/share/b/c$d;

    invoke-direct {v0}, Lcom/facebook/share/b/c$d;-><init>()V

    :try_start_0
    const-string v1, "user_code"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/b/c$d;->d(Ljava/lang/String;)V

    const-string v1, "expires_in"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/share/b/c$d;->c(J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lcom/facebook/share/b/c$b;->a:Lcom/facebook/share/b/c;

    invoke-static {p1, v0}, Lcom/facebook/share/b/c;->Y1(Lcom/facebook/share/b/c;Lcom/facebook/share/b/c$d;)V

    return-void

    :catch_0
    iget-object p1, p0, Lcom/facebook/share/b/c$b;->a:Lcom/facebook/share/b/c;

    new-instance v0, Lcom/facebook/q;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "Malformed server response"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/q;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/share/b/c;->X1(Lcom/facebook/share/b/c;Lcom/facebook/q;)V

    return-void
.end method
