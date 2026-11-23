.class Lcom/google/android/vending/licensing/e$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/vending/licensing/e$a;-><init>(Lcom/google/android/vending/licensing/e;Lcom/google/android/vending/licensing/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/vending/licensing/e$a;


# direct methods
.method constructor <init>(Lcom/google/android/vending/licensing/e$a;Lcom/google/android/vending/licensing/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/vending/licensing/e$a$a;->a:Lcom/google/android/vending/licensing/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "LicenseChecker"

    const-string v1, "Check timed out."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/vending/licensing/e$a$a;->a:Lcom/google/android/vending/licensing/e$a;

    iget-object v1, v0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-static {v0}, Lcom/google/android/vending/licensing/e$a;->j(Lcom/google/android/vending/licensing/e$a;)Lcom/google/android/vending/licensing/g;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/vending/licensing/e;->a(Lcom/google/android/vending/licensing/e;Lcom/google/android/vending/licensing/g;)V

    iget-object v0, p0, Lcom/google/android/vending/licensing/e$a$a;->a:Lcom/google/android/vending/licensing/e$a;

    iget-object v1, v0, Lcom/google/android/vending/licensing/e$a;->c:Lcom/google/android/vending/licensing/e;

    invoke-static {v0}, Lcom/google/android/vending/licensing/e$a;->j(Lcom/google/android/vending/licensing/e$a;)Lcom/google/android/vending/licensing/g;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/vending/licensing/e;->b(Lcom/google/android/vending/licensing/e;Lcom/google/android/vending/licensing/g;)V

    return-void
.end method
