.class public final Lj/c/a/f/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lj/c/a/f/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lj/c/a/f/a;
    .locals 8

    new-instance v7, Lj/c/a/f/a;

    iget-object v1, p0, Lj/c/a/f/b;->a:Ljava/lang/String;

    iget-object v2, p0, Lj/c/a/f/b;->b:Ljava/lang/String;

    iget-object v3, p0, Lj/c/a/f/b;->c:Ljava/lang/Integer;

    iget-object v4, p0, Lj/c/a/f/b;->d:Ljava/lang/Integer;

    iget-object v5, p0, Lj/c/a/f/b;->e:Ljava/lang/String;

    iget-object v6, p0, Lj/c/a/f/b;->f:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lj/c/a/f/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public b(Ljava/lang/String;)Lj/c/a/f/b;
    .locals 0

    iput-object p1, p0, Lj/c/a/f/b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/Integer;)Lj/c/a/f/b;
    .locals 0

    iput-object p1, p0, Lj/c/a/f/b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lj/c/a/f/b;
    .locals 0

    iput-object p1, p0, Lj/c/a/f/b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lj/c/a/f/b;
    .locals 0

    iput-object p1, p0, Lj/c/a/f/b;->e:Ljava/lang/String;

    return-object p0
.end method
