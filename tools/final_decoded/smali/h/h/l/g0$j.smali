.class Lh/h/l/g0$j;
.super Lh/h/l/g0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/l/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# instance fields
.field private n:Lh/h/e/b;

.field private o:Lh/h/e/b;

.field private p:Lh/h/e/b;


# direct methods
.method constructor <init>(Lh/h/l/g0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh/h/l/g0$i;-><init>(Lh/h/l/g0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh/h/l/g0$j;->n:Lh/h/e/b;

    iput-object p1, p0, Lh/h/l/g0$j;->o:Lh/h/e/b;

    iput-object p1, p0, Lh/h/l/g0$j;->p:Lh/h/e/b;

    return-void
.end method

.method constructor <init>(Lh/h/l/g0;Lh/h/l/g0$j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh/h/l/g0$i;-><init>(Lh/h/l/g0;Lh/h/l/g0$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh/h/l/g0$j;->n:Lh/h/e/b;

    iput-object p1, p0, Lh/h/l/g0$j;->o:Lh/h/e/b;

    iput-object p1, p0, Lh/h/l/g0$j;->p:Lh/h/e/b;

    return-void
.end method


# virtual methods
.method h()Lh/h/e/b;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$j;->o:Lh/h/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lh/h/e/b;->d(Landroid/graphics/Insets;)Lh/h/e/b;

    move-result-object v0

    iput-object v0, p0, Lh/h/l/g0$j;->o:Lh/h/e/b;

    :cond_0
    iget-object v0, p0, Lh/h/l/g0$j;->o:Lh/h/e/b;

    return-object v0
.end method

.method j()Lh/h/e/b;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$j;->n:Lh/h/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lh/h/e/b;->d(Landroid/graphics/Insets;)Lh/h/e/b;

    move-result-object v0

    iput-object v0, p0, Lh/h/l/g0$j;->n:Lh/h/e/b;

    :cond_0
    iget-object v0, p0, Lh/h/l/g0$j;->n:Lh/h/e/b;

    return-object v0
.end method

.method l()Lh/h/e/b;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$j;->p:Lh/h/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lh/h/e/b;->d(Landroid/graphics/Insets;)Lh/h/e/b;

    move-result-object v0

    iput-object v0, p0, Lh/h/l/g0$j;->p:Lh/h/e/b;

    :cond_0
    iget-object v0, p0, Lh/h/l/g0$j;->p:Lh/h/e/b;

    return-object v0
.end method

.method m(IIII)Lh/h/l/g0;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lh/h/l/g0;->u(Landroid/view/WindowInsets;)Lh/h/l/g0;

    move-result-object p1

    return-object p1
.end method

.method public s(Lh/h/e/b;)V
    .locals 0

    return-void
.end method
