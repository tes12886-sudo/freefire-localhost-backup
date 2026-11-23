.class public Lcom/voxelbusters/androidlib/internal/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Landroid/media/MediaCodec;

.field private b:[Ljava/nio/ByteBuffer;

.field private c:[Ljava/nio/ByteBuffer;

.field private d:Landroid/media/MediaCodec$BufferInfo;

.field private e:Ljava/io/FileOutputStream;

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/voxelbusters/androidlib/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lcom/voxelbusters/androidlib/c/b;

.field private l:J

.field private m:J

.field private n:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/a;->b:[Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/a;->c:[Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/a;->e:Ljava/io/FileOutputStream;

    const/4 v0, 0x3

    iput v0, p0, Lcom/voxelbusters/androidlib/internal/a;->h:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/a;->i:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->i:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lcom/voxelbusters/androidlib/internal/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/voxelbusters/androidlib/internal/a;->j:Z

    return p0
.end method

.method static synthetic c(Lcom/voxelbusters/androidlib/internal/a;I)J
    .locals 0

    invoke-direct {p0, p1}, Lcom/voxelbusters/androidlib/internal/a;->s(I)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->d:Landroid/media/MediaCodec$BufferInfo;

    return-object p0
.end method

.method static synthetic e(Lcom/voxelbusters/androidlib/internal/a;)[Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->c:[Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic f(Lcom/voxelbusters/androidlib/internal/a;[BII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/voxelbusters/androidlib/internal/a;->p([BII)V

    return-void
.end method

.method static synthetic g(Lcom/voxelbusters/androidlib/internal/a;)J
    .locals 2

    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->l:J

    return-wide v0
.end method

.method static synthetic h(Lcom/voxelbusters/androidlib/internal/a;)J
    .locals 2

    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->m:J

    return-wide v0
.end method

.method static synthetic i(Lcom/voxelbusters/androidlib/internal/a;)J
    .locals 4

    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/voxelbusters/androidlib/internal/a;->m:J

    return-wide v0
.end method

.method static synthetic j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;

    return-object p0
.end method

.method static synthetic k(Lcom/voxelbusters/androidlib/internal/a;)Ljava/io/FileOutputStream;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->e:Ljava/io/FileOutputStream;

    return-object p0
.end method

.method static synthetic l(Lcom/voxelbusters/androidlib/internal/a;)Lcom/voxelbusters/androidlib/c/b;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->k:Lcom/voxelbusters/androidlib/c/b;

    return-object p0
.end method

.method static synthetic m(Lcom/voxelbusters/androidlib/internal/a;)J
    .locals 2

    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->n:J

    return-wide v0
.end method

.method static synthetic n(Lcom/voxelbusters/androidlib/internal/a;)I
    .locals 0

    iget p0, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    return p0
.end method

.method static synthetic o(Lcom/voxelbusters/androidlib/internal/a;)[Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/a;->b:[Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method private p([BII)V
    .locals 4

    iget v0, p0, Lcom/voxelbusters/androidlib/internal/a;->h:I

    iget v1, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    add-int/lit8 v2, p2, 0x0

    const/4 v3, -0x1

    aput-byte v3, p1, v2

    add-int/lit8 v2, p2, 0x1

    const/16 v3, -0xf

    aput-byte v3, p1, v2

    add-int/lit8 v2, p2, 0x2

    shl-int/lit8 v0, v0, 0x2

    const/16 v3, 0x40

    add-int/2addr v3, v0

    shr-int/lit8 v0, v1, 0x2

    add-int/2addr v3, v0

    int-to-byte v0, v3

    aput-byte v0, p1, v2

    add-int/lit8 v0, p2, 0x3

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x6

    shr-int/lit8 v2, p3, 0xb

    add-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x4

    and-int/lit16 v1, p3, 0x7ff

    shr-int/lit8 v1, v1, 0x3

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x5

    and-int/lit8 p3, p3, 0x7

    shl-int/lit8 p3, p3, 0x5

    add-int/lit8 p3, p3, 0x1f

    int-to-byte p3, p3

    aput-byte p3, p1, v0

    add-int/lit8 p2, p2, 0x6

    const/4 p3, -0x4

    aput-byte p3, p1, p2

    return-void
.end method

.method private q(I)V
    .locals 4

    const/16 v0, 0xd

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    const/4 v2, 0x3

    iput v2, p0, Lcom/voxelbusters/androidlib/internal/a;->h:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, v1, v2

    if-ne p1, v3, :cond_0

    iput v2, p0, Lcom/voxelbusters/androidlib/internal/a;->h:I

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x17700
        0x15888
        0xfa00
        0xbb80
        0xac44
        0x7d00
        0x5dc0
        0x5622
        0x3e80
        0x2ee0
        0x2b11
        0x1f40
        0x1cb6
    .end array-data
.end method

.method private s(I)J
    .locals 4

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget p1, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    int-to-long v2, p1

    div-long/2addr v0, v2

    iget p1, p0, Lcom/voxelbusters/androidlib/internal/a;->f:I

    int-to-long v2, p1

    div-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public r([FI)V
    .locals 4

    iget-boolean v0, p0, Lcom/voxelbusters/androidlib/internal/a;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->l:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->l:J

    new-instance v0, Lcom/voxelbusters/androidlib/b/a;

    invoke-direct {v0, p2, p1}, Lcom/voxelbusters/androidlib/b/a;-><init>(I[F)V

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->i:Ljava/util/ArrayList;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/voxelbusters/androidlib/internal/a;->i:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public t(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setChannels :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AacEncode"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput p1, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->e:Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public v(I)V
    .locals 2

    iput p1, p0, Lcom/voxelbusters/androidlib/internal/a;->f:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSampleRate :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AacEncode"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, p1}, Lcom/voxelbusters/androidlib/internal/a;->q(I)V

    return-void
.end method

.method public w(Lcom/voxelbusters/androidlib/c/b;)V
    .locals 3

    const-string v0, "audio/mp4a-latm"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start   SampleRate = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/a;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "   Channels = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AacEncode"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/voxelbusters/androidlib/internal/a;->m:J

    iput-wide v1, p0, Lcom/voxelbusters/androidlib/internal/a;->l:J

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->k:Lcom/voxelbusters/androidlib/c/b;

    :try_start_0
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lcom/voxelbusters/androidlib/internal/a;->f:I

    iget v1, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    invoke-static {v0, p1, v1}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object p1

    const-string v1, "mime"

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "aac-profile"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v0, p0, Lcom/voxelbusters/androidlib/internal/a;->f:I

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/a;->g:I

    mul-int v0, v0, v2

    mul-int/lit8 v0, v0, 0x2

    const-string v1, "bitrate"

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v1, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->b:[Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->c:[Ljava/nio/ByteBuffer;

    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a;->d:Landroid/media/MediaCodec$BufferInfo;

    iput-boolean v2, p0, Lcom/voxelbusters/androidlib/internal/a;->j:Z

    new-instance p1, Lcom/voxelbusters/androidlib/internal/a$a;

    invoke-direct {p1, p0}, Lcom/voxelbusters/androidlib/internal/a$a;-><init>(Lcom/voxelbusters/androidlib/internal/a;)V

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public x()V
    .locals 5

    :try_start_0
    const-string v0, "AacEncode"

    const-string v1, "audio record stop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/voxelbusters/androidlib/internal/a;->j:Z

    iget-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->l:J

    iget-wide v2, p0, Lcom/voxelbusters/androidlib/internal/a;->m:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->n:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/voxelbusters/androidlib/internal/a;->n:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
