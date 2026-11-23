.class Lj/d/d/z/n/n$t;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/n/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Lj/d/d/k;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/z/n/n$t;->e(Lj/d/d/b0/a;)Lj/d/d/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lj/d/d/k;

    invoke-virtual {p0, p1, p2}, Lj/d/d/z/n/n$t;->f(Lj/d/d/b0/c;Lj/d/d/k;)V

    return-void
.end method

.method public e(Lj/d/d/b0/a;)Lj/d/d/k;
    .locals 3

    instance-of v0, p1, Lj/d/d/z/n/f;

    if-eqz v0, :cond_0

    check-cast p1, Lj/d/d/z/n/f;

    invoke-virtual {p1}, Lj/d/d/z/n/f;->A0()Lj/d/d/k;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lj/d/d/z/n/n$b0;->a:[I

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Lj/d/d/n;

    invoke-direct {v0}, Lj/d/d/n;-><init>()V

    invoke-virtual {p1}, Lj/d/d/b0/a;->c()V

    :goto_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj/d/d/b0/a;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lj/d/d/z/n/n$t;->e(Lj/d/d/b0/a;)Lj/d/d/k;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lj/d/d/n;->q(Ljava/lang/String;Lj/d/d/k;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->F()V

    return-object v0

    :pswitch_1
    new-instance v0, Lj/d/d/h;

    invoke-direct {v0}, Lj/d/d/h;-><init>()V

    invoke-virtual {p1}, Lj/d/d/b0/a;->b()V

    :goto_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Lj/d/d/z/n/n$t;->e(Lj/d/d/b0/a;)Lj/d/d/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/d/d/h;->q(Lj/d/d/k;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lj/d/d/b0/a;->u()V

    return-object v0

    :pswitch_2
    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    sget-object p1, Lj/d/d/m;->a:Lj/d/d/m;

    return-object p1

    :pswitch_3
    new-instance v0, Lj/d/d/p;

    invoke-virtual {p1}, Lj/d/d/b0/a;->d0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lj/d/d/p;

    invoke-virtual {p1}, Lj/d/d/b0/a;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    invoke-virtual {p1}, Lj/d/d/b0/a;->l0()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lj/d/d/p;

    new-instance v1, Lj/d/d/z/g;

    invoke-direct {v1, p1}, Lj/d/d/z/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lj/d/d/p;-><init>(Ljava/lang/Number;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lj/d/d/b0/c;Lj/d/d/k;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lj/d/d/k;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lj/d/d/k;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lj/d/d/k;->d()Lj/d/d/p;

    move-result-object p2

    invoke-virtual {p2}, Lj/d/d/p;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lj/d/d/p;->u()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/d/d/b0/c;->n0(Ljava/lang/Number;)Lj/d/d/b0/c;

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Lj/d/d/p;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lj/d/d/p;->q()Z

    move-result p2

    invoke-virtual {p1, p2}, Lj/d/d/b0/c;->p0(Z)Lj/d/d/b0/c;

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p2}, Lj/d/d/p;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/d/d/b0/c;->o0(Ljava/lang/String;)Lj/d/d/b0/c;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p2}, Lj/d/d/k;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lj/d/d/b0/c;->f()Lj/d/d/b0/c;

    invoke-virtual {p2}, Lj/d/d/k;->b()Lj/d/d/h;

    move-result-object p2

    invoke-virtual {p2}, Lj/d/d/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/k;

    invoke-virtual {p0, p1, v0}, Lj/d/d/z/n/n$t;->f(Lj/d/d/b0/c;Lj/d/d/k;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lj/d/d/b0/c;->u()Lj/d/d/b0/c;

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lj/d/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lj/d/d/b0/c;->j()Lj/d/d/b0/c;

    invoke-virtual {p2}, Lj/d/d/k;->c()Lj/d/d/n;

    move-result-object p2

    invoke-virtual {p2}, Lj/d/d/n;->s()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lj/d/d/b0/c;->Z(Ljava/lang/String;)Lj/d/d/b0/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/k;

    invoke-virtual {p0, p1, v0}, Lj/d/d/z/n/n$t;->f(Lj/d/d/b0/c;Lj/d/d/k;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lj/d/d/b0/c;->F()Lj/d/d/b0/c;

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    :goto_3
    return-void
.end method
