.class public final enum Lcom/beetalk/sdk/a0/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/a0/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/beetalk/sdk/a0/a;

.field public static final enum c:Lcom/beetalk/sdk/a0/a;

.field private static final synthetic d:[Lcom/beetalk/sdk/a0/a;


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/a0/a;

    const-string v1, "CODE"

    const/4 v2, 0x0

    const-string v3, "code"

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/a0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/a0/a;->b:Lcom/beetalk/sdk/a0/a;

    new-instance v0, Lcom/beetalk/sdk/a0/a;

    const-string v1, "TOKEN"

    const/4 v2, 0x1

    const-string v3, "token"

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/a0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/a0/a;->c:Lcom/beetalk/sdk/a0/a;

    invoke-static {}, Lcom/beetalk/sdk/a0/a;->a()[Lcom/beetalk/sdk/a0/a;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/a0/a;->d:[Lcom/beetalk/sdk/a0/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/beetalk/sdk/a0/a;->a:Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/a0/a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/beetalk/sdk/a0/a;

    sget-object v1, Lcom/beetalk/sdk/a0/a;->b:Lcom/beetalk/sdk/a0/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/a0/a;->c:Lcom/beetalk/sdk/a0/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/a0/a;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/a0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/a0/a;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/a0/a;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/a0/a;->d:[Lcom/beetalk/sdk/a0/a;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/a0/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/a0/a;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/a0/a;->a:Ljava/lang/String;

    return-object v0
.end method
