.class public Lcom/seagroup/gamesdk/CheckChannelResponse;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private status:I
    .annotation runtime Lj/d/d/y/c;
        value = "status"
    .end annotation
.end field

.field private streamId:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "stream_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/seagroup/gamesdk/CheckChannelResponse;->status:I

    return v0
.end method

.method public getStreamId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/seagroup/gamesdk/CheckChannelResponse;->streamId:Ljava/lang/String;

    return-object v0
.end method
