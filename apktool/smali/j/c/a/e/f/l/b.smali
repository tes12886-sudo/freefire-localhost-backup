.class public Lj/c/a/e/f/l/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:[B

.field private c:Z

.field private d:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/c/a/e/f/l/b;->c:Z

    const v0, 0xea60

    iput v0, p0, Lj/c/a/e/f/l/b;->d:I

    iput p1, p0, Lj/c/a/e/f/l/b;->a:I

    iput-object p2, p0, Lj/c/a/e/f/l/b;->b:[B

    return-void
.end method

.method private static a([BI)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, p0, v1

    const v0, 0xff00

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, p0, v1

    const/high16 v0, 0xff0000

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x10

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, p0, v1

    const/high16 v0, -0x1000000

    and-int/2addr p1, v0

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    const/4 v0, 0x3

    aput-byte p1, p0, v0

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lj/c/a/e/f/l/b;->a:I

    return v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/l/b;->b:[B

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lj/c/a/e/f/l/b;->d:I

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lj/c/a/e/f/l/b;->c:Z

    return v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lj/c/a/e/f/l/b;->c:Z

    return-void
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lj/c/a/e/f/l/b;->d:I

    return-void
.end method

.method public h()[B
    .locals 5

    iget-object v0, p0, Lj/c/a/e/f/l/b;->b:[B

    array-length v0, v0

    const/4 v1, 0x5

    add-int/2addr v0, v1

    new-array v2, v0, [B

    iget v3, p0, Lj/c/a/e/f/l/b;->a:I

    int-to-byte v3, v3

    const/4 v4, 0x4

    aput-byte v3, v2, v4

    sub-int/2addr v0, v4

    invoke-static {v2, v0}, Lj/c/a/e/f/l/b;->a([BI)V

    iget-object v0, p0, Lj/c/a/e/f/l/b;->b:[B

    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
