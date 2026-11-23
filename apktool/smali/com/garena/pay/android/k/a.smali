.class public Lcom/garena/pay/android/k/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/pay/android/k/a$b;
    }
.end annotation


# static fields
.field public static a:Lcom/garena/pay/android/k/a$b;

.field private static b:Lcom/garena/pay/android/k/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Z)V
    .locals 1

    sget-object v0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/garena/pay/android/k/c;->g(Z)V

    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/garena/pay/android/data/GGPayment$Denomination;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/garena/pay/android/k/c;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/k/c;-><init>(Landroid/app/Activity;)V

    sput-object v0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    sget v1, Lj/c/b/g;->e:I

    invoke-static {p0, v1}, Lcom/garena/pay/android/j/d;->b(Landroid/app/Activity;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/garena/pay/android/k/c;->k(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/garena/pay/android/data/GGPayment$Denomination;

    new-instance v3, Lcom/garena/pay/android/k/d;

    invoke-direct {v3}, Lcom/garena/pay/android/k/d;-><init>()V

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lcom/garena/pay/android/k/e;->c:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getName()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lcom/garena/pay/android/k/e;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v3, Lcom/garena/pay/android/k/e;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getPrice()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lcom/garena/pay/android/k/e;->d:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->isInPromotion()Z

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getPromoPoints()I

    move-result v5

    if-lez v5, :cond_0

    sget v5, Lj/c/b/g;->h:I

    new-array v6, v2, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, ""

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getPromoPoints()I

    move-result v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v4

    invoke-virtual {p0, v5, v6}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lcom/garena/pay/android/k/e;->f:Ljava/lang/String;

    :cond_0
    sget-object v1, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    invoke-virtual {v1, v3}, Lcom/garena/pay/android/k/c;->c(Lcom/garena/pay/android/k/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    new-instance p2, Lcom/garena/pay/android/k/a$a;

    invoke-direct {p2, p1}, Lcom/garena/pay/android/k/a$a;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p2}, Lcom/garena/pay/android/k/c;->i(Lcom/garena/pay/android/k/c$b;)V

    return-void
.end method

.method public static c(Lcom/garena/pay/android/k/a$b;)V
    .locals 0

    sput-object p0, Lcom/garena/pay/android/k/a;->a:Lcom/garena/pay/android/k/a$b;

    return-void
.end method

.method public static d(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/k/c;->j(I)V

    sget-object v0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0}, Lcom/garena/pay/android/k/c;->f()V

    sget-object v0, Lcom/garena/pay/android/k/a;->b:Lcom/garena/pay/android/k/c;

    invoke-virtual {v0, p0}, Lcom/garena/pay/android/k/c;->l(Landroid/view/View;)V

    return-void
.end method
