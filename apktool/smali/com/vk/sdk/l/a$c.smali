.class Lcom/vk/sdk/l/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/l/a;->h(Landroid/content/Context;Landroid/content/DialogInterface$OnDismissListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/l/a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/l/a;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/l/a$c;->a:Lcom/vk/sdk/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p2, p0, Lcom/vk/sdk/l/a$c;->a:Lcom/vk/sdk/l/a;

    invoke-static {p2}, Lcom/vk/sdk/l/a;->a(Lcom/vk/sdk/l/a;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
