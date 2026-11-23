.class public Lcom/vk/sdk/k/k/r;
.super Lcom/vk/sdk/k/k/s;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/k/r$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/vk/sdk/k/k/s<",
        "Lcom/vk/sdk/k/k/r$b;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# instance fields
.field private final c:Lcom/vk/sdk/k/k/s$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/vk/sdk/k/k/s$a<",
            "Lcom/vk/sdk/k/k/r$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/vk/sdk/k/k/s;-><init>()V

    new-instance v0, Lcom/vk/sdk/k/k/r$a;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/k/r$a;-><init>(Lcom/vk/sdk/k/k/r;)V

    iput-object v0, p0, Lcom/vk/sdk/k/k/r;->c:Lcom/vk/sdk/k/k/s$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/vk/sdk/k/k/r$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/k/s;-><init>(Ljava/util/List;)V

    new-instance p1, Lcom/vk/sdk/k/k/r$a;

    invoke-direct {p1, p0}, Lcom/vk/sdk/k/k/r$a;-><init>(Lcom/vk/sdk/k/k/r;)V

    iput-object p1, p0, Lcom/vk/sdk/k/k/r;->c:Lcom/vk/sdk/k/k/s$a;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(Lorg/json/JSONArray;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/k/r;->c:Lcom/vk/sdk/k/k/s$a;

    invoke-super {p0, p1, v0}, Lcom/vk/sdk/k/k/s;->h(Lorg/json/JSONArray;Lcom/vk/sdk/k/k/s$a;)V

    return-void
.end method

.method public u()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/vk/sdk/k/k/s;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vk/sdk/k/k/r$b;

    invoke-virtual {v2}, Lcom/vk/sdk/k/k/r$b;->f()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v1, ","

    invoke-static {v0, v1}, Lcom/vk/sdk/m/b;->a(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/vk/sdk/k/k/s;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p0}, Lcom/vk/sdk/k/k/s;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/vk/sdk/k/k/r$b;

    invoke-virtual {v0}, Lcom/vk/sdk/k/k/r$b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
