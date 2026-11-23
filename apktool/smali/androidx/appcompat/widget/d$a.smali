.class Landroidx/appcompat/widget/d$a;
.super Landroidx/appcompat/view/menu/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic m:Landroidx/appcompat/widget/d;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/d;Landroid/content/Context;Landroidx/appcompat/view/menu/r;Landroid/view/View;)V
    .locals 6

    iput-object p1, p0, Landroidx/appcompat/widget/d$a;->m:Landroidx/appcompat/widget/d;

    sget v5, Lh/b/a;->l:I

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/view/menu/l;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/g;Landroid/view/View;ZI)V

    invoke-virtual {p3}, Landroidx/appcompat/view/menu/r;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/view/menu/i;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/i;->l()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p1, Landroidx/appcompat/widget/d;->i:Landroidx/appcompat/widget/d$d;

    if-nez p2, :cond_0

    invoke-static {p1}, Landroidx/appcompat/widget/d;->t(Landroidx/appcompat/widget/d;)Landroidx/appcompat/view/menu/n;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/l;->f(Landroid/view/View;)V

    :cond_1
    iget-object p1, p1, Landroidx/appcompat/widget/d;->J:Landroidx/appcompat/widget/d$f;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/l;->j(Landroidx/appcompat/view/menu/m$a;)V

    return-void
.end method


# virtual methods
.method protected e()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/d$a;->m:Landroidx/appcompat/widget/d;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/d;->G:Landroidx/appcompat/widget/d$a;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/appcompat/widget/d;->K:I

    invoke-super {p0}, Landroidx/appcompat/view/menu/l;->e()V

    return-void
.end method
