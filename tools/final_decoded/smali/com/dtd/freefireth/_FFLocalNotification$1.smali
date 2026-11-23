.class Lcom/dtd/freefireth/_FFLocalNotification$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dtd/freefireth/_FFLocalNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/dtd/freefireth/_FFLocalNotification;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lcom/dtd/freefireth/_FFLocalNotification;
    .locals 1

    new-instance v0, Lcom/dtd/freefireth/_FFLocalNotification;

    invoke-direct {v0, p1}, Lcom/dtd/freefireth/_FFLocalNotification;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/dtd/freefireth/_FFLocalNotification$1;->createFromParcel(Landroid/os/Parcel;)Lcom/dtd/freefireth/_FFLocalNotification;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/dtd/freefireth/_FFLocalNotification;
    .locals 0

    new-array p1, p1, [Lcom/dtd/freefireth/_FFLocalNotification;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/dtd/freefireth/_FFLocalNotification$1;->newArray(I)[Lcom/dtd/freefireth/_FFLocalNotification;

    move-result-object p1

    return-object p1
.end method
