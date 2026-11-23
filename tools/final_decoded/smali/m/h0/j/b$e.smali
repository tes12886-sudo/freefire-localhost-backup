.class final Lm/h0/j/b$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field private final a:Ln/h;

.field private b:Z

.field final synthetic c:Lm/h0/j/b;


# direct methods
.method public constructor <init>(Lm/h0/j/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/j/b$e;->c:Lm/h0/j/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln/h;

    invoke-static {p1}, Lm/h0/j/b;->l(Lm/h0/j/b;)Ln/c;

    move-result-object p1

    invoke-interface {p1}, Ln/v;->d()Ln/y;

    move-result-object p1

    invoke-direct {v0, p1}, Ln/h;-><init>(Ln/y;)V

    iput-object v0, p0, Lm/h0/j/b$e;->a:Ln/h;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, Lm/h0/j/b$e;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/h0/j/b$e;->b:Z

    iget-object v0, p0, Lm/h0/j/b$e;->c:Lm/h0/j/b;

    iget-object v1, p0, Lm/h0/j/b$e;->a:Ln/h;

    invoke-static {v0, v1}, Lm/h0/j/b;->i(Lm/h0/j/b;Ln/h;)V

    iget-object v0, p0, Lm/h0/j/b$e;->c:Lm/h0/j/b;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lm/h0/j/b;->p(Lm/h0/j/b;I)V

    return-void
.end method

.method public d()Ln/y;
    .locals 1

    iget-object v0, p0, Lm/h0/j/b$e;->a:Ln/h;

    return-object v0
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Lm/h0/j/b$e;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm/h0/j/b$e;->c:Lm/h0/j/b;

    invoke-static {v0}, Lm/h0/j/b;->l(Lm/h0/j/b;)Ln/c;

    move-result-object v0

    invoke-interface {v0}, Ln/c;->flush()V

    return-void
.end method

.method public h(Ln/b;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lm/h0/j/b$e;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ln/b;->r0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lm/h0/d;->i(JJJ)V

    iget-object v0, p0, Lm/h0/j/b$e;->c:Lm/h0/j/b;

    invoke-static {v0}, Lm/h0/j/b;->l(Lm/h0/j/b;)Ln/c;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ln/v;->h(Ln/b;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
