.class Lcom/beetalk/sdk/plugin/e/i/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/d;->n(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/i/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/d;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$a;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$a;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1}, Lcom/beetalk/sdk/plugin/e/i/d;->a(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/d$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/plugin/e/i/d$f;->dismissAllowingStateLoss()V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$a;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$a;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/plugin/e/i/c$a;->c()V

    :cond_0
    return-void
.end method
