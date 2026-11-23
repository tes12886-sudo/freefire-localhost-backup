.class public final enum Lcom/facebook/share/b/a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/facebook/internal/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/share/b/a;",
        ">;",
        "Lcom/facebook/internal/h;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/share/b/a;

.field private static final synthetic c:[Lcom/facebook/share/b/a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/share/b/a;

    new-instance v1, Lcom/facebook/share/b/a;

    const-string v2, "SHARE_CAMERA_EFFECT"

    const/4 v3, 0x0

    const v4, 0x133c6b1

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/share/b/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/share/b/a;->b:Lcom/facebook/share/b/a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/share/b/a;->c:[Lcom/facebook/share/b/a;

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

    iput p3, p0, Lcom/facebook/share/b/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/b/a;
    .locals 1

    const-class v0, Lcom/facebook/share/b/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/share/b/a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/share/b/a;
    .locals 1

    sget-object v0, Lcom/facebook/share/b/a;->c:[Lcom/facebook/share/b/a;

    invoke-virtual {v0}, [Lcom/facebook/share/b/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/share/b/a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.CAMERA_EFFECT"

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/facebook/share/b/a;->a:I

    return v0
.end method
