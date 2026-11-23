.class public final Lj/c/a/e/f/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(I)Lj/c/a/e/f/l/a;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    const/16 v1, 0x2766

    const-string v2, "gpushsg1.beetalkmobile.com"

    goto :goto_0

    :cond_1
    invoke-static {}, Lj/c/a/e/i/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/f/i;->d(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v2, v0, p0}, Lj/c/a/e/f/i;->b(Ljava/lang/String;II)Lj/c/a/e/f/l/a;

    move-result-object p0

    invoke-virtual {p0, v1}, Lj/c/a/e/f/l/a;->m(Z)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lj/c/a/e/i/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lj/c/a/e/f/i;->d(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    invoke-static {v2, v1, p0}, Lj/c/a/e/f/i;->b(Ljava/lang/String;II)Lj/c/a/e/f/l/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lj/c/a/e/f/l/a;->m(Z)V

    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/String;II)Lj/c/a/e/f/l/a;
    .locals 1

    new-instance v0, Lj/c/a/e/f/l/a;

    invoke-direct {v0, p0, p1, p2}, Lj/c/a/e/f/l/a;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method

.method public static c(Ljava/io/InputStream;)Lj/c/a/e/f/j;
    .locals 1

    new-instance v0, Lj/c/a/e/f/j;

    invoke-direct {v0, p0}, Lj/c/a/e/f/j;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    const/4 v1, 0x1

    aget-object p0, p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    new-instance v1, Landroid/util/Pair;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
