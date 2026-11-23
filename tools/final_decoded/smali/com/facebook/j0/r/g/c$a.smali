.class public final enum Lcom/facebook/j0/r/g/c$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/r/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/j0/r/g/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/j0/r/g/c$a;

.field public static final enum c:Lcom/facebook/j0/r/g/c$a;

.field public static final enum d:Lcom/facebook/j0/r/g/c$a;

.field public static final enum e:Lcom/facebook/j0/r/g/c$a;

.field public static final enum f:Lcom/facebook/j0/r/g/c$a;

.field private static final synthetic g:[Lcom/facebook/j0/r/g/c$a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/j0/r/g/c$a;

    new-instance v1, Lcom/facebook/j0/r/g/c$a;

    const-string v2, "ID"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/j0/r/g/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/j0/r/g/c$a;->b:Lcom/facebook/j0/r/g/c$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/r/g/c$a;

    const-string v2, "TEXT"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/j0/r/g/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/j0/r/g/c$a;->c:Lcom/facebook/j0/r/g/c$a;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/j0/r/g/c$a;

    const-string v2, "TAG"

    const/4 v4, 0x4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/j0/r/g/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/j0/r/g/c$a;->d:Lcom/facebook/j0/r/g/c$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/r/g/c$a;

    const-string v2, "DESCRIPTION"

    const/4 v3, 0x3

    const/16 v5, 0x8

    invoke-direct {v1, v2, v3, v5}, Lcom/facebook/j0/r/g/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/j0/r/g/c$a;->e:Lcom/facebook/j0/r/g/c$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/r/g/c$a;

    const-string v2, "HINT"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/j0/r/g/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/j0/r/g/c$a;->f:Lcom/facebook/j0/r/g/c$a;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/j0/r/g/c$a;->g:[Lcom/facebook/j0/r/g/c$a;

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

    iput p3, p0, Lcom/facebook/j0/r/g/c$a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/j0/r/g/c$a;
    .locals 1

    const-class v0, Lcom/facebook/j0/r/g/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/j0/r/g/c$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/j0/r/g/c$a;
    .locals 1

    sget-object v0, Lcom/facebook/j0/r/g/c$a;->g:[Lcom/facebook/j0/r/g/c$a;

    invoke-virtual {v0}, [Lcom/facebook/j0/r/g/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/j0/r/g/c$a;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/facebook/j0/r/g/c$a;->a:I

    return v0
.end method
