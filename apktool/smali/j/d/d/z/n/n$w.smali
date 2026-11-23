.class Lj/d/d/z/n/n$w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/n/n;->a(Lj/d/d/a0/a;Lj/d/d/w;)Lj/d/d/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/a0/a;

.field final synthetic b:Lj/d/d/w;


# direct methods
.method constructor <init>(Lj/d/d/a0/a;Lj/d/d/w;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/n/n$w;->a:Lj/d/d/a0/a;

    iput-object p2, p0, Lj/d/d/z/n/n$w;->b:Lj/d/d/w;

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

    iget-object p1, p0, Lj/d/d/z/n/n$w;->a:Lj/d/d/a0/a;

    invoke-virtual {p2, p1}, Lj/d/d/a0/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj/d/d/z/n/n$w;->b:Lj/d/d/w;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
