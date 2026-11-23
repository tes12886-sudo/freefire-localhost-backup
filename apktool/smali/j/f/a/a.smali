.class public final enum Lj/f/a/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj/f/a/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lj/f/a/a;

.field public static final enum c:Lj/f/a/a;

.field public static final enum d:Lj/f/a/a;

.field public static final enum e:Lj/f/a/a;

.field private static final synthetic f:[Lj/f/a/a;


# instance fields
.field final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lj/f/a/a;

    const-string v1, "VARINT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lj/f/a/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj/f/a/a;->b:Lj/f/a/a;

    new-instance v1, Lj/f/a/a;

    const-string v3, "FIXED64"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lj/f/a/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lj/f/a/a;->c:Lj/f/a/a;

    new-instance v3, Lj/f/a/a;

    const-string v5, "LENGTH_DELIMITED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lj/f/a/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lj/f/a/a;->d:Lj/f/a/a;

    new-instance v5, Lj/f/a/a;

    const-string v7, "FIXED32"

    const/4 v8, 0x3

    const/4 v9, 0x5

    invoke-direct {v5, v7, v8, v9}, Lj/f/a/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lj/f/a/a;->e:Lj/f/a/a;

    const/4 v7, 0x4

    new-array v7, v7, [Lj/f/a/a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lj/f/a/a;->f:[Lj/f/a/a;

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

    iput p3, p0, Lj/f/a/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj/f/a/a;
    .locals 1

    const-class v0, Lj/f/a/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj/f/a/a;

    return-object p0
.end method

.method public static values()[Lj/f/a/a;
    .locals 1

    sget-object v0, Lj/f/a/a;->f:[Lj/f/a/a;

    invoke-virtual {v0}, [Lj/f/a/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj/f/a/a;

    return-object v0
.end method


# virtual methods
.method public a()Lj/f/a/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/f/a/e<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lj/f/a/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object v0, Lj/f/a/e;->h:Lj/f/a/e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lj/f/a/e;->f:Lj/f/a/e;

    return-object v0

    :cond_2
    sget-object v0, Lj/f/a/e;->d:Lj/f/a/e;

    return-object v0

    :cond_3
    sget-object v0, Lj/f/a/e;->e:Lj/f/a/e;

    return-object v0
.end method
