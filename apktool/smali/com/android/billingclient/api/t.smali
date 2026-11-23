.class public final synthetic Lcom/android/billingclient/api/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/l;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/t;->a:Lcom/android/billingclient/api/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/t;->a:Lcom/android/billingclient/api/l;

    sget-object v1, Lcom/android/billingclient/api/i0;->m:Lcom/android/billingclient/api/h;

    invoke-static {}, Lj/d/a/c/f/h/b0;->t()Lj/d/a/c/f/h/b0;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/l;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void
.end method
