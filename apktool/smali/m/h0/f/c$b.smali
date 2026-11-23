.class public final Lm/h0/f/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/f/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lm/b0;

.field private final c:Lm/d0;

.field private d:Ljava/util/Date;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/Date;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/Date;

.field private i:J

.field private j:J

.field private k:Ljava/lang/String;

.field private l:I


# direct methods
.method public constructor <init>(JLm/b0;Lm/d0;)V
    .locals 4

    const-string v0, "request"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lm/h0/f/c$b;->a:J

    iput-object p3, p0, Lm/h0/f/c$b;->b:Lm/b0;

    iput-object p4, p0, Lm/h0/f/c$b;->c:Lm/d0;

    const/4 p1, -0x1

    iput p1, p0, Lm/h0/f/c$b;->l:I

    if-eqz p4, :cond_5

    invoke-virtual {p4}, Lm/d0;->g0()J

    move-result-wide p2

    iput-wide p2, p0, Lm/h0/f/c$b;->i:J

    invoke-virtual {p4}, Lm/d0;->e0()J

    move-result-wide p2

    iput-wide p2, p0, Lm/h0/f/c$b;->j:J

    invoke-virtual {p4}, Lm/d0;->T()Lm/u;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2}, Lm/u;->size()I

    move-result p4

    :goto_0
    if-ge p3, p4, :cond_5

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p2, p3}, Lm/u;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p3}, Lm/u;->h(I)Ljava/lang/String;

    move-result-object p3

    const-string v2, "Date"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p3}, Lm/h0/i/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Lm/h0/f/c$b;->d:Ljava/util/Date;

    iput-object p3, p0, Lm/h0/f/c$b;->e:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v2, "Expires"

    invoke-static {v1, v2, v3}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p3}, Lm/h0/i/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p3

    iput-object p3, p0, Lm/h0/f/c$b;->h:Ljava/util/Date;

    goto :goto_1

    :cond_1
    const-string v2, "Last-Modified"

    invoke-static {v1, v2, v3}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p3}, Lm/h0/i/c;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Lm/h0/f/c$b;->f:Ljava/util/Date;

    iput-object p3, p0, Lm/h0/f/c$b;->g:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string v2, "ETag"

    invoke-static {v1, v2, v3}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    iput-object p3, p0, Lm/h0/f/c$b;->k:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v2, "Age"

    invoke-static {v1, v2, v3}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p3, p1}, Lm/h0/d;->U(Ljava/lang/String;I)I

    move-result p3

    iput p3, p0, Lm/h0/f/c$b;->l:I

    :cond_4
    :goto_1
    move p3, v0

    goto :goto_0

    :cond_5
    return-void
.end method

.method private final a()J
    .locals 9

    iget-object v0, p0, Lm/h0/f/c$b;->d:Ljava/util/Date;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    iget-wide v3, p0, Lm/h0/f/c$b;->j:J

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_0
    iget v0, p0, Lm/h0/f/c$b;->l:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_1
    iget-wide v3, p0, Lm/h0/f/c$b;->j:J

    iget-wide v5, p0, Lm/h0/f/c$b;->i:J

    sub-long v5, v3, v5

    iget-wide v7, p0, Lm/h0/f/c$b;->a:J

    sub-long/2addr v7, v3

    add-long/2addr v1, v5

    add-long/2addr v1, v7

    return-wide v1
.end method

.method private final c()Lm/h0/f/c;
    .locals 13

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {v0, v2, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v0}, Lm/b0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->F()Lm/t;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {v0, v2, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v0

    :cond_1
    sget-object v0, Lm/h0/f/c;->c:Lm/h0/f/c$a;

    iget-object v2, p0, Lm/h0/f/c$b;->c:Lm/d0;

    iget-object v3, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v0, v2, v3}, Lm/h0/f/c$a;->a(Lm/d0;Lm/b0;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {v0, v2, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v0

    :cond_2
    iget-object v0, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v0}, Lm/b0;->b()Lm/d;

    move-result-object v0

    invoke-virtual {v0}, Lm/d;->h()Z

    move-result v2

    if-nez v2, :cond_d

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {p0, v2}, Lm/h0/f/c$b;->e(Lm/b0;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_2

    :cond_3
    iget-object v2, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-virtual {v2}, Lm/d0;->c()Lm/d;

    move-result-object v2

    invoke-direct {p0}, Lm/h0/f/c$b;->a()J

    move-result-wide v3

    invoke-direct {p0}, Lm/h0/f/c$b;->d()J

    move-result-wide v5

    invoke-virtual {v0}, Lm/d;->d()I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_4

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Lm/d;->d()I

    move-result v9

    int-to-long v9, v9

    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_4
    invoke-virtual {v0}, Lm/d;->f()I

    move-result v7

    const-wide/16 v9, 0x0

    if-eq v7, v8, :cond_5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Lm/d;->f()I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v7, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    goto :goto_0

    :cond_5
    move-wide v11, v9

    :goto_0
    invoke-virtual {v2}, Lm/d;->g()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v0}, Lm/d;->e()I

    move-result v7

    if-eq v7, v8, :cond_6

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Lm/d;->e()I

    move-result v0

    int-to-long v8, v0

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    :cond_6
    invoke-virtual {v2}, Lm/d;->h()Z

    move-result v0

    if-nez v0, :cond_9

    add-long/2addr v11, v3

    add-long/2addr v9, v5

    cmp-long v0, v11, v9

    if-gez v0, :cond_9

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->b0()Lm/d0$a;

    move-result-object v0

    const-string v2, "Warning"

    cmp-long v7, v11, v5

    if-ltz v7, :cond_7

    const-string v5, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v0, v2, v5}, Lm/d0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lm/d0$a;

    :cond_7
    const-wide/32 v5, 0x5265c00

    cmp-long v7, v3, v5

    if-lez v7, :cond_8

    invoke-direct {p0}, Lm/h0/f/c$b;->f()Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v0, v2, v3}, Lm/d0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lm/d0$a;

    :cond_8
    new-instance v2, Lm/h0/f/c;

    invoke-virtual {v0}, Lm/d0$a;->c()Lm/d0;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v2

    :cond_9
    iget-object v0, p0, Lm/h0/f/c$b;->k:Ljava/lang/String;

    const-string v2, "If-Modified-Since"

    if-eqz v0, :cond_a

    const-string v2, "If-None-Match"

    goto :goto_1

    :cond_a
    iget-object v0, p0, Lm/h0/f/c$b;->f:Ljava/util/Date;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lm/h0/f/c$b;->g:Ljava/lang/String;

    goto :goto_1

    :cond_b
    iget-object v0, p0, Lm/h0/f/c$b;->d:Ljava/util/Date;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lm/h0/f/c$b;->e:Ljava/lang/String;

    :goto_1
    iget-object v1, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v1}, Lm/b0;->e()Lm/u;

    move-result-object v1

    invoke-virtual {v1}, Lm/u;->d()Lm/u$a;

    move-result-object v1

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, Lm/u$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/u$a;

    iget-object v0, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v0}, Lm/b0;->h()Lm/b0$a;

    move-result-object v0

    invoke-virtual {v1}, Lm/u$a;->e()Lm/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b0$a;->e(Lm/u;)Lm/b0$a;

    invoke-virtual {v0}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    new-instance v1, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-direct {v1, v0, v2}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v1

    :cond_c
    new-instance v0, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {v0, v2, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v0

    :cond_d
    :goto_2
    new-instance v0, Lm/h0/f/c;

    iget-object v2, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-direct {v0, v2, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    return-object v0
.end method

.method private final d()J
    .locals 6

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/d0;->c()Lm/d;

    move-result-object v0

    invoke-virtual {v0}, Lm/d;->d()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Lm/d;->d()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lm/h0/f/c$b;->h:Ljava/util/Date;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v4, p0, Lm/h0/f/c$b;->d:Ljava/util/Date;

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    iget-wide v4, p0, Lm/h0/f/c$b;->j:J

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    :goto_1
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    move-wide v2, v0

    :cond_3
    return-wide v2

    :cond_4
    iget-object v0, p0, Lm/h0/f/c$b;->f:Ljava/util/Date;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->f0()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->j()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->o()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lm/h0/f/c$b;->d:Ljava/util/Date;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_6

    iget-wide v0, p0, Lm/h0/f/c$b;->i:J

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_3
    iget-object v4, p0, Lm/h0/f/c$b;->f:Ljava/util/Date;

    invoke-static {v4}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_7

    const/16 v2, 0xa

    int-to-long v2, v2

    div-long v2, v0, v2

    :cond_7
    return-wide v2
.end method

.method private final e(Lm/b0;)Z
    .locals 1

    const-string v0, "If-Modified-Since"

    invoke-virtual {p1, v0}, Lm/b0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "If-None-Match"

    invoke-virtual {p1, v0}, Lm/b0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final f()Z
    .locals 2

    iget-object v0, p0, Lm/h0/f/c$b;->c:Lm/d0;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/d0;->c()Lm/d;

    move-result-object v0

    invoke-virtual {v0}, Lm/d;->d()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lm/h0/f/c$b;->h:Ljava/util/Date;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final b()Lm/h0/f/c;
    .locals 2

    invoke-direct {p0}, Lm/h0/f/c$b;->c()Lm/h0/f/c;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/f/c;->b()Lm/b0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lm/h0/f/c$b;->b:Lm/b0;

    invoke-virtual {v1}, Lm/b0;->b()Lm/d;

    move-result-object v1

    invoke-virtual {v1}, Lm/d;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lm/h0/f/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lm/h0/f/c;-><init>(Lm/b0;Lm/d0;)V

    :cond_0
    return-object v0
.end method
