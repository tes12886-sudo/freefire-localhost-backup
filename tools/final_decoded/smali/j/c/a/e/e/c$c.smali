.class Lj/c/a/e/e/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/e/c;


# direct methods
.method constructor <init>(Lj/c/a/e/e/c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/c/a/e/g/c/a;)V
    .locals 1

    iget-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->i(Lj/c/a/e/e/c;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->f(Lj/c/a/e/e/c;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->j(Lj/c/a/e/e/c;)Lj/c/a/e/f/d;

    move-result-object p1

    invoke-virtual {p1}, Lj/c/a/e/f/d;->l()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    const/16 v0, 0x7530

    invoke-static {p1, v0}, Lj/c/a/e/e/c;->k(Lj/c/a/e/e/c;I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj/c/a/e/e/c$c;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->l(Lj/c/a/e/e/c;)V

    :cond_2
    :goto_0
    return-void
.end method
