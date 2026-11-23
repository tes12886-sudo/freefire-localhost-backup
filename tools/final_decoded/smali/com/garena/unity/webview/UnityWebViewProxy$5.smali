.class Lcom/garena/unity/webview/UnityWebViewProxy$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/unity/webview/UnityWebViewProxy;->open(Ljava/lang/String;FFFFLjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

.field final synthetic val$height:F

.field final synthetic val$parameters:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;

.field final synthetic val$webViewId:I

.field final synthetic val$width:F

.field final synthetic val$x:F

.field final synthetic val$y:F


# direct methods
.method constructor <init>(Lcom/garena/unity/webview/UnityWebViewProxy;ILjava/lang/String;FFFFLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iput p2, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    iput-object p3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$parameters:Ljava/lang/String;

    iput p4, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$x:F

    iput p5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$y:F

    iput p6, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$width:F

    iput p7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$height:F

    iput-object p8, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v1, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-virtual {v0, v1}, Lcom/garena/unity/webview/UnityWebViewProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/garena/unity/webview/WebViewStatus;

    invoke-direct {v0}, Lcom/garena/unity/webview/WebViewStatus;-><init>()V

    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v1}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$300(Lcom/garena/unity/webview/UnityWebViewProxy;)Ljava/util/HashMap;

    move-result-object v1

    iget v2, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v2, v3, :cond_1

    sget-boolean v3, Lcom/garena/unity/webview/UnityWebViewProxy;->WebContentDebugging:Z

    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    :cond_1
    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v3}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$200(Lcom/garena/unity/webview/UnityWebViewProxy;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v3}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$100(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$702(Lcom/garena/unity/webview/UnityWebViewProxy;Landroid/view/View;)Landroid/view/View;

    :cond_2
    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$parameters:Ljava/lang/String;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v3}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$800(Lcom/garena/unity/webview/UnityWebViewProxy;)Lj/d/d/e;

    move-result-object v3

    iget-object v4, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$parameters:Ljava/lang/String;

    const-class v5, Lcom/garena/unity/webview/WebViewParameters;

    invoke-virtual {v3, v4, v5}, Lj/d/d/e;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/garena/unity/webview/WebViewParameters;

    goto :goto_0

    :cond_3
    new-instance v3, Lcom/garena/unity/webview/WebViewParameters;

    invoke-direct {v3}, Lcom/garena/unity/webview/WebViewParameters;-><init>()V

    :goto_0
    iget-boolean v4, v3, Lcom/garena/unity/webview/WebViewParameters;->ExtraLog:Z

    iput-boolean v4, v0, Lcom/garena/unity/webview/WebViewStatus;->ExtraLog:Z

    iget-object v4, v3, Lcom/garena/unity/webview/WebViewParameters;->UnitySendMessageGameObjectName:Ljava/lang/String;

    iput-object v4, v0, Lcom/garena/unity/webview/WebViewStatus;->UnitySendMessageGameObjectName:Ljava/lang/String;

    new-instance v4, Landroid/webkit/WebView;

    iget-object v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v5}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$100(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/app/Activity;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v5}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$200(Lcom/garena/unity/webview/UnityWebViewProxy;)Ljava/util/HashMap;

    move-result-object v5

    iget v6, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v5, v3, Lcom/garena/unity/webview/WebViewParameters;->HardwareAcceleration:Z

    const/4 v6, 0x1

    if-nez v5, :cond_4

    const/4 v5, 0x0

    invoke-virtual {v4, v6, v5}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_4
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v5, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x53

    iput v7, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v7}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$000(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/widget/FrameLayout;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v7

    int-to-float v7, v7

    iget-object v8, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v8}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$000(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/widget/FrameLayout;

    move-result-object v8

    invoke-virtual {v8}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v8

    int-to-float v8, v8

    iget v9, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$x:F

    mul-float v9, v9, v7

    float-to-int v9, v9

    iput v9, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v9, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$y:F

    mul-float v9, v9, v8

    float-to-int v9, v9

    iput v9, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    iget v9, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$width:F

    mul-float v9, v9, v7

    float-to-int v7, v9

    iput v7, v5, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget v7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$height:F

    mul-float v7, v7, v8

    float-to-int v7, v7

    iput v7, v5, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object v7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v7}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$000(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/widget/FrameLayout;

    move-result-object v7

    invoke-virtual {v7, v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "@open(): DeferredDisplay: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v9, v3, Lcom/garena/unity/webview/WebViewParameters;->DeferredDisplay:Z

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lcom/garena/unity/webview/UnityWebViewProxy;->LogExtra(ILjava/lang/String;)V

    iget-boolean v5, v3, Lcom/garena/unity/webview/WebViewParameters;->DeferredDisplay:Z

    if-eqz v5, :cond_5

    iput-boolean v6, v0, Lcom/garena/unity/webview/WebViewStatus;->DeferredDisplay:Z

    iput-boolean v6, v0, Lcom/garena/unity/webview/WebViewStatus;->DeferringDisplay:Z

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setVisibility(I)V

    goto :goto_1

    :cond_5
    iget-object v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    invoke-static {v5}, Lcom/garena/unity/webview/UnityWebViewProxy;->access$000(Lcom/garena/unity/webview/UnityWebViewProxy;)Landroid/widget/FrameLayout;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    invoke-virtual {v4, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->requestFocus()Z

    :goto_1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v5

    iget-boolean v7, v3, Lcom/garena/unity/webview/WebViewParameters;->UseCookie:Z

    invoke-virtual {v5, v7}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    const/16 v5, 0x15

    if-lt v2, v5, :cond_6

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v7

    iget-boolean v8, v3, Lcom/garena/unity/webview/WebViewParameters;->UseCookie:Z

    invoke-virtual {v7, v4, v8}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    :cond_6
    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    iget-boolean v8, v3, Lcom/garena/unity/webview/WebViewParameters;->Scaling:Z

    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    iget-boolean v8, v3, Lcom/garena/unity/webview/WebViewParameters;->Scaling:Z

    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    const/16 v8, 0x64

    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const/16 v7, 0x11

    if-lt v2, v7, :cond_8

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v7

    iget-boolean v3, v3, Lcom/garena/unity/webview/WebViewParameters;->AutoPlayMedia:Z

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v7, v6}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    :cond_8
    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->getNameInJavaScript()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_9

    new-instance v6, Lcom/garena/unity/webview/UnityWebViewProxy$_WebViewJavaScriptHandler;

    iget-object v7, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v8, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-direct {v6, v7, v8}, Lcom/garena/unity/webview/UnityWebViewProxy$_WebViewJavaScriptHandler;-><init>(Lcom/garena/unity/webview/UnityWebViewProxy;I)V

    invoke-virtual {v4, v6, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    invoke-virtual {v4, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    if-lt v2, v5, :cond_a

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_a
    const-string v2, "FORCE_DARK"

    invoke-static {v2}, Lh/u/b;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-static {v2, v1}, Lh/u/a;->b(Landroid/webkit/WebSettings;I)V

    :cond_b
    new-instance v2, Lcom/garena/unity/webview/UnityWebViewProxy$_UnityWebViewClient;

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-direct {v2, v3, v5}, Lcom/garena/unity/webview/UnityWebViewProxy$_UnityWebViewClient;-><init>(Lcom/garena/unity/webview/UnityWebViewProxy;I)V

    invoke-virtual {v4, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v2, Lcom/garena/unity/webview/UnityWebViewProxy$_UnityWebChromeClient;

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v5, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    invoke-direct {v2, v3, v5}, Lcom/garena/unity/webview/UnityWebViewProxy$_UnityWebChromeClient;-><init>(Lcom/garena/unity/webview/UnityWebViewProxy;I)V

    iput-object v2, v0, Lcom/garena/unity/webview/WebViewStatus;->WebChromeClient:Lcom/garena/unity/webview/UnityWebChromeClient;

    invoke-virtual {v4, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v2, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$url:Ljava/lang/String;

    invoke-virtual {v4, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/webkit/WebView;->onResume()V

    invoke-virtual {v4}, Landroid/webkit/WebView;->resumeTimers()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->this$0:Lcom/garena/unity/webview/UnityWebViewProxy;

    iget v4, p0, Lcom/garena/unity/webview/UnityWebViewProxy$5;->val$webViewId:I

    const-string v5, "@_open()"

    invoke-virtual {v3, v4, v5, v2}, Lcom/garena/unity/webview/UnityWebViewProxy;->Log(ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    iput-boolean v1, v0, Lcom/garena/unity/webview/WebViewStatus;->Opening:Z

    return-void
.end method
