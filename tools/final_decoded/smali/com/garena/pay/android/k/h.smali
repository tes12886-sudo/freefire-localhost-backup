.class public Lcom/garena/pay/android/k/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/pay/android/k/h$b;
    }
.end annotation


# static fields
.field public static a:Lcom/garena/pay/android/k/h$b;

.field private static b:Lcom/garena/pay/android/k/c;


# direct methods
.method public static a(Z)V
    .locals 1

    sget-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/garena/pay/android/k/c;->g(Z)V

    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/garena/pay/android/e;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/k/c;->g(Z)V

    :cond_0
    new-instance v0, Lcom/garena/pay/android/k/c;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/k/c;-><init>(Landroid/app/Activity;)V

    sput-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    sget v1, Lj/c/b/g;->i:I

    invoke-static {p0, v1}, Lcom/garena/pay/android/j/d;->b(Landroid/app/Activity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/k/c;->k(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/garena/pay/android/e;

    invoke-virtual {v1}, Lcom/garena/pay/android/e;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/garena/pay/android/e;->l()Lcom/garena/pay/android/data/GGPayment$PaymentChannel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;->getFlag()I

    move-result v3

    and-int/lit8 v4, v3, 0x1

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    sget v3, Lj/c/b/g;->c:I

    :goto_1
    invoke-static {p0, v3}, Lcom/garena/pay/android/j/d;->b(Landroid/app/Activity;I)Ljava/lang/String;

    move-result-object v3

    :goto_2
    move-object v7, v3

    goto :goto_3

    :cond_1
    and-int/lit8 v4, v3, 0x2

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    sget v3, Lj/c/b/g;->b:I

    goto :goto_1

    :cond_2
    and-int/lit8 v3, v3, 0x4

    const/4 v4, 0x4

    if-ne v3, v4, :cond_3

    sget v3, Lj/c/b/g;->d:I

    goto :goto_1

    :cond_3
    const-string v3, ""

    goto :goto_2

    :goto_3
    invoke-virtual {v1, p0}, Lcom/garena/pay/android/e;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lcom/garena/pay/android/j/d;->d(Ljava/lang/String;)Z

    move-result v2

    sget-object v3, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lcom/garena/pay/android/e;->j()Ljava/lang/String;

    move-result-object v5

    sget v1, Lj/c/b/g;->g:I

    invoke-static {p0, v1}, Lcom/garena/pay/android/j/d;->b(Landroid/app/Activity;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v3 .. v8}, Lcom/garena/pay/android/k/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/garena/pay/android/e;->k()I

    move-result v5

    sget v1, Lj/c/b/g;->g:I

    invoke-static {p0, v1}, Lcom/garena/pay/android/j/d;->b(Landroid/app/Activity;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v3 .. v8}, Lcom/garena/pay/android/k/c;->d(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    sget-object p0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    new-instance v0, Lcom/garena/pay/android/k/h$a;

    invoke-direct {v0, p1}, Lcom/garena/pay/android/k/h$a;-><init>(Ljava/util/HashMap;)V

    invoke-virtual {p0, v0}, Lcom/garena/pay/android/k/c;->i(Lcom/garena/pay/android/k/c$b;)V

    return-void
.end method

.method public static c(Lcom/garena/pay/android/k/h$b;)V
    .locals 0

    sput-object p0, Lcom/garena/pay/android/k/h;->a:Lcom/garena/pay/android/k/h$b;

    return-void
.end method

.method public static d(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/k/c;->j(I)V

    sget-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0}, Lcom/garena/pay/android/k/c;->f()V

    sget-object v0, Lcom/garena/pay/android/k/h;->b:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0, p0}, Lcom/garena/pay/android/k/c;->l(Landroid/view/View;)V

    return-void
.end method
