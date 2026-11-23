.class Lcom/voxelbusters/androidlib/internal/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxelbusters/androidlib/internal/a;->w(Lcom/voxelbusters/androidlib/c/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxelbusters/androidlib/internal/a;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/internal/a;)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    const/high16 v0, 0x20000

    :try_start_0
    new-array v0, v0, [B

    :goto_0
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->b(Lcom/voxelbusters/androidlib/internal/a;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "AacEncode"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "audio real record stop write count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v3}, Lcom/voxelbusters/androidlib/internal/a;->g(Lcom/voxelbusters/androidlib/internal/a;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "  encode count"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v3}, Lcom/voxelbusters/androidlib/internal/a;->h(Lcom/voxelbusters/androidlib/internal/a;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/a;->k(Lcom/voxelbusters/androidlib/internal/a;)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/a;->l(Lcom/voxelbusters/androidlib/internal/a;)Lcom/voxelbusters/androidlib/c/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/a;->l(Lcom/voxelbusters/androidlib/internal/a;)Lcom/voxelbusters/androidlib/c/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/voxelbusters/androidlib/c/b;->onAudioEncodeComplete()V

    :cond_0
    monitor-exit v1

    goto/16 :goto_2

    :cond_1
    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->g(Lcom/voxelbusters/androidlib/internal/a;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->h(Lcom/voxelbusters/androidlib/internal/a;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-double v2, v2

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->m(Lcom/voxelbusters/androidlib/internal/a;)J

    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    long-to-double v4, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double v2, v2, v4

    :try_start_2
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->l(Lcom/voxelbusters/androidlib/internal/a;)Lcom/voxelbusters/androidlib/c/b;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->l(Lcom/voxelbusters/androidlib/internal/a;)Lcom/voxelbusters/androidlib/c/b;

    move-result-object v2

    invoke-interface {v2, v3}, Lcom/voxelbusters/androidlib/c/a;->onAudioEncodeProgress(I)V

    :cond_2
    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    monitor-exit v1

    goto/16 :goto_0

    :cond_3
    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/voxelbusters/androidlib/b/a;

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->a(Lcom/voxelbusters/androidlib/internal/a;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->i(Lcom/voxelbusters/androidlib/internal/a;)J

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->n(Lcom/voxelbusters/androidlib/internal/a;)I

    move-result v1

    const/16 v4, 0x7fff

    invoke-virtual {v2, v1, v4, v0}, Lcom/voxelbusters/androidlib/b/a;->a(IS[B)I

    move-result v8

    if-gtz v8, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v1

    const-wide/16 v12, 0x2710

    invoke-virtual {v1, v12, v13}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v6

    if-ltz v6, :cond_5

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->o(Lcom/voxelbusters/androidlib/internal/a;)[Ljava/nio/ByteBuffer;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-virtual {v1, v0, v3, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v5

    const/4 v7, 0x0

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1, v8}, Lcom/voxelbusters/androidlib/internal/a;->c(Lcom/voxelbusters/androidlib/internal/a;I)J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    :cond_5
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v1

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v2}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v2

    invoke-virtual {v1, v2, v12, v13}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ltz v1, :cond_6

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v4

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/lit8 v5, v4, 0x7

    iget-object v6, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v6}, Lcom/voxelbusters/androidlib/internal/a;->e(Lcom/voxelbusters/androidlib/internal/a;)[Ljava/nio/ByteBuffer;

    move-result-object v6

    aget-object v6, v6, v1

    iget-object v7, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v7}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v7

    iget v7, v7, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v7, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v7}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v7

    iget v7, v7, Landroid/media/MediaCodec$BufferInfo;->offset:I

    add-int/2addr v7, v4

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v7, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v7, v0, v2, v5}, Lcom/voxelbusters/androidlib/internal/a;->f(Lcom/voxelbusters/androidlib/internal/a;[BII)V

    add-int/lit8 v7, v2, 0x7

    invoke-virtual {v6, v0, v7, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v4

    iget v4, v4, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr v2, v5

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v4

    invoke-virtual {v4, v1, v3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->j(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec;

    move-result-object v1

    iget-object v4, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/internal/a;->d(Lcom/voxelbusters/androidlib/internal/a;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v4

    invoke-virtual {v1, v4, v12, v13}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v1

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/a$a;->a:Lcom/voxelbusters/androidlib/internal/a;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/a;->k(Lcom/voxelbusters/androidlib/internal/a;)Ljava/io/FileOutputStream;

    move-result-object v1

    invoke-virtual {v1, v0, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method
