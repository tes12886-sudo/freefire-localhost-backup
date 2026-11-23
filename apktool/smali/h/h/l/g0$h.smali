.class Lh/h/l/g0$h;
.super Lh/h/l/g0$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/l/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private m:Lh/h/e/b;


# direct methods
.method constructor <init>(Lh/h/l/g0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh/h/l/g0$g;-><init>(Lh/h/l/g0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    return-void
.end method

.method constructor <init>(Lh/h/l/g0;Lh/h/l/g0$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh/h/l/g0$g;-><init>(Lh/h/l/g0;Lh/h/l/g0$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    iget-object p1, p2, Lh/h/l/g0$h;->m:Lh/h/e/b;

    iput-object p1, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    return-void
.end method


# virtual methods
.method b()Lh/h/l/g0;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lh/h/l/g0;->u(Landroid/view/WindowInsets;)Lh/h/l/g0;

    move-result-object v0

    return-object v0
.end method

.method c()Lh/h/l/g0;
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lh/h/l/g0;->u(Landroid/view/WindowInsets;)Lh/h/l/g0;

    move-result-object v0

    return-object v0
.end method

.method final i()Lh/h/e/b;
    .locals 4

    iget-object v0, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lh/h/e/b;->b(IIII)Lh/h/e/b;

    move-result-object v0

    iput-object v0, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    :cond_0
    iget-object v0, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    return-object v0
.end method

.method n()Z
    .locals 1

    iget-object v0, p0, Lh/h/l/g0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public s(Lh/h/e/b;)V
    .locals 0

    iput-object p1, p0, Lh/h/l/g0$h;->m:Lh/h/e/b;

    return-void
.end method
