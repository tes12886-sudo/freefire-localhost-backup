.class public final enum Lcom/vk/sdk/k/i/a$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/k/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vk/sdk/k/i/a$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/vk/sdk/k/i/a$e;

.field public static final enum b:Lcom/vk/sdk/k/i/a$e;

.field public static final enum c:Lcom/vk/sdk/k/i/a$e;

.field public static final enum d:Lcom/vk/sdk/k/i/a$e;

.field public static final enum e:Lcom/vk/sdk/k/i/a$e;

.field public static final enum f:Lcom/vk/sdk/k/i/a$e;

.field private static final synthetic g:[Lcom/vk/sdk/k/i/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lcom/vk/sdk/k/i/a$e;

    const-string v1, "Created"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vk/sdk/k/i/a$e;->a:Lcom/vk/sdk/k/i/a$e;

    new-instance v1, Lcom/vk/sdk/k/i/a$e;

    const-string v3, "Ready"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/vk/sdk/k/i/a$e;->b:Lcom/vk/sdk/k/i/a$e;

    new-instance v3, Lcom/vk/sdk/k/i/a$e;

    const-string v5, "Executing"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/vk/sdk/k/i/a$e;->c:Lcom/vk/sdk/k/i/a$e;

    new-instance v5, Lcom/vk/sdk/k/i/a$e;

    const-string v7, "Paused"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/vk/sdk/k/i/a$e;->d:Lcom/vk/sdk/k/i/a$e;

    new-instance v7, Lcom/vk/sdk/k/i/a$e;

    const-string v9, "Finished"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    new-instance v9, Lcom/vk/sdk/k/i/a$e;

    const-string v11, "Canceled"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/vk/sdk/k/i/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/vk/sdk/k/i/a$e;->f:Lcom/vk/sdk/k/i/a$e;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/vk/sdk/k/i/a$e;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lcom/vk/sdk/k/i/a$e;->g:[Lcom/vk/sdk/k/i/a$e;

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

.method public static valueOf(Ljava/lang/String;)Lcom/vk/sdk/k/i/a$e;
    .locals 1

    const-class v0, Lcom/vk/sdk/k/i/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vk/sdk/k/i/a$e;

    return-object p0
.end method

.method public static values()[Lcom/vk/sdk/k/i/a$e;
    .locals 1

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->g:[Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {v0}, [Lcom/vk/sdk/k/i/a$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vk/sdk/k/i/a$e;

    return-object v0
.end method
