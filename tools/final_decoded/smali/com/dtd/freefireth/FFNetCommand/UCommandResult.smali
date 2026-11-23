.class public Lcom/dtd/freefireth/FFNetCommand/UCommandResult;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected status:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
    .annotation runtime Lj/d/d/y/c;
        value = "status"
    .end annotation
.end field

.field protected targetIp:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "target_ip"
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/dtd/freefireth/FFNetCommand/UCommandResult;->targetIp:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
    .locals 1

    iget-object v0, p0, Lcom/dtd/freefireth/FFNetCommand/UCommandResult;->status:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    return-object v0
.end method

.method public getTargetIp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/dtd/freefireth/FFNetCommand/UCommandResult;->targetIp:Ljava/lang/String;

    return-object v0
.end method

.method protected setTargetIp(Ljava/lang/String;)Lcom/dtd/freefireth/FFNetCommand/UCommandResult;
    .locals 0

    iput-object p1, p0, Lcom/dtd/freefireth/FFNetCommand/UCommandResult;->targetIp:Ljava/lang/String;

    return-object p0
.end method
