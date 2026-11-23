.class Landroidx/appcompat/app/f$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/b/n/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field private a:Lh/b/n/b$a;

.field final synthetic b:Landroidx/appcompat/app/f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/f;Lh/b/n/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/f$j;->a:Lh/b/n/b$a;

    return-void
.end method


# virtual methods
.method public a(Lh/b/n/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, v0, Landroidx/appcompat/app/f;->v:Landroid/view/ViewGroup;

    invoke-static {v0}, Lh/h/l/y;->K(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->a:Lh/b/n/b$a;

    invoke-interface {v0, p1, p2}, Lh/b/n/b$a;->a(Lh/b/n/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lh/b/n/b;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->a:Lh/b/n/b$a;

    invoke-interface {v0, p1}, Lh/b/n/b$a;->b(Lh/b/n/b;)V

    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/f;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, v0, Landroidx/appcompat/app/f;->r:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/f;->V()V

    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lh/h/l/y;->b(Landroid/view/View;)Lh/h/l/c0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/h/l/c0;->a(F)Lh/h/l/c0;

    iput-object v0, p1, Landroidx/appcompat/app/f;->s:Lh/h/l/c0;

    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->s:Lh/h/l/c0;

    new-instance v0, Landroidx/appcompat/app/f$j$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/f$j$a;-><init>(Landroidx/appcompat/app/f$j;)V

    invoke-virtual {p1, v0}, Lh/h/l/c0;->f(Lh/h/l/d0;)Lh/h/l/c0;

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->h:Landroidx/appcompat/app/d;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/appcompat/app/f;->o:Lh/b/n/b;

    invoke-interface {v0, p1}, Landroidx/appcompat/app/d;->g(Lh/b/n/b;)V

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/f$j;->b:Landroidx/appcompat/app/f;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/f;->o:Lh/b/n/b;

    iget-object p1, p1, Landroidx/appcompat/app/f;->v:Landroid/view/ViewGroup;

    invoke-static {p1}, Lh/h/l/y;->K(Landroid/view/View;)V

    return-void
.end method

.method public c(Lh/b/n/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->a:Lh/b/n/b$a;

    invoke-interface {v0, p1, p2}, Lh/b/n/b$a;->c(Lh/b/n/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lh/b/n/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/f$j;->a:Lh/b/n/b$a;

    invoke-interface {v0, p1, p2}, Lh/b/n/b$a;->d(Lh/b/n/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
