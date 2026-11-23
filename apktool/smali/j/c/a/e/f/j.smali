.class public Lj/c/a/e/f/j;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/c/a/e/f/j;->a:Ljava/io/InputStream;

    return-void
.end method

.method private static a([B)I
    .locals 2

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method private b(I)[B
    .locals 3

    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lj/c/a/e/f/j;->a:Ljava/io/InputStream;

    invoke-virtual {v2, v0, v1, p1}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-lez v2, :cond_1

    if-ge v2, p1, :cond_0

    add-int/2addr v1, v2

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public c()Lj/c/a/e/f/l/b;
    .locals 4

    const/4 v0, 0x4

    :try_start_0
    invoke-direct {p0, v0}, Lj/c/a/e/f/j;->b(I)[B

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/f/j;->a([B)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lj/c/a/e/f/j;->b(I)[B

    move-result-object v2

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lj/c/a/e/f/j;->b(I)[B

    move-result-object v0

    new-instance v1, Lj/c/a/e/f/l/b;

    const/4 v3, 0x0

    aget-byte v2, v2, v3

    invoke-direct {v1, v2, v0}, Lj/c/a/e/f/l/b;-><init>(I[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Lj/c/a/e/f/k/c;

    invoke-direct {v1, v0}, Lj/c/a/e/f/k/c;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method
