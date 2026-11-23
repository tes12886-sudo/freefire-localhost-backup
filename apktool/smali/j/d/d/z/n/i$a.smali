.class Lj/d/d/z/n/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/n/i;->f(Lj/d/d/v;)Lj/d/d/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/z/n/i;


# direct methods
.method constructor <init>(Lj/d/d/z/n/i;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/n/i$a;->a:Lj/d/d/z/n/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 0
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

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lj/d/d/z/n/i$a;->a:Lj/d/d/z/n/i;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
