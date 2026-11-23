.class Lcom/beetalk/sdk/z/e$a;
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
        "Ljava/lang/Void;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/z/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/z/e;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/z/e$a;->a:Lcom/beetalk/sdk/z/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li/i;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/lang/Void;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$a;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    instance-of p1, p1, Lcom/beetalk/sdk/z/e$l;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$a;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$l;

    const-string v0, ""

    invoke-interface {p1, v0}, Lcom/beetalk/sdk/z/e$l;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/z/e$a;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    instance-of p1, p1, Lcom/beetalk/sdk/z/e$i;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/beetalk/sdk/z/e$a;->a:Lcom/beetalk/sdk/z/e;

    invoke-static {p1}, Lcom/beetalk/sdk/z/e;->a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/z/e$i;

    invoke-interface {p1, v1}, Lcom/beetalk/sdk/z/e$i;->b(Lorg/json/JSONObject;)V

    :cond_1
    :goto_0
    return-object v1
.end method
