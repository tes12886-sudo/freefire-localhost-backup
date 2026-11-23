.class public Lcom/vk/sdk/k/k/c;
.super Lcom/vk/sdk/k/k/r$b;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lcom/vk/sdk/k/k/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/vk/sdk/k/k/r$b;-><init>()V

    new-instance v0, Lcom/vk/sdk/k/k/u;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/u;-><init>()V

    iput-object v0, p0, Lcom/vk/sdk/k/k/c;->e:Lcom/vk/sdk/k/k/u;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/c;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/c;

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "app"

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Attaching app info is not supported by VK.com API"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/c;
    .locals 3

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/c;->a:I

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/c;->b:Ljava/lang/String;

    const-string v0, "photo_130"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/c;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->e:Lcom/vk/sdk/k/k/u;

    iget-object v1, p0, Lcom/vk/sdk/k/k/c;->c:Ljava/lang/String;

    const/16 v2, 0x82

    invoke-static {v1, v2}, Lcom/vk/sdk/k/k/k;->h(Ljava/lang/String;I)Lcom/vk/sdk/k/k/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_0
    const-string v0, "photo_604"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/vk/sdk/k/k/c;->d:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/vk/sdk/k/k/c;->e:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->d:Ljava/lang/String;

    const/16 v1, 0x25c

    invoke-static {v0, v1}, Lcom/vk/sdk/k/k/k;->h(Ljava/lang/String;I)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_1
    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget v0, p0, Lcom/vk/sdk/k/k/c;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/c;->e:Lcom/vk/sdk/k/k/u;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
