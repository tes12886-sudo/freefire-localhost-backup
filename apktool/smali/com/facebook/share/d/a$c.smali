.class Lcom/facebook/share/d/a$c;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/j<",
        "Lcom/facebook/share/c/c;",
        "Lcom/facebook/share/d/a$d;",
        ">.a;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/share/d/a;


# direct methods
.method private constructor <init>(Lcom/facebook/share/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/d/a$c;->b:Lcom/facebook/share/d/a;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/a;Lcom/facebook/share/d/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/a$c;-><init>(Lcom/facebook/share/d/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/c;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/a$c;->d(Lcom/facebook/share/c/c;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/c;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/a$c;->e(Lcom/facebook/share/c/c;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/share/c/c;Z)Z
    .locals 0

    invoke-static {}, Lcom/facebook/internal/g;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/share/d/a$c;->b:Lcom/facebook/share/d/a;

    invoke-static {p1}, Lcom/facebook/share/d/a;->n(Lcom/facebook/share/d/a;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {}, Lcom/facebook/internal/g;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/facebook/internal/i0;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Lcom/facebook/share/c/c;)Lcom/facebook/internal/a;
    .locals 3

    invoke-static {p1}, Lcom/facebook/share/b/d;->a(Lcom/facebook/share/c/c;)V

    iget-object v0, p0, Lcom/facebook/share/d/a$c;->b:Lcom/facebook/share/d/a;

    invoke-virtual {v0}, Lcom/facebook/share/d/a;->e()Lcom/facebook/internal/a;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/share/b/q;->a(Lcom/facebook/share/c/c;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v1

    const-string v2, "app_id"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/a;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/internal/g;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "redirect_uri"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "apprequests"

    invoke-static {v0, v1, p1}, Lcom/facebook/internal/i;->h(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
