.class Lcom/beetalk/sdk/z/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/z/e;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/z/e$j;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/z/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/z/e;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/z/e$b;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/z/e$j;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$j;

    iget-boolean v0, p1, Lcom/beetalk/sdk/z/e$j;->a:Z

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/z/e$f;->c()V

    return-object v2

    :cond_1
    iget-object v0, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {v0}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object v0

    instance-of v0, v0, Lcom/beetalk/sdk/z/e$l;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {v0}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object v0

    check-cast v0, Lcom/beetalk/sdk/z/e$l;

    iget-object p1, p1, Lcom/beetalk/sdk/z/e$j;->b:Lorg/json/JSONObject;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-interface {v0, v1}, Lcom/beetalk/sdk/z/e$l;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {v0}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object v0

    instance-of v0, v0, Lcom/beetalk/sdk/z/e$i;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {v0}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object v0

    check-cast v0, Lcom/beetalk/sdk/z/e$i;

    iget-object p1, p1, Lcom/beetalk/sdk/z/e$j;->b:Lorg/json/JSONObject;

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/z/e$i;->b(Lorg/json/JSONObject;)V

    :cond_4
    :goto_0
    return-object v2

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    instance-of p1, p1, Lcom/beetalk/sdk/z/e$l;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$l;

    invoke-interface {p1, v1}, Lcom/beetalk/sdk/z/e$l;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    instance-of p1, p1, Lcom/beetalk/sdk/z/e$i;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$b;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$i;

    invoke-interface {p1, v2}, Lcom/beetalk/sdk/z/e$i;->b(Lorg/json/JSONObject;)V

    :cond_7
    :goto_2
    return-object v2
.end method
