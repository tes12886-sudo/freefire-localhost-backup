.class public final enum Lcom/beetalk/sdk/q;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/q;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beetalk/sdk/q;

.field public static final enum b:Lcom/beetalk/sdk/q;

.field public static final enum c:Lcom/beetalk/sdk/q;

.field public static final enum d:Lcom/beetalk/sdk/q;

.field public static final enum e:Lcom/beetalk/sdk/q;

.field public static final enum f:Lcom/beetalk/sdk/q;

.field public static final enum g:Lcom/beetalk/sdk/q;

.field private static final synthetic h:[Lcom/beetalk/sdk/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "CREATED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->a:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "OPENING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "TOKEN_AVAILABLE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "CLOSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->d:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "CLOSED_WITH_ERROR"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "INSPECTION_WITH_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->f:Lcom/beetalk/sdk/q;

    new-instance v0, Lcom/beetalk/sdk/q;

    const-string v1, "CLOSED_WITH_BIND_FAIL"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/q;->g:Lcom/beetalk/sdk/q;

    invoke-static {}, Lcom/beetalk/sdk/q;->a()[Lcom/beetalk/sdk/q;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/q;->h:[Lcom/beetalk/sdk/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/q;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/beetalk/sdk/q;

    sget-object v1, Lcom/beetalk/sdk/q;->a:Lcom/beetalk/sdk/q;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->d:Lcom/beetalk/sdk/q;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->f:Lcom/beetalk/sdk/q;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/q;->g:Lcom/beetalk/sdk/q;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/q;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/q;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/q;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/q;->h:[Lcom/beetalk/sdk/q;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/q;

    return-object v0
.end method
