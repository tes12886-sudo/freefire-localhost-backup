.class public Lcom/facebook/m0/b;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private h0:Lcom/facebook/m0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public L0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->L0()V

    iget-object v0, p0, Lcom/facebook/m0/b;->h0:Lcom/facebook/m0/a;

    invoke-virtual {v0}, Lcom/facebook/m0/a;->g()V

    return-void
.end method

.method public l0(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->l0(IILandroid/content/Intent;)V

    iget-object v0, p0, Lcom/facebook/m0/b;->h0:Lcom/facebook/m0/a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/m0/a;->f(IILandroid/content/Intent;)V

    return-void
.end method

.method public q0(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->q0(Landroid/os/Bundle;)V

    new-instance p1, Lcom/facebook/m0/a;

    invoke-direct {p1, p0}, Lcom/facebook/m0/a;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object p1, p0, Lcom/facebook/m0/b;->h0:Lcom/facebook/m0/a;

    return-void
.end method
