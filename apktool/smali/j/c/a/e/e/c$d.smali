.class Lj/c/a/e/e/c$d;
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

    iput-object p1, p0, Lj/c/a/e/e/c$d;->a:Lj/c/a/e/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/c/a/e/g/c/a;)V
    .locals 1

    iget-object p1, p0, Lj/c/a/e/e/c$d;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->i(Lj/c/a/e/e/c;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lj/c/a/e/l/e;->d()Lj/c/a/e/f/l/b;

    move-result-object p1

    iget-object v0, p0, Lj/c/a/e/e/c$d;->a:Lj/c/a/e/e/c;

    invoke-static {v0}, Lj/c/a/e/e/c;->m(Lj/c/a/e/e/c;)Lj/c/a/e/f/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lj/c/a/e/f/b;->c(Lj/c/a/e/f/l/b;)V

    return-void
.end method
