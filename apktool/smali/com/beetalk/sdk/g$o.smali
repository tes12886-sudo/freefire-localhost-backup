.class public final enum Lcom/beetalk/sdk/g$o;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beetalk/sdk/g$o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/beetalk/sdk/g$o;

.field public static final enum c:Lcom/beetalk/sdk/g$o;

.field public static final enum d:Lcom/beetalk/sdk/g$o;

.field public static final enum e:Lcom/beetalk/sdk/g$o;

.field public static final enum f:Lcom/beetalk/sdk/g$o;

.field public static final enum g:Lcom/beetalk/sdk/g$o;

.field public static final enum h:Lcom/beetalk/sdk/g$o;

.field public static final enum i:Lcom/beetalk/sdk/g$o;

.field private static final synthetic j:[Lcom/beetalk/sdk/g$o;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "GARENA"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "FACEBOOK"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v4}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "GUEST"

    const/4 v3, 0x2

    const/4 v5, 0x4

    invoke-direct {v0, v1, v3, v5}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "VK"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v4, v3}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "LINE"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v5, v4}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->f:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "GOOGLE"

    const/16 v5, 0x8

    invoke-direct {v0, v1, v3, v5}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "REFRESH_TOKEN"

    invoke-direct {v0, v1, v4, v2}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->h:Lcom/beetalk/sdk/g$o;

    new-instance v0, Lcom/beetalk/sdk/g$o;

    const-string v1, "TWITTER"

    const/4 v2, 0x7

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lcom/beetalk/sdk/g$o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    invoke-static {}, Lcom/beetalk/sdk/g$o;->a()[Lcom/beetalk/sdk/g$o;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/g$o;->j:[Lcom/beetalk/sdk/g$o;

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

    iput p3, p0, Lcom/beetalk/sdk/g$o;->a:I

    return-void
.end method

.method private static synthetic a()[Lcom/beetalk/sdk/g$o;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/beetalk/sdk/g$o;

    sget-object v1, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->f:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->h:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(Lcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/u/l;)Z
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    sget-object v0, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_1

    sget-object v0, Lcom/beetalk/sdk/u/l;->g:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    sget-object v0, Lcom/beetalk/sdk/g$o;->h:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_2

    return v1

    :cond_2
    sget-object v0, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_4

    sget-object v0, Lcom/beetalk/sdk/u/l;->c:Lcom/beetalk/sdk/u/l;

    if-eq p1, v0, :cond_3

    sget-object v0, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_4

    :cond_3
    return v1

    :cond_4
    sget-object v0, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_5

    sget-object v0, Lcom/beetalk/sdk/u/l;->h:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_5

    return v1

    :cond_5
    sget-object v0, Lcom/beetalk/sdk/g$o;->f:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_6

    sget-object v0, Lcom/beetalk/sdk/u/l;->i:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_6

    return v1

    :cond_6
    sget-object v0, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_7

    sget-object v0, Lcom/beetalk/sdk/u/l;->j:Lcom/beetalk/sdk/u/l;

    if-ne p1, v0, :cond_7

    return v1

    :cond_7
    sget-object v0, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    if-ne p0, v0, :cond_8

    sget-object p0, Lcom/beetalk/sdk/u/l;->k:Lcom/beetalk/sdk/u/l;

    if-ne p1, p0, :cond_8

    return v1

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beetalk/sdk/g$o;
    .locals 1

    const-class v0, Lcom/beetalk/sdk/g$o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beetalk/sdk/g$o;

    return-object p0
.end method

.method public static values()[Lcom/beetalk/sdk/g$o;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/g$o;->j:[Lcom/beetalk/sdk/g$o;

    invoke-virtual {v0}, [Lcom/beetalk/sdk/g$o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beetalk/sdk/g$o;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/g$o;->a:I

    return v0
.end method
