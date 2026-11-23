.class Lcom/vk/sdk/l/b$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/l/b$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/l/b$b;


# direct methods
.method constructor <init>(Lcom/vk/sdk/l/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/l/b$b$a;->a:Lcom/vk/sdk/l/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/l/b$b$a;->a:Lcom/vk/sdk/l/b$b;

    iget-object p1, p1, Lcom/vk/sdk/l/b$b;->b:Lcom/vk/sdk/l/b;

    invoke-static {p1}, Lcom/vk/sdk/l/b;->b(Lcom/vk/sdk/l/b;)V

    return-void
.end method
