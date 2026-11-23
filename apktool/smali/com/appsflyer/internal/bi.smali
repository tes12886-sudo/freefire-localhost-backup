.class public final Lcom/appsflyer/internal/bi;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBody:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final AFInAppEventParameterName:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final AFInAppEventType:Lcom/appsflyer/internal/bj;

.field final AFKeystoreWrapper:Lcom/appsflyer/internal/bn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/bn<",
            "TResponseBody;>;"
        }
    .end annotation
.end field

.field final valueOf:Lcom/appsflyer/internal/v;

.field public final values:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/v;Ljava/util/concurrent/ExecutorService;Lcom/appsflyer/internal/bj;Lcom/appsflyer/internal/bn;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/v;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/appsflyer/internal/bj;",
            "Lcom/appsflyer/internal/bn<",
            "TResponseBody;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/appsflyer/internal/bi;->AFInAppEventParameterName:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/appsflyer/internal/bi;->valueOf:Lcom/appsflyer/internal/v;

    iput-object p2, p0, Lcom/appsflyer/internal/bi;->values:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Lcom/appsflyer/internal/bi;->AFInAppEventType:Lcom/appsflyer/internal/bj;

    iput-object p4, p0, Lcom/appsflyer/internal/bi;->AFKeystoreWrapper:Lcom/appsflyer/internal/bn;

    return-void
.end method
