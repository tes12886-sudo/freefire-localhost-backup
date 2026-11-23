.class final synthetic Lj/d/a/c/d/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lj/d/a/c/d/j;

.field private final b:Lj/d/a/c/d/u;


# direct methods
.method constructor <init>(Lj/d/a/c/d/j;Lj/d/a/c/d/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/a/c/d/p;->a:Lj/d/a/c/d/j;

    iput-object p2, p0, Lj/d/a/c/d/p;->b:Lj/d/a/c/d/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj/d/a/c/d/p;->a:Lj/d/a/c/d/j;

    iget-object v1, p0, Lj/d/a/c/d/p;->b:Lj/d/a/c/d/u;

    iget v1, v1, Lj/d/a/c/d/u;->a:I

    invoke-virtual {v0, v1}, Lj/d/a/c/d/j;->b(I)V

    return-void
.end method
