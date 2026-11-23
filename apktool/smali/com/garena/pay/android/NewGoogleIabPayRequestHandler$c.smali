.class Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->q(Landroid/app/Activity;Lcom/garena/pay/android/d;Ljava/lang/String;Li/g;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Ljava/lang/Boolean;",
        "Li/i<",
        "Lcom/beetalk/sdk/u/j;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->b(Li/i;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Li/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/u/j;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->t(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Li/j;

    move-result-object v0

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Li/j;->f(Ljava/lang/Exception;)Z

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v0, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->v(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Lcom/garena/pay/android/GGBillingDataSource;

    move-result-object p1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v1, v0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->u(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v3, v2, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iget-object v2, v2, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {p1, v1, v0, v3, v2}, Lcom/garena/pay/android/GGBillingDataSource;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_1
    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->t(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Li/j;

    move-result-object p1

    invoke-virtual {p1}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1
.end method
