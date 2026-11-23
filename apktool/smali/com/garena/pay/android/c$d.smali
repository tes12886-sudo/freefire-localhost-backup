.class Lcom/garena/pay/android/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/garena/pay/android/k/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/c;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/c;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/c;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "User Dismissed the Dialog Box. Therefore invoking failed to pay"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    sget-object v1, Lcom/garena/pay/android/b;->T:Lcom/garena/pay/android/b;

    invoke-static {v0, v1}, Lcom/garena/pay/android/c;->b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method public b(Lcom/garena/pay/android/e;)V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    sget-object v1, Lcom/garena/pay/android/c$h;->d:Lcom/garena/pay/android/c$h;

    invoke-static {v0, v1}, Lcom/garena/pay/android/c;->i(Lcom/garena/pay/android/c;Lcom/garena/pay/android/c$h;)Lcom/garena/pay/android/c$h;

    iget-object v0, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    invoke-static {v0, p1}, Lcom/garena/pay/android/c;->k(Lcom/garena/pay/android/c;Lcom/garena/pay/android/e;)Lcom/garena/pay/android/e;

    iget-object p1, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    invoke-static {p1}, Lcom/garena/pay/android/c;->c(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/d;

    move-result-object p1

    iget-object v0, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    invoke-static {v0}, Lcom/garena/pay/android/c;->j(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/garena/pay/android/e;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/garena/pay/android/d;->j(Ljava/util/List;)V

    iget-object p1, p0, Lcom/garena/pay/android/c$d;->a:Lcom/garena/pay/android/c;

    invoke-static {p1}, Lcom/garena/pay/android/c;->g(Lcom/garena/pay/android/c;)V

    return-void
.end method
