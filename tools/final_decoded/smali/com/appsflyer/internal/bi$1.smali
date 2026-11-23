.class public final Lcom/appsflyer/internal/bi$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/bi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFInAppEventType:Lcom/appsflyer/internal/bk;

.field private synthetic values:Lcom/appsflyer/internal/bi;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/bi;Lcom/appsflyer/internal/bk;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/bi$1;->values:Lcom/appsflyer/internal/bi;

    iput-object p2, p0, Lcom/appsflyer/internal/bi$1;->AFInAppEventType:Lcom/appsflyer/internal/bk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/bi$1;->values:Lcom/appsflyer/internal/bi;

    iget-object v1, v0, Lcom/appsflyer/internal/bi;->AFInAppEventType:Lcom/appsflyer/internal/bj;

    iget-object v0, v0, Lcom/appsflyer/internal/bi;->valueOf:Lcom/appsflyer/internal/v;

    invoke-virtual {v1, v0}, Lcom/appsflyer/internal/bj;->valueOf(Lcom/appsflyer/internal/v;)Lcom/appsflyer/internal/bm;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/bi$1;->AFInAppEventType:Lcom/appsflyer/internal/bk;

    new-instance v2, Lcom/appsflyer/internal/bm;

    iget-object v3, p0, Lcom/appsflyer/internal/bi$1;->values:Lcom/appsflyer/internal/bi;

    iget-object v3, v3, Lcom/appsflyer/internal/bi;->AFKeystoreWrapper:Lcom/appsflyer/internal/bn;

    iget-object v4, v0, Lcom/appsflyer/internal/bm;->AFKeystoreWrapper:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3, v4}, Lcom/appsflyer/internal/bn;->AFInAppEventType(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget v4, v0, Lcom/appsflyer/internal/bm;->AFInAppEventParameterName:I

    invoke-virtual {v0}, Lcom/appsflyer/internal/bm;->valueOf()Z

    move-result v0

    invoke-direct {v2, v3, v4, v0}, Lcom/appsflyer/internal/bm;-><init>(Ljava/lang/Object;IZ)V

    invoke-interface {v1, v2}, Lcom/appsflyer/internal/bk;->valueOf(Lcom/appsflyer/internal/bm;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/appsflyer/internal/bi$1;->AFInAppEventType:Lcom/appsflyer/internal/bk;

    invoke-interface {v1, v0}, Lcom/appsflyer/internal/bk;->valueOf(Ljava/lang/Throwable;)V

    return-void
.end method
