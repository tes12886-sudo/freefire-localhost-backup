.class Lcom/beetalk/sdk/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->Y(Lcom/beetalk/sdk/g$n;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Lcom/beetalk/sdk/g;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    iput-object p2, p0, Lcom/beetalk/sdk/g$b;->a:Lcom/beetalk/sdk/g$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "facebook token refresh failed:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    sget-object v0, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    invoke-static {p1, v0}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->c(Lcom/beetalk/sdk/g;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->g(Lcom/beetalk/sdk/g;I)I

    iget-object v0, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$b;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {v0, v1, v0, p1}, Lcom/beetalk/sdk/g;->f(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method

.method public b(Lcom/facebook/a;)V
    .locals 2

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "facebook token refreshed"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    iget-object v0, p0, Lcom/beetalk/sdk/g$b;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {p1, v0}, Lcom/beetalk/sdk/g;->k(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/g$b;->b:Lcom/beetalk/sdk/g;

    iget-object v0, p0, Lcom/beetalk/sdk/g$b;->a:Lcom/beetalk/sdk/g$n;

    const/4 v1, 0x0

    invoke-static {p1, v0, p1, v1}, Lcom/beetalk/sdk/g;->f(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method
