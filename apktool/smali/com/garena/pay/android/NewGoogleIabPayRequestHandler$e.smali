.class Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->E(Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)Li/i;
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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Li/j;

.field final synthetic c:Lcom/garena/pay/android/d;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;Li/j;Lcom/garena/pay/android/d;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iput-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    iput-object p4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->c:Lcom/garena/pay/android/d;

    iput-object p5, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "subs"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "inapp"

    :goto_1
    invoke-static {}, Lcom/android/billingclient/api/n;->c()Lcom/android/billingclient/api/n$a;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/n$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/n$a;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/n$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/n$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/n$a;->a()Lcom/android/billingclient/api/n;

    move-result-object p1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->v(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Lcom/garena/pay/android/GGBillingDataSource;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;)V

    invoke-virtual {v0, p1, v1}, Lcom/garena/pay/android/GGBillingDataSource;->H(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    invoke-virtual {p1}, Li/j;->a()Li/i;

    move-result-object p1

    invoke-virtual {p1}, Li/i;->w()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Li/j;->d(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
