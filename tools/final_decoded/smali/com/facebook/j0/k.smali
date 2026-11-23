.class public final enum Lcom/facebook/j0/k;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/j0/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/facebook/j0/k;

.field public static final enum b:Lcom/facebook/j0/k;

.field public static final enum c:Lcom/facebook/j0/k;

.field private static final synthetic d:[Lcom/facebook/j0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/j0/k;

    new-instance v1, Lcom/facebook/j0/k;

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/j0/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/j0/k;->a:Lcom/facebook/j0/k;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/k;

    const-string v2, "SERVER_ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/facebook/j0/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/j0/k;->b:Lcom/facebook/j0/k;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/k;

    const-string v2, "NO_CONNECTIVITY"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/facebook/j0/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/j0/k;->c:Lcom/facebook/j0/k;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/k;

    const-string v2, "UNKNOWN_ERROR"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/facebook/j0/k;-><init>(Ljava/lang/String;I)V

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/j0/k;->d:[Lcom/facebook/j0/k;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/j0/k;
    .locals 1

    const-class v0, Lcom/facebook/j0/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/j0/k;

    return-object p0
.end method

.method public static values()[Lcom/facebook/j0/k;
    .locals 1

    sget-object v0, Lcom/facebook/j0/k;->d:[Lcom/facebook/j0/k;

    invoke-virtual {v0}, [Lcom/facebook/j0/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/j0/k;

    return-object v0
.end method
