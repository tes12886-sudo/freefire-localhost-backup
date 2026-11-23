.class public final enum Lcom/beetalk/sdk/u/l;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/u/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/beetalk/sdk/u/l;

.field public static final enum c:Lcom/beetalk/sdk/u/l;

.field public static final enum d:Lcom/beetalk/sdk/u/l;

.field public static final enum e:Lcom/beetalk/sdk/u/l;

.field public static final enum f:Lcom/beetalk/sdk/u/l;

.field public static final enum g:Lcom/beetalk/sdk/u/l;

.field public static final enum h:Lcom/beetalk/sdk/u/l;

.field public static final enum i:Lcom/beetalk/sdk/u/l;

.field public static final enum j:Lcom/beetalk/sdk/u/l;

.field public static final enum k:Lcom/beetalk/sdk/u/l;

.field private static final synthetic l:[Lcom/beetalk/sdk/u/l;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "GARENA_NATIVE_ANDROID"

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "GARENA_WEB_ANDROID"

    const/4 v2, 0x1

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v4}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->c:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "GARENA_OTHERS"

    const/4 v2, 0x2

    const/4 v5, 0x5

    invoke-direct {v0, v1, v2, v5}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->d:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "FACEBOOK"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "OTHERS"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v4, v3}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->f:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "GUEST"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v5, v4}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->g:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "VK"

    const/16 v5, 0x9

    invoke-direct {v0, v1, v2, v5}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->h:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "LINE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v3, v2}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->i:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "GOOGLE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v4, v2}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->j:Lcom/beetalk/sdk/u/l;

    new-instance v0, Lcom/beetalk/sdk/u/l;

    const-string v1, "TWITTER"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v5, v2}, Lcom/beetalk/sdk/u/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/u/l;->k:Lcom/beetalk/sdk/u/l;

    invoke-static {}, Lcom/beetalk/sdk/u/l;->a()[Lcom/beetalk/sdk/u/l;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/u/l;->l:[Lcom/beetalk/sdk/u/l;

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

    iput p3, p0, Lcom/beetalk/sdk/u/l;->a:I

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/u/l;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lcom/beetalk/sdk/u/l;

    sget-object v1, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->c:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->d:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->f:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->g:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->h:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->i:Lcom/beetalk/sdk/u/l;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->j:Lcom/beetalk/sdk/u/l;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/u/l;->k:Lcom/beetalk/sdk/u/l;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(I)Lcom/beetalk/sdk/u/l;
    .locals 5

    invoke-static {}, Lcom/beetalk/sdk/u/l;->values()[Lcom/beetalk/sdk/u/l;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/beetalk/sdk/u/l;->c()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/beetalk/sdk/u/l;->f:Lcom/beetalk/sdk/u/l;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/u/l;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/u/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/u/l;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/u/l;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/u/l;->l:[Lcom/beetalk/sdk/u/l;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/u/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/u/l;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/u/l;->a:I

    return v0
.end method
