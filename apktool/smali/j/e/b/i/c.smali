.class public Lj/e/b/i/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj/e/b/i/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lj/e/b/i/c;


# instance fields
.field private final a:Lj/e/b/d;

.field private final b:Lj/e/b/f;

.field private final c:Lj/e/b/e;

.field private final d:Lj/e/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj/e/b/i/c;

    sget-object v1, Lj/e/b/d;->b:Lj/e/b/d;

    sget-object v2, Lj/e/b/b;->c:Lj/e/b/b;

    invoke-direct {v0, v1, v2}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/b;)V

    sput-object v0, Lj/e/b/i/c;->e:Lj/e/b/i/c;

    new-instance v0, Lj/e/b/i/c$a;

    invoke-direct {v0}, Lj/e/b/i/c$a;-><init>()V

    sput-object v0, Lj/e/b/i/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lj/e/b/d;

    iput-object v0, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    const-class v0, Lj/e/b/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lj/e/b/f;

    iput-object v0, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    const-class v0, Lj/e/b/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lj/e/b/e;

    iput-object v0, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    const-class v0, Lj/e/b/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lj/e/b/b;

    iput-object p1, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lj/e/b/i/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/e/b/i/c;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lj/e/b/d;Lj/e/b/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0, p2}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/f;Lj/e/b/e;Lj/e/b/b;)V

    return-void
.end method

.method constructor <init>(Lj/e/b/d;Lj/e/b/f;Lj/e/b/e;Lj/e/b/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    iput-object p2, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    iput-object p3, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    iput-object p4, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    return-void
.end method

.method public constructor <init>(Lj/e/b/f;Lj/e/b/e;)V
    .locals 2

    sget-object v0, Lj/e/b/d;->a:Lj/e/b/d;

    sget-object v1, Lj/e/b/b;->c:Lj/e/b/b;

    invoke-direct {p0, v0, p1, p2, v1}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/f;Lj/e/b/e;Lj/e/b/b;)V

    return-void
.end method


# virtual methods
.method public a()Lj/e/b/b;
    .locals 1

    iget-object v0, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    return-object v0
.end method

.method public b()Lj/e/b/e;
    .locals 1

    iget-object v0, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    return-object v0
.end method

.method public c()Lj/e/b/d;
    .locals 1

    iget-object v0, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    const-class v1, Lj/e/b/i/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_2

    :cond_1
    check-cast p1, Lj/e/b/i/c;

    iget-object v1, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    iget-object v2, p1, Lj/e/b/i/c;->a:Lj/e/b/d;

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    if-eqz v1, :cond_3

    iget-object v2, p1, Lj/e/b/i/c;->b:Lj/e/b/f;

    invoke-virtual {v1, v2}, Lj/e/b/f;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_3
    iget-object v1, p1, Lj/e/b/i/c;->b:Lj/e/b/f;

    if-eqz v1, :cond_4

    :goto_0
    return v0

    :cond_4
    iget-object v1, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    if-eqz v1, :cond_5

    iget-object v2, p1, Lj/e/b/i/c;->c:Lj/e/b/e;

    invoke-virtual {v1, v2}, Lj/e/b/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_5
    iget-object v1, p1, Lj/e/b/i/c;->c:Lj/e/b/e;

    if-eqz v1, :cond_6

    :goto_1
    return v0

    :cond_6
    iget-object v0, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    iget-object p1, p1, Lj/e/b/i/c;->d:Lj/e/b/b;

    invoke-virtual {v0, p1}, Lj/e/b/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_2
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lj/e/b/f;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lj/e/b/e;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    invoke-virtual {v1}, Lj/e/b/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LineLoginResult{errorData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineProfile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineCredential="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lj/e/b/i/c;->a:Lj/e/b/d;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lj/e/b/i/c;->b:Lj/e/b/f;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lj/e/b/i/c;->c:Lj/e/b/e;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lj/e/b/i/c;->d:Lj/e/b/b;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
