.class public final Lcom/beetalk/sdk/x/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/x/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/beetalk/sdk/x/f$b;->b:I

    iput-object p1, p0, Lcom/beetalk/sdk/x/f$b;->a:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/beetalk/sdk/x/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/x/f$b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/beetalk/sdk/x/f;

    iget v1, p0, Lcom/beetalk/sdk/x/f$b;->b:I

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/beetalk/sdk/x/f;-><init>(Landroid/widget/ImageView;ILcom/beetalk/sdk/x/f$a;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt p1, v1, :cond_1

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v3, [Ljava/lang/String;

    iget-object v3, p0, Lcom/beetalk/sdk/x/f$b;->a:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    new-array p1, v3, [Ljava/lang/String;

    iget-object v1, p0, Lcom/beetalk/sdk/x/f$b;->a:Ljava/lang/String;

    aput-object v1, p1, v2

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public b(I)Lcom/beetalk/sdk/x/f$b;
    .locals 0

    iput p1, p0, Lcom/beetalk/sdk/x/f$b;->b:I

    return-object p0
.end method
