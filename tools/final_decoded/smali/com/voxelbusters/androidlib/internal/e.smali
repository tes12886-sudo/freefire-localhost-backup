.class public final enum Lcom/voxelbusters/androidlib/internal/e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/voxelbusters/androidlib/internal/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/voxelbusters/androidlib/internal/e;

.field public static final enum b:Lcom/voxelbusters/androidlib/internal/e;

.field public static final enum c:Lcom/voxelbusters/androidlib/internal/e;

.field public static final enum d:Lcom/voxelbusters/androidlib/internal/e;

.field private static final synthetic e:[Lcom/voxelbusters/androidlib/internal/e;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/voxelbusters/androidlib/internal/e;

    const-string v1, "QUALITY_MATCH_SCREEN_SIZE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/voxelbusters/androidlib/internal/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/voxelbusters/androidlib/internal/e;->a:Lcom/voxelbusters/androidlib/internal/e;

    new-instance v1, Lcom/voxelbusters/androidlib/internal/e;

    const-string v3, "QUALITY_1080P"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/voxelbusters/androidlib/internal/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/voxelbusters/androidlib/internal/e;->b:Lcom/voxelbusters/androidlib/internal/e;

    new-instance v3, Lcom/voxelbusters/androidlib/internal/e;

    const-string v5, "QUALITY_720P"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/voxelbusters/androidlib/internal/e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/voxelbusters/androidlib/internal/e;->c:Lcom/voxelbusters/androidlib/internal/e;

    new-instance v5, Lcom/voxelbusters/androidlib/internal/e;

    const-string v7, "QUALITY_480P"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/voxelbusters/androidlib/internal/e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/voxelbusters/androidlib/internal/e;->d:Lcom/voxelbusters/androidlib/internal/e;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/voxelbusters/androidlib/internal/e;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/voxelbusters/androidlib/internal/e;->e:[Lcom/voxelbusters/androidlib/internal/e;

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

.method public static valueOf(Ljava/lang/String;)Lcom/voxelbusters/androidlib/internal/e;
    .locals 1

    const-class v0, Lcom/voxelbusters/androidlib/internal/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/voxelbusters/androidlib/internal/e;

    return-object p0
.end method

.method public static values()[Lcom/voxelbusters/androidlib/internal/e;
    .locals 1

    sget-object v0, Lcom/voxelbusters/androidlib/internal/e;->e:[Lcom/voxelbusters/androidlib/internal/e;

    invoke-virtual {v0}, [Lcom/voxelbusters/androidlib/internal/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/voxelbusters/androidlib/internal/e;

    return-object v0
.end method
