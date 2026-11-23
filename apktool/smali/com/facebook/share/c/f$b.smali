.class public Lcom/facebook/share/c/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Object<",
        "Lcom/facebook/share/c/f;",
        "Lcom/facebook/share/c/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/share/c/f$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/f$b;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/facebook/share/c/f;
    .locals 2

    new-instance v0, Lcom/facebook/share/c/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/c/f;-><init>(Lcom/facebook/share/c/f$b;Lcom/facebook/share/c/f$a;)V

    return-object v0
.end method

.method c(Landroid/os/Parcel;)Lcom/facebook/share/c/f$b;
    .locals 1

    const-class v0, Lcom/facebook/share/c/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/facebook/share/c/f;

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/f$b;->d(Lcom/facebook/share/c/f;)Lcom/facebook/share/c/f$b;

    return-object p0
.end method

.method public d(Lcom/facebook/share/c/f;)Lcom/facebook/share/c/f$b;
    .locals 0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/c/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/f$b;->e(Ljava/lang/String;)Lcom/facebook/share/c/f$b;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/share/c/f$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/f$b;->a:Ljava/lang/String;

    return-object p0
.end method
