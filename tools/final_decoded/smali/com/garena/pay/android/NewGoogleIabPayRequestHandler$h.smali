.class Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->K(Ljava/util/List;Ljava/util/List;)Li/i;
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
        "Ljava/util/List<",
        "Lcom/android/billingclient/api/SkuDetails;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->c:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iput-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->b(Li/i;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Li/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Li/i<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;>;"
        }
    .end annotation

    const/4 p1, 0x2

    new-array p1, p1, [Li/i;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->c:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->a:Ljava/util/List;

    const-string v2, "inapp"

    invoke-static {v0, v2, v1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->x(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;Ljava/util/List;)Li/i;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->c:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;->b:Ljava/util/List;

    const-string v2, "subs"

    invoke-static {v0, v2, v1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->x(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;Ljava/util/List;)Li/i;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li/i;->I(Ljava/util/Collection;)Li/i;

    move-result-object p1

    new-instance v0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h$a;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h$a;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;)V

    invoke-virtual {p1, v0}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1
.end method
