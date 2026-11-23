.class public Lcom/beetalk/sdk/plugin/e/i/b;
.super Landroid/app/DialogFragment;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/plugin/e/i/d$f;


# instance fields
.field private a:Lcom/beetalk/sdk/plugin/e/i/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/c;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/i/d;-><init>(Lcom/beetalk/sdk/plugin/e/i/d$f;)V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object v1, p1, Lcom/beetalk/sdk/plugin/e/i/c;->c:[Lcom/vk/sdk/k/l/b;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->q([Lcom/vk/sdk/k/l/b;)V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object v1, p1, Lcom/beetalk/sdk/plugin/e/i/c;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->u(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/beetalk/sdk/plugin/e/i/c;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lcom/beetalk/sdk/plugin/e/i/c;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-virtual {v2, v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->r(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object v1, p1, Lcom/beetalk/sdk/plugin/e/i/c;->d:Lcom/vk/sdk/k/k/t;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->v(Lcom/vk/sdk/k/k/t;)V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/i/c;->f:Lcom/beetalk/sdk/plugin/e/i/c$a;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->t(Lcom/beetalk/sdk/plugin/e/i/c$a;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/DialogFragment;->dismiss()V

    :cond_0
    return-void
.end method

.method public dismissAllowingStateLoss()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    :cond_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->m(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->n(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/DialogFragment;->onPause()V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->m(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-virtual {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->o()V

    return-void
.end method
