.class Lcom/google/android/vending/licensing/e$a;
.super Lcom/google/android/vending/licensing/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/vending/licensing/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/vending/licensing/g;

.field private b:Ljava/lang/Runnable;

.field final synthetic c:Lcom/google/android/vending/licensing/e;


# direct methods
.method public constructor <init>(Lcom/google/android/vending/licensing/e;Lcom/google/android/vending/licensing/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-direct {p0}, Lcom/google/android/vending/licensing/d$a;-><init>()V

    iput-object p2, p0, Lcom/google/android/vending/licensing/e$a;->a:Lcom/google/android/vending/licensing/g;

    new-instance p2, Lcom/google/android/vending/licensing/e$a$a;

    invoke-direct {p2, p0, p1}, Lcom/google/android/vending/licensing/e$a$a;-><init>(Lcom/google/android/vending/licensing/e$a;Lcom/google/android/vending/licensing/e;)V

    iput-object p2, p0, Lcom/google/android/vending/licensing/e$a;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/google/android/vending/licensing/e$a;->c1()V

    return-void
.end method

.method private c1()V
    .locals 4

    const-string v0, "LicenseChecker"

    const-string v1, "Start monitoring timeout."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-static {v0}, Lcom/google/android/vending/licensing/e;->e(Lcom/google/android/vending/licensing/e;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/vending/licensing/e$a;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic j(Lcom/google/android/vending/licensing/e$a;)Lcom/google/android/vending/licensing/g;
    .locals 0

    iget-object p0, p0, Lcom/google/android/vending/licensing/e$a;->a:Lcom/google/android/vending/licensing/g;

    return-object p0
.end method

.method static synthetic m(Lcom/google/android/vending/licensing/e$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/vending/licensing/e$a;->o()V

    return-void
.end method

.method private o()V
    .locals 2

    const-string v0, "LicenseChecker"

    const-string v1, "Clearing timeout."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-static {v0}, Lcom/google/android/vending/licensing/e;->e(Lcom/google/android/vending/licensing/e;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/vending/licensing/e$a;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public P0(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-static {v0}, Lcom/google/android/vending/licensing/e;->e(Lcom/google/android/vending/licensing/e;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/vending/licensing/e$a$b;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/vending/licensing/e$a$b;-><init>(Lcom/google/android/vending/licensing/e$a;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
