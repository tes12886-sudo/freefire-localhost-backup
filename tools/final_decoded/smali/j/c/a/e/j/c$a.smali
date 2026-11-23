.class Lj/c/a/e/j/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/j/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/j/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/j/c;


# direct methods
.method constructor <init>(Lj/c/a/e/j/c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/j/c$a;->a:Lj/c/a/e/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const-string v0, "Strategy is successful. Service can be safely started"

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/j/c$a;->a:Lj/c/a/e/j/c;

    invoke-static {v0}, Lj/c/a/e/j/c;->a(Lj/c/a/e/j/c;)Lj/c/a/e/j/c$b;

    move-result-object v0

    invoke-interface {v0}, Lj/c/a/e/j/c$b;->b()V

    return-void
.end method

.method public b(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "Strategy Unsuccessful, Should not start service. Its already running."

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/j/c$a;->a:Lj/c/a/e/j/c;

    invoke-static {v0}, Lj/c/a/e/j/c;->a(Lj/c/a/e/j/c;)Lj/c/a/e/j/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lj/c/a/e/j/c$b;->a(Landroid/content/ComponentName;)V

    return-void
.end method
