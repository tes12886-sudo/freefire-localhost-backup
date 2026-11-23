.class public abstract Lcom/android/billingclient/api/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lcom/android/billingclient/api/d$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/d$a;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/z0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)V
.end method

.method public abstract b(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)V
.end method

.method public abstract c(Ljava/lang/String;)Lcom/android/billingclient/api/h;
.end method

.method public abstract d(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;
.end method

.method public abstract f(Ljava/lang/String;Lcom/android/billingclient/api/l;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract g(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract h(Lcom/android/billingclient/api/f;)V
.end method
