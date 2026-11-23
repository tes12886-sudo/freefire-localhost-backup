.class final Lcom/facebook/j0/q/d$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/q/d;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/q/d;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/facebook/j0/q/d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/q/d$b;->a:Lcom/facebook/j0/q/d;

    iput-object p2, p0, Lcom/facebook/j0/q/d$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/j0/q/d$b;->b:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/EditText;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/facebook/j0/q/d$b;->a:Lcom/facebook/j0/q/d;

    invoke-static {v1, v0}, Lcom/facebook/j0/q/d;->b(Lcom/facebook/j0/q/d;Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
