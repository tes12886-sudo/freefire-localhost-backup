.class public final Lcom/android/billingclient/api/m0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lcom/android/billingclient/api/h;


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/android/billingclient/api/m0;->a:Ljava/util/List;

    iput-object p1, p0, Lcom/android/billingclient/api/m0;->b:Lcom/android/billingclient/api/h;

    return-void
.end method


# virtual methods
.method public final a()Lcom/android/billingclient/api/h;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/m0;->b:Lcom/android/billingclient/api/h;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/m0;->a:Ljava/util/List;

    return-object v0
.end method
