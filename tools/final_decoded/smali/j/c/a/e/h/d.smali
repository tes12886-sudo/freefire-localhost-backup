.class public Lj/c/a/e/h/d;
.super Lj/c/a/e/h/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/h/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public b([BII)V
    .locals 0

    invoke-static {p1, p2, p3}, Lj/c/a/e/l/f;->c([BII)Lj/c/a/d/a/d;

    move-result-object p1

    iget-object p1, p1, Lj/c/a/d/a/d;->d:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Lj/c/a/e/i/a;->m(J)V

    invoke-static {p1}, Lj/c/a/e/i/a;->k(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object p1

    const/4 p2, 0x0

    const-string p3, "CONNECT_AUTHENTICATION_SERVER"

    invoke-virtual {p1, p3, p2}, Lj/c/a/e/g/a;->b(Ljava/lang/String;Lj/c/a/e/g/c/a;)V

    return-void
.end method
