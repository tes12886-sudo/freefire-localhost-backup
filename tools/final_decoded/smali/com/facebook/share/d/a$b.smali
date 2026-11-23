.class Lcom/facebook/share/d/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/d/a;->k(Lcom/facebook/internal/e;Lcom/facebook/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/share/b/k;

.field final synthetic b:Lcom/facebook/share/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/share/d/a;Lcom/facebook/share/b/k;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/d/a$b;->b:Lcom/facebook/share/d/a;

    iput-object p2, p0, Lcom/facebook/share/d/a$b;->a:Lcom/facebook/share/b/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/content/Intent;)Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/share/d/a$b;->b:Lcom/facebook/share/d/a;

    invoke-virtual {v0}, Lcom/facebook/internal/j;->h()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/share/d/a$b;->a:Lcom/facebook/share/b/k;

    invoke-static {v0, p1, p2, v1}, Lcom/facebook/share/b/o;->p(IILandroid/content/Intent;Lcom/facebook/share/b/k;)Z

    move-result p1

    return p1
.end method
