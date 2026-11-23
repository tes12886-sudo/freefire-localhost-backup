.class public final enum Lcom/vk/sdk/VKServiceActivity$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/VKServiceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vk/sdk/VKServiceActivity$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/vk/sdk/VKServiceActivity$c;

.field public static final enum c:Lcom/vk/sdk/VKServiceActivity$c;

.field public static final enum d:Lcom/vk/sdk/VKServiceActivity$c;

.field private static final synthetic e:[Lcom/vk/sdk/VKServiceActivity$c;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/vk/sdk/VKServiceActivity$c;

    const-string v1, "Authorization"

    const/4 v2, 0x0

    const/16 v3, 0x28f5

    invoke-direct {v0, v1, v2, v3}, Lcom/vk/sdk/VKServiceActivity$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/vk/sdk/VKServiceActivity$c;->b:Lcom/vk/sdk/VKServiceActivity$c;

    new-instance v1, Lcom/vk/sdk/VKServiceActivity$c;

    const-string v3, "Captcha"

    const/4 v4, 0x1

    const/16 v5, 0x36ff

    invoke-direct {v1, v3, v4, v5}, Lcom/vk/sdk/VKServiceActivity$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/vk/sdk/VKServiceActivity$c;->c:Lcom/vk/sdk/VKServiceActivity$c;

    new-instance v3, Lcom/vk/sdk/VKServiceActivity$c;

    const-string v5, "Validation"

    const/4 v6, 0x2

    const/16 v7, 0x2cd5

    invoke-direct {v3, v5, v6, v7}, Lcom/vk/sdk/VKServiceActivity$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/vk/sdk/VKServiceActivity$c;->d:Lcom/vk/sdk/VKServiceActivity$c;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/vk/sdk/VKServiceActivity$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/vk/sdk/VKServiceActivity$c;->e:[Lcom/vk/sdk/VKServiceActivity$c;

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

    iput p3, p0, Lcom/vk/sdk/VKServiceActivity$c;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vk/sdk/VKServiceActivity$c;
    .locals 1

    const-class v0, Lcom/vk/sdk/VKServiceActivity$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vk/sdk/VKServiceActivity$c;

    return-object p0
.end method

.method public static values()[Lcom/vk/sdk/VKServiceActivity$c;
    .locals 1

    sget-object v0, Lcom/vk/sdk/VKServiceActivity$c;->e:[Lcom/vk/sdk/VKServiceActivity$c;

    invoke-virtual {v0}, [Lcom/vk/sdk/VKServiceActivity$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vk/sdk/VKServiceActivity$c;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/vk/sdk/VKServiceActivity$c;->a:I

    return v0
.end method
