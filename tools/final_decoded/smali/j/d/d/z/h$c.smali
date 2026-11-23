.class final Lj/d/d/z/h$c;
.super Ljava/util/AbstractSet;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/z/h;


# direct methods
.method constructor <init>(Lj/d/d/z/h;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    invoke-virtual {v0}, Lj/d/d/z/h;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    invoke-virtual {v0, p1}, Lj/d/d/z/h;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Lj/d/d/z/h$c$a;

    invoke-direct {v0, p0}, Lj/d/d/z/h$c$a;-><init>(Lj/d/d/z/h$c;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    invoke-virtual {v0, p1}, Lj/d/d/z/h;->g(Ljava/lang/Object;)Lj/d/d/z/h$e;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    iget v0, v0, Lj/d/d/z/h;->c:I

    return v0
.end method
