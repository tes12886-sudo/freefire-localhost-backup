.class Lcom/garena/pay/android/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/c;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/u/j;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/c;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/c;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c$b;->a:Lcom/garena/pay/android/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/c$b;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/u/j;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/c$b;->a:Lcom/garena/pay/android/c;

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/u/j;

    invoke-static {v0, p1}, Lcom/garena/pay/android/c;->h(Lcom/garena/pay/android/c;Lcom/beetalk/sdk/u/j;)V

    return-object v1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/garena/pay/android/c$b;->a:Lcom/garena/pay/android/c;

    sget-object v0, Lcom/garena/pay/android/b;->R:Lcom/garena/pay/android/b;

    invoke-static {p1, v0}, Lcom/garena/pay/android/c;->b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V

    return-object v1
.end method
