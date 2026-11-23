.class Lj/c/a/e/d/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/j/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/c/a/e/d/b;->n()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/d/b;


# direct methods
.method constructor <init>(Lj/c/a/e/d/b;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/d/b$a;->a:Lj/c/a/e/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;)V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/d/b$a;->a:Lj/c/a/e/d/b;

    invoke-static {v0, p1}, Lj/c/a/e/d/b;->c(Lj/c/a/e/d/b;Landroid/content/ComponentName;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lj/c/a/e/d/b$a;->a:Lj/c/a/e/d/b;

    invoke-static {v0}, Lj/c/a/e/d/b;->a(Lj/c/a/e/d/b;)V

    iget-object v0, p0, Lj/c/a/e/d/b$a;->a:Lj/c/a/e/d/b;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lj/c/a/e/d/b$a;->a:Lj/c/a/e/d/b;

    invoke-static {v2}, Lj/c/a/e/d/b;->b(Lj/c/a/e/d/b;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lj/c/a/e/b;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lj/c/a/e/d/b;->c(Lj/c/a/e/d/b;Landroid/content/ComponentName;)V

    return-void
.end method
