.class public final enum Lcom/beetalk/sdk/u/j$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/u/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/u/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/beetalk/sdk/u/j$a;

.field public static final enum c:Lcom/beetalk/sdk/u/j$a;

.field public static final enum d:Lcom/beetalk/sdk/u/j$a;

.field private static final synthetic e:[Lcom/beetalk/sdk/u/j$a;


# instance fields
.field private final a:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/u/j$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/beetalk/sdk/u/j$a;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/beetalk/sdk/u/j$a;->b:Lcom/beetalk/sdk/u/j$a;

    new-instance v0, Lcom/beetalk/sdk/u/j$a;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "CANCEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/beetalk/sdk/u/j$a;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/beetalk/sdk/u/j$a;->c:Lcom/beetalk/sdk/u/j$a;

    new-instance v0, Lcom/beetalk/sdk/u/j$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/beetalk/sdk/u/j$a;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/beetalk/sdk/u/j$a;->d:Lcom/beetalk/sdk/u/j$a;

    invoke-static {}, Lcom/beetalk/sdk/u/j$a;->a()[Lcom/beetalk/sdk/u/j$a;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/u/j$a;->e:[Lcom/beetalk/sdk/u/j$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/beetalk/sdk/u/j$a;->a:Ljava/lang/Integer;

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/u/j$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/beetalk/sdk/u/j$a;

    sget-object v1, Lcom/beetalk/sdk/u/j$a;->b:Lcom/beetalk/sdk/u/j$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/j$a;->c:Lcom/beetalk/sdk/u/j$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/j$a;->d:Lcom/beetalk/sdk/u/j$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/u/j$a;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/u/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/u/j$a;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/u/j$a;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/u/j$a;->e:[Lcom/beetalk/sdk/u/j$a;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/u/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/u/j$a;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/j$a;->a:Ljava/lang/Integer;

    return-object v0
.end method
