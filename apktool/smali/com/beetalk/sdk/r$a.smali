.class Lcom/beetalk/sdk/r$a;
.super Lj/g/a/a/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/g/a/a/a/c<",
        "Lj/g/a/a/a/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/r;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/r;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/r$a;->a:Lcom/beetalk/sdk/r;

    invoke-direct {p0}, Lj/g/a/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lj/g/a/a/a/v;)V
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/r;->e:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Authorize canceled."

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/r$a;->a:Lcom/beetalk/sdk/r;

    sget-object v0, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/r$a;->a:Lcom/beetalk/sdk/r;

    sget-object v0, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    :goto_0
    invoke-static {p1, v0}, Lcom/beetalk/sdk/r;->g(Lcom/beetalk/sdk/r;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method public d(Lj/g/a/a/a/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/j<",
            "Lj/g/a/a/a/x;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lj/g/a/a/a/u;->f()Lj/g/a/a/a/u;

    move-result-object p1

    invoke-virtual {p1}, Lj/g/a/a/a/u;->g()Lj/g/a/a/a/l;

    move-result-object p1

    invoke-interface {p1}, Lj/g/a/a/a/l;->c()Lj/g/a/a/a/k;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/x;

    invoke-virtual {p1}, Lj/g/a/a/a/k;->a()Lj/g/a/a/a/a;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/r;

    iget-object v0, p1, Lj/g/a/a/a/r;->a:Ljava/lang/String;

    iget-object p1, p1, Lj/g/a/a/a/r;->b:Ljava/lang/String;

    sget-object v1, Lcom/beetalk/sdk/r;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", secret: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/beetalk/sdk/r$a;->a:Lcom/beetalk/sdk/r;

    invoke-static {v1, v0, p1}, Lcom/beetalk/sdk/r;->f(Lcom/beetalk/sdk/r;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
