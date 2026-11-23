.class final Lcom/facebook/share/b/o$c;
.super Lcom/facebook/share/b/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/o;->k(Lcom/facebook/l;)Lcom/facebook/share/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/l;


# direct methods
.method constructor <init>(Lcom/facebook/l;Lcom/facebook/l;)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    invoke-direct {p0, p1}, Lcom/facebook/share/b/k;-><init>(Lcom/facebook/l;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/internal/a;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    invoke-static {p1}, Lcom/facebook/share/b/o;->q(Lcom/facebook/l;)V

    return-void
.end method

.method public b(Lcom/facebook/internal/a;Lcom/facebook/n;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    invoke-static {p1, p2}, Lcom/facebook/share/b/o;->r(Lcom/facebook/l;Lcom/facebook/n;)V

    return-void
.end method

.method public c(Lcom/facebook/internal/a;Landroid/os/Bundle;)V
    .locals 1

    if-eqz p2, :cond_3

    invoke-static {p2}, Lcom/facebook/share/b/o;->h(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "post"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "cancel"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    invoke-static {p1}, Lcom/facebook/share/b/o;->q(Lcom/facebook/l;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    new-instance p2, Lcom/facebook/n;

    const-string v0, "UnknownError"

    invoke-direct {p2, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/facebook/share/b/o;->r(Lcom/facebook/l;Lcom/facebook/n;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p2}, Lcom/facebook/share/b/o;->j(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/share/b/o$c;->b:Lcom/facebook/l;

    invoke-static {p2, p1}, Lcom/facebook/share/b/o;->s(Lcom/facebook/l;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method
