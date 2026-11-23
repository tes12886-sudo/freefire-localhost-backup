.class Lcom/facebook/login/d$a;
.super Landroid/app/Dialog;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/d;->P1(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/d;


# direct methods
.method constructor <init>(Lcom/facebook/login/d;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d$a;->a:Lcom/facebook/login/d;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/d$a;->a:Lcom/facebook/login/d;

    invoke-virtual {v0}, Lcom/facebook/login/d;->n2()V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method
