.class public final Lcom/facebook/share/c/t$b;
.super Lcom/facebook/share/c/h$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/h$a<",
        "Lcom/facebook/share/c/t;",
        "Lcom/facebook/share/c/t$b;",
        ">;"
    }
.end annotation


# instance fields
.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/net/Uri;

.field private d:Z

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/share/c/h$a;-><init>()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/share/c/t$b;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/t$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method static synthetic f(Lcom/facebook/share/c/t$b;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/t$b;->c:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic g(Lcom/facebook/share/c/t$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/share/c/t$b;->d:Z

    return p0
.end method

.method static synthetic h(Lcom/facebook/share/c/t$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/t$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method static n(Landroid/os/Parcel;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/share/c/t;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/facebook/share/c/h$a;->c(Landroid/os/Parcel;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/share/c/h;

    instance-of v2, v1, Lcom/facebook/share/c/t;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/facebook/share/c/t;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method static s(Landroid/os/Parcel;ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "I",
            "Ljava/util/List<",
            "Lcom/facebook/share/c/t;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/facebook/share/c/h;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/share/c/h;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    return-void
.end method


# virtual methods
.method public i()Lcom/facebook/share/c/t;
    .locals 2

    new-instance v0, Lcom/facebook/share/c/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/c/t;-><init>(Lcom/facebook/share/c/t$b;Lcom/facebook/share/c/t$a;)V

    return-object v0
.end method

.method j()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/t$b;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method k()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/t$b;->c:Landroid/net/Uri;

    return-object v0
.end method

.method l(Landroid/os/Parcel;)Lcom/facebook/share/c/t$b;
    .locals 1

    const-class v0, Lcom/facebook/share/c/t;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/facebook/share/c/t;

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/t$b;->m(Lcom/facebook/share/c/t;)Lcom/facebook/share/c/t$b;

    move-result-object p1

    return-object p1
.end method

.method public m(Lcom/facebook/share/c/t;)Lcom/facebook/share/c/t$b;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/share/c/h$a;->b(Lcom/facebook/share/c/h;)Lcom/facebook/share/c/h$a;

    move-object v0, p0

    check-cast v0, Lcom/facebook/share/c/t$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/t;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/c/t$b;->o(Landroid/graphics/Bitmap;)Lcom/facebook/share/c/t$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/t;->e()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/c/t$b;->q(Landroid/net/Uri;)Lcom/facebook/share/c/t$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/t;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/c/t$b;->r(Z)Lcom/facebook/share/c/t$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/t;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/t$b;->p(Ljava/lang/String;)Lcom/facebook/share/c/t$b;

    return-object v0
.end method

.method public o(Landroid/graphics/Bitmap;)Lcom/facebook/share/c/t$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/t$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/facebook/share/c/t$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/t$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public q(Landroid/net/Uri;)Lcom/facebook/share/c/t$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/t$b;->c:Landroid/net/Uri;

    return-object p0
.end method

.method public r(Z)Lcom/facebook/share/c/t$b;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/share/c/t$b;->d:Z

    return-object p0
.end method
