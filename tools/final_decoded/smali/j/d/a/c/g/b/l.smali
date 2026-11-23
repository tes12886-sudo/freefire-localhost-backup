.class public final Lj/d/a/c/g/b/l;
.super Lcom/google/android/gms/common/internal/y/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj/d/a/c/g/b/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/common/ConnectionResult;

.field private final c:Lcom/google/android/gms/common/internal/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/a/c/g/b/m;

    invoke-direct {v0}, Lj/d/a/c/g/b/m;-><init>()V

    sput-object v0, Lj/d/a/c/g/b/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/internal/u0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/y/a;-><init>()V

    iput p1, p0, Lj/d/a/c/g/b/l;->a:I

    iput-object p2, p0, Lj/d/a/c/g/b/l;->b:Lcom/google/android/gms/common/ConnectionResult;

    iput-object p3, p0, Lj/d/a/c/g/b/l;->c:Lcom/google/android/gms/common/internal/u0;

    return-void
.end method


# virtual methods
.method public final f()Lcom/google/android/gms/common/ConnectionResult;
    .locals 1

    iget-object v0, p0, Lj/d/a/c/g/b/l;->b:Lcom/google/android/gms/common/ConnectionResult;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/common/internal/u0;
    .locals 1

    iget-object v0, p0, Lj/d/a/c/g/b/l;->c:Lcom/google/android/gms/common/internal/u0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/y/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lj/d/a/c/g/b/l;->a:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/y/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lj/d/a/c/g/b/l;->b:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/y/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lj/d/a/c/g/b/l;->c:Lcom/google/android/gms/common/internal/u0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/y/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/y/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
