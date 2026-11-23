.class public final Lcom/facebook/share/c/x;
.super Lcom/facebook/share/c/e;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/e<",
        "Lcom/facebook/share/c/x;",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Lcom/facebook/share/c/t;

.field private final j:Lcom/facebook/share/c/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/x$a;

    invoke-direct {v0}, Lcom/facebook/share/c/x$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/facebook/share/c/e;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/x;->g:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/x;->h:Ljava/lang/String;

    new-instance v0, Lcom/facebook/share/c/t$b;

    invoke-direct {v0}, Lcom/facebook/share/c/t$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/t$b;->l(Landroid/os/Parcel;)Lcom/facebook/share/c/t$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/c/t$b;->k()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/facebook/share/c/t$b;->j()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/share/c/t$b;->i()Lcom/facebook/share/c/t;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/facebook/share/c/x;->i:Lcom/facebook/share/c/t;

    new-instance v0, Lcom/facebook/share/c/w$b;

    invoke-direct {v0}, Lcom/facebook/share/c/w$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/w$b;->g(Landroid/os/Parcel;)Lcom/facebook/share/c/w$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/share/c/w$b;->f()Lcom/facebook/share/c/w;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/x;->j:Lcom/facebook/share/c/w;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/x;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/x;->h:Ljava/lang/String;

    return-object v0
.end method

.method public j()Lcom/facebook/share/c/t;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/x;->i:Lcom/facebook/share/c/t;

    return-object v0
.end method

.method public k()Lcom/facebook/share/c/w;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/x;->j:Lcom/facebook/share/c/w;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/facebook/share/c/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/share/c/x;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/x;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/x;->i:Lcom/facebook/share/c/t;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/facebook/share/c/x;->j:Lcom/facebook/share/c/w;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
