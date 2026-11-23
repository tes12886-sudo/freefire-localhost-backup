.class public final enum Lcom/facebook/share/b/p;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/facebook/internal/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/share/b/p;",
        ">;",
        "Lcom/facebook/internal/h;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/share/b/p;

.field private static final synthetic c:[Lcom/facebook/share/b/p;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/share/b/p;

    const-string v1, "SHARE_STORY_ASSET"

    const/4 v2, 0x0

    const v3, 0x133c6b1

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/share/b/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/share/b/p;->b:Lcom/facebook/share/b/p;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/facebook/share/b/p;

    aput-object v0, v1, v2

    sput-object v1, Lcom/facebook/share/b/p;->c:[Lcom/facebook/share/b/p;

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

    iput p3, p0, Lcom/facebook/share/b/p;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/b/p;
    .locals 1

    const-class v0, Lcom/facebook/share/b/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/share/b/p;

    return-object p0
.end method

.method public static values()[Lcom/facebook/share/b/p;
    .locals 1

    sget-object v0, Lcom/facebook/share/b/p;->c:[Lcom/facebook/share/b/p;

    invoke-virtual {v0}, [Lcom/facebook/share/b/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/share/b/p;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.SHARE_STORY"

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/facebook/share/b/p;->a:I

    return v0
.end method
