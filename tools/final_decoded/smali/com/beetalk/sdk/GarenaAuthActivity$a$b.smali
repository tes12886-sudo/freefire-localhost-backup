.class Lcom/beetalk/sdk/GarenaAuthActivity$a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/GarenaAuthActivity$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/GarenaAuthActivity$a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/GarenaAuthActivity$a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$b;->a:Lcom/beetalk/sdk/GarenaAuthActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$b;->a:Lcom/beetalk/sdk/GarenaAuthActivity$a;

    iget-object v0, v0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/GarenaAuthActivity;->e(Lcom/beetalk/sdk/GarenaAuthActivity;I)V

    return-void
.end method
