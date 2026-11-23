.class public Lcom/facebook/share/c/d;
.super Lcom/facebook/share/c/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/e<",
        "Lcom/facebook/share/c/d;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private g:Ljava/lang/String;

.field private h:Lcom/facebook/share/c/a;

.field private i:Lcom/facebook/share/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/d$a;

    invoke-direct {v0}, Lcom/facebook/share/c/d$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/share/c/e;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/d;->g:Ljava/lang/String;

    new-instance v0, Lcom/facebook/share/c/a$b;

    invoke-direct {v0}, Lcom/facebook/share/c/a$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/a$b;->c(Landroid/os/Parcel;)Lcom/facebook/share/c/a$b;

    invoke-virtual {v0}, Lcom/facebook/share/c/a$b;->b()Lcom/facebook/share/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/d;->h:Lcom/facebook/share/c/a;

    new-instance v0, Lcom/facebook/share/c/b$b;

    invoke-direct {v0}, Lcom/facebook/share/c/b$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/b$b;->c(Landroid/os/Parcel;)Lcom/facebook/share/c/b$b;

    invoke-virtual {v0}, Lcom/facebook/share/c/b$b;->b()Lcom/facebook/share/c/b;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/d;->i:Lcom/facebook/share/c/b;

    return-void
.end method


# virtual methods
.method public h()Lcom/facebook/share/c/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/d;->h:Lcom/facebook/share/c/a;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public j()Lcom/facebook/share/c/b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/d;->i:Lcom/facebook/share/c/b;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/facebook/share/c/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/share/c/d;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/d;->h:Lcom/facebook/share/c/a;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/facebook/share/c/d;->i:Lcom/facebook/share/c/b;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
