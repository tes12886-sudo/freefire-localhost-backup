.class Lj/d/d/w$a;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/w;->a()Lj/d/d/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/w;


# direct methods
.method constructor <init>(Lj/d/d/w;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/w$a;->a:Lj/d/d/w;

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->i:Lj/d/d/b0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lj/d/d/w$a;->a:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/d/d/w$a;->a:Lj/d/d/w;

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
