.class Lj/g/a/a/a/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g/a/a/a/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lj/g/a/a/a/p;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lj/g/a/a/a/p;
    .locals 2

    new-instance v0, Lj/g/a/a/a/p;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj/g/a/a/a/p;-><init>(Landroid/os/Parcel;Lj/g/a/a/a/p$a;)V

    return-object v0
.end method

.method public b(I)[Lj/g/a/a/a/p;
    .locals 0

    new-array p1, p1, [Lj/g/a/a/a/p;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/g/a/a/a/p$a;->a(Landroid/os/Parcel;)Lj/g/a/a/a/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/g/a/a/a/p$a;->b(I)[Lj/g/a/a/a/p;

    move-result-object p1

    return-object p1
.end method
