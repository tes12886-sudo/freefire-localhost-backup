.class public final Lh/g/a/c;
.super Lh/g/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lh/g/a/a<",
        "TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh/g/a/a;-><init>()V

    return-void
.end method

.method public static s()Lh/g/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lh/g/a/c<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lh/g/a/c;

    invoke-direct {v0}, Lh/g/a/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public p(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lh/g/a/a;->p(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lh/g/a/a;->q(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
