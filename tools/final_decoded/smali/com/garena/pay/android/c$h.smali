.class final enum Lcom/garena/pay/android/c$h;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/garena/pay/android/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/garena/pay/android/c$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/garena/pay/android/c$h;

.field public static final enum c:Lcom/garena/pay/android/c$h;

.field public static final enum d:Lcom/garena/pay/android/c$h;

.field public static final enum e:Lcom/garena/pay/android/c$h;

.field public static final enum f:Lcom/garena/pay/android/c$h;

.field private static final synthetic g:[Lcom/garena/pay/android/c$h;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/garena/pay/android/c$h;

    const-string v1, "INIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/c$h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    new-instance v0, Lcom/garena/pay/android/c$h;

    const-string v1, "CHOOSE_CHANNEL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/c$h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/c$h;->c:Lcom/garena/pay/android/c$h;

    new-instance v0, Lcom/garena/pay/android/c$h;

    const-string v1, "CHOOSE_ITEM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/c$h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/c$h;->d:Lcom/garena/pay/android/c$h;

    new-instance v0, Lcom/garena/pay/android/c$h;

    const-string v1, "READY_TO_PAY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/c$h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/c$h;->e:Lcom/garena/pay/android/c$h;

    new-instance v0, Lcom/garena/pay/android/c$h;

    const-string v1, "DONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/c$h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/c$h;->f:Lcom/garena/pay/android/c$h;

    invoke-static {}, Lcom/garena/pay/android/c$h;->a()[Lcom/garena/pay/android/c$h;

    move-result-object v0

    sput-object v0, Lcom/garena/pay/android/c$h;->g:[Lcom/garena/pay/android/c$h;

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

    iput p3, p0, Lcom/garena/pay/android/c$h;->a:I

    return-void
.end method

.method private static synthetic a()[Lcom/garena/pay/android/c$h;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/garena/pay/android/c$h;

    sget-object v1, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/c$h;->c:Lcom/garena/pay/android/c$h;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/c$h;->d:Lcom/garena/pay/android/c$h;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/c$h;->e:Lcom/garena/pay/android/c$h;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/c$h;->f:Lcom/garena/pay/android/c$h;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/garena/pay/android/c$h;
    .locals 1

    const-class v0, Lcom/garena/pay/android/c$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/garena/pay/android/c$h;

    return-object p0
.end method

.method public static values()[Lcom/garena/pay/android/c$h;
    .locals 1

    sget-object v0, Lcom/garena/pay/android/c$h;->g:[Lcom/garena/pay/android/c$h;

    invoke-virtual {v0}, [Lcom/garena/pay/android/c$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/garena/pay/android/c$h;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcom/garena/pay/android/c$h;->a:I

    return v0
.end method

.method public d()Lcom/garena/pay/android/c$h;
    .locals 1

    sget-object v0, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    if-ne p0, v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/garena/pay/android/c$h;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/garena/pay/android/c$h;->e(I)Lcom/garena/pay/android/c$h;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Lcom/garena/pay/android/c$h;
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x4

    if-gt p1, v0, :cond_0

    invoke-static {}, Lcom/garena/pay/android/c$h;->values()[Lcom/garena/pay/android/c$h;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/garena/pay/android/c$h;->f:Lcom/garena/pay/android/c$h;

    return-object p1
.end method
