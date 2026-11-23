.class public Lcom/vk/sdk/k/l/a;
.super Lcom/vk/sdk/h;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/l/a$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/vk/sdk/k/l/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:Lcom/vk/sdk/k/l/a$c;

.field public d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/l/a$a;

    invoke-direct {v0}, Lcom/vk/sdk/k/l/a$a;-><init>()V

    sput-object v0, Lcom/vk/sdk/k/l/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/vk/sdk/h;-><init>()V

    sget-object v0, Lcom/vk/sdk/k/l/a$c;->b:Lcom/vk/sdk/k/l/a$c;

    iput-object v0, p0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0}, Lcom/vk/sdk/h;-><init>()V

    sget-object v0, Lcom/vk/sdk/k/l/a$c;->b:Lcom/vk/sdk/k/l/a$c;

    iput-object v0, p0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/vk/sdk/k/l/a$c;->values()[Lcom/vk/sdk/k/l/a$c;

    move-result-object v1

    aget-object v0, v1, v0

    :goto_0
    iput-object v0, p0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, Lcom/vk/sdk/k/l/a;->d:F

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/vk/sdk/k/l/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/l/a;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static e(F)Lcom/vk/sdk/k/l/a;
    .locals 2

    new-instance v0, Lcom/vk/sdk/k/l/a;

    invoke-direct {v0}, Lcom/vk/sdk/k/l/a;-><init>()V

    sget-object v1, Lcom/vk/sdk/k/l/a$c;->a:Lcom/vk/sdk/k/l/a$c;

    iput-object v1, v0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    iput p0, v0, Lcom/vk/sdk/k/l/a;->d:F

    return-object v0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/vk/sdk/k/l/a$b;->a:[I

    iget-object v1, p0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const-string v0, "file"

    return-object v0

    :cond_0
    const-string v0, "png"

    return-object v0

    :cond_1
    const-string v0, "jpg"

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/vk/sdk/k/l/a;->c:Lcom/vk/sdk/k/l/a$c;

    if-nez p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/vk/sdk/k/l/a;->d:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
