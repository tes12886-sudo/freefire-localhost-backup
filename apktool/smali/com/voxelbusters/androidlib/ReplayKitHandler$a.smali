.class Lcom/voxelbusters/androidlib/ReplayKitHandler$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxelbusters/androidlib/ReplayKitHandler;->savePreviewRecordingToGallery(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/voxelbusters/androidlib/ReplayKitHandler;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/ReplayKitHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    iput-object p2, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$500(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$600(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$700(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$800(Lcom/voxelbusters/androidlib/ReplayKitHandler;)I

    move-result v6

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$900(Lcom/voxelbusters/androidlib/ReplayKitHandler;)F

    move-result v7

    iget-object v8, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static/range {v3 .. v8}, Lcom/voxelbusters/androidlib/d/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IFLcom/voxelbusters/androidlib/c/g;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->a:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$600(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/voxelbusters/androidlib/d/b;->m(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    const-string v1, "PREVIEW_UNAVAILABLE"

    invoke-virtual {v0, v1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->onPreviewSaveFailed(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v3, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v3}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_4

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    iget-object v4, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->b:Ljava/lang/String;

    const-string v5, "title"

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->b:Ljava/lang/String;

    const-string v5, "_display_name"

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "mime_type"

    const-string v5, "video/mp4"

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "is_pending"

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Movies/"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v6}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/voxelbusters/androidlib/d/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v6, "relative_path"

    invoke-virtual {v3, v6, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v4}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v6, "external_primary"

    invoke-static {v6}, Landroid/provider/MediaStore$Video$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v4, v6, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v6

    const/4 v7, 0x0

    :try_start_1
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v4, v6}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v4

    const/16 v9, 0x800

    new-array v9, v9, [B

    :goto_2
    invoke-virtual {v0, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    if-lez v10, :cond_3

    invoke-virtual {v4, v9, v1, v10}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-static {}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "savePreviewRecordingToGallery  Uri->"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v3}, Landroid/content/ContentValues;->clear()V

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v6, v3, v7, v7}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v6}, Lcom/voxelbusters/androidlib/d/d;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->onPreviewSaveSuccess(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    invoke-virtual {v3}, Landroid/content/ContentValues;->clear()V

    invoke-virtual {v3, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$1000(Lcom/voxelbusters/androidlib/ReplayKitHandler;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, v6, v3, v7, v7}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object v1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$a;->c:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    const-string v2, "UNKNOWN"

    invoke-virtual {v1, v2}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->onPreviewSaveFailed(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    :cond_4
    new-instance v1, Lcom/voxelbusters/androidlib/ReplayKitHandler$a$a;

    invoke-direct {v1, p0, v3, v0}, Lcom/voxelbusters/androidlib/ReplayKitHandler$a$a;-><init>(Lcom/voxelbusters/androidlib/ReplayKitHandler$a;Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v2, "Need external storage access for saving video to gallery"

    invoke-static {v3, v0, v2, v1}, Lcom/voxelbusters/androidlib/d/b;->p(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/voxelbusters/androidlib/c/c;)V

    :goto_3
    return-void
.end method
