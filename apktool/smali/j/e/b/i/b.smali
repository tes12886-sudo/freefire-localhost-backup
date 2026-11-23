.class public Lj/e/b/i/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lj/e/b/i/a;Ljava/util/List;)Landroid/content/Intent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj/e/b/i/a;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    invoke-virtual {p1}, Lj/e/b/i/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lj/e/b/h/d;->b(Landroid/content/Context;)V

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;->a(Landroid/content/Context;Lj/e/b/i/a;Ljava/util/List;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Lj/e/b/i/a$b;

    invoke-direct {v0, p1}, Lj/e/b/i/a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lj/e/b/i/a$b;->f()Lj/e/b/i/a;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lj/e/b/i/b;->a(Landroid/content/Context;Lj/e/b/i/a;Ljava/util/List;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Intent;)Lj/e/b/i/c;
    .locals 3

    if-nez p0, :cond_0

    new-instance p0, Lj/e/b/i/c;

    sget-object v0, Lj/e/b/d;->f:Lj/e/b/d;

    new-instance v1, Lj/e/b/b;

    const-string v2, "Callback intent is null"

    invoke-direct {v1, v2}, Lj/e/b/b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/b;)V

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;->b(Landroid/content/Intent;)Lj/e/b/i/c;

    move-result-object p0

    return-object p0
.end method
