.class Lj/d/d/z/n/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/n/j;->f(Lj/d/d/v;)Lj/d/d/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/v;


# direct methods
.method constructor <init>(Lj/d/d/v;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/n/j$a;->a:Lj/d/d/v;

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

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Lj/d/d/z/n/j;

    iget-object v0, p0, Lj/d/d/z/n/j$a;->a:Lj/d/d/v;

    invoke-direct {p2, p1, v0, v1}, Lj/d/d/z/n/j;-><init>(Lj/d/d/e;Lj/d/d/v;Lj/d/d/z/n/j$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
