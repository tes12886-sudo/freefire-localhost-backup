.class public final Lcom/facebook/share/c/u;
.super Lcom/facebook/share/c/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/c/u$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/e<",
        "Lcom/facebook/share/c/u;",
        "Lcom/facebook/share/c/u$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/share/c/t;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/u$a;

    invoke-direct {v0}, Lcom/facebook/share/c/u$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/e;-><init>(Landroid/os/Parcel;)V

    invoke-static {p1}, Lcom/facebook/share/c/t$b;->n(Landroid/os/Parcel;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/u;->g:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/c/u$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/e;-><init>(Lcom/facebook/share/c/e$a;)V

    invoke-static {p1}, Lcom/facebook/share/c/u$b;->n(Lcom/facebook/share/c/u$b;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/u;->g:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/c/u$b;Lcom/facebook/share/c/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/u;-><init>(Lcom/facebook/share/c/u$b;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/share/c/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/share/c/u;->g:Ljava/util/List;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/facebook/share/c/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/facebook/share/c/u;->g:Ljava/util/List;

    invoke-static {p1, p2, v0}, Lcom/facebook/share/c/t$b;->s(Landroid/os/Parcel;ILjava/util/List;)V

    return-void
.end method
