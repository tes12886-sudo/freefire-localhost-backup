.class final Lcom/facebook/share/b/o$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/o;->e(Lcom/facebook/share/c/v;Ljava/util/UUID;)Landroid/os/Bundle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/internal/h0$b<",
        "Lcom/facebook/share/c/h;",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/UUID;

.field final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/UUID;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/b/o$b;->a:Ljava/util/UUID;

    iput-object p2, p0, Lcom/facebook/share/b/o$b;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/share/c/h;)Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/b/o$b;->a:Ljava/util/UUID;

    invoke-static {v0, p1}, Lcom/facebook/share/b/o;->a(Ljava/util/UUID;Lcom/facebook/share/c/h;)Lcom/facebook/internal/b0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/b/o$b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/share/c/h;->a()Lcom/facebook/share/c/h$b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string v2, "type"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/internal/b0$a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "uri"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/internal/b0$a;->e()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/share/b/o;->n(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "extension"

    invoke-static {v1, v0, p1}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/h;

    invoke-virtual {p0, p1}, Lcom/facebook/share/b/o$b;->a(Lcom/facebook/share/c/h;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
