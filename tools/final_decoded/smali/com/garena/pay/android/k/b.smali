.class public Lcom/garena/pay/android/k/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/pay/android/k/b$c;
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/PopupWindow;

.field private b:Landroid/widget/PopupWindow$OnDismissListener;

.field private c:Lcom/garena/pay/android/k/b$c;


# direct methods
.method public constructor <init>(Landroid/view/View;ZZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/garena/pay/android/k/b$a;

    invoke-direct {p2, p0}, Lcom/garena/pay/android/k/b$a;-><init>(Lcom/garena/pay/android/k/b;)V

    iput-object p2, p0, Lcom/garena/pay/android/k/b;->b:Landroid/widget/PopupWindow$OnDismissListener;

    new-instance p2, Landroid/widget/PopupWindow;

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p2, p1, v0, v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object p2, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iget-object p2, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object p1, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object p1, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->update()V

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    new-instance p2, Lcom/garena/pay/android/k/b$b;

    invoke-direct {p2, p0}, Lcom/garena/pay/android/k/b$b;-><init>(Lcom/garena/pay/android/k/b;)V

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    :cond_0
    iget-object p1, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    iget-object p2, p0, Lcom/garena/pay/android/k/b;->b:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method static synthetic a(Lcom/garena/pay/android/k/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/garena/pay/android/k/b;->c()V

    return-void
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/b;->c:Lcom/garena/pay/android/k/b$c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/garena/pay/android/k/b$c;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public d(Lcom/garena/pay/android/k/b$c;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/b;->c:Lcom/garena/pay/android/k/b$c;

    return-void
.end method

.method public e(Landroid/view/View;)V
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/pay/android/j/d;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v0, p0, Lcom/garena/pay/android/k/b;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
