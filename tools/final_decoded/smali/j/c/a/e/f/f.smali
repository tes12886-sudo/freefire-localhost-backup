.class public final Lj/c/a/e/f/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lj/c/a/e/h/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lj/c/a/e/f/f;->a:Ljava/util/HashMap;

    return-void
.end method

.method private static a(Lj/c/a/e/h/a;)V
    .locals 2

    sget-object v0, Lj/c/a/e/f/f;->a:Ljava/util/HashMap;

    invoke-virtual {p0}, Lj/c/a/e/h/a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static b()V
    .locals 1

    sget-object v0, Lj/c/a/e/f/f;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    new-instance v0, Lj/c/a/e/h/d;

    invoke-direct {v0}, Lj/c/a/e/h/d;-><init>()V

    invoke-static {v0}, Lj/c/a/e/f/f;->a(Lj/c/a/e/h/a;)V

    new-instance v0, Lj/c/a/e/h/b;

    invoke-direct {v0}, Lj/c/a/e/h/b;-><init>()V

    invoke-static {v0}, Lj/c/a/e/f/f;->a(Lj/c/a/e/h/a;)V

    new-instance v0, Lj/c/a/e/h/c;

    invoke-direct {v0}, Lj/c/a/e/h/c;-><init>()V

    invoke-static {v0}, Lj/c/a/e/f/f;->a(Lj/c/a/e/h/a;)V

    return-void
.end method

.method public static c(Lj/c/a/e/f/l/b;)V
    .locals 3

    sget-object v0, Lj/c/a/e/f/f;->a:Ljava/util/HashMap;

    invoke-virtual {p0}, Lj/c/a/e/f/l/b;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/c/a/e/h/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/c/a/e/f/l/b;->c()[B

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    array-length v2, p0

    invoke-virtual {v0, p0, v1, v2}, Lj/c/a/e/h/a;->b([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
