.class final Lj/d/a/d/a/b/i;
.super Lj/d/a/d/a/b/g;
.source ""


# instance fields
.field final synthetic b:Lj/d/a/d/a/b/g;

.field final synthetic c:Lj/d/a/d/a/b/p;


# direct methods
.method constructor <init>(Lj/d/a/d/a/b/p;Lj/d/a/d/a/f/p;Lj/d/a/d/a/b/g;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/d/a/b/i;->c:Lj/d/a/d/a/b/p;

    iput-object p3, p0, Lj/d/a/d/a/b/i;->b:Lj/d/a/d/a/b/g;

    invoke-direct {p0, p2}, Lj/d/a/d/a/b/g;-><init>(Lj/d/a/d/a/f/p;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lj/d/a/d/a/b/i;->c:Lj/d/a/d/a/b/p;

    iget-object v1, p0, Lj/d/a/d/a/b/i;->b:Lj/d/a/d/a/b/g;

    invoke-static {v0, v1}, Lj/d/a/d/a/b/p;->d(Lj/d/a/d/a/b/p;Lj/d/a/d/a/b/g;)V

    return-void
.end method
