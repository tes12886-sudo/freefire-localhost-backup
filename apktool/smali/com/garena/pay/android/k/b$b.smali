.class Lcom/garena/pay/android/k/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/k/b;-><init>(Landroid/view/View;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/k/b;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/k/b;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/b$b;->a:Lcom/garena/pay/android/k/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/garena/pay/android/k/b$b;->a:Lcom/garena/pay/android/k/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/k/b;->b()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
