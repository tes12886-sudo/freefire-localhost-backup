.class public Lcom/garena/sdkunity/UnityMessgae;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final instance:Lcom/garena/sdkunity/UnityMessgae;


# instance fields
.field private final SdkUnityObjectName:Ljava/lang/String;

.field private gson:Lj/d/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/garena/sdkunity/UnityMessgae;

    invoke-direct {v0}, Lcom/garena/sdkunity/UnityMessgae;-><init>()V

    sput-object v0, Lcom/garena/sdkunity/UnityMessgae;->instance:Lcom/garena/sdkunity/UnityMessgae;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GarenaMSDK"

    iput-object v0, p0, Lcom/garena/sdkunity/UnityMessgae;->SdkUnityObjectName:Ljava/lang/String;

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    iput-object v0, p0, Lcom/garena/sdkunity/UnityMessgae;->gson:Lj/d/d/e;

    return-void
.end method

.method public static getInstance()Lcom/garena/sdkunity/UnityMessgae;
    .locals 1

    sget-object v0, Lcom/garena/sdkunity/UnityMessgae;->instance:Lcom/garena/sdkunity/UnityMessgae;

    return-object v0
.end method


# virtual methods
.method public sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/garena/sdkunity/UnityMessgae;->gson:Lj/d/d/e;

    invoke-virtual {v0, p2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public sendToUnity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@UnityMessage.sendToUnity(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    const-string v0, "GarenaMSDK"

    invoke-static {v0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public sendToUnity(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
