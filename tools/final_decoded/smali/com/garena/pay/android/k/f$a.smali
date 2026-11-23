.class Lcom/garena/pay/android/k/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/k/f;->e(Lcom/garena/pay/android/k/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/k/f;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/k/f;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/f$a;->a:Lcom/garena/pay/android/k/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/garena/pay/android/k/f$a;->a:Lcom/garena/pay/android/k/f;

    iget-object v0, v0, Lcom/garena/pay/android/k/g;->a:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0}, Lcom/garena/pay/android/k/c;->h()Lcom/garena/pay/android/k/c$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/garena/pay/android/k/f$a;->a:Lcom/garena/pay/android/k/f;

    iget-object v0, v0, Lcom/garena/pay/android/k/g;->a:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0}, Lcom/garena/pay/android/k/c;->h()Lcom/garena/pay/android/k/c$b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/garena/pay/android/k/c$b;->b(Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lcom/garena/pay/android/k/f$a;->a:Lcom/garena/pay/android/k/f;

    iget-object p1, p1, Lcom/garena/pay/android/k/g;->a:Lcom/garena/pay/android/k/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/garena/pay/android/k/c;->g(Z)V

    return-void
.end method
