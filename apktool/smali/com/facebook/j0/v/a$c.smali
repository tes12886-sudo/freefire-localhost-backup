.class final Lcom/facebook/j0/v/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/v/a;->w(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(JLjava/lang/String;Landroid/content/Context;)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/j0/v/a$c;->a:J

    iput-object p3, p0, Lcom/facebook/j0/v/a$c;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/j0/v/a$c;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/j0/v/a;->l:Lcom/facebook/j0/v/a;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/facebook/j0/v/h;->e()Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "appContext"

    if-nez v3, :cond_2

    :try_start_1
    new-instance v1, Lcom/facebook/j0/v/h;

    iget-wide v5, p0, Lcom/facebook/j0/v/a$c;->a:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lcom/facebook/j0/v/h;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILl/y/c/f;)V

    invoke-static {v0, v1}, Lcom/facebook/j0/v/a;->n(Lcom/facebook/j0/v/a;Lcom/facebook/j0/v/h;)V

    iget-object v1, p0, Lcom/facebook/j0/v/a$c;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->b(Lcom/facebook/j0/v/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/facebook/j0/v/a$c;->c:Landroid/content/Context;

    invoke-static {v5, v4}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v5}, Lcom/facebook/j0/v/i;->c(Ljava/lang/String;Lcom/facebook/j0/v/j;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_4

    iget-wide v5, p0, Lcom/facebook/j0/v/a$c;->a:J

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sub-long/2addr v5, v7

    invoke-static {v0}, Lcom/facebook/j0/v/a;->g(Lcom/facebook/j0/v/a;)I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v7, v1

    cmp-long v1, v5, v7

    if-lez v1, :cond_3

    iget-object v1, p0, Lcom/facebook/j0/v/a$c;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v3

    invoke-static {v0}, Lcom/facebook/j0/v/a;->b(Lcom/facebook/j0/v/a;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v3, v5}, Lcom/facebook/j0/v/i;->e(Ljava/lang/String;Lcom/facebook/j0/v/h;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/j0/v/a$c;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->b(Lcom/facebook/j0/v/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/facebook/j0/v/a$c;->c:Landroid/content/Context;

    invoke-static {v5, v4}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v5}, Lcom/facebook/j0/v/i;->c(Ljava/lang/String;Lcom/facebook/j0/v/j;Ljava/lang/String;Landroid/content/Context;)V

    new-instance v1, Lcom/facebook/j0/v/h;

    iget-wide v2, p0, Lcom/facebook/j0/v/a$c;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v11}, Lcom/facebook/j0/v/h;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILl/y/c/f;)V

    invoke-static {v0, v1}, Lcom/facebook/j0/v/a;->n(Lcom/facebook/j0/v/a;Lcom/facebook/j0/v/h;)V

    goto :goto_1

    :cond_3
    const-wide/16 v1, 0x3e8

    cmp-long v3, v5, v1

    if-lez v3, :cond_4

    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/facebook/j0/v/h;->h()V

    :cond_4
    :goto_1
    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-wide v2, p0, Lcom/facebook/j0/v/a$c;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/j0/v/h;->k(Ljava/lang/Long;)V

    :cond_5
    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/facebook/j0/v/h;->m()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
