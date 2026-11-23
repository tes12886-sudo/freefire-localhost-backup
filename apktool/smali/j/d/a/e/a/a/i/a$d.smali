.class Lj/d/a/e/a/a/i/a$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method static synthetic a(Lj/d/a/e/a/a/i/a$d;)Z
    .locals 0

    invoke-direct {p0}, Lj/d/a/e/a/a/i/a$d;->c()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lj/d/a/e/a/a/i/a$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/d/a/e/a/a/i/a$d;->d(Ljava/lang/String;)V

    return-void
.end method

.method private c()Z
    .locals 2

    iget-object v0, p0, Lj/d/a/e/a/a/i/a$d;->a:Ljava/lang/String;

    iget v1, p0, Lj/d/a/e/a/a/i/a$d;->b:I

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lj/d/a/e/a/a/i/a$d;->b:I

    iget-object v1, p0, Lj/d/a/e/a/a/i/a$d;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method
