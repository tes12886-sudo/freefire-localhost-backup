.class public Lcom/voxelbusters/androidlib/d/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Ljava/lang/String; = "MediaMuxerHelper"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IFLcom/voxelbusters/androidlib/c/g;)Z
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    const/4 v6, 0x0

    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/voxelbusters/androidlib/d/b;->m(Ljava/lang/String;)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v7, :cond_1b

    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/voxelbusters/androidlib/d/b;->m(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1b

    invoke-static/range {p2 .. p2}, Lcom/voxelbusters/androidlib/d/b;->m(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_a

    :cond_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v8, 0x12

    if-ge v7, v8, :cond_4

    if-eqz v5, :cond_1

    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerEnd()V

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_3
    return v6

    :cond_4
    :try_start_2
    sget-object v7, Lcom/voxelbusters/androidlib/d/c;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "muxerVideoAudio: video->"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "  audio->"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "  out->"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " videoBitRate->"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "  videoFrameRate->"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v5, :cond_5

    :try_start_3
    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerStart()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_5
    :try_start_4
    new-instance v7, Landroid/media/MediaMuxer;

    invoke-direct {v7, v2, v6}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    new-instance v8, Landroid/media/MediaExtractor;

    invoke-direct {v8}, Landroid/media/MediaExtractor;-><init>()V

    invoke-virtual {v8, v0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    new-instance v9, Landroid/media/MediaExtractor;

    invoke-direct {v9}, Landroid/media/MediaExtractor;-><init>()V

    invoke-virtual {v9, v1}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v11
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string v12, "durationUs"

    const-string v13, "mime"

    if-ge v10, v11, :cond_9

    :try_start_5
    invoke-virtual {v8, v10}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v11

    invoke-virtual {v11, v13}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v14, "video/"

    invoke-virtual {v6, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    if-lez v3, :cond_6

    const-string v6, "bitrate"

    invoke-virtual {v11, v6, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_6
    const/4 v3, 0x0

    cmpl-float v3, v4, v3

    if-lez v3, :cond_7

    const-string v3, "frame-rate"

    invoke-virtual {v11, v3, v4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_7
    invoke-virtual {v8, v10}, Landroid/media/MediaExtractor;->selectTrack(I)V

    invoke-virtual {v7, v11}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v3

    invoke-virtual {v11, v12}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    const-string v4, "max-input-size"

    invoke-virtual {v11, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :cond_8
    add-int/lit8 v10, v10, 0x1

    const/4 v6, 0x0

    goto :goto_0

    :cond_9
    const/4 v3, -0x1

    const/4 v4, 0x0

    const-wide/16 v14, 0x0

    :goto_1
    if-nez v4, :cond_a

    const/high16 v4, 0x100000

    :cond_a
    const/4 v10, 0x0

    :goto_2
    :try_start_6
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-ge v10, v11, :cond_c

    :try_start_7
    invoke-virtual {v9, v10}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v11

    invoke-virtual {v11, v13}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v18, v13

    const-string v13, "audio/"

    invoke-virtual {v6, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v9, v10}, Landroid/media/MediaExtractor;->selectTrack(I)V

    invoke-virtual {v7, v11}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v6

    invoke-virtual {v11, v12}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    move-result-wide v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :cond_b
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v13, v18

    goto :goto_2

    :cond_c
    const/4 v6, -0x1

    const-wide/16 v10, 0x0

    :goto_3
    :try_start_8
    sget-object v12, Lcom/voxelbusters/androidlib/d/c;->a:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "muxerVideoAudio: videoTrackIndex = "

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "  audioTrackIndex = "

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v12, 0x1

    const-wide/16 v16, 0x0

    cmp-long v2, v14, v16

    if-gtz v2, :cond_d

    move-wide v14, v12

    :cond_d
    cmp-long v2, v10, v16

    if-gtz v2, :cond_e

    move-wide v10, v12

    :cond_e
    invoke-virtual {v7}, Landroid/media/MediaMuxer;->start()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    const/4 v2, -0x1

    if-eq v2, v3, :cond_12

    :try_start_9
    new-instance v2, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v2}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    const-wide/16 v12, 0x0

    iput-wide v12, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    const/4 v12, 0x0

    :goto_4
    const/4 v13, 0x0

    invoke-virtual {v8, v4, v13}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v0

    if-gez v0, :cond_f

    const/4 v0, -0x1

    goto :goto_5

    :cond_f
    iput v13, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iput v0, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v0

    iput v0, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v0

    iput-wide v0, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v7, v3, v4, v2}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iget-wide v0, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    long-to-double v0, v0

    move-object/from16 p4, v2

    move v13, v3

    long-to-double v2, v14

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    mul-double v0, v0, v18

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    :try_start_a
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v1, v0

    if-le v1, v12, :cond_11

    if-eqz v5, :cond_10

    invoke-interface {v5, v1}, Lcom/voxelbusters/androidlib/c/g;->onMuxerProgress(I)V

    :cond_10
    move v12, v1

    :cond_11
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->advance()Z

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move v3, v13

    goto :goto_4

    :catchall_0
    move-object/from16 v1, p1

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object/from16 v1, p1

    goto/16 :goto_9

    :cond_12
    const/4 v0, -0x1

    const/4 v12, 0x0

    :goto_5
    if-eq v0, v6, :cond_16

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const/high16 v1, 0x100000

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    :goto_6
    const/4 v2, 0x0

    invoke-virtual {v9, v1, v2}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v3

    if-gez v3, :cond_13

    goto :goto_7

    :cond_13
    iput v2, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iput v3, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v9}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v2

    iput v2, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual {v9}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v2

    iput-wide v2, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v7, v6, v1, v0}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iget-wide v2, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    long-to-double v2, v2

    long-to-double v13, v10

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v13

    mul-double v2, v2, v18

    const-wide/high16 v13, 0x4059000000000000L    # 100.0

    mul-double v2, v2, v13

    :try_start_b
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    add-int/lit8 v3, v3, 0x32

    if-le v3, v12, :cond_15

    if-eqz v5, :cond_14

    invoke-interface {v5, v3}, Lcom/voxelbusters/androidlib/c/g;->onMuxerProgress(I)V

    :cond_14
    move v12, v3

    :cond_15
    invoke-virtual {v9}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_6

    :cond_16
    :goto_7
    if-eqz v5, :cond_17

    const/16 v0, 0x64

    invoke-interface {v5, v0}, Lcom/voxelbusters/androidlib/c/g;->onMuxerProgress(I)V

    :cond_17
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->release()V

    invoke-virtual {v9}, Landroid/media/MediaExtractor;->release()V

    invoke-virtual {v7}, Landroid/media/MediaMuxer;->stop()V

    invoke-virtual {v7}, Landroid/media/MediaMuxer;->release()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v5, :cond_18

    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerEnd()V

    :cond_18
    new-instance v0, Ljava/io/File;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_19
    new-instance v0, Ljava/io/File;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1a
    const/4 v0, 0x1

    return v0

    :catchall_1
    :goto_8
    move-object/from16 v2, p2

    goto :goto_c

    :catch_1
    move-exception v0

    :goto_9
    move-object/from16 v2, p2

    goto :goto_b

    :cond_1b
    :goto_a
    if-eqz v5, :cond_1c

    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerEnd()V

    :cond_1c
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1d
    new-instance v0, Ljava/io/File;

    move-object/from16 v2, p2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1e
    const/4 v1, 0x0

    return v1

    :catchall_2
    nop

    goto :goto_c

    :catch_2
    move-exception v0

    :goto_b
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    if-eqz v5, :cond_1f

    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerEnd()V

    :cond_1f
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_20
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_21
    const/4 v1, 0x0

    return v1

    :goto_c
    if-eqz v5, :cond_22

    invoke-interface/range {p5 .. p5}, Lcom/voxelbusters/androidlib/c/g;->onMuxerEnd()V

    :cond_22
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_23
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_24
    const/4 v1, 0x0

    return v1
.end method
