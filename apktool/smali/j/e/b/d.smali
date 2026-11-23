.class public final enum Lj/e/b/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj/e/b/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj/e/b/d;

.field public static final enum b:Lj/e/b/d;

.field public static final enum c:Lj/e/b/d;

.field public static final enum d:Lj/e/b/d;

.field public static final enum e:Lj/e/b/d;

.field public static final enum f:Lj/e/b/d;

.field private static final synthetic g:[Lj/e/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lj/e/b/d;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj/e/b/d;->a:Lj/e/b/d;

    new-instance v1, Lj/e/b/d;

    const-string v3, "CANCEL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj/e/b/d;->b:Lj/e/b/d;

    new-instance v3, Lj/e/b/d;

    const-string v5, "NETWORK_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj/e/b/d;->c:Lj/e/b/d;

    new-instance v5, Lj/e/b/d;

    const-string v7, "SERVER_ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj/e/b/d;->d:Lj/e/b/d;

    new-instance v7, Lj/e/b/d;

    const-string v9, "AUTHENTICATION_AGENT_ERROR"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lj/e/b/d;->e:Lj/e/b/d;

    new-instance v9, Lj/e/b/d;

    const-string v11, "INTERNAL_ERROR"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lj/e/b/d;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lj/e/b/d;->f:Lj/e/b/d;

    const/4 v11, 0x6

    new-array v11, v11, [Lj/e/b/d;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lj/e/b/d;->g:[Lj/e/b/d;

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

.method public static valueOf(Ljava/lang/String;)Lj/e/b/d;
    .locals 1

    const-class v0, Lj/e/b/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj/e/b/d;

    return-object p0
.end method

.method public static values()[Lj/e/b/d;
    .locals 1

    sget-object v0, Lj/e/b/d;->g:[Lj/e/b/d;

    invoke-virtual {v0}, [Lj/e/b/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj/e/b/d;

    return-object v0
.end method
