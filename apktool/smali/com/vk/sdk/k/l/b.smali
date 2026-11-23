.class public Lcom/vk/sdk/k/l/b;
.super Lcom/vk/sdk/h;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/vk/sdk/k/l/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final c:Landroid/graphics/Bitmap;

.field public final d:Lcom/vk/sdk/k/l/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/l/b$a;

    invoke-direct {v0}, Lcom/vk/sdk/k/l/b$a;-><init>()V

    sput-object v0, Lcom/vk/sdk/k/l/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/vk/sdk/k/l/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/h;-><init>()V

    iput-object p1, p0, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/vk/sdk/k/l/b;->d:Lcom/vk/sdk/k/l/a;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Lcom/vk/sdk/h;-><init>()V

    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    const-class v0, Lcom/vk/sdk/k/l/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/vk/sdk/k/l/a;

    iput-object p1, p0, Lcom/vk/sdk/k/l/b;->d:Lcom/vk/sdk/k/l/a;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/vk/sdk/k/l/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/l/b;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/io/File;
    .locals 7

    invoke-static {}, Lcom/vk/sdk/j;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :cond_2
    :goto_0
    :try_start_0
    const-string v0, "tmpImg"

    const-string v3, ".%s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/vk/sdk/k/l/b;->d:Lcom/vk/sdk/k/l/a;

    invoke-virtual {v6}, Lcom/vk/sdk/k/l/a;->d()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget-object v2, p0, Lcom/vk/sdk/k/l/b;->d:Lcom/vk/sdk/k/l/a;

    iget-object v3, v2, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    sget-object v4, Lcom/vk/sdk/k/l/a$c;->b:Lcom/vk/sdk/k/l/a$c;

    if-ne v3, v4, :cond_3

    iget-object v2, p0, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {v2, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget v2, v2, Lcom/vk/sdk/k/l/a;->d:F

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float v2, v2, v5

    float-to-int v2, v2

    invoke-virtual {v3, v4, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    :goto_1
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/vk/sdk/k/l/b;->d:Lcom/vk/sdk/k/l/a;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
