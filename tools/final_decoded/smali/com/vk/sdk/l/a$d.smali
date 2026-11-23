.class Lcom/vk/sdk/l/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/l/a;->h(Landroid/content/Context;Landroid/content/DialogInterface$OnDismissListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/vk/sdk/l/a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/l/a;Landroid/app/AlertDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/l/a$d;->b:Lcom/vk/sdk/l/a;

    iput-object p2, p0, Lcom/vk/sdk/l/a$d;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/l/a$d;->a:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    iget-object p1, p0, Lcom/vk/sdk/l/a$d;->b:Lcom/vk/sdk/l/a;

    invoke-static {p1}, Lcom/vk/sdk/l/a;->b(Lcom/vk/sdk/l/a;)Lcom/vk/sdk/k/c;

    move-result-object p1

    iget-object p1, p1, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    invoke-virtual {p1}, Lcom/vk/sdk/k/f;->m()V

    return-void
.end method
