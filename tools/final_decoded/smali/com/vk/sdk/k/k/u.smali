.class public Lcom/vk/sdk/k/k/u;
.super Lcom/vk/sdk/k/k/s;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/vk/sdk/k/k/s<",
        "Lcom/vk/sdk/k/k/k;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# instance fields
.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private final g:Lcom/vk/sdk/k/k/s$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/vk/sdk/k/k/s$a<",
            "Lcom/vk/sdk/k/k/k;",
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

    const/4 v0, 0x1

    iput v0, p0, Lcom/vk/sdk/k/k/u;->c:I

    iput v0, p0, Lcom/vk/sdk/k/k/u;->d:I

    new-instance v0, Lcom/vk/sdk/k/k/u$a;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/k/u$a;-><init>(Lcom/vk/sdk/k/k/u;)V

    iput-object v0, p0, Lcom/vk/sdk/k/k/u;->g:Lcom/vk/sdk/k/k/s$a;

    return-void
.end method

.method static synthetic t(Lcom/vk/sdk/k/k/u;)I
    .locals 0

    iget p0, p0, Lcom/vk/sdk/k/k/u;->c:I

    return p0
.end method

.method static synthetic u(Lcom/vk/sdk/k/k/u;)I
    .locals 0

    iget p0, p0, Lcom/vk/sdk/k/k/u;->d:I

    return p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Lorg/json/JSONArray;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/k/u;->g:Lcom/vk/sdk/k/k/s$a;

    invoke-virtual {p0, p1, v0}, Lcom/vk/sdk/k/k/s;->h(Lorg/json/JSONArray;Lcom/vk/sdk/k/k/s$a;)V

    invoke-virtual {p0}, Lcom/vk/sdk/k/k/u;->y()V

    return-void
.end method

.method public w(C)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/vk/sdk/k/k/s;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vk/sdk/k/k/k;

    iget-char v2, v1, Lcom/vk/sdk/k/k/k;->d:C

    if-ne v2, p1, :cond_0

    iget-object p1, v1, Lcom/vk/sdk/k/k/k;->a:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/vk/sdk/k/k/s;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/vk/sdk/k/k/u;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/vk/sdk/k/k/u;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/u;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/vk/sdk/k/k/u;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public x(II)V
    .locals 0

    if-eqz p1, :cond_0

    iput p1, p0, Lcom/vk/sdk/k/k/u;->c:I

    :cond_0
    if-eqz p2, :cond_1

    iput p2, p0, Lcom/vk/sdk/k/k/u;->d:I

    :cond_1
    return-void
.end method

.method public y()V
    .locals 0

    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method
