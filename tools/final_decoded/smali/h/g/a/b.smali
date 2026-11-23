.class public final Lh/g/a/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/g/a/b$b;,
        Lh/g/a/b$a;,
        Lh/g/a/b$d;,
        Lh/g/a/b$c;
    }
.end annotation


# direct methods
.method public static a(Lh/g/a/b$c;)Lj/d/b/a/a/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lh/g/a/b$c<",
            "TT;>;)",
            "Lj/d/b/a/a/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lh/g/a/b$a;

    invoke-direct {v0}, Lh/g/a/b$a;-><init>()V

    new-instance v1, Lh/g/a/b$d;

    invoke-direct {v1, v0}, Lh/g/a/b$d;-><init>(Lh/g/a/b$a;)V

    iput-object v1, v0, Lh/g/a/b$a;->b:Lh/g/a/b$d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lh/g/a/b$a;->a:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, Lh/g/a/b$c;->a(Lh/g/a/b$a;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    iput-object p0, v0, Lh/g/a/b$a;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {v1, p0}, Lh/g/a/b$d;->c(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-object v1
.end method
