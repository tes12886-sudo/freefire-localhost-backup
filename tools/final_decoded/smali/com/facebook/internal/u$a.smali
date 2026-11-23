.class public final enum Lcom/facebook/internal/u$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/u$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/facebook/internal/u$a;

.field public static final enum b:Lcom/facebook/internal/u$a;

.field public static final enum c:Lcom/facebook/internal/u$a;

.field public static final enum d:Lcom/facebook/internal/u$a;

.field private static final synthetic e:[Lcom/facebook/internal/u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/internal/u$a;

    new-instance v1, Lcom/facebook/internal/u$a;

    const-string v2, "NOT_LOADED"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/internal/u$a;->a:Lcom/facebook/internal/u$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/internal/u$a;

    const-string v2, "LOADING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/internal/u$a;->b:Lcom/facebook/internal/u$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/internal/u$a;

    const-string v2, "SUCCESS"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/internal/u$a;->c:Lcom/facebook/internal/u$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/internal/u$a;

    const-string v2, "ERROR"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/internal/u$a;->d:Lcom/facebook/internal/u$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/internal/u$a;->e:[Lcom/facebook/internal/u$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/u$a;
    .locals 1

    const-class v0, Lcom/facebook/internal/u$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/u$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/u$a;
    .locals 1

    sget-object v0, Lcom/facebook/internal/u$a;->e:[Lcom/facebook/internal/u$a;

    invoke-virtual {v0}, [Lcom/facebook/internal/u$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/u$a;

    return-object v0
.end method
