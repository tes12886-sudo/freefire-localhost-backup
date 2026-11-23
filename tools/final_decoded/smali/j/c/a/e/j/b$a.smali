.class Lj/c/a/e/j/b$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/j/b;


# direct methods
.method constructor <init>(Lj/c/a/e/j/b;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/j/b$a;->a:Lj/c/a/e/j/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "receive feedback!"

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/j/b$a;->a:Lj/c/a/e/j/b;

    invoke-virtual {v0, p1, p2}, Lj/c/a/e/j/b;->i(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
