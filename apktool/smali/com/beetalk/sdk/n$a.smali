.class Lcom/beetalk/sdk/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/n;->g(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/n;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/n;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/n$a;->a:Lcom/beetalk/sdk/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object p1, p0, Lcom/beetalk/sdk/n$a;->a:Lcom/beetalk/sdk/n;

    iget-object p1, p1, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method
