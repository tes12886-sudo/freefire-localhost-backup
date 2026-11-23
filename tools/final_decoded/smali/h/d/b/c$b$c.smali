.class Lh/d/b/c$b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/d/b/c$b;->O0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lh/d/b/c$b;


# direct methods
.method constructor <init>(Lh/d/b/c$b;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lh/d/b/c$b$c;->b:Lh/d/b/c$b;

    iput-object p2, p0, Lh/d/b/c$b$c;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b$c;->b:Lh/d/b/c$b;

    iget-object v0, v0, Lh/d/b/c$b;->b:Lh/d/b/b;

    iget-object v1, p0, Lh/d/b/c$b$c;->a:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lh/d/b/b;->c(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    throw v0
.end method
