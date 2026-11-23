.class public final Lj/c/a/e/i/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v1

    const-string v2, "ACK_MSG_LIST"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lj/c/a/e/i/b;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "REGIONAL_SERVER_ADDRESS"

    const-string v2, "gpushsg1.beetalkmobile.com:10086"

    invoke-virtual {v0, v1, v2}, Lj/c/a/e/i/b;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "CONNECTION_ADDRESS"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lj/c/a/e/i/b;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()J
    .locals 4

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "CONNECTION_ID"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lj/c/a/e/i/b;->b(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static e(Landroid/content/Context;)J
    .locals 3

    const-string v0, "SERVICE_PREF"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "DEVICE_ID"

    const-wide/16 v1, -0x1

    invoke-interface {p0, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, "SERVICE_PREF"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "DEVICE_ID"

    const-wide/16 v1, -0x1

    invoke-interface {p0, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static g()J
    .locals 4

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "LAST_REGION_REFRESH_TIME"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lj/c/a/e/i/b;->b(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACK_MSG_LIST"

    invoke-virtual {p0, v1, v0}, Lj/c/a/e/i/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "CONNECTION_ADDRESS"

    invoke-virtual {v0, v1, p0}, Lj/c/a/e/i/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static j(J)V
    .locals 2

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "CONNECTION_ID"

    invoke-virtual {v0, v1, p0, p1}, Lj/c/a/e/i/b;->d(Ljava/lang/String;J)V

    return-void
.end method

.method public static k(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "REGIONAL_SERVER_ADDRESS"

    invoke-virtual {v0, v1, p0}, Lj/c/a/e/i/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static l(Landroid/content/Context;J)V
    .locals 2

    const-string v0, "SERVICE_PREF"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "DEVICE_ID"

    invoke-interface {p0, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public static m(J)V
    .locals 2

    invoke-static {}, Lj/c/a/e/i/b;->a()Lj/c/a/e/i/b;

    move-result-object v0

    const-string v1, "LAST_REGION_REFRESH_TIME"

    invoke-virtual {v0, v1, p0, p1}, Lj/c/a/e/i/b;->d(Ljava/lang/String;J)V

    return-void
.end method
