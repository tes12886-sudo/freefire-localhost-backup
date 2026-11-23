.class Lj/c/a/e/e/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/e/c;


# direct methods
.method constructor <init>(Lj/c/a/e/e/c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/e/c$a;->a:Lj/c/a/e/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/c/a/e/g/c/a;)V
    .locals 1

    const-string p1, "received gip == 0, reconnect to auth server"

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lj/c/a/e/e/c$a;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->f(Lj/c/a/e/e/c;)Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj/c/a/e/e/c$a;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->f(Lj/c/a/e/e/c;)Landroid/content/Context;

    move-result-object p1

    const v0, 0x927c0

    invoke-static {p1, v0}, Lj/c/a/e/l/a;->g(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
