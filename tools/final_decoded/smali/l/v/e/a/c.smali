.class public abstract Ll/v/e/a/c;
.super Ll/v/e/a/a;
.source ""


# instance fields
.field private final b:Ll/v/c;

.field private transient c:Ll/v/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/v/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll/v/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/v/a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ll/v/a;->a()Ll/v/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Ll/v/e/a/c;-><init>(Ll/v/a;Ll/v/c;)V

    return-void
.end method

.method public constructor <init>(Ll/v/a;Ll/v/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/v/a<",
            "Ljava/lang/Object;",
            ">;",
            "Ll/v/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ll/v/e/a/a;-><init>(Ll/v/a;)V

    iput-object p2, p0, Ll/v/e/a/c;->b:Ll/v/c;

    return-void
.end method


# virtual methods
.method public a()Ll/v/c;
    .locals 1

    iget-object v0, p0, Ll/v/e/a/c;->b:Ll/v/c;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method protected e()V
    .locals 3

    iget-object v0, p0, Ll/v/e/a/c;->c:Ll/v/a;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ll/v/e/a/c;->a()Ll/v/c;

    move-result-object v1

    sget-object v2, Ll/v/b;->a:Ll/v/b$a;

    invoke-interface {v1, v2}, Ll/v/c;->c(Ll/v/c$b;)Ll/v/c$a;

    move-result-object v1

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    check-cast v1, Ll/v/b;

    invoke-interface {v1, v0}, Ll/v/b;->a(Ll/v/a;)V

    :cond_0
    sget-object v0, Ll/v/e/a/b;->a:Ll/v/e/a/b;

    iput-object v0, p0, Ll/v/e/a/c;->c:Ll/v/a;

    return-void
.end method

.method public final f()Ll/v/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll/v/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll/v/e/a/c;->c:Ll/v/a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll/v/e/a/c;->a()Ll/v/c;

    move-result-object v0

    sget-object v1, Ll/v/b;->a:Ll/v/b$a;

    invoke-interface {v0, v1}, Ll/v/c;->c(Ll/v/c$b;)Ll/v/c$a;

    move-result-object v0

    check-cast v0, Ll/v/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Ll/v/b;->b(Ll/v/a;)Ll/v/a;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Ll/v/e/a/c;->c:Ll/v/a;

    :cond_2
    return-object v0
.end method
