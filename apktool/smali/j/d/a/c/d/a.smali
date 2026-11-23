.class public final Lj/d/a/c/d/a;
.super Lcom/google/android/gms/common/internal/y/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj/d/a/c/d/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/a/c/d/f;

    invoke-direct {v0}, Lj/d/a/c/d/f;-><init>()V

    sput-object v0, Lj/d/a/c/d/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/y/a;-><init>()V

    iput-object p1, p0, Lj/d/a/c/d/a;->a:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final f()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lj/d/a/c/d/a;->a:Landroid/content/Intent;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/y/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lj/d/a/c/d/a;->a:Landroid/content/Intent;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/y/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/y/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
