.class public final Lcom/facebook/share/c/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/c/c$c;,
        Lcom/facebook/share/c/c$d;,
        Lcom/facebook/share/c/c$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/facebook/share/c/c$b;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/facebook/share/c/c$d;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/c$a;

    invoke-direct {v0}, Lcom/facebook/share/c/c$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->c:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/c/c$b;

    iput-object v0, p0, Lcom/facebook/share/c/c;->f:Lcom/facebook/share/c/c$b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->g:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/c/c$d;

    iput-object v0, p0, Lcom/facebook/share/c/c;->h:Lcom/facebook/share/c/c$d;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->i:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/c/c$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->a(Lcom/facebook/share/c/c$c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->b(Lcom/facebook/share/c/c$c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->c(Lcom/facebook/share/c/c$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->d(Lcom/facebook/share/c/c$c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->e(Lcom/facebook/share/c/c$c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->f(Lcom/facebook/share/c/c$c;)Lcom/facebook/share/c/c$b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->f:Lcom/facebook/share/c/c$b;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->g(Lcom/facebook/share/c/c$c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->h(Lcom/facebook/share/c/c$c;)Lcom/facebook/share/c/c$d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/c/c;->h:Lcom/facebook/share/c/c$d;

    invoke-static {p1}, Lcom/facebook/share/c/c$c;->i(Lcom/facebook/share/c/c$c;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/share/c/c;->i:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/c/c$c;Lcom/facebook/share/c/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/c;-><init>(Lcom/facebook/share/c/c$c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/share/c/c$b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->f:Lcom/facebook/share/c/c$b;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/share/c/c$d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->h:Lcom/facebook/share/c/c$d;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/share/c/c;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/share/c/c;->i:Ljava/util/List;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/c/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/facebook/share/c/c;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->c:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->f:Lcom/facebook/share/c/c$b;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->h:Lcom/facebook/share/c/c$d;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/facebook/share/c/c;->i:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
