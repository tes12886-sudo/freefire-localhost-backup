.class final Lcom/facebook/internal/i$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/activity/result/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/i;->m(Landroidx/activity/result/d;Lcom/facebook/j;Landroid/content/Intent;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/activity/result/b;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j;

.field final synthetic b:I

.field final synthetic c:Ll/y/c/l;


# direct methods
.method constructor <init>(Lcom/facebook/j;ILl/y/c/l;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/i$c;->a:Lcom/facebook/j;

    iput p2, p0, Lcom/facebook/internal/i$c;->b:I

    iput-object p3, p0, Lcom/facebook/internal/i$c;->c:Ll/y/c/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/util/Pair;

    invoke-virtual {p0, p1}, Lcom/facebook/internal/i$c;->b(Landroid/util/Pair;)V

    return-void
.end method

.method public final b(Landroid/util/Pair;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/internal/i$c;->a:Lcom/facebook/j;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/internal/e;

    invoke-direct {v0}, Lcom/facebook/internal/e;-><init>()V

    :cond_0
    iget v1, p0, Lcom/facebook/internal/i$c;->b:I

    iget-object v2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v3, "result.first"

    invoke-static {v2, v3}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/j;->a(IILandroid/content/Intent;)Z

    iget-object p1, p0, Lcom/facebook/internal/i$c;->c:Ll/y/c/l;

    iget-object p1, p1, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast p1, Landroidx/activity/result/c;

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Landroidx/activity/result/c;->c()V

    iget-object v0, p0, Lcom/facebook/internal/i$c;->c:Ll/y/c/l;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
