.class public final Lcom/facebook/share/c/w;
.super Lcom/facebook/share/c/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/c/w$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/w$a;

    invoke-direct {v0}, Lcom/facebook/share/c/w$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/share/c/h;-><init>(Landroid/os/Parcel;)V

    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/facebook/share/c/w;->b:Landroid/net/Uri;

    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/c/w$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/h;-><init>(Lcom/facebook/share/c/h$a;)V

    invoke-static {p1}, Lcom/facebook/share/c/w$b;->e(Lcom/facebook/share/c/w$b;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/w;->b:Landroid/net/Uri;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/c/w$b;Lcom/facebook/share/c/w$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/w;-><init>(Lcom/facebook/share/c/w$b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/share/c/h$b;
    .locals 1

    sget-object v0, Lcom/facebook/share/c/h$b;->b:Lcom/facebook/share/c/h$b;

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/w;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/facebook/share/c/h;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/share/c/w;->b:Landroid/net/Uri;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
