.class public final Lcom/facebook/share/c/p;
.super Lcom/facebook/share/c/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/c/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/s<",
        "Lcom/facebook/share/c/p;",
        "Lcom/facebook/share/c/p$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/share/c/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/share/c/p$a;

    invoke-direct {v0}, Lcom/facebook/share/c/p$a;-><init>()V

    sput-object v0, Lcom/facebook/share/c/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/s;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/c/p$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/s;-><init>(Lcom/facebook/share/c/s$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/c/p$b;Lcom/facebook/share/c/p$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/c/p;-><init>(Lcom/facebook/share/c/p$b;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "og:type"

    invoke-virtual {p0, v0}, Lcom/facebook/share/c/s;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
