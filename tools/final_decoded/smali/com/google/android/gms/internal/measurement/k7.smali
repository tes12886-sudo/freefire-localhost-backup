.class public abstract Lcom/google/android/gms/internal/measurement/k7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/l7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/measurement/k7<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/ca;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic F([BLcom/google/android/gms/internal/measurement/l8;)Lcom/google/android/gms/internal/measurement/ca;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/google/android/gms/internal/measurement/k7;->m([BIILcom/google/android/gms/internal/measurement/l8;)Lcom/google/android/gms/internal/measurement/k7;

    return-object p0
.end method

.method public final bridge synthetic O([B)Lcom/google/android/gms/internal/measurement/ca;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/measurement/k7;->k([BII)Lcom/google/android/gms/internal/measurement/k7;

    return-object p0
.end method

.method public abstract k([BII)Lcom/google/android/gms/internal/measurement/k7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII)TBuilderType;"
        }
    .end annotation
.end method

.method public final bridge synthetic l(Lcom/google/android/gms/internal/measurement/da;)Lcom/google/android/gms/internal/measurement/ca;
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/ea;->h()Lcom/google/android/gms/internal/measurement/da;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/l7;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/k7;->n(Lcom/google/android/gms/internal/measurement/l7;)Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract m([BIILcom/google/android/gms/internal/measurement/l8;)Lcom/google/android/gms/internal/measurement/k7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/android/gms/internal/measurement/l8;",
            ")TBuilderType;"
        }
    .end annotation
.end method

.method protected abstract n(Lcom/google/android/gms/internal/measurement/l7;)Lcom/google/android/gms/internal/measurement/k7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation
.end method
