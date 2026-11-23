.class public abstract Lj/f/a/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/f/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lj/f/a/b<",
        "TT;TB;>;B:",
        "Lj/f/a/b$a<",
        "TT;TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Ln/b;

.field b:Lj/f/a/g;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILj/f/a/a;Ljava/lang/Object;)Lj/f/a/b$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lj/f/a/a;",
            "Ljava/lang/Object;",
            ")",
            "Lj/f/a/b$a<",
            "TT;TB;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/f/a/b$a;->b:Lj/f/a/g;

    if-nez v0, :cond_0

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    iput-object v0, p0, Lj/f/a/b$a;->a:Ln/b;

    new-instance v1, Lj/f/a/g;

    invoke-direct {v1, v0}, Lj/f/a/g;-><init>(Ln/c;)V

    iput-object v1, p0, Lj/f/a/b$a;->b:Lj/f/a/g;

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lj/f/a/a;->a()Lj/f/a/e;

    move-result-object p2

    iget-object v0, p0, Lj/f/a/b$a;->b:Lj/f/a/g;

    invoke-virtual {p2, v0, p1, p3}, Lj/f/a/e;->i(Lj/f/a/g;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final b()Ln/e;
    .locals 1

    iget-object v0, p0, Lj/f/a/b$a;->a:Ln/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln/b;->Z()Ln/b;

    move-result-object v0

    invoke-virtual {v0}, Ln/b;->j0()Ln/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ln/e;->e:Ln/e;

    :goto_0
    return-object v0
.end method
