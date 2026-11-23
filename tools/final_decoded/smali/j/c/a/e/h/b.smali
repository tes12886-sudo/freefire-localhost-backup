.class public Lj/c/a/e/h/b;
.super Lj/c/a/e/h/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/h/a;-><init>()V

    return-void
.end method

.method private c(J)V
    .locals 3

    invoke-static {}, Lj/c/a/e/a;->c()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.garena.android.gpns.GPID_UPDATE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "gpid_update_intent_extra_gpid"

    invoke-virtual {v1, v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0x11

    return v0
.end method

.method public b([BII)V
    .locals 4

    invoke-static {p1, p2, p3}, Lj/c/a/e/l/f;->b([BII)Lj/c/a/d/a/c;

    move-result-object p1

    iget-object p2, p1, Lj/c/a/d/a/c;->d:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetGPidResponse gPid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-eqz v3, :cond_1

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-eqz v3, :cond_0

    invoke-direct {p0, p2, p3}, Lj/c/a/e/h/b;->c(J)V

    :cond_0
    invoke-static {p2, p3}, Lj/c/a/e/i/a;->j(J)V

    iget-object p1, p1, Lj/c/a/d/a/c;->e:Ljava/lang/String;

    invoke-static {p1}, Lj/c/a/e/i/a;->i(Ljava/lang/String;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object p1

    const-string p2, "CONNECT_NOTIFICATION_SERVER"

    goto :goto_0

    :cond_1
    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object p1

    const-string p2, "RECONNECT_WHEN_INVALID_GIP_RECEIVED"

    :goto_0
    invoke-virtual {p1, p2, v0}, Lj/c/a/e/g/a;->b(Ljava/lang/String;Lj/c/a/e/g/c/a;)V

    return-void
.end method
