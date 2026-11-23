.class Lh/h/e/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/h/e/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/e/k;->f(Landroidx/core/content/d/e$b;I)Landroidx/core/content/d/e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh/h/e/k$c<",
        "Landroidx/core/content/d/e$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lh/h/e/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/core/content/d/e$c;

    invoke-virtual {p0, p1}, Lh/h/e/k$b;->c(Landroidx/core/content/d/e$c;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroidx/core/content/d/e$c;

    invoke-virtual {p0, p1}, Lh/h/e/k$b;->d(Landroidx/core/content/d/e$c;)Z

    move-result p1

    return p1
.end method

.method public c(Landroidx/core/content/d/e$c;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/core/content/d/e$c;->e()I

    move-result p1

    return p1
.end method

.method public d(Landroidx/core/content/d/e$c;)Z
    .locals 0

    invoke-virtual {p1}, Landroidx/core/content/d/e$c;->f()Z

    move-result p1

    return p1
.end method
