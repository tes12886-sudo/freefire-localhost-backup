.class Lj/d/d/z/p/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/p/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/sql/Timestamp;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    const-class p2, Ljava/util/Date;

    invoke-virtual {p1, p2}, Lj/d/d/e;->n(Ljava/lang/Class;)Lj/d/d/w;

    move-result-object p1

    new-instance p2, Lj/d/d/z/p/c;

    invoke-direct {p2, p1, v1}, Lj/d/d/z/p/c;-><init>(Lj/d/d/w;Lj/d/d/z/p/c$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
