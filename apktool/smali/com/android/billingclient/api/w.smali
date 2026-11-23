.class final Lcom/android/billingclient/api/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/android/billingclient/api/l;

.field final synthetic c:Lcom/android/billingclient/api/e;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Lcom/android/billingclient/api/l;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/w;->c:Lcom/android/billingclient/api/e;

    iput-object p2, p0, Lcom/android/billingclient/api/w;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/w;->b:Lcom/android/billingclient/api/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/w;->c:Lcom/android/billingclient/api/e;

    iget-object v1, p0, Lcom/android/billingclient/api/w;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/e;->B(Lcom/android/billingclient/api/e;Ljava/lang/String;)Lcom/android/billingclient/api/m0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/m0;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/w;->b:Lcom/android/billingclient/api/l;

    invoke-virtual {v0}, Lcom/android/billingclient/api/m0;->a()Lcom/android/billingclient/api/h;

    move-result-object v2

    invoke-virtual {v0}, Lcom/android/billingclient/api/m0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/android/billingclient/api/l;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/android/billingclient/api/w;->b:Lcom/android/billingclient/api/l;

    invoke-virtual {v0}, Lcom/android/billingclient/api/m0;->a()Lcom/android/billingclient/api/h;

    move-result-object v0

    invoke-static {}, Lj/d/a/c/f/h/b0;->t()Lj/d/a/c/f/h/b0;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/android/billingclient/api/l;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
