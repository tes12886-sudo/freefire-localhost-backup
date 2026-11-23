.class Ll/v/d/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ll/v/a;)Ll/v/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ll/v/a<",
            "-TT;>;)",
            "Ll/v/a<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ll/v/e/a/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/v/e/a/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/v/e/a/c;->f()Ll/v/a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
