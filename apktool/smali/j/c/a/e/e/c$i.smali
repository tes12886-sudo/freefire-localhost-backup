.class Lj/c/a/e/e/c$i;
.super Lj/c/a/e/l/b$a;
.source ""


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

    iput-object p1, p0, Lj/c/a/e/e/c$i;->a:Lj/c/a/e/e/c;

    invoke-direct {p0}, Lj/c/a/e/l/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj/c/a/e/l/b$a;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lj/c/a/e/e/c$i;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->o(Lj/c/a/e/e/c;)I

    move-result p2

    invoke-static {p1, p2}, Lj/c/a/e/e/c;->k(Lj/c/a/e/e/c;I)V

    return-void
.end method
