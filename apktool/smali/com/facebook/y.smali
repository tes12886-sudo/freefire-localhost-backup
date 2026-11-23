.class public final enum Lcom/facebook/y;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/y;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/facebook/y;

.field public static final enum b:Lcom/facebook/y;

.field private static final synthetic c:[Lcom/facebook/y;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/y;

    new-instance v1, Lcom/facebook/y;

    const-string v2, "GET"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/y;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/y;->a:Lcom/facebook/y;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/y;

    const-string v2, "POST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/facebook/y;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/y;->b:Lcom/facebook/y;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/y;

    const-string v2, "DELETE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/facebook/y;-><init>(Ljava/lang/String;I)V

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/y;->c:[Lcom/facebook/y;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/y;
    .locals 1

    const-class v0, Lcom/facebook/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/y;

    return-object p0
.end method

.method public static values()[Lcom/facebook/y;
    .locals 1

    sget-object v0, Lcom/facebook/y;->c:[Lcom/facebook/y;

    invoke-virtual {v0}, [Lcom/facebook/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/y;

    return-object v0
.end method
