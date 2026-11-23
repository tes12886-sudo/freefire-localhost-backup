.class public Lcom/seagroup/gamesdk/SdkEventBuilder;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final MAX_SIZE:I = 0xc8

.field public static final PLATFORM_ANDROID:I = 0x2

.field public static final PLATFORM_IOS:I = 0x1


# instance fields
.field private final deviceId:Ljava/lang/String;

.field private eventCount:I

.field private final gameAccountId:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;

.field private platform:I

.field private final streamId:Ljava/lang/String;

.field private final streamKey:Ljava/lang/String;

.field private stringBuilder:Ljava/lang/StringBuilder;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->platform:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->eventCount:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->stringBuilder:Ljava/lang/StringBuilder;

    iput-object p1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->packageName:Ljava/lang/String;

    iput-object p2, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->streamId:Ljava/lang/String;

    iput-object p3, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->streamKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->version:Ljava/lang/String;

    iput-object p5, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->gameAccountId:Ljava/lang/String;

    iput-object p6, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->deviceId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public addEvent(Ljava/lang/String;)Z
    .locals 2

    iget v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->eventCount:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->stringBuilder:Ljava/lang/StringBuilder;

    const-string v1, "{\"event_list\":["

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->stringBuilder:Ljava/lang/StringBuilder;

    const-string v1, ","

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->eventCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->eventCount:I

    const/16 v1, 0xc8

    if-lt p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->stringBuilder:Ljava/lang/StringBuilder;

    const-string v1, "],\"package_name\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"platform\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->platform:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\"stream_id\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->streamId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"stream_key\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->streamKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"version\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"account_id\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->gameAccountId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"device_id\": \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/SdkEventBuilder;->deviceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
