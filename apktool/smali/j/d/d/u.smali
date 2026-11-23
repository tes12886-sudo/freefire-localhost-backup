.class public abstract enum Lj/d/d/u;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lj/d/d/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj/d/d/u;",
        ">;",
        "Lj/d/d/v;"
    }
.end annotation


# static fields
.field public static final enum a:Lj/d/d/u;

.field public static final enum b:Lj/d/d/u;

.field public static final enum c:Lj/d/d/u;

.field public static final enum d:Lj/d/d/u;

.field private static final synthetic e:[Lj/d/d/u;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lj/d/d/u$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj/d/d/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj/d/d/u;->a:Lj/d/d/u;

    new-instance v1, Lj/d/d/u$b;

    const-string v3, "LAZILY_PARSED_NUMBER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj/d/d/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj/d/d/u;->b:Lj/d/d/u;

    new-instance v3, Lj/d/d/u$c;

    const-string v5, "LONG_OR_DOUBLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj/d/d/u$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj/d/d/u;->c:Lj/d/d/u;

    new-instance v5, Lj/d/d/u$d;

    const-string v7, "BIG_DECIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lj/d/d/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj/d/d/u;->d:Lj/d/d/u;

    const/4 v7, 0x4

    new-array v7, v7, [Lj/d/d/u;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lj/d/d/u;->e:[Lj/d/d/u;

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

.method synthetic constructor <init>(Ljava/lang/String;ILj/d/d/u$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/d/d/u;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj/d/d/u;
    .locals 1

    const-class v0, Lj/d/d/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj/d/d/u;

    return-object p0
.end method

.method public static values()[Lj/d/d/u;
    .locals 1

    sget-object v0, Lj/d/d/u;->e:[Lj/d/d/u;

    invoke-virtual {v0}, [Lj/d/d/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj/d/d/u;

    return-object v0
.end method
