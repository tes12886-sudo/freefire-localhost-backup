.class final Lcom/facebook/share/b/o$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/o;->x(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/share/b/o$d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/content/Intent;)Z
    .locals 2

    iget v0, p0, Lcom/facebook/share/b/o$d;->a:I

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/facebook/share/b/o;->k(Lcom/facebook/l;)Lcom/facebook/share/b/k;

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Lcom/facebook/share/b/o;->p(IILandroid/content/Intent;Lcom/facebook/share/b/k;)Z

    move-result p1

    return p1
.end method
