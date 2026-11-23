.class public Lcom/vk/sdk/k/k/i;
.super Lcom/vk/sdk/k/k/r$b;
.source ""

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/vk/sdk/k/k/a;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Lcom/vk/sdk/k/k/u;

.field public o:Z

.field public p:Z

.field public q:I

.field public r:I

.field public s:I

.field public t:Ljava/lang/String;


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

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/i;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/i;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "photo"

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "photo"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/vk/sdk/k/k/i;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/vk/sdk/k/k/i;->a:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/vk/sdk/k/k/i;->t:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/vk/sdk/k/k/i;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-object v0
.end method

.method public h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/i;
    .locals 4

    const-string v0, "album_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->b:I

    const-string v0, "date"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/vk/sdk/k/k/i;->g:J

    const-string v0, "height"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->e:I

    const-string v0, "width"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->d:I

    const-string v0, "owner_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->c:I

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->a:I

    const-string v0, "text"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->f:Ljava/lang/String;

    const-string v0, "access_key"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->t:Ljava/lang/String;

    const-string v0, "photo_75"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->h:Ljava/lang/String;

    const-string v0, "photo_130"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->i:Ljava/lang/String;

    const-string v0, "photo_604"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->j:Ljava/lang/String;

    const-string v0, "photo_807"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->k:Ljava/lang/String;

    const-string v0, "photo_1280"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->l:Ljava/lang/String;

    const-string v0, "photo_2560"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/k/i;->m:Ljava/lang/String;

    const-string v0, "likes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "count"

    invoke-static {v0, v1}, Lcom/vk/sdk/k/k/b;->c(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/vk/sdk/k/k/i;->q:I

    const-string v2, "user_likes"

    invoke-static {v0, v2}, Lcom/vk/sdk/k/k/b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/vk/sdk/k/k/i;->o:Z

    const-string v0, "comments"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/vk/sdk/k/k/b;->c(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->r:I

    const-string v0, "tags"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/vk/sdk/k/k/b;->c(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/vk/sdk/k/k/i;->s:I

    const-string v0, "can_comment"

    invoke-static {p1, v0}, Lcom/vk/sdk/k/k/b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/vk/sdk/k/k/i;->p:Z

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget v1, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v2, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/vk/sdk/k/k/u;->x(II)V

    const-string v0, "sizes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/u;->v(Lorg/json/JSONArray;)V

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->h:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->h:Ljava/lang/String;

    const/16 v1, 0x73

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_1
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->i:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->i:Ljava/lang/String;

    const/16 v1, 0x6d

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_2
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->j:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->j:Ljava/lang/String;

    const/16 v1, 0x78

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_3
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->k:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->k:Ljava/lang/String;

    const/16 v1, 0x79

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_4
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->l:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->l:Ljava/lang/String;

    const/16 v1, 0x7a

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_5
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->m:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->m:Ljava/lang/String;

    const/16 v1, 0x77

    iget v2, p0, Lcom/vk/sdk/k/k/i;->d:I

    iget v3, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/vk/sdk/k/k/k;->f(Ljava/lang/String;CII)Lcom/vk/sdk/k/k/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_6
    iget-object p1, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    invoke-virtual {p1}, Lcom/vk/sdk/k/k/u;->y()V

    :goto_0
    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget v0, p0, Lcom/vk/sdk/k/k/i;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/vk/sdk/k/k/i;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/vk/sdk/k/k/i;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/vk/sdk/k/k/i;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/vk/sdk/k/k/i;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/vk/sdk/k/k/i;->g:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->j:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->k:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->l:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/vk/sdk/k/k/i;->o:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lcom/vk/sdk/k/k/i;->p:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/vk/sdk/k/k/i;->q:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/vk/sdk/k/k/i;->r:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/vk/sdk/k/k/i;->s:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/vk/sdk/k/k/i;->t:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
