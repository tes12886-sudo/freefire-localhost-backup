.class public Lj/g/a/a/a/y/j/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/p;",
            "Lj/g/a/a/a/r;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p6}, Lj/g/a/a/a/y/j/b;->b(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lj/g/a/a/a/y/j/c;

    move-result-object p1

    invoke-virtual {p1}, Lj/g/a/a/a/y/j/c;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method b(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lj/g/a/a/a/y/j/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/p;",
            "Lj/g/a/a/a/r;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lj/g/a/a/a/y/j/c;"
        }
    .end annotation

    new-instance v7, Lj/g/a/a/a/y/j/c;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lj/g/a/a/a/y/j/c;-><init>(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v7
.end method
