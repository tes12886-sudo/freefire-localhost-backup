.class final Lj/e/b/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/e/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lj/e/b/e;",
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
.method public final a(Landroid/os/Parcel;)Lj/e/b/e;
    .locals 2

    new-instance v0, Lj/e/b/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj/e/b/e;-><init>(Landroid/os/Parcel;Lj/e/b/e$a;)V

    return-object v0
.end method

.method public final b(I)[Lj/e/b/e;
    .locals 0

    new-array p1, p1, [Lj/e/b/e;

    return-object p1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/e/b/e$a;->a(Landroid/os/Parcel;)Lj/e/b/e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/e/b/e$a;->b(I)[Lj/e/b/e;

    move-result-object p1

    return-object p1
.end method
