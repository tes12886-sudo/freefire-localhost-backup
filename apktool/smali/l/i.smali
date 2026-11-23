.class Ll/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ll/y/b/a;)Ll/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ll/y/b/a<",
            "+TT;>;)",
            "Ll/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll/o;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Ll/o;-><init>(Ll/y/b/a;Ljava/lang/Object;ILl/y/c/f;)V

    return-object v0
.end method
