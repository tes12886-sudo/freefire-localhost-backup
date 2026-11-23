.class public Lcom/garena/pay/android/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Lcom/garena/pay/android/data/GGPayment;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/garena/pay/android/data/GGPayment$Denomination;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/garena/pay/android/data/GGPayment$Denomination;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/garena/pay/android/d;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/garena/pay/android/d;->d:Lcom/garena/pay/android/data/GGPayment$Denomination;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/garena/pay/android/data/GGPayment$Denomination;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/d;->d:Lcom/garena/pay/android/data/GGPayment$Denomination;

    return-object v0
.end method

.method public c()Lcom/garena/pay/android/data/GGPayment;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/d;->a:Lcom/garena/pay/android/data/GGPayment;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/garena/pay/android/data/GGPayment$Denomination;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/garena/pay/android/d;->c:Ljava/util/List;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/garena/pay/android/d;->e:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/d;->a:Lcom/garena/pay/android/data/GGPayment;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/garena/pay/android/data/GGPayment;->getVirtualCurrencyName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/d;->b:Ljava/lang/String;

    return-void
.end method

.method public h(Lcom/garena/pay/android/data/GGPayment$Denomination;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/d;->d:Lcom/garena/pay/android/data/GGPayment$Denomination;

    return-void
.end method

.method public i(Lcom/garena/pay/android/data/GGPayment;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/d;->a:Lcom/garena/pay/android/data/GGPayment;

    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/garena/pay/android/data/GGPayment$Denomination;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/pay/android/d;->c:Ljava/util/List;

    return-void
.end method

.method public k(I)V
    .locals 0

    iput p1, p0, Lcom/garena/pay/android/d;->e:I

    return-void
.end method
