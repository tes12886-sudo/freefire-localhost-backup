.class public Lcom/voxelbusters/androidlib/b/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:[F


# direct methods
.method public constructor <init>(I[F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/voxelbusters/androidlib/b/a;->a:I

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p1

    iput-object p1, p0, Lcom/voxelbusters/androidlib/b/a;->b:[F

    return-void
.end method


# virtual methods
.method public a(IS[B)I
    .locals 8

    iget-object v0, p0, Lcom/voxelbusters/androidlib/b/a;->b:[F

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "AacEncode"

    const-string p2, "datas is null"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    array-length v0, v0

    iget v2, p0, Lcom/voxelbusters/androidlib/b/a;->a:I

    div-int/2addr v0, v2

    mul-int v0, v0, p1

    mul-int/lit8 v0, v0, 0x2

    array-length v2, p3

    if-le v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/voxelbusters/androidlib/b/a;->b:[F

    array-length v4, v3

    if-ge v1, v4, :cond_3

    aget v4, v3, v1

    int-to-float v5, p2

    mul-float v4, v4, v5

    float-to-int v4, v4

    int-to-short v4, v4

    iget v6, p0, Lcom/voxelbusters/androidlib/b/a;->a:I

    if-lt v6, p1, :cond_2

    add-int/lit8 v7, v1, 0x1

    aget v3, v3, v7

    mul-float v3, v3, v5

    float-to-int v3, v3

    int-to-short v3, v3

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    add-int/lit8 v5, v2, 0x1

    and-int/lit16 v7, v4, 0xff

    int-to-byte v7, v7

    aput-byte v7, p3, v2

    add-int/lit8 v2, v5, 0x1

    shr-int/lit8 v4, v4, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, p3, v5

    add-int/lit8 v4, v2, 0x1

    and-int/lit16 v5, v3, 0xff

    int-to-byte v5, v5

    aput-byte v5, p3, v2

    add-int/lit8 v2, v4, 0x1

    shr-int/lit8 v3, v3, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p3, v4

    add-int/2addr v1, v6

    goto :goto_0

    :cond_3
    return v0
.end method
