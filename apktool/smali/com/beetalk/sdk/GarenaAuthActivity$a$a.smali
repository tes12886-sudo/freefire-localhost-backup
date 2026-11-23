.class Lcom/beetalk/sdk/GarenaAuthActivity$a$a;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beetalk/sdk/GarenaAuthActivity$a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/GarenaAuthActivity$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;->b:Lcom/beetalk/sdk/GarenaAuthActivity$a;

    iput-object p2, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;->b:Lcom/beetalk/sdk/GarenaAuthActivity$a;

    iget-object v0, v0, Lcom/beetalk/sdk/GarenaAuthActivity$a;->a:Lcom/beetalk/sdk/GarenaAuthActivity;

    iget-object v1, p0, Lcom/beetalk/sdk/GarenaAuthActivity$a$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/GarenaAuthActivity;->d(Lcom/beetalk/sdk/GarenaAuthActivity;Ljava/lang/String;)V

    return-void
.end method
