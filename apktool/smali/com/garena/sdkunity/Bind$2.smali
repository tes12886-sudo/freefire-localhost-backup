.class Lcom/garena/sdkunity/Bind$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/z/e$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/sdkunity/Bind;->getPlatformBindingInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/garena/sdkunity/Bind;


# direct methods
.method constructor <init>(Lcom/garena/sdkunity/Bind;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/sdkunity/Bind$2;->this$0:Lcom/garena/sdkunity/Bind;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lorg/json/JSONObject;)V
    .locals 2

    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v0

    const-string v1, "OnGetPlatformBindingInfoComplete"

    invoke-virtual {v0, v1, p1}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
