.class public abstract Lcom/facebook/share/b/k;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lcom/facebook/l;


# direct methods
.method public constructor <init>(Lcom/facebook/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/share/b/k;->a:Lcom/facebook/l;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/internal/a;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/share/b/k;->a:Lcom/facebook/l;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/l;->a()V

    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/internal/a;Lcom/facebook/n;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/share/b/k;->a:Lcom/facebook/l;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/facebook/l;->b(Lcom/facebook/n;)V

    :cond_0
    return-void
.end method

.method public abstract c(Lcom/facebook/internal/a;Landroid/os/Bundle;)V
.end method
