.class Lcom/facebook/share/d/a$a;
.super Lcom/facebook/share/b/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/d/a;->k(Lcom/facebook/internal/e;Lcom/facebook/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/l;


# direct methods
.method constructor <init>(Lcom/facebook/share/d/a;Lcom/facebook/l;Lcom/facebook/l;)V
    .locals 0

    iput-object p3, p0, Lcom/facebook/share/d/a$a;->b:Lcom/facebook/l;

    invoke-direct {p0, p2}, Lcom/facebook/share/b/k;-><init>(Lcom/facebook/l;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/internal/a;Landroid/os/Bundle;)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/facebook/share/d/a$a;->b:Lcom/facebook/l;

    new-instance v0, Lcom/facebook/share/d/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/facebook/share/d/a$d;-><init>(Landroid/os/Bundle;Lcom/facebook/share/d/a$a;)V

    invoke-interface {p1, v0}, Lcom/facebook/l;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/share/b/k;->a(Lcom/facebook/internal/a;)V

    :goto_0
    return-void
.end method
