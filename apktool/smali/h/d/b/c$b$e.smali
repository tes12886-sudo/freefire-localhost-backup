.class Lh/d/b/c$b$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/d/b/c$b;->Y0(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:Z

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Lh/d/b/c$b;


# direct methods
.method constructor <init>(Lh/d/b/c$b;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lh/d/b/c$b$e;->e:Lh/d/b/c$b;

    iput p2, p0, Lh/d/b/c$b$e;->a:I

    iput-object p3, p0, Lh/d/b/c$b$e;->b:Landroid/net/Uri;

    iput-boolean p4, p0, Lh/d/b/c$b$e;->c:Z

    iput-object p5, p0, Lh/d/b/c$b$e;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lh/d/b/c$b$e;->e:Lh/d/b/c$b;

    iget-object v0, v0, Lh/d/b/c$b;->b:Lh/d/b/b;

    iget v1, p0, Lh/d/b/c$b$e;->a:I

    iget-object v2, p0, Lh/d/b/c$b$e;->b:Landroid/net/Uri;

    iget-boolean v3, p0, Lh/d/b/c$b$e;->c:Z

    iget-object v4, p0, Lh/d/b/c$b$e;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Lh/d/b/b;->f(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    const/4 v0, 0x0

    throw v0
.end method
