.class public Lcom/vk/sdk/k/k/j;
.super Lcom/vk/sdk/k/k/r$b;
.source ""

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/vk/sdk/k/k/a;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Z

.field public h:J

.field public i:J

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Lcom/vk/sdk/k/k/u;


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

    iput-object v0, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/j;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/j;

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "album"

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "album"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/vk/sdk/k/k/j;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/vk/sdk/k/k/j;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/j;
    .locals 3

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/j;->a:I

    const-string v0, "thumb_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/j;->j:I

    const-string v0, "owner_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/j;->f:I

    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/j;->b:Ljava/lang/String;

    const-string v0, "description"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/j;->e:Ljava/lang/String;

    const-string v0, "created"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/vk/sdk/k/k/j;->i:J

    const-string v0, "updated"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/vk/sdk/k/k/j;->h:J

    const-string v0, "size"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/j;->c:I

    const-string v0, "can_upload"

    invoke-static {p1, v0}, Lcom/vk/sdk/k/k/b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/vk/sdk/k/k/j;->g:Z

    const-string v0, "thumb_src"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/j;->k:Ljava/lang/String;

    const-string v0, "privacy"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "privacy_view"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/vk/sdk/k/k/v;->a(Lorg/json/JSONObject;)I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/vk/sdk/k/k/j;->d:I

    const-string v0, "sizes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/u;->v(Lorg/json/JSONArray;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    const/16 v0, 0x4b

    const/16 v1, 0x37

    const-string v2, "http://vk.com/images/s_noalbum.png"

    invoke-static {v2, v0, v1}, Lcom/vk/sdk/k/k/k;->j(Ljava/lang/String;II)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    iget-object p1, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    const/16 v0, 0x82

    const/16 v1, 0x61

    const-string v2, "http://vk.com/images/m_noalbum.png"

    invoke-static {v2, v0, v1}, Lcom/vk/sdk/k/k/k;->j(Ljava/lang/String;II)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    iget-object p1, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    const/16 v0, 0x1b0

    const/16 v1, 0xf9

    const-string v2, "http://vk.com/images/x_noalbum.png"

    invoke-static {v2, v0, v1}, Lcom/vk/sdk/k/k/k;->j(Ljava/lang/String;II)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    iget-object p1, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    invoke-virtual {p1}, Lcom/vk/sdk/k/k/u;->y()V

    :goto_1
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget v0, p0, Lcom/vk/sdk/k/k/j;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/vk/sdk/k/k/j;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/vk/sdk/k/k/j;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/vk/sdk/k/k/j;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/vk/sdk/k/k/j;->g:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-wide v0, p0, Lcom/vk/sdk/k/k/j;->h:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/vk/sdk/k/k/j;->i:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Lcom/vk/sdk/k/k/j;->j:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/j;->l:Lcom/vk/sdk/k/k/u;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
