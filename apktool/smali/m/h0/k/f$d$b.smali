.class public final Lm/h0/k/f$d$b;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f$d;->h(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;

.field final synthetic f:Lm/h0/k/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;Lm/h0/k/i;)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$d$b;->e:Lm/h0/k/f;

    iput-object p4, p0, Lm/h0/k/f$d$b;->f:Lm/h0/k/i;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f$d$b;->e:Lm/h0/k/f;

    invoke-virtual {v0}, Lm/h0/k/f;->l0()Lm/h0/k/f$c;

    move-result-object v0

    iget-object v1, p0, Lm/h0/k/f$d$b;->f:Lm/h0/k/i;

    invoke-virtual {v0, v1}, Lm/h0/k/f$c;->c(Lm/h0/k/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v1}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v1

    iget-object v2, p0, Lm/h0/k/f$d$b;->e:Lm/h0/k/f;

    invoke-virtual {v2}, Lm/h0/k/f;->j0()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Http2Connection.Listener failure for "

    invoke-static {v3, v2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, Lm/h0/l/h;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, Lm/h0/k/f$d$b;->f:Lm/h0/k/i;

    sget-object v2, Lm/h0/k/b;->d:Lm/h0/k/b;

    invoke-virtual {v1, v2, v0}, Lm/h0/k/i;->d(Lm/h0/k/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
