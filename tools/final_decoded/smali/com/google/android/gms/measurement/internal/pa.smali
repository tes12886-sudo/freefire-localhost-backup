.class final Lcom/google/android/gms/measurement/internal/pa;
.super Lcom/google/android/gms/measurement/internal/qa;
.source ""


# instance fields
.field private final g:Lcom/google/android/gms/internal/measurement/h3;

.field final synthetic h:Lcom/google/android/gms/measurement/internal/sa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/sa;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/h3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/measurement/internal/qa;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h3;->y()I

    move-result v0

    return v0
.end method

.method final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/h3;->D()Z

    move-result v0

    return v0
.end method

.method final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/k4;JLcom/google/android/gms/measurement/internal/p;Z)Z
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ed;->a()Z

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/a5;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v3

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/qa;->a:Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/measurement/internal/f3;->a0:Lcom/google/android/gms/measurement/internal/d3;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/measurement/internal/f;->w(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/d3;)Z

    move-result v3

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/h3;->J()Z

    move-result v4

    if-eqz v4, :cond_0

    move-object/from16 v4, p6

    iget-wide v4, v4, Lcom/google/android/gms/measurement/internal/p;->e:J

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p4

    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/r3;->z()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/r3;->w()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v6

    iget v8, v0, Lcom/google/android/gms/measurement/internal/qa;->b:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->x()Z

    move-result v9

    if-eqz v9, :cond_1

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->y()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_1

    :cond_1
    move-object v9, v7

    :goto_1
    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v10

    iget-object v11, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/h3;->z()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "Evaluating filter. audience, filter, event"

    invoke-virtual {v6, v11, v8, v9, v10}, Lcom/google/android/gms/measurement/internal/p3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/r3;->w()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v6

    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/l9;->b:Lcom/google/android/gms/measurement/internal/v9;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/v9;->Y()Lcom/google/android/gms/measurement/internal/x9;

    move-result-object v8

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/x9;->z(Lcom/google/android/gms/internal/measurement/h3;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Filter definition"

    invoke-virtual {v6, v9, v8}, Lcom/google/android/gms/measurement/internal/p3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h3;->x()Z

    move-result v6

    const/4 v8, 0x0

    if-eqz v6, :cond_2a

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h3;->y()I

    move-result v6

    const/16 v9, 0x100

    if-le v6, v9, :cond_3

    goto/16 :goto_10

    :cond_3
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h3;->G()Z

    move-result v6

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->H()Z

    move-result v9

    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/h3;->J()Z

    move-result v10

    const/4 v11, 0x1

    if-nez v6, :cond_5

    if-nez v9, :cond_5

    if-eqz v10, :cond_4

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz p7, :cond_7

    if-nez v6, :cond_7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r3;->w()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    iget v2, v0, Lcom/google/android/gms/measurement/internal/qa;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h3;->x()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h3;->y()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_6
    const-string v3, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {v1, v3, v2, v7}, Lcom/google/android/gms/measurement/internal/p3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v11

    :cond_7
    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/k4;->A()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->D()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->E()Lcom/google/android/gms/internal/measurement/n3;

    move-result-object v12

    invoke-static {v4, v5, v12}, Lcom/google/android/gms/measurement/internal/qa;->g(JLcom/google/android/gms/internal/measurement/n3;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_8

    :goto_4
    move-object v2, v7

    goto/16 :goto_c

    :cond_8
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_c

    :cond_9
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->A()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/j3;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/j3;->E()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_a

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "null or empty param name in filter. event"

    :goto_6
    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/measurement/internal/p3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/j3;->E()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    new-instance v5, Lh/f/a;

    invoke-direct {v5}, Lh/f/a;-><init>()V

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/k4;->x()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_c
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_11

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->y()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v4, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->B()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->y()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->B()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->C()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_8

    :cond_d
    move-object v13, v7

    goto :goto_8

    :cond_e
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->G()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->y()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->G()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->H()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    goto :goto_8

    :cond_f
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->z()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->y()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->A()Ljava/lang/String;

    move-result-object v13

    :goto_8
    invoke-interface {v5, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_10
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/o4;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "Unknown value for param. event, param"

    :goto_9
    invoke-virtual {v2, v9, v4, v5}, Lcom/google/android/gms/measurement/internal/p3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_11
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/h3;->A()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/j3;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->B()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->C()Z

    move-result v12

    if-eqz v12, :cond_13

    const/4 v12, 0x1

    goto :goto_a

    :cond_13
    const/4 v12, 0x0

    :goto_a
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->E()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_14

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Event has empty param name. event"

    goto/16 :goto_6

    :cond_14
    invoke-interface {v5, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Long;

    if-eqz v15, :cond_17

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->z()Z

    move-result v15

    if-nez v15, :cond_15

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "No number filter for long param. event, param"

    goto/16 :goto_9

    :cond_15
    check-cast v14, Ljava/lang/Long;

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->A()Lcom/google/android/gms/internal/measurement/n3;

    move-result-object v9

    invoke-static {v13, v14, v9}, Lcom/google/android/gms/measurement/internal/qa;->g(JLcom/google/android/gms/internal/measurement/n3;)Ljava/lang/Boolean;

    move-result-object v9

    if-nez v9, :cond_16

    goto/16 :goto_4

    :cond_16
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-ne v9, v12, :cond_12

    goto/16 :goto_c

    :cond_17
    instance-of v15, v14, Ljava/lang/Double;

    if-eqz v15, :cond_1a

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->z()Z

    move-result v15

    if-nez v15, :cond_18

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "No number filter for double param. event, param"

    goto/16 :goto_9

    :cond_18
    check-cast v14, Ljava/lang/Double;

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->A()Lcom/google/android/gms/internal/measurement/n3;

    move-result-object v9

    invoke-static {v13, v14, v9}, Lcom/google/android/gms/measurement/internal/qa;->h(DLcom/google/android/gms/internal/measurement/n3;)Ljava/lang/Boolean;

    move-result-object v9

    if-nez v9, :cond_19

    goto/16 :goto_4

    :cond_19
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-ne v9, v12, :cond_12

    goto/16 :goto_c

    :cond_1a
    instance-of v15, v14, Ljava/lang/String;

    if-eqz v15, :cond_1f

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->x()Z

    move-result v15

    if-eqz v15, :cond_1b

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->y()Lcom/google/android/gms/internal/measurement/t3;

    move-result-object v9

    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v13, v13, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v13

    invoke-static {v14, v9, v13}, Lcom/google/android/gms/measurement/internal/qa;->f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/t3;Lcom/google/android/gms/measurement/internal/r3;)Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_b

    :cond_1b
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->z()Z

    move-result v15

    if-eqz v15, :cond_1e

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/x9;->C(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1d

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/j3;->A()Lcom/google/android/gms/internal/measurement/n3;

    move-result-object v9

    invoke-static {v14, v9}, Lcom/google/android/gms/measurement/internal/qa;->i(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n3;)Ljava/lang/Boolean;

    move-result-object v9

    :goto_b
    if-nez v9, :cond_1c

    goto/16 :goto_4

    :cond_1c
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-ne v9, v12, :cond_12

    goto/16 :goto_c

    :cond_1d
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "Invalid param value for number filter. event, param"

    goto/16 :goto_9

    :cond_1e
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "No filter for String param. event, param"

    goto/16 :goto_9

    :cond_1f
    if-nez v14, :cond_20

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/r3;->w()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v7

    invoke-virtual {v7, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Missing param for filter. event, param"

    invoke-virtual {v4, v9, v5, v7}, Lcom/google/android/gms/measurement/internal/p3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_c

    :cond_20
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/measurement/internal/m3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/a5;->H()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/google/android/gms/measurement/internal/m3;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "Unknown param type. event, param"

    goto/16 :goto_9

    :cond_21
    move-object v2, v1

    :goto_c
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/r3;->w()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v4

    if-nez v2, :cond_22

    const-string v5, "null"

    goto :goto_d

    :cond_22
    move-object v5, v2

    :goto_d
    const-string v7, "Event filter result"

    invoke-virtual {v4, v7, v5}, Lcom/google/android/gms/measurement/internal/p3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v2, :cond_23

    return v8

    :cond_23
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/qa;->c:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_24

    return v11

    :cond_24
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/qa;->d:Ljava/lang/Boolean;

    if-eqz v6, :cond_29

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/k4;->B()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/k4;->C()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h3;->H()Z

    move-result v2

    if-eqz v2, :cond_27

    if-eqz v3, :cond_26

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h3;->D()Z

    move-result v2

    if-nez v2, :cond_25

    goto :goto_e

    :cond_25
    move-object/from16 v1, p1

    :cond_26
    :goto_e
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/qa;->f:Ljava/lang/Long;

    goto :goto_f

    :cond_27
    if-eqz v3, :cond_28

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/h3;->D()Z

    move-result v2

    if-eqz v2, :cond_28

    move-object/from16 v1, p2

    :cond_28
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/qa;->e:Ljava/lang/Long;

    :cond_29
    :goto_f
    return v11

    :cond_2a
    :goto_10
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/pa;->h:Lcom/google/android/gms/measurement/internal/sa;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/u5;->a:Lcom/google/android/gms/measurement/internal/a5;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a5;->d()Lcom/google/android/gms/measurement/internal/r3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/r3;->r()Lcom/google/android/gms/measurement/internal/p3;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/qa;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/r3;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h3;->x()Z

    move-result v3

    if-eqz v3, :cond_2b

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/pa;->g:Lcom/google/android/gms/internal/measurement/h3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/h3;->y()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_2b
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event filter ID. appId, id"

    invoke-virtual {v1, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v8
.end method
