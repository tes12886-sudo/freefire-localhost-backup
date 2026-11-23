.class public Lm/b0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lm/v;

.field private b:Ljava/lang/String;

.field private c:Lm/u$a;

.field private d:Lm/c0;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lm/b0$a;->e:Ljava/util/Map;

    const-string v0, "GET"

    iput-object v0, p0, Lm/b0$a;->b:Ljava/lang/String;

    new-instance v0, Lm/u$a;

    invoke-direct {v0}, Lm/u$a;-><init>()V

    iput-object v0, p0, Lm/b0$a;->c:Lm/u$a;

    return-void
.end method

.method public constructor <init>(Lm/b0;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lm/b0$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object v0

    iput-object v0, p0, Lm/b0$a;->a:Lm/v;

    invoke-virtual {p1}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm/b0$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object v0

    iput-object v0, p0, Lm/b0$a;->d:Lm/c0;

    invoke-virtual {p1}, Lm/b0;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm/b0;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/t/a0;->n(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lm/b0$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lm/b0;->e()Lm/u;

    move-result-object p1

    invoke-virtual {p1}, Lm/u;->d()Lm/u$a;

    move-result-object p1

    iput-object p1, p0, Lm/b0$a;->c:Lm/u$a;

    return-void
.end method


# virtual methods
.method public a()Lm/b0;
    .locals 7

    iget-object v1, p0, Lm/b0$a;->a:Lm/v;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lm/b0$a;->b:Ljava/lang/String;

    iget-object v0, p0, Lm/b0$a;->c:Lm/u$a;

    invoke-virtual {v0}, Lm/u$a;->e()Lm/u;

    move-result-object v3

    iget-object v4, p0, Lm/b0$a;->d:Lm/c0;

    iget-object v0, p0, Lm/b0$a;->e:Ljava/util/Map;

    invoke-static {v0}, Lm/h0/d;->S(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lm/b0;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lm/b0;-><init>(Lm/v;Ljava/lang/String;Lm/u;Lm/c0;Ljava/util/Map;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lm/u$a;
    .locals 1

    iget-object v0, p0, Lm/b0$a;->c:Lm/u$a;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/b0$a;->e:Ljava/util/Map;

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/b0$a;->b()Lm/u$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/u$a;->h(Ljava/lang/String;Ljava/lang/String;)Lm/u$a;

    return-object p0
.end method

.method public e(Lm/u;)Lm/b0$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm/u;->d()Lm/u$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b0$a;->j(Lm/u$a;)V

    return-object p0
.end method

.method public f(Ljava/lang/String;Lm/c0;)Lm/b0$a;
    .locals 3

    const-string v0, "method"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    const-string v0, "method "

    if-nez p2, :cond_2

    invoke-static {p1}, Lm/h0/i/f;->e(Ljava/lang/String;)Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {p1}, Lm/h0/i/f;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p0, p1}, Lm/b0$a;->k(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lm/b0$a;->i(Lm/c0;)V

    return-object p0

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lm/c0;)Lm/b0$a;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "POST"

    invoke-virtual {p0, v0, p1}, Lm/b0$a;->f(Ljava/lang/String;Lm/c0;)Lm/b0$a;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lm/b0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/b0$a;->b()Lm/u$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/u$a;->g(Ljava/lang/String;)Lm/u$a;

    return-object p0
.end method

.method public final i(Lm/c0;)V
    .locals 0

    iput-object p1, p0, Lm/b0$a;->d:Lm/c0;

    return-void
.end method

.method public final j(Lm/u$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/b0$a;->c:Lm/u$a;

    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/b0$a;->b:Ljava/lang/String;

    return-void
.end method

.method public final l(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/b0$a;->e:Ljava/util/Map;

    return-void
.end method

.method public final m(Lm/v;)V
    .locals 0

    iput-object p1, p0, Lm/b0$a;->a:Lm/v;

    return-void
.end method

.method public n(Ljava/lang/Class;Ljava/lang/Object;)Lm/b0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "-TT;>;TT;)",
            "Lm/b0$a;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lm/b0$a;->c()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm/b0$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0, v0}, Lm/b0$a;->l(Ljava/util/Map;)V

    :cond_1
    invoke-virtual {p0}, Lm/b0$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object p0
.end method

.method public o(Ljava/lang/String;)Lm/b0$a;
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ws:"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Ll/d0/g;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "this as java.lang.String).substring(startIndex)"

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http:"

    :goto_0
    invoke-static {v0, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    const-string v0, "wss:"

    invoke-static {p1, v0, v1}, Ll/d0/g;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https:"

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Lm/v;->k:Lm/v$b;

    invoke-virtual {v0, p1}, Lm/v$b;->d(Ljava/lang/String;)Lm/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b0$a;->p(Lm/v;)Lm/b0$a;

    return-object p0
.end method

.method public p(Lm/v;)Lm/b0$a;
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/b0$a;->m(Lm/v;)V

    return-object p0
.end method
