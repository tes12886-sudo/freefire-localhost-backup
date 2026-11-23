.class Lj/d/d/z/n/n$a0$a;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/n/n$a0;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "TT1;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Class;

.field final synthetic b:Lj/d/d/z/n/n$a0;


# direct methods
.method constructor <init>(Lj/d/d/z/n/n$a0;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/n/n$a0$a;->b:Lj/d/d/z/n/n$a0;

    iput-object p2, p0, Lj/d/d/z/n/n$a0$a;->a:Ljava/lang/Class;

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT1;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/n/n$a0$a;->b:Lj/d/d/z/n/n$a0;

    iget-object v0, v0, Lj/d/d/z/n/n$a0;->b:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj/d/d/z/n/n$a0$a;->a:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lj/d/d/s;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lj/d/d/z/n/n$a0$a;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " but was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj/d/d/b0/a;->Y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj/d/d/s;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT1;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/n/n$a0$a;->b:Lj/d/d/z/n/n$a0;

    iget-object v0, v0, Lj/d/d/z/n/n$a0;->b:Lj/d/d/w;

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
