.class public Lh/u/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static a(Landroid/webkit/WebSettings;)Lh/u/c/b;
    .locals 1

    invoke-static {}, Lh/u/c/d;->c()Lh/u/c/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lh/u/c/g;->a(Landroid/webkit/WebSettings;)Lh/u/c/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/webkit/WebSettings;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-string v0, "FORCE_DARK"

    invoke-static {v0}, Lh/u/c/c;->a(Ljava/lang/String;)Lh/u/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lh/u/c/c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/webkit/WebSettings;->setForceDark(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh/u/c/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lh/u/a;->a(Landroid/webkit/WebSettings;)Lh/u/c/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lh/u/c/b;->a(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lh/u/c/c;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
