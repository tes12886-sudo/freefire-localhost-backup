.class Lcom/garena/pay/android/k/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/garena/pay/android/k/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/k/c;->l(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/k/c;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/c$a;->a:Lcom/garena/pay/android/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/c$a;->a:Lcom/garena/pay/android/k/c;

    invoke-static {v0}, Lcom/garena/pay/android/k/c;->b(Lcom/garena/pay/android/k/c;)Lcom/garena/pay/android/k/c$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/garena/pay/android/k/c$b;->a()V

    return-void
.end method
