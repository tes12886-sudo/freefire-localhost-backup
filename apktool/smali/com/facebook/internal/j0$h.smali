.class final Lcom/facebook/internal/j0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/j0;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/j0;


# direct methods
.method constructor <init>(Lcom/facebook/internal/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/j0$h;->a:Lcom/facebook/internal/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/internal/j0$h;->a:Lcom/facebook/internal/j0;

    invoke-virtual {p1}, Lcom/facebook/internal/j0;->cancel()V

    return-void
.end method
