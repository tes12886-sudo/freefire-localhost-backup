.class public final enum Lcom/vk/sdk/i$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vk/sdk/i$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/vk/sdk/i$d;

.field public static final enum b:Lcom/vk/sdk/i$d;

.field public static final enum c:Lcom/vk/sdk/i$d;

.field public static final enum d:Lcom/vk/sdk/i$d;

.field private static final synthetic e:[Lcom/vk/sdk/i$d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/vk/sdk/i$d;

    const-string v1, "Unknown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/vk/sdk/i$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vk/sdk/i$d;->a:Lcom/vk/sdk/i$d;

    new-instance v1, Lcom/vk/sdk/i$d;

    const-string v3, "LoggedOut"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/vk/sdk/i$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/vk/sdk/i$d;->b:Lcom/vk/sdk/i$d;

    new-instance v3, Lcom/vk/sdk/i$d;

    const-string v5, "Pending"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/vk/sdk/i$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/vk/sdk/i$d;->c:Lcom/vk/sdk/i$d;

    new-instance v5, Lcom/vk/sdk/i$d;

    const-string v7, "LoggedIn"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/vk/sdk/i$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/vk/sdk/i$d;->d:Lcom/vk/sdk/i$d;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/vk/sdk/i$d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/vk/sdk/i$d;->e:[Lcom/vk/sdk/i$d;

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

.method public static valueOf(Ljava/lang/String;)Lcom/vk/sdk/i$d;
    .locals 1

    const-class v0, Lcom/vk/sdk/i$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vk/sdk/i$d;

    return-object p0
.end method

.method public static values()[Lcom/vk/sdk/i$d;
    .locals 1

    sget-object v0, Lcom/vk/sdk/i$d;->e:[Lcom/vk/sdk/i$d;

    invoke-virtual {v0}, [Lcom/vk/sdk/i$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vk/sdk/i$d;

    return-object v0
.end method
