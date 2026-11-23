.class final Lcom/android/billingclient/api/y0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/android/billingclient/api/x0;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/y0;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/x0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2, p2}, Lcom/android/billingclient/api/x0;-><init>(Lcom/android/billingclient/api/y0;Lcom/android/billingclient/api/l0;Lcom/android/billingclient/api/w0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/m;Lcom/android/billingclient/api/t0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/y0;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/x0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, p3, v0}, Lcom/android/billingclient/api/x0;-><init>(Lcom/android/billingclient/api/y0;Lcom/android/billingclient/api/m;Lcom/android/billingclient/api/t0;Lcom/android/billingclient/api/w0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    return-void
.end method

.method static bridge synthetic a(Lcom/android/billingclient/api/y0;)Lcom/android/billingclient/api/x0;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    return-object p0
.end method


# virtual methods
.method final b()Lcom/android/billingclient/api/l0;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    invoke-static {v0}, Lcom/android/billingclient/api/x0;->a(Lcom/android/billingclient/api/x0;)Lcom/android/billingclient/api/l0;

    const/4 v0, 0x0

    return-object v0
.end method

.method final c()Lcom/android/billingclient/api/m;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    invoke-static {v0}, Lcom/android/billingclient/api/x0;->b(Lcom/android/billingclient/api/x0;)Lcom/android/billingclient/api/m;

    move-result-object v0

    return-object v0
.end method

.method final d()V
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/android/billingclient/api/y0;->b:Lcom/android/billingclient/api/x0;

    iget-object v2, p0, Lcom/android/billingclient/api/y0;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/android/billingclient/api/x0;->c(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method
