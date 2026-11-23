.class public final Lj/c/a/e/l/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string p0, "UNKNOWN"

    return-object p0

    :pswitch_0
    const-string p0, "REGION_RESPONSE"

    return-object p0

    :pswitch_1
    const-string p0, "PING_ACK"

    return-object p0

    :pswitch_2
    const-string p0, "PUSH_NOTIFICATION"

    return-object p0

    :pswitch_3
    const-string p0, "AUTH_RESPONSE"

    return-object p0

    :cond_0
    const-string p0, "REGION_REQUEST"

    return-object p0

    :cond_1
    const-string p0, "PING_REQUEST"

    return-object p0

    :cond_2
    const-string p0, "PUSH_ACK"

    return-object p0

    :cond_3
    const-string p0, "CONNECTION_REQUEST"

    return-object p0

    :cond_4
    const-string p0, "AUTH_REQUEST"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b()Lj/c/a/e/f/l/b;
    .locals 4

    new-instance v0, Lj/c/a/d/a/b$a;

    invoke-direct {v0}, Lj/c/a/d/a/b$a;-><init>()V

    invoke-static {}, Lj/c/a/e/a;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lj/c/a/e/l/c;->b(Landroid/content/Context;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/c/a/d/a/b$a;->d(Ljava/lang/Long;)Lj/c/a/d/a/b$a;

    invoke-static {}, Lj/c/a/e/i/a;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/c/a/d/a/b$a;->c(Ljava/lang/Long;)Lj/c/a/d/a/b$a;

    invoke-virtual {v0}, Lj/c/a/d/a/b$a;->e()Lj/c/a/d/a/b;

    move-result-object v0

    new-instance v1, Lj/c/a/e/f/l/b;

    invoke-static {v0}, Lj/c/a/e/l/f;->a(Lj/f/a/b;)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Lj/c/a/e/f/l/b;-><init>(I[B)V

    invoke-virtual {v1, v3}, Lj/c/a/e/f/l/b;->f(Z)V

    const/16 v2, 0x7530

    invoke-virtual {v1, v2}, Lj/c/a/e/f/l/b;->g(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "auth packet: Command: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lj/c/a/e/f/l/b;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " sign: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lj/c/a/d/a/b;->d:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " oldid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lj/c/a/d/a/b;->e:Ljava/lang/Long;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    return-object v1
.end method

.method public static c(J)Lj/c/a/e/f/l/b;
    .locals 1

    new-instance v0, Lj/c/a/d/a/a$a;

    invoke-direct {v0}, Lj/c/a/d/a/a$a;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Lj/c/a/d/a/a$a;->c(Ljava/lang/Long;)Lj/c/a/d/a/a$a;

    invoke-virtual {v0}, Lj/c/a/d/a/a$a;->d()Lj/c/a/d/a/a;

    move-result-object p0

    new-instance p1, Lj/c/a/e/f/l/b;

    invoke-static {p0}, Lj/c/a/e/l/f;->a(Lj/f/a/b;)[B

    move-result-object p0

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, Lj/c/a/e/f/l/b;-><init>(I[B)V

    return-object p1
.end method

.method public static d()Lj/c/a/e/f/l/b;
    .locals 3

    new-instance v0, Lj/c/a/e/f/l/b;

    const/4 v1, 0x0

    new-array v1, v1, [B

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Lj/c/a/e/f/l/b;-><init>(I[B)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/c/a/e/f/l/b;->f(Z)V

    const v1, 0xea60

    invoke-virtual {v0, v1}, Lj/c/a/e/f/l/b;->g(I)V

    return-object v0
.end method

.method public static e(I)Lj/c/a/e/f/l/b;
    .locals 2

    new-instance v0, Lj/c/a/d/a/g$a;

    invoke-direct {v0}, Lj/c/a/d/a/g$a;-><init>()V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lj/c/a/d/a/g$a;->c(Ljava/lang/Integer;)Lj/c/a/d/a/g$a;

    new-instance p0, Lj/c/a/e/f/l/b;

    invoke-virtual {v0}, Lj/c/a/d/a/g$a;->d()Lj/c/a/d/a/g;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/f;->a(Lj/f/a/b;)[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lj/c/a/e/f/l/b;-><init>(I[B)V

    return-object p0
.end method

.method public static f()Lj/c/a/e/f/l/b;
    .locals 3

    new-instance v0, Lj/c/a/e/f/l/b;

    const/4 v1, 0x0

    new-array v1, v1, [B

    const/4 v2, 0x5

    invoke-direct {v0, v2, v1}, Lj/c/a/e/f/l/b;-><init>(I[B)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lj/c/a/e/f/l/b;->f(Z)V

    const/16 v1, 0x7530

    invoke-virtual {v0, v1}, Lj/c/a/e/f/l/b;->g(I)V

    return-object v0
.end method
