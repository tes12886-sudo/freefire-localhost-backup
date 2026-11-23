.class public final Lj/d/d/z/n/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/d/z/n/b$a;
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/z/c;


# direct methods
.method public constructor <init>(Lj/d/d/z/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/b;->a:Lj/d/d/z/c;

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 3
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

    invoke-virtual {p2}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lj/d/d/z/b;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v1

    iget-object v2, p0, Lj/d/d/z/n/b;->a:Lj/d/d/z/c;

    invoke-virtual {v2, p2}, Lj/d/d/z/c;->a(Lj/d/d/a0/a;)Lj/d/d/z/i;

    move-result-object p2

    new-instance v2, Lj/d/d/z/n/b$a;

    invoke-direct {v2, p1, v0, v1, p2}, Lj/d/d/z/n/b$a;-><init>(Lj/d/d/e;Ljava/lang/reflect/Type;Lj/d/d/w;Lj/d/d/z/i;)V

    return-object v2
.end method
