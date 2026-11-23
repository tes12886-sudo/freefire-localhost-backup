.class final Lj/d/a/c/f/h/a0;
.super Lj/d/a/c/f/h/b0;
.source ""


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:Lj/d/a/c/f/h/b0;


# direct methods
.method constructor <init>(Lj/d/a/c/f/h/b0;II)V
    .locals 0

    iput-object p1, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    invoke-direct {p0}, Lj/d/a/c/f/h/b0;-><init>()V

    iput p2, p0, Lj/d/a/c/f/h/a0;->c:I

    iput p3, p0, Lj/d/a/c/f/h/a0;->d:I

    return-void
.end method


# virtual methods
.method final c()I
    .locals 2

    iget-object v0, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    invoke-virtual {v0}, Lj/d/a/c/f/h/y;->d()I

    move-result v0

    iget v1, p0, Lj/d/a/c/f/h/a0;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lj/d/a/c/f/h/a0;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final d()I
    .locals 2

    iget-object v0, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    invoke-virtual {v0}, Lj/d/a/c/f/h/y;->d()I

    move-result v0

    iget v1, p0, Lj/d/a/c/f/h/a0;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj/d/a/c/f/h/a0;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lj/d/a/c/f/h/t;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    iget v1, p0, Lj/d/a/c/f/h/a0;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final l()[Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    invoke-virtual {v0}, Lj/d/a/c/f/h/y;->l()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(II)Lj/d/a/c/f/h/b0;
    .locals 2

    iget v0, p0, Lj/d/a/c/f/h/a0;->d:I

    invoke-static {p1, p2, v0}, Lj/d/a/c/f/h/t;->c(III)V

    iget-object v0, p0, Lj/d/a/c/f/h/a0;->e:Lj/d/a/c/f/h/b0;

    iget v1, p0, Lj/d/a/c/f/h/a0;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lj/d/a/c/f/h/b0;->n(II)Lj/d/a/c/f/h/b0;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lj/d/a/c/f/h/a0;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj/d/a/c/f/h/b0;->n(II)Lj/d/a/c/f/h/b0;

    move-result-object p1

    return-object p1
.end method
