.class public Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private targetIp:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "target_ip"
    .end annotation
.end field

.field private timestamp:J
    .annotation runtime Lj/d/d/y/c;
        value = "time_stamp"
    .end annotation
.end field

.field private tracerouteNodeResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteNodeResult;",
            ">;"
        }
    .end annotation

    .annotation runtime Lj/d/d/y/c;
        value = "traceroute_node_results"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->targetIp:Ljava/lang/String;

    iput-wide p2, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->timestamp:J

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->tracerouteNodeResults:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getTargetIp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->targetIp:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->timestamp:J

    return-wide v0
.end method

.method public getTracerouteNodeResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteNodeResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/dtd/freefireth/FFNetCommand/TraceRoute/TracerouteResult;->tracerouteNodeResults:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    invoke-virtual {v0, p0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
