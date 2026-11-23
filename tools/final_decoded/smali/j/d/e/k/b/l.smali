.class public final enum Lj/d/e/k/b/l;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj/d/e/k/b/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj/d/e/k/b/l;

.field public static final enum b:Lj/d/e/k/b/l;

.field public static final enum c:Lj/d/e/k/b/l;

.field private static final synthetic d:[Lj/d/e/k/b/l;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lj/d/e/k/b/l;

    const-string v1, "FORCE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj/d/e/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj/d/e/k/b/l;->a:Lj/d/e/k/b/l;

    new-instance v1, Lj/d/e/k/b/l;

    const-string v3, "FORCE_SQUARE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj/d/e/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj/d/e/k/b/l;->b:Lj/d/e/k/b/l;

    new-instance v3, Lj/d/e/k/b/l;

    const-string v5, "FORCE_RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj/d/e/k/b/l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj/d/e/k/b/l;->c:Lj/d/e/k/b/l;

    const/4 v5, 0x3

    new-array v5, v5, [Lj/d/e/k/b/l;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lj/d/e/k/b/l;->d:[Lj/d/e/k/b/l;

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

.method public static valueOf(Ljava/lang/String;)Lj/d/e/k/b/l;
    .locals 1

    const-class v0, Lj/d/e/k/b/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj/d/e/k/b/l;

    return-object p0
.end method

.method public static values()[Lj/d/e/k/b/l;
    .locals 1

    sget-object v0, Lj/d/e/k/b/l;->d:[Lj/d/e/k/b/l;

    invoke-virtual {v0}, [Lj/d/e/k/b/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj/d/e/k/b/l;

    return-object v0
.end method
