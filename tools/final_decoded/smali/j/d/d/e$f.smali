.class Lj/d/d/e$f;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/d/d/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/e$f;->a:Lj/d/d/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/e$f;->a:Lj/d/d/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public e(Lj/d/d/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/w<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/e$f;->a:Lj/d/d/w;

    if-nez v0, :cond_0

    iput-object p1, p0, Lj/d/d/e$f;->a:Lj/d/d/w;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method
