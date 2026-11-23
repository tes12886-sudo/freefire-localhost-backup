.class public final Lm/h0/k/i$c;
.super Ln/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/k/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field final synthetic l:Lm/h0/k/i;


# direct methods
.method public constructor <init>(Lm/h0/k/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/i$c;->l:Lm/h0/k/i;

    invoke-direct {p0}, Ln/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    invoke-virtual {p0}, Ln/a;->u()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm/h0/k/i$c;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method protected v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method protected z()V
    .locals 2

    iget-object v0, p0, Lm/h0/k/i$c;->l:Lm/h0/k/i;

    sget-object v1, Lm/h0/k/b;->k:Lm/h0/k/b;

    invoke-virtual {v0, v1}, Lm/h0/k/i;->f(Lm/h0/k/b;)V

    iget-object v0, p0, Lm/h0/k/i$c;->l:Lm/h0/k/i;

    invoke-virtual {v0}, Lm/h0/k/i;->g()Lm/h0/k/f;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/f;->E0()V

    return-void
.end method
