.class public abstract Lj/d/d/w;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lj/d/d/w$a;

    invoke-direct {v0, p0}, Lj/d/d/w$a;-><init>(Lj/d/d/w;)V

    return-object v0
.end method

.method public abstract b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation
.end method

.method public final c(Ljava/lang/Object;)Lj/d/d/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lj/d/d/k;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lj/d/d/z/n/g;

    invoke-direct {v0}, Lj/d/d/z/n/g;-><init>()V

    invoke-virtual {p0, v0, p1}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj/d/d/z/n/g;->r0()Lj/d/d/k;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lj/d/d/l;

    invoke-direct {v0, p1}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT;)V"
        }
    .end annotation
.end method
