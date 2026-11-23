.class final Lcom/facebook/j0/r/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/j0/r/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/r/b;->m(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/t;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/internal/t;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/r/b$b;->a:Lcom/facebook/internal/t;

    iput-object p2, p0, Lcom/facebook/j0/r/b$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/j0/r/b$b;->a:Lcom/facebook/internal/t;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/internal/t;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/facebook/r;->m()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v1, 0x0

    :cond_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/facebook/j0/r/b$b;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/j0/r/b;->e(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
