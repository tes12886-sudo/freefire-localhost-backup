.class abstract Lm/h0/j/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
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

    iput-object p1, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln/h;

    invoke-static {p1}, Lm/h0/j/b;->m(Lm/h0/j/b;)Ln/d;

    move-result-object p1

    invoke-interface {p1}, Ln/x;->d()Ln/y;

    move-result-object p1

    invoke-direct {v0, p1}, Ln/h;-><init>(Ln/y;)V

    iput-object v0, p0, Lm/h0/j/b$a;->a:Ln/h;

    return-void
.end method


# virtual methods
.method public I(Ln/b;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-static {v0}, Lm/h0/j/b;->m(Lm/h0/j/b;)Ln/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ln/x;->I(Ln/b;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-virtual {p2}, Lm/h0/j/b;->h()Lm/h0/h/f;

    move-result-object p2

    invoke-virtual {p2}, Lm/h0/h/f;->z()V

    invoke-virtual {p0}, Lm/h0/j/b$a;->c()V

    throw p1
.end method

.method protected final b()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/j/b$a;->b:Z

    return v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-static {v0}, Lm/h0/j/b;->n(Lm/h0/j/b;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-static {v0}, Lm/h0/j/b;->n(Lm/h0/j/b;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    iget-object v2, p0, Lm/h0/j/b$a;->a:Ln/h;

    invoke-static {v0, v2}, Lm/h0/j/b;->i(Lm/h0/j/b;Ln/h;)V

    iget-object v0, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-static {v0, v1}, Lm/h0/j/b;->p(Lm/h0/j/b;I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lm/h0/j/b$a;->c:Lm/h0/j/b;

    invoke-static {v1}, Lm/h0/j/b;->n(Lm/h0/j/b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "state: "

    invoke-static {v2, v1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ln/y;
    .locals 1

    iget-object v0, p0, Lm/h0/j/b$a;->a:Ln/h;

    return-object v0
.end method

.method protected final f(Z)V
    .locals 0

    iput-boolean p1, p0, Lm/h0/j/b$a;->b:Z

    return-void
.end method
