.class public abstract Lcom/facebook/share/c/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/facebook/share/c/e<",
        "TP;TE;>;E:",
        "Lcom/facebook/share/c/e$a<",
        "TP;TE;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Object<",
        "TP;TE;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/facebook/share/c/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public final b()Lcom/facebook/share/c/f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->f:Lcom/facebook/share/c/f;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/e$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g(Lcom/facebook/share/c/e;)Lcom/facebook/share/c/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)TE;"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/e$a;->h(Landroid/net/Uri;)Lcom/facebook/share/c/e$a;

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/e$a;->j(Ljava/util/List;)Lcom/facebook/share/c/e$a;

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/e$a;->k(Ljava/lang/String;)Lcom/facebook/share/c/e$a;

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/e$a;->i(Ljava/lang/String;)Lcom/facebook/share/c/e$a;

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/e$a;->l(Ljava/lang/String;)Lcom/facebook/share/c/e$a;

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->f()Lcom/facebook/share/c/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/e$a;->m(Lcom/facebook/share/c/f;)Lcom/facebook/share/c/e$a;

    return-object p0
.end method

.method public final h(Landroid/net/Uri;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")TE;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/e$a;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public final i(Ljava/lang/String;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TE;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/e$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/util/List;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)TE;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/facebook/share/c/e$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public final k(Ljava/lang/String;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TE;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final l(Ljava/lang/String;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TE;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/e$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final m(Lcom/facebook/share/c/f;)Lcom/facebook/share/c/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/c/f;",
            ")TE;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/share/c/e$a;->f:Lcom/facebook/share/c/f;

    return-object p0
.end method
