.class Lj/c/a/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/c/a/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Lj/c/a/a;


# direct methods
.method constructor <init>(Lj/c/a/a;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lj/c/a/a$a;->c:Lj/c/a/a;

    iput-object p2, p0, Lj/c/a/a$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lj/c/a/a$a;->b:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3

    iget-object v0, p0, Lj/c/a/a$a;->c:Lj/c/a/a;

    iget-object v1, p0, Lj/c/a/a$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lj/c/a/a$a;->b:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Lj/c/a/a;->access$000(Lj/c/a/a;Landroid/content/Context;Landroid/content/Intent;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj/c/a/a$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
