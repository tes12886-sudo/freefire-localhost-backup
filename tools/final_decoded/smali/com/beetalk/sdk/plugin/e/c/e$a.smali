.class Lcom/beetalk/sdk/plugin/e/c/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/c/e;->j(Landroid/app/Activity;Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/u/c;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/c/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/c/e;Lcom/beetalk/sdk/u/c;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->c:Lcom/beetalk/sdk/plugin/e/c/e;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->a:Lcom/beetalk/sdk/u/c;

    iput-object p3, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/z/i/d;->a()Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->c:Lcom/beetalk/sdk/plugin/e/c/e;

    invoke-virtual {v1, v0}, Lcom/beetalk/sdk/plugin/e/c/a;->i(Lorg/json/JSONObject;)Lcom/garena/pay/android/b;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->a:Lcom/beetalk/sdk/u/c;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v2, Lcom/beetalk/sdk/u/c;->a:I

    sget-object v2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->a:Lcom/beetalk/sdk/u/c;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v1, Lcom/beetalk/sdk/u/c;->a:I

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->a:Lcom/beetalk/sdk/u/c;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/d;->a(Lorg/json/JSONObject;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, v1, Lcom/beetalk/sdk/u/c;->b:Ljava/util/Vector;

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->a:Lcom/beetalk/sdk/u/c;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->b:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/c/e$a;->c:Lcom/beetalk/sdk/plugin/e/c/e;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/c/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/c/e$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
