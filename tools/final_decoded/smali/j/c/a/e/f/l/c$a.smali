.class Lj/c/a/e/f/l/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/f/l/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/f/l/c;


# direct methods
.method constructor <init>(Lj/c/a/e/f/l/c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/f/l/c$a;->a:Lj/c/a/e/f/l/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/f/l/c$a;->a:Lj/c/a/e/f/l/c;

    invoke-static {v0}, Lj/c/a/e/f/l/c;->a(Lj/c/a/e/f/l/c;)Lj/c/a/e/f/l/c$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/l/c$a;->a:Lj/c/a/e/f/l/c;

    invoke-static {v0}, Lj/c/a/e/f/l/c;->a(Lj/c/a/e/f/l/c;)Lj/c/a/e/f/l/c$b;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/f/l/c$a;->a:Lj/c/a/e/f/l/c;

    invoke-static {v1}, Lj/c/a/e/f/l/c;->b(Lj/c/a/e/f/l/c;)Lj/c/a/e/f/l/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lj/c/a/e/f/l/c$b;->b(Lj/c/a/e/f/l/b;)V

    :cond_0
    return-void
.end method
