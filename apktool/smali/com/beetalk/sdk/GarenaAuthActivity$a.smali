.class Lcom/beetalk/sdk/GarenaAuthActivity$a;
.super Landroid/webkit/WebViewClient;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/GarenaAuthActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/GarenaAuthActivity;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/GarenaAuthActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    invoke-static {p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->a(Lcom/beetalk/sdk/GarenaAuthActivity;)Lcom/beetalk/sdk/b$c;

    move-result-object p1

    sget-object p2, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object p2, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    invoke-static {p2, p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->b(Lcom/beetalk/sdk/GarenaAuthActivity;Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/p;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    invoke-static {v0}, Lcom/beetalk/sdk/GarenaAuthActivity;->c(Lcom/beetalk/sdk/GarenaAuthActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const-string p1, "code="

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    add-int/lit8 p1, p1, 0x5

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    aput-object p1, v1, v0

    const-string p2, "web code 1%s %s"

    invoke-static {p2, v1}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/beetalk/sdk/z/a;->a()Lcom/beetalk/sdk/z/a;

    move-result-object p2

    new-instance v1, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity$a;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lcom/beetalk/sdk/z/a;->b(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    const-string p1, "error="

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-ne p1, v1, :cond_3

    invoke-static {}, Lcom/beetalk/sdk/z/a;->a()Lcom/beetalk/sdk/z/a;

    move-result-object p1

    new-instance p2, Lcom/beetalk/sdk/GarenaAuthActivity$a$b;

    invoke-direct {p2, p0}, Lcom/beetalk/sdk/GarenaAuthActivity$a$b;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity$a;)V

    invoke-virtual {p1, p2}, Lcom/beetalk/sdk/z/a;->b(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_3
    add-int/lit8 p1, p1, 0x6

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "access_denied"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    invoke-static {p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->f(Lcom/beetalk/sdk/GarenaAuthActivity;)V

    :cond_4
    :goto_1
    return v0
.end method
