.class public Lj/g/a/a/a/o;
.super Lj/g/a/a/a/v;
.source ""


# direct methods
.method public constructor <init>(Lo/t;)V
    .locals 3

    invoke-static {p1}, Lj/g/a/a/a/o;->c(Lo/t;)Lj/g/a/a/a/z/a;

    move-result-object v0

    invoke-static {p1}, Lj/g/a/a/a/o;->d(Lo/t;)Lj/g/a/a/a/w;

    move-result-object v1

    invoke-virtual {p1}, Lo/t;->b()I

    move-result v2

    invoke-direct {p0, p1, v0, v1, v2}, Lj/g/a/a/a/o;-><init>(Lo/t;Lj/g/a/a/a/z/a;Lj/g/a/a/a/w;I)V

    return-void
.end method

.method constructor <init>(Lo/t;Lj/g/a/a/a/z/a;Lj/g/a/a/a/w;I)V
    .locals 0

    invoke-static {p4}, Lj/g/a/a/a/o;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lj/g/a/a/a/v;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method static a(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP request failed, Status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static b(Ljava/lang/String;)Lj/g/a/a/a/z/a;
    .locals 4

    new-instance v0, Lj/d/d/f;

    invoke-direct {v0}, Lj/d/d/f;-><init>()V

    new-instance v1, Lj/g/a/a/a/z/g;

    invoke-direct {v1}, Lj/g/a/a/a/z/g;-><init>()V

    invoke-virtual {v0, v1}, Lj/d/d/f;->d(Lj/d/d/x;)Lj/d/d/f;

    new-instance v1, Lj/g/a/a/a/z/h;

    invoke-direct {v1}, Lj/g/a/a/a/z/h;-><init>()V

    invoke-virtual {v0, v1}, Lj/d/d/f;->d(Lj/d/d/x;)Lj/d/d/f;

    invoke-virtual {v0}, Lj/d/d/f;->b()Lj/d/d/e;

    move-result-object v0

    :try_start_0
    const-class v1, Lj/g/a/a/a/z/b;

    invoke-virtual {v0, p0, v1}, Lj/d/d/e;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/g/a/a/a/z/b;

    iget-object v1, v0, Lj/g/a/a/a/z/b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lj/g/a/a/a/z/b;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/g/a/a/a/z/a;
    :try_end_0
    .catch Lj/d/d/s; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid json: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "Twitter"

    invoke-interface {v1, v2, p0, v0}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lo/t;)Lj/g/a/a/a/z/a;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lo/t;->d()Lm/e0;

    move-result-object p0

    invoke-virtual {p0}, Lm/e0;->F()Ln/d;

    move-result-object p0

    invoke-interface {p0}, Ln/d;->n()Ln/b;

    move-result-object p0

    invoke-virtual {p0}, Ln/b;->Z()Ln/b;

    move-result-object p0

    invoke-virtual {p0}, Ln/b;->o0()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lj/g/a/a/a/o;->b(Ljava/lang/String;)Lj/g/a/a/a/z/a;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Unexpected response"

    invoke-interface {v0, v1, v2, p0}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Lo/t;)Lj/g/a/a/a/w;
    .locals 1

    new-instance v0, Lj/g/a/a/a/w;

    invoke-virtual {p0}, Lo/t;->e()Lm/u;

    move-result-object p0

    invoke-direct {v0, p0}, Lj/g/a/a/a/w;-><init>(Lm/u;)V

    return-object v0
.end method
