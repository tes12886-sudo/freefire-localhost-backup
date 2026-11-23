.class Lcom/beetalk/sdk/n$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/n;->g(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/b$e;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/beetalk/sdk/n;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/n;Landroid/app/Dialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/n$b;->b:Lcom/beetalk/sdk/n;

    iput-object p2, p0, Lcom/beetalk/sdk/n$b;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/n$b;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/b$e;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/beetalk/sdk/n$b;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    iget-object v0, p0, Lcom/beetalk/sdk/n$b;->b:Lcom/beetalk/sdk/n;

    iget-object v0, v0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {p1}, Li/i;->s()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "error"

    invoke-static {v1, v3, p1, v2}, Lcom/beetalk/sdk/b$e;->b(Lcom/beetalk/sdk/b$c;Ljava/lang/String;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/n$b;->b:Lcom/beetalk/sdk/n;

    iget-object v0, v0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/b$e;

    :goto_1
    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    const/4 p1, 0x0

    return-object p1
.end method
