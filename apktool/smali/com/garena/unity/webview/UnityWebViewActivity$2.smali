.class Lcom/garena/unity/webview/UnityWebViewActivity$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/unity/webview/UnityWebViewActivity;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/garena/unity/webview/UnityWebViewActivity;


# direct methods
.method constructor <init>(Lcom/garena/unity/webview/UnityWebViewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivity$2;->this$0:Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivity$2;->this$0:Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/garena/unity/webview/UnityWebViewActivity;->access$402(Lcom/garena/unity/webview/UnityWebViewActivity;Landroid/graphics/Insets;)Landroid/graphics/Insets;

    invoke-static {}, Lcom/garena/unity/webview/UnityWebViewActivity;->access$500()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onApplyWindowInsets: _SystemBarsWindowInsets: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/garena/unity/webview/UnityWebViewActivity$2;->this$0:Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-static {p2}, Lcom/garena/unity/webview/UnityWebViewActivity;->access$400(Lcom/garena/unity/webview/UnityWebViewActivity;)Landroid/graphics/Insets;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Insets;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "UWVActivity"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivity$2;->this$0:Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivity$2;->this$0:Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-static {p1}, Lcom/garena/unity/webview/UnityWebViewActivity;->access$600(Lcom/garena/unity/webview/UnityWebViewActivity;)V

    :cond_1
    sget-object p1, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    return-object p1
.end method
