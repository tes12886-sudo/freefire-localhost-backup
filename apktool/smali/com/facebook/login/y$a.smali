.class Lcom/facebook/login/y$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/j0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/y;->q(Lcom/facebook/login/l$d;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/l$d;

.field final synthetic b:Lcom/facebook/login/y;


# direct methods
.method constructor <init>(Lcom/facebook/login/y;Lcom/facebook/login/l$d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$a;->b:Lcom/facebook/login/y;

    iput-object p2, p0, Lcom/facebook/login/y$a;->a:Lcom/facebook/login/l$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/facebook/n;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/y$a;->b:Lcom/facebook/login/y;

    iget-object v1, p0, Lcom/facebook/login/y$a;->a:Lcom/facebook/login/l$d;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/login/y;->z(Lcom/facebook/login/l$d;Landroid/os/Bundle;Lcom/facebook/n;)V

    return-void
.end method
