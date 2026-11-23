.class final Lo/z/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo/h<",
        "Lm/e0;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/e;

.field private final b:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lj/d/d/e;Lj/d/d/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/e;",
            "Lj/d/d/w<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/z/a/c;->a:Lj/d/d/e;

    iput-object p2, p0, Lo/z/a/c;->b:Lj/d/d/w;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm/e0;

    invoke-virtual {p0, p1}, Lo/z/a/c;->b(Lm/e0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm/e0;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/e0;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lo/z/a/c;->a:Lj/d/d/e;

    invoke-virtual {p1}, Lm/e0;->c()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/d/d/e;->q(Ljava/io/Reader;)Lj/d/d/b0/a;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lo/z/a/c;->b:Lj/d/d/w;

    invoke-virtual {v1, v0}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v2, Lj/d/d/b0/b;->j:Lj/d/d/b0/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lm/e0;->close()V

    return-object v1

    :cond_0
    :try_start_1
    new-instance v0, Lj/d/d/l;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lj/d/d/l;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lm/e0;->close()V

    throw v0
.end method
