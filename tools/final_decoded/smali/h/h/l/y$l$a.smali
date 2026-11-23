.class Lh/h/l/y$l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/l/y$l;->u(Landroid/view/View;Lh/h/l/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Lh/h/l/g0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lh/h/l/t;


# direct methods
.method constructor <init>(Landroid/view/View;Lh/h/l/t;)V
    .locals 0

    iput-object p1, p0, Lh/h/l/y$l$a;->b:Landroid/view/View;

    iput-object p2, p0, Lh/h/l/y$l$a;->c:Lh/h/l/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lh/h/l/y$l$a;->a:Lh/h/l/g0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    invoke-static {p2, p1}, Lh/h/l/g0;->v(Landroid/view/WindowInsets;Landroid/view/View;)Lh/h/l/g0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    iget-object v3, p0, Lh/h/l/y$l$a;->b:Landroid/view/View;

    invoke-static {p2, v3}, Lh/h/l/y$l;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Lh/h/l/y$l$a;->a:Lh/h/l/g0;

    invoke-virtual {v0, p2}, Lh/h/l/g0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lh/h/l/y$l$a;->c:Lh/h/l/t;

    invoke-interface {p2, p1, v0}, Lh/h/l/t;->a(Landroid/view/View;Lh/h/l/g0;)Lh/h/l/g0;

    move-result-object p1

    invoke-virtual {p1}, Lh/h/l/g0;->t()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Lh/h/l/y$l$a;->a:Lh/h/l/g0;

    iget-object p2, p0, Lh/h/l/y$l$a;->c:Lh/h/l/t;

    invoke-interface {p2, p1, v0}, Lh/h/l/t;->a(Landroid/view/View;Lh/h/l/g0;)Lh/h/l/g0;

    move-result-object p2

    if-lt v1, v2, :cond_1

    invoke-virtual {p2}, Lh/h/l/g0;->t()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Lh/h/l/y;->K(Landroid/view/View;)V

    invoke-virtual {p2}, Lh/h/l/g0;->t()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
