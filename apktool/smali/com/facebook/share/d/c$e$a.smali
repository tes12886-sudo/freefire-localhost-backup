.class Lcom/facebook/share/d/c$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/d/c$e;->e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/a;

.field final synthetic b:Lcom/facebook/share/c/e;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lcom/facebook/share/d/c$e;Lcom/facebook/internal/a;Lcom/facebook/share/c/e;Z)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/share/d/c$e$a;->a:Lcom/facebook/internal/a;

    iput-object p3, p0, Lcom/facebook/share/d/c$e$a;->b:Lcom/facebook/share/c/e;

    iput-boolean p4, p0, Lcom/facebook/share/d/c$e$a;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/d/c$e$a;->a:Lcom/facebook/internal/a;

    invoke-virtual {v0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/d/c$e$a;->b:Lcom/facebook/share/c/e;

    iget-boolean v2, p0, Lcom/facebook/share/d/c$e$a;->c:Z

    invoke-static {v0, v1, v2}, Lcom/facebook/share/b/e;->e(Ljava/util/UUID;Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/d/c$e$a;->a:Lcom/facebook/internal/a;

    invoke-virtual {v0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/d/c$e$a;->b:Lcom/facebook/share/c/e;

    iget-boolean v2, p0, Lcom/facebook/share/d/c$e$a;->c:Z

    invoke-static {v0, v1, v2}, Lcom/facebook/share/b/h;->k(Ljava/util/UUID;Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
