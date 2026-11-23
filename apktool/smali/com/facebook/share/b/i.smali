.class public final enum Lcom/facebook/share/b/i;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/facebook/internal/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/share/b/i;",
        ">;",
        "Lcom/facebook/internal/h;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/share/b/i;

.field private static final synthetic c:[Lcom/facebook/share/b/i;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/share/b/i;

    const-string v1, "OG_ACTION_DIALOG"

    const/4 v2, 0x0

    const v3, 0x1332b3a

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/share/b/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/share/b/i;->b:Lcom/facebook/share/b/i;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/facebook/share/b/i;

    aput-object v0, v1, v2

    sput-object v1, Lcom/facebook/share/b/i;->c:[Lcom/facebook/share/b/i;

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

    iput p3, p0, Lcom/facebook/share/b/i;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/b/i;
    .locals 1

    const-class v0, Lcom/facebook/share/b/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/share/b/i;

    return-object p0
.end method

.method public static values()[Lcom/facebook/share/b/i;
    .locals 1

    sget-object v0, Lcom/facebook/share/b/i;->c:[Lcom/facebook/share/b/i;

    invoke-virtual {v0}, [Lcom/facebook/share/b/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/share/b/i;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/facebook/share/b/i;->a:I

    return v0
.end method
