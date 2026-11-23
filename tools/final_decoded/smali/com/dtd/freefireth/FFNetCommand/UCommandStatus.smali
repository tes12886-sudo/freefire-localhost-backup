.class public final enum Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_ERROE_NULL_RESULT:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_ERROR_UNKNOW_HOST:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_FAILED:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_NETWORK_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_SUCCESSFUL:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

.field public static final enum CMD_STATUS_USER_STOP:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;


# direct methods
.method private static synthetic $values()[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_SUCCESSFUL:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_FAILED:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_USER_STOP:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_NETWORK_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROR_UNKNOW_HOST:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROE_NULL_RESULT:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_SUCCESSFUL:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_FAILED:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_USER_STOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_USER_STOP:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_NETWORK_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_NETWORK_ERROR:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_ERROR_UNKNOW_HOST"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROR_UNKNOW_HOST:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    new-instance v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    const-string v1, "CMD_STATUS_ERROE_NULL_RESULT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->CMD_STATUS_ERROE_NULL_RESULT:Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    invoke-static {}, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->$values()[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    move-result-object v0

    sput-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->$VALUES:[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
    .locals 1

    const-class v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    return-object p0
.end method

.method public static values()[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->$VALUES:[Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    invoke-virtual {v0}, [Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dtd/freefireth/FFNetCommand/UCommandStatus;

    return-object v0
.end method
