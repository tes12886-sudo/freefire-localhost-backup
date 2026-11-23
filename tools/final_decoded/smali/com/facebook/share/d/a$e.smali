.class Lcom/facebook/share/d/a$e;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
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

    iput-object p1, p0, Lcom/facebook/share/d/a$e;->b:Lcom/facebook/share/d/a;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/a;Lcom/facebook/share/d/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/a$e;-><init>(Lcom/facebook/share/d/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/c;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/a$e;->d(Lcom/facebook/share/c/c;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/c;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/a$e;->e(Lcom/facebook/share/c/c;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/share/c/c;Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public e(Lcom/facebook/share/c/c;)Lcom/facebook/internal/a;
    .locals 2

    invoke-static {p1}, Lcom/facebook/share/b/d;->a(Lcom/facebook/share/c/c;)V

    iget-object v0, p0, Lcom/facebook/share/d/a$e;->b:Lcom/facebook/share/d/a;

    invoke-virtual {v0}, Lcom/facebook/share/d/a;->e()Lcom/facebook/internal/a;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/share/b/q;->a(Lcom/facebook/share/c/c;)Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "apprequests"

    invoke-static {v0, v1, p1}, Lcom/facebook/internal/i;->l(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
