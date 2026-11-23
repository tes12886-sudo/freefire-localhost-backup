.class public final enum Lcom/beetalk/sdk/z/f;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/z/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/beetalk/sdk/z/f;

.field public static final enum d:Lcom/beetalk/sdk/z/f;

.field public static final enum e:Lcom/beetalk/sdk/z/f;

.field public static final enum f:Lcom/beetalk/sdk/z/f;

.field public static final enum g:Lcom/beetalk/sdk/z/f;

.field public static final enum h:Lcom/beetalk/sdk/z/f;

.field public static final enum i:Lcom/beetalk/sdk/z/f;

.field public static final enum j:Lcom/beetalk/sdk/z/f;

.field public static final enum k:Lcom/beetalk/sdk/z/f;

.field public static final enum l:Lcom/beetalk/sdk/z/f;

.field public static final enum m:Lcom/beetalk/sdk/z/f;

.field private static final n:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/beetalk/sdk/z/f;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic o:[Lcom/beetalk/sdk/z/f;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_PARSE"

    const/4 v2, 0x0

    const/4 v3, -0x1

    const-string v4, "Failed to parse response"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->c:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "SUCCESS"

    const/4 v3, 0x1

    const-string v4, "Success"

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->d:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "UNKNOWN"

    const/4 v4, 0x2

    const-string v5, "Unknown error"

    invoke-direct {v0, v1, v4, v3, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->e:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "PENDING_TRANSACTION"

    const/4 v3, 0x3

    const-string v4, "Pending transaction"

    invoke-direct {v0, v1, v3, v3, v4}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->f:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_PARAMS"

    const/4 v3, 0x4

    const/16 v4, 0x3e9

    const-string v5, "Error params"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->g:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_TOKEN"

    const/4 v3, 0x5

    const/16 v4, 0x3ea

    const-string v5, "Error token"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->h:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_SCOPE"

    const/4 v3, 0x6

    const/16 v4, 0x3eb

    const-string v5, "Error scope"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->i:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_PLATFORM"

    const/4 v3, 0x7

    const/16 v4, 0x44d

    const-string v5, "Error user platform"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->j:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_DISPLAY_RESULT"

    const/16 v3, 0x8

    const/16 v4, 0x7d0

    const-string v5, "Error display result (task error)"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->k:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_SUBS_BINDING"

    const/16 v3, 0x9

    const/16 v4, 0xbb9

    const-string v5, "Error subscription binding"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->l:Lcom/beetalk/sdk/z/f;

    new-instance v0, Lcom/beetalk/sdk/z/f;

    const-string v1, "ERR_SUBS_GET_DETAILS"

    const/16 v3, 0xa

    const/16 v4, 0xbba

    const-string v5, "Error subscription get details failed"

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/beetalk/sdk/z/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beetalk/sdk/z/f;->m:Lcom/beetalk/sdk/z/f;

    invoke-static {}, Lcom/beetalk/sdk/z/f;->a()[Lcom/beetalk/sdk/z/f;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/z/f;->o:[Lcom/beetalk/sdk/z/f;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/beetalk/sdk/z/f;->n:Landroid/util/SparseArray;

    invoke-static {}, Lcom/beetalk/sdk/z/f;->values()[Lcom/beetalk/sdk/z/f;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    sget-object v4, Lcom/beetalk/sdk/z/f;->n:Landroid/util/SparseArray;

    invoke-virtual {v3}, Lcom/beetalk/sdk/z/f;->c()I

    move-result v5

    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/beetalk/sdk/z/f;->a:I

    iput-object p4, p0, Lcom/beetalk/sdk/z/f;->b:Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/z/f;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lcom/beetalk/sdk/z/f;

    sget-object v1, Lcom/beetalk/sdk/z/f;->c:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->d:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->e:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->f:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->g:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->h:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->i:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->j:Lcom/beetalk/sdk/z/f;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->k:Lcom/beetalk/sdk/z/f;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->l:Lcom/beetalk/sdk/z/f;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/z/f;->m:Lcom/beetalk/sdk/z/f;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/z/f;->n:Landroid/util/SparseArray;

    sget-object v1, Lcom/beetalk/sdk/z/f;->c:Lcom/beetalk/sdk/z/f;

    invoke-virtual {v0, p0, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/z/f;

    invoke-virtual {p0}, Lcom/beetalk/sdk/z/f;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/z/f;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/z/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/z/f;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/z/f;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/z/f;->o:[Lcom/beetalk/sdk/z/f;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/z/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/z/f;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/z/f;->a:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/z/f;->b:Ljava/lang/String;

    return-object v0
.end method
