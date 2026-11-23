.class final Lh/g/a/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/g/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final a:Lh/g/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/g/a/a<",
            "TV;>;"
        }
    .end annotation
.end field

.field final b:Lj/d/b/a/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/b/a/a/a<",
            "+TV;>;"
        }
    .end annotation
.end field


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lh/g/a/a$g;->a:Lh/g/a/a;

    iget-object v0, v0, Lh/g/a/a;->a:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/g/a/a$g;->b:Lj/d/b/a/a/a;

    invoke-static {v0}, Lh/g/a/a;->j(Lj/d/b/a/a/a;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lh/g/a/a;->f:Lh/g/a/a$b;

    iget-object v2, p0, Lh/g/a/a$g;->a:Lh/g/a/a;

    invoke-virtual {v1, v2, p0, v0}, Lh/g/a/a$b;->b(Lh/g/a/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh/g/a/a$g;->a:Lh/g/a/a;

    invoke-static {v0}, Lh/g/a/a;->g(Lh/g/a/a;)V

    :cond_1
    return-void
.end method
