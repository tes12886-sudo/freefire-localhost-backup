.class public final Lcom/facebook/internal/m0/j/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a()V
    .locals 1

    invoke-static {}, Lcom/facebook/r;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/internal/m0/j/b;->d()V

    :cond_0
    return-void
.end method

.method public static final b()[Ljava/io/File;
    .locals 2

    invoke-static {}, Lcom/facebook/internal/m0/f;->c()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/facebook/internal/m0/j/b$a;->a:Lcom/facebook/internal/m0/j/b$a;

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    const-string v1, "reportDir.listFiles { di\u2026OR_REPORT_PREFIX)))\n    }"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    return-object v0
.end method

.method public static final c(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    new-instance v0, Lcom/facebook/internal/m0/j/a;

    invoke-direct {v0, p0}, Lcom/facebook/internal/m0/j/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/internal/m0/j/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static final d()V
    .locals 7

    invoke-static {}, Lcom/facebook/internal/h0;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/facebook/internal/m0/j/b;->b()[Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    new-instance v6, Lcom/facebook/internal/m0/j/a;

    invoke-direct {v6, v5}, Lcom/facebook/internal/m0/j/a;-><init>(Ljava/io/File;)V

    invoke-virtual {v6}, Lcom/facebook/internal/m0/j/a;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/facebook/internal/m0/j/b$b;->a:Lcom/facebook/internal/m0/j/b$b;

    invoke-static {v1, v0}, Ll/t/k;->q(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_3

    const/16 v2, 0x3e8

    if-ge v3, v2, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance v2, Lcom/facebook/internal/m0/j/b$c;

    invoke-direct {v2, v1}, Lcom/facebook/internal/m0/j/b$c;-><init>(Ljava/util/ArrayList;)V

    const-string v1, "error_reports"

    invoke-static {v1, v0, v2}, Lcom/facebook/internal/m0/f;->l(Ljava/lang/String;Lorg/json/JSONArray;Lcom/facebook/u$b;)V

    return-void
.end method
