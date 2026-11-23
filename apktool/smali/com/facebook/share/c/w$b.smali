.class public final Lcom/facebook/share/c/w$b;
.super Lcom/facebook/share/c/h$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/h$a<",
        "Lcom/facebook/share/c/w;",
        "Lcom/facebook/share/c/w$b;",
        ">;"
    }
.end annotation


# instance fields
.field private b:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/share/c/h$a;-><init>()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/share/c/w$b;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/w$b;->b:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public f()Lcom/facebook/share/c/w;
    .locals 2

    new-instance v0, Lcom/facebook/share/c/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/c/w;-><init>(Lcom/facebook/share/c/w$b;Lcom/facebook/share/c/w$a;)V

    return-object v0
.end method

.method g(Landroid/os/Parcel;)Lcom/facebook/share/c/w$b;
    .locals 1

    const-class v0, Lcom/facebook/share/c/w;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/facebook/share/c/w;

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/w$b;->h(Lcom/facebook/share/c/w;)Lcom/facebook/share/c/w$b;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/facebook/share/c/w;)Lcom/facebook/share/c/w$b;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/share/c/h$a;->b(Lcom/facebook/share/c/h;)Lcom/facebook/share/c/h$a;

    move-object v0, p0

    check-cast v0, Lcom/facebook/share/c/w$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/w;->c()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/w$b;->i(Landroid/net/Uri;)Lcom/facebook/share/c/w$b;

    return-object v0
.end method

.method public i(Landroid/net/Uri;)Lcom/facebook/share/c/w$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/c/w$b;->b:Landroid/net/Uri;

    return-object p0
.end method
