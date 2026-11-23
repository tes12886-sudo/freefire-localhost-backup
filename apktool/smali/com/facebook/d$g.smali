.class final Lcom/facebook/d$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/w$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/d;->j(Lcom/facebook/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/d;

.field final synthetic b:Lcom/facebook/d$d;

.field final synthetic c:Lcom/facebook/a;

.field final synthetic d:Lcom/facebook/a$a;

.field final synthetic e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic f:Ljava/util/Set;

.field final synthetic g:Ljava/util/Set;

.field final synthetic h:Ljava/util/Set;


# direct methods
.method constructor <init>(Lcom/facebook/d;Lcom/facebook/d$d;Lcom/facebook/a;Lcom/facebook/a$a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/d$g;->a:Lcom/facebook/d;

    iput-object p2, p0, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    iput-object p3, p0, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    iput-object p4, p0, Lcom/facebook/d$g;->d:Lcom/facebook/a$a;

    iput-object p5, p0, Lcom/facebook/d$g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p6, p0, Lcom/facebook/d$g;->f:Ljava/util/Set;

    iput-object p7, p0, Lcom/facebook/d$g;->g:Ljava/util/Set;

    iput-object p8, p0, Lcom/facebook/d$g;->h:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/w;)V
    .locals 27

    move-object/from16 v1, p0

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v0}, Lcom/facebook/d$d;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v2}, Lcom/facebook/d$d;->c()I

    move-result v2

    iget-object v3, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v3}, Lcom/facebook/d$d;->b()Ljava/lang/Long;

    move-result-object v3

    iget-object v4, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v4}, Lcom/facebook/d$d;->e()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_0
    sget-object v7, Lcom/facebook/d;->g:Lcom/facebook/d$a;

    invoke-virtual {v7}, Lcom/facebook/d$a;->e()Lcom/facebook/d;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/d;->g()Lcom/facebook/a;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-virtual {v7}, Lcom/facebook/d$a;->e()Lcom/facebook/d;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/d;->g()Lcom/facebook/a;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lcom/facebook/a;->n()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object v8, v5

    :goto_0
    iget-object v9, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v9}, Lcom/facebook/a;->n()Ljava/lang/String;

    move-result-object v9

    if-eq v8, v9, :cond_1

    goto/16 :goto_a

    :cond_1
    iget-object v8, v1, Lcom/facebook/d$g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v8

    if-nez v8, :cond_3

    if-nez v0, :cond_3

    if-nez v2, :cond_3

    iget-object v0, v1, Lcom/facebook/d$g;->d:Lcom/facebook/a$a;

    if-eqz v0, :cond_2

    new-instance v2, Lcom/facebook/n;

    const-string v3, "Failed to refresh access token"

    invoke-direct {v2, v3}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/facebook/a$a;->a(Lcom/facebook/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    iget-object v0, v1, Lcom/facebook/d$g;->a:Lcom/facebook/d;

    invoke-static {v0}, Lcom/facebook/d;->b(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_3
    :try_start_1
    iget-object v2, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v2}, Lcom/facebook/a;->h()Ljava/util/Date;

    move-result-object v2

    iget-object v8, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v8}, Lcom/facebook/d$d;->c()I

    move-result v8

    const-wide/16 v9, 0x3e8

    if-eqz v8, :cond_4

    new-instance v2, Ljava/util/Date;

    iget-object v8, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v8}, Lcom/facebook/d$d;->c()I

    move-result v8

    int-to-long v11, v8

    mul-long v11, v11, v9

    invoke-direct {v2, v11, v12}, Ljava/util/Date;-><init>(J)V

    goto :goto_1

    :cond_4
    iget-object v8, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v8}, Lcom/facebook/d$d;->d()I

    move-result v8

    if-eqz v8, :cond_5

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    new-instance v2, Ljava/util/Date;

    iget-object v8, v1, Lcom/facebook/d$g;->b:Lcom/facebook/d$d;

    invoke-virtual {v8}, Lcom/facebook/d$d;->d()I

    move-result v8

    int-to-long v13, v8

    mul-long v13, v13, v9

    add-long/2addr v13, v11

    invoke-direct {v2, v13, v14}, Ljava/util/Date;-><init>(J)V

    :cond_5
    :goto_1
    move-object/from16 v23, v2

    new-instance v2, Lcom/facebook/a;

    if-eqz v0, :cond_6

    :goto_2
    move-object/from16 v16, v0

    goto :goto_3

    :cond_6
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :goto_3
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->c()Ljava/lang/String;

    move-result-object v17

    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->n()Ljava/lang/String;

    move-result-object v18

    iget-object v0, v1, Lcom/facebook/d$g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v1, Lcom/facebook/d$g;->f:Ljava/util/Set;

    goto :goto_4

    :cond_7
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->k()Ljava/util/Set;

    move-result-object v0

    :goto_4
    move-object/from16 v19, v0

    iget-object v0, v1, Lcom/facebook/d$g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lcom/facebook/d$g;->g:Ljava/util/Set;

    goto :goto_5

    :cond_8
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->f()Ljava/util/Set;

    move-result-object v0

    :goto_5
    move-object/from16 v20, v0

    iget-object v0, v1, Lcom/facebook/d$g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, v1, Lcom/facebook/d$g;->h:Ljava/util/Set;

    goto :goto_6

    :cond_9
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->g()Ljava/util/Set;

    move-result-object v0

    :goto_6
    move-object/from16 v21, v0

    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->l()Lcom/facebook/e;

    move-result-object v22

    new-instance v24, Ljava/util/Date;

    invoke-direct/range {v24 .. v24}, Ljava/util/Date;-><init>()V

    if-eqz v3, :cond_a

    new-instance v0, Ljava/util/Date;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    mul-long v11, v11, v9

    invoke-direct {v0, v11, v12}, Ljava/util/Date;-><init>(J)V

    goto :goto_7

    :cond_a
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->e()Ljava/util/Date;

    move-result-object v0

    :goto_7
    move-object/from16 v25, v0

    if-eqz v4, :cond_b

    :goto_8
    move-object/from16 v26, v4

    goto :goto_9

    :cond_b
    iget-object v0, v1, Lcom/facebook/d$g;->c:Lcom/facebook/a;

    invoke-virtual {v0}, Lcom/facebook/a;->i()Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :goto_9
    move-object v15, v2

    invoke-direct/range {v15 .. v26}, Lcom/facebook/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/e;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v7}, Lcom/facebook/d$a;->e()Lcom/facebook/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/d;->l(Lcom/facebook/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Lcom/facebook/d$g;->a:Lcom/facebook/d;

    invoke-static {v0}, Lcom/facebook/d;->b(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, v1, Lcom/facebook/d$g;->d:Lcom/facebook/a$a;

    if-eqz v0, :cond_c

    invoke-interface {v0, v2}, Lcom/facebook/a$a;->b(Lcom/facebook/a;)V

    :cond_c
    return-void

    :catchall_0
    move-exception v0

    move-object v5, v2

    goto :goto_b

    :cond_d
    :goto_a
    :try_start_3
    iget-object v0, v1, Lcom/facebook/d$g;->d:Lcom/facebook/a$a;

    if-eqz v0, :cond_e

    new-instance v2, Lcom/facebook/n;

    const-string v3, "No current access token to refresh"

    invoke-direct {v2, v3}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/facebook/a$a;->a(Lcom/facebook/n;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_e
    iget-object v0, v1, Lcom/facebook/d$g;->a:Lcom/facebook/d;

    invoke-static {v0}, Lcom/facebook/d;->b(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_1
    move-exception v0

    :goto_b
    iget-object v2, v1, Lcom/facebook/d$g;->a:Lcom/facebook/d;

    invoke-static {v2}, Lcom/facebook/d;->b(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v2, v1, Lcom/facebook/d$g;->d:Lcom/facebook/a$a;

    if-eqz v2, :cond_f

    if-eqz v5, :cond_f

    invoke-interface {v2, v5}, Lcom/facebook/a$a;->b(Lcom/facebook/a;)V

    :cond_f
    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method
