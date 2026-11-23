.class public final Lj/d/a/d/a/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/d/a/b/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/a/d/a/b/h0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/a/d/a/b/h0;

.field private final synthetic b:I


# direct methods
.method public constructor <init>(Lj/d/a/d/a/b/h0;[S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Landroid/content/Context;",
            ">;[S)V"
        }
    .end annotation

    const/4 p2, 0x3

    iput p2, p0, Lj/d/a/d/a/a/c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/a/d/a/a/c;->a:Lj/d/a/d/a/b/h0;

    return-void
.end method

.method public static b(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Landroid/content/Context;",
            ">;)",
            "Lj/d/a/d/a/a/c;"
        }
    .end annotation

    new-instance v0, Lj/d/a/d/a/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lj/d/a/d/a/a/c;-><init>(Lj/d/a/d/a/b/h0;[S)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lj/d/a/d/a/a/c;->b:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lj/d/a/d/a/a/c;->a:Lj/d/a/d/a/b/h0;

    invoke-interface {v0}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lj/d/a/d/a/e/a;

    invoke-direct {v1, v0}, Lj/d/a/d/a/e/a;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lj/d/a/d/a/a/c;->a:Lj/d/a/d/a/b/h0;

    check-cast v0, Lj/d/a/d/a/a/d;

    invoke-virtual {v0}, Lj/d/a/d/a/a/d;->b()Landroid/content/Context;

    throw v2

    :cond_1
    iget-object v0, p0, Lj/d/a/d/a/a/c;->a:Lj/d/a/d/a/b/h0;

    check-cast v0, Lj/d/a/d/a/a/d;

    invoke-virtual {v0}, Lj/d/a/d/a/a/d;->b()Landroid/content/Context;

    throw v2

    :cond_2
    iget-object v0, p0, Lj/d/a/d/a/a/c;->a:Lj/d/a/d/a/b/h0;

    invoke-interface {v0}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/a/d/a/a/a;

    invoke-static {v0}, Lj/d/a/d/a/b/s;->d(Ljava/lang/Object;)V

    return-object v0
.end method
