.class public final Lcom/facebook/internal/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/e$a;,
        Lcom/facebook/internal/e$c;,
        Lcom/facebook/internal/e$b;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/internal/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/facebook/internal/e$b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/internal/e$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/e$b;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/internal/e;->c:Lcom/facebook/internal/e$b;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/internal/e;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/internal/e;->a:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic b()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/facebook/internal/e;->b:Ljava/util/Map;

    return-object v0
.end method

.method public static final declared-synchronized d(ILcom/facebook/internal/e$a;)V
    .locals 2

    const-class v0, Lcom/facebook/internal/e;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/internal/e;->c:Lcom/facebook/internal/e$b;

    invoke-virtual {v1, p0, p1}, Lcom/facebook/internal/e$b;->c(ILcom/facebook/internal/e$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/internal/e;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/e$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2, p3}, Lcom/facebook/internal/e$a;->a(ILandroid/content/Intent;)Z

    move-result p1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/facebook/internal/e;->c:Lcom/facebook/internal/e$b;

    invoke-static {v0, p1, p2, p3}, Lcom/facebook/internal/e$b;->a(Lcom/facebook/internal/e$b;IILandroid/content/Intent;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final c(ILcom/facebook/internal/e$a;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/internal/e;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
