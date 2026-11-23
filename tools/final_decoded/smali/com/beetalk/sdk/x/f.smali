.class public Lcom/beetalk/sdk/x/f;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/x/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I

.field private c:Lcom/beetalk/sdk/x/b;


# direct methods
.method private constructor <init>(Landroid/widget/ImageView;I)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beetalk/sdk/x/f;->a:Ljava/lang/ref/WeakReference;

    iput p2, p0, Lcom/beetalk/sdk/x/f;->b:I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "cache_images"

    invoke-static {p1, p2}, Lcom/beetalk/sdk/x/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/beetalk/sdk/x/b;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/x/f;->c:Lcom/beetalk/sdk/x/b;

    return-void
.end method

.method synthetic constructor <init>(Landroid/widget/ImageView;ILcom/beetalk/sdk/x/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/x/f;-><init>(Landroid/widget/ImageView;I)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Lcom/beetalk/sdk/x/f$b;
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/x/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/beetalk/sdk/x/f$b;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/x/f$a;)V

    return-object v0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v1, p0, Lcom/beetalk/sdk/x/f;->c:Lcom/beetalk/sdk/x/b;

    invoke-virtual {v1, p1}, Lcom/beetalk/sdk/x/b;->d(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/x/f;->c:Lcom/beetalk/sdk/x/b;

    const v3, 0x2a300

    invoke-virtual {v2, p1, v1, v3}, Lcom/beetalk/sdk/x/b;->h(Ljava/lang/String;Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "ImageLoader failed to load image: out of memory"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-object v1
.end method

.method protected c(Landroid/graphics/Bitmap;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/x/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/x/f;->a([Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/x/f;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/x/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/beetalk/sdk/x/f;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method
