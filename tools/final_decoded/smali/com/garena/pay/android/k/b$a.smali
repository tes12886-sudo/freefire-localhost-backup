.class Lcom/garena/pay/android/k/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/garena/pay/android/k/b;
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

    iput-object p1, p0, Lcom/garena/pay/android/k/b$a;->a:Lcom/garena/pay/android/k/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/k/b$a;->a:Lcom/garena/pay/android/k/b;

    iget-object v0, v0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/garena/pay/android/k/b$a;->a:Lcom/garena/pay/android/k/b;

    iput-object v1, v0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-static {v0}, Lcom/garena/pay/android/k/b;->a(Lcom/garena/pay/android/k/b;)V

    return-void
.end method
