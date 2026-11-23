.class public final enum Lcom/garena/pay/android/data/PayMode;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/garena/pay/android/data/PayMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/garena/pay/android/data/PayMode;

.field public static final enum NATIVE:Lcom/garena/pay/android/data/PayMode;

.field public static final enum WEB_VIEW:Lcom/garena/pay/android/data/PayMode;


# instance fields
.field private value:I


# direct methods
.method private static synthetic $values()[Lcom/garena/pay/android/data/PayMode;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/garena/pay/android/data/PayMode;

    sget-object v1, Lcom/garena/pay/android/data/PayMode;->WEB_VIEW:Lcom/garena/pay/android/data/PayMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/data/PayMode;->NATIVE:Lcom/garena/pay/android/data/PayMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/garena/pay/android/data/PayMode;

    const-string v1, "WEB_VIEW"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/garena/pay/android/data/PayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/data/PayMode;->WEB_VIEW:Lcom/garena/pay/android/data/PayMode;

    new-instance v0, Lcom/garena/pay/android/data/PayMode;

    const-string v1, "NATIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/garena/pay/android/data/PayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/garena/pay/android/data/PayMode;->NATIVE:Lcom/garena/pay/android/data/PayMode;

    invoke-static {}, Lcom/garena/pay/android/data/PayMode;->$values()[Lcom/garena/pay/android/data/PayMode;

    move-result-object v0

    sput-object v0, Lcom/garena/pay/android/data/PayMode;->$VALUES:[Lcom/garena/pay/android/data/PayMode;

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

    iput p3, p0, Lcom/garena/pay/android/data/PayMode;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/garena/pay/android/data/PayMode;
    .locals 1

    const-class v0, Lcom/garena/pay/android/data/PayMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/garena/pay/android/data/PayMode;

    return-object p0
.end method

.method public static values()[Lcom/garena/pay/android/data/PayMode;
    .locals 1

    sget-object v0, Lcom/garena/pay/android/data/PayMode;->$VALUES:[Lcom/garena/pay/android/data/PayMode;

    invoke-virtual {v0}, [Lcom/garena/pay/android/data/PayMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/garena/pay/android/data/PayMode;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/garena/pay/android/data/PayMode;->value:I

    return v0
.end method
