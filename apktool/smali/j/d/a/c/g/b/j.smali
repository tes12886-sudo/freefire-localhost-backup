.class public final Lj/d/a/c/g/b/j;
.super Lcom/google/android/gms/common/internal/y/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj/d/a/c/g/b/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/common/internal/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/a/c/g/b/k;

    invoke-direct {v0}, Lj/d/a/c/g/b/k;-><init>()V

    sput-object v0, Lj/d/a/c/g/b/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/internal/s0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/y/a;-><init>()V

    iput p1, p0, Lj/d/a/c/g/b/j;->a:I

    iput-object p2, p0, Lj/d/a/c/g/b/j;->b:Lcom/google/android/gms/common/internal/s0;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/y/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lj/d/a/c/g/b/j;->a:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/y/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lj/d/a/c/g/b/j;->b:Lcom/google/android/gms/common/internal/s0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/y/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/y/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
