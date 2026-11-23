.class public Lcom/seagroup/gamesdk/CheckChannelRequest;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final deviceId:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "device_id"
    .end annotation
.end field

.field private final sourceId:I
    .annotation runtime Lj/d/d/y/c;
        value = "source_id"
    .end annotation
.end field

.field private final streamKey:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "stream_key"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/seagroup/gamesdk/CheckChannelRequest;->sourceId:I

    iput-object p1, p0, Lcom/seagroup/gamesdk/CheckChannelRequest;->streamKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/seagroup/gamesdk/CheckChannelRequest;->deviceId:Ljava/lang/String;

    return-void
.end method
