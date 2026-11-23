.class public final Lcom/facebook/share/c/q;
.super Lcom/facebook/share/c/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/e<",
        "Lcom/facebook/share/c/q;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final g:Lcom/facebook/share/c/p;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/q$a;

    invoke-direct {v0}, Lcom/facebook/share/c/q$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/share/c/e;-><init>(Landroid/os/Parcel;)V

    new-instance v0, Lcom/facebook/share/c/p$b;

    invoke-direct {v0}, Lcom/facebook/share/c/p$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/p$b;->e(Landroid/os/Parcel;)Lcom/facebook/share/c/p$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/c/p$b;->d()Lcom/facebook/share/c/p;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/q;->g:Lcom/facebook/share/c/p;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/q;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Lcom/facebook/share/c/p;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/q;->g:Lcom/facebook/share/c/p;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/q;->h:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/facebook/share/c/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/share/c/q;->g:Lcom/facebook/share/c/p;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/facebook/share/c/q;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
