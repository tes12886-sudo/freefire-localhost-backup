.class Lcom/appff/haptic/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/appff/haptic/FFHapticUtils;


# direct methods
.method constructor <init>(Lcom/appff/haptic/FFHapticUtils;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    iput-object p2, p0, Lcom/appff/haptic/f;->a:Ljava/lang/String;

    iput p3, p0, Lcom/appff/haptic/f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const-class v0, Ljava/lang/String;

    const-string v1, "Failed to get file descriptor."

    const-string v2, "FFHapticUtils"

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    iget-object v5, p0, Lcom/appff/haptic/f;->a:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v5

    new-array v6, v5, [B

    invoke-virtual {v4, v6}, Ljava/io/FileInputStream;->read([B)I

    iget-object v7, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v7, v6}, Lcom/appff/haptic/FFHapticUtils;->access$300(Lcom/appff/haptic/FFHapticUtils;[B)I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "duration:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v7, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v7}, Lcom/appff/haptic/FFHapticUtils;->access$400(Lcom/appff/haptic/FFHapticUtils;)V

    iget-object v7, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    new-instance v8, Landroid/os/MemoryFile;

    const-string v9, "run-act"

    invoke-direct {v8, v9, v5}, Landroid/os/MemoryFile;-><init>(Ljava/lang/String;I)V

    invoke-static {v7, v8}, Lcom/appff/haptic/FFHapticUtils;->access$502(Lcom/appff/haptic/FFHapticUtils;Landroid/os/MemoryFile;)Landroid/os/MemoryFile;

    iget-object v7, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v7}, Lcom/appff/haptic/FFHapticUtils;->access$500(Lcom/appff/haptic/FFHapticUtils;)Landroid/os/MemoryFile;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v6, v8, v8, v5}, Landroid/os/MemoryFile;->writeBytes([BIII)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "memory file buffer length:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-class v5, Landroid/os/MemoryFile;

    const-string v6, "getFileDescriptor"

    new-array v7, v8, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    iget-object v6, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v6}, Lcom/appff/haptic/FFHapticUtils;->access$500(Lcom/appff/haptic/FFHapticUtils;)Landroid/os/MemoryFile;

    move-result-object v6

    new-array v7, v8, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/FileDescriptor;

    invoke-static {v5}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_3
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    move-object v5, v3

    :goto_0
    if-nez v5, :cond_0

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    return-void

    :cond_0
    :try_start_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/16 v6, 0x1d

    const-string v7, "createStream"

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x3

    if-lt v1, v6, :cond_1

    :try_start_6
    iget-object v1, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v1}, Lcom/appff/haptic/FFHapticUtils;->access$000(Lcom/appff/haptic/FFHapticUtils;)Ljava/lang/Class;

    move-result-object v1

    new-array v6, v11, [Ljava/lang/Class;

    const-class v12, Landroid/os/ParcelFileDescriptor;

    aput-object v12, v6, v8

    aput-object v0, v6, v10

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v0, v6, v9

    invoke-virtual {v1, v7, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    aput-object v5, v1, v8

    iget-object v5, p0, Lcom/appff/haptic/f;->a:Ljava/lang/String;

    aput-object v5, v1, v10

    iget v5, p0, Lcom/appff/haptic/f;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v9

    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/VibrationEffect;

    iget-object v1, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v1}, Lcom/appff/haptic/FFHapticUtils;->access$100(Lcom/appff/haptic/FFHapticUtils;)Landroid/os/Vibrator;

    move-result-object v1

    :goto_2
    invoke-virtual {v1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    goto :goto_3

    :cond_1
    const/16 v6, 0x1a

    if-lt v1, v6, :cond_2

    iget-object v1, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v1}, Lcom/appff/haptic/FFHapticUtils;->access$000(Lcom/appff/haptic/FFHapticUtils;)Ljava/lang/Class;

    move-result-object v1

    new-array v6, v11, [Ljava/lang/Class;

    const-class v12, Ljava/io/FileDescriptor;

    aput-object v12, v6, v8

    aput-object v0, v6, v10

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v0, v6, v9

    invoke-virtual {v1, v7, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v5

    aput-object v5, v1, v8

    iget-object v5, p0, Lcom/appff/haptic/f;->a:Ljava/lang/String;

    aput-object v5, v1, v10

    iget v5, p0, Lcom/appff/haptic/f;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v9

    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/VibrationEffect;

    iget-object v1, p0, Lcom/appff/haptic/f;->c:Lcom/appff/haptic/FFHapticUtils;

    invoke-static {v1}, Lcom/appff/haptic/FFHapticUtils;->access$100(Lcom/appff/haptic/FFHapticUtils;)Landroid/os/Vibrator;

    move-result-object v1

    goto :goto_2

    :cond_2
    const-string v0, "The system is low than 26,does not support FF!!"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_3

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const-string v0, "The system doesn\'t integrate FF software"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    :try_start_8
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v4

    goto :goto_6

    :catch_3
    move-exception v0

    move-object v3, v4

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v0

    :goto_4
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v3, :cond_3

    :try_start_a
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_5

    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_3
    :goto_5
    return-void

    :goto_6
    if-eqz v3, :cond_4

    :try_start_b
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    goto :goto_7

    :catch_6
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_4
    :goto_7
    goto :goto_9

    :goto_8
    throw v0

    :goto_9
    goto :goto_8
.end method
