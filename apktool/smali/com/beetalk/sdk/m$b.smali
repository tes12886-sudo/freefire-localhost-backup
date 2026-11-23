.class Lcom/beetalk/sdk/m$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/z/e$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/m;->j(JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/m;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/m;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/m$b;->a:Lcom/beetalk/sdk/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/m$b;->a:Lcom/beetalk/sdk/m;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/m;->h(Lcom/beetalk/sdk/m;Lorg/json/JSONObject;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget v0, p1, Lcom/beetalk/sdk/b$e;->c:I

    sget-object v1, Lcom/garena/pay/android/b;->g0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/garena/pay/android/j/c;->a()Lcom/garena/pay/android/j/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/m$b$a;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/m$b$a;-><init>(Lcom/beetalk/sdk/m$b;)V

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/j/c;->b(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/m$b;->a:Lcom/beetalk/sdk/m;

    iget-object v0, v0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method
