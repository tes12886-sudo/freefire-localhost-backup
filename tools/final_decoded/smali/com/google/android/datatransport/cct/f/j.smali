.class public abstract Lcom/google/android/datatransport/cct/f/j;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lcom/google/android/datatransport/cct/f/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/datatransport/cct/f/m;",
            ">;)",
            "Lcom/google/android/datatransport/cct/f/j;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/datatransport/cct/f/d;

    invoke-direct {v0, p0}, Lcom/google/android/datatransport/cct/f/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lcom/google/firebase/i/a;
    .locals 2

    new-instance v0, Lcom/google/firebase/i/i/d;

    invoke-direct {v0}, Lcom/google/firebase/i/i/d;-><init>()V

    sget-object v1, Lcom/google/android/datatransport/cct/f/b;->a:Lcom/google/firebase/i/h/a;

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/i/d;->g(Lcom/google/firebase/i/h/a;)Lcom/google/firebase/i/i/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/i/d;->h(Z)Lcom/google/firebase/i/i/d;

    invoke-virtual {v0}, Lcom/google/firebase/i/i/d;->f()Lcom/google/firebase/i/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/datatransport/cct/f/m;",
            ">;"
        }
    .end annotation
.end method
