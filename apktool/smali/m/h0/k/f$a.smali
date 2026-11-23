.class public final Lm/h0/k/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private final b:Lm/h0/g/e;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:Ln/d;

.field public f:Ln/c;

.field private g:Lm/h0/k/f$c;

.field private h:Lm/h0/k/l;

.field private i:I


# direct methods
.method public constructor <init>(ZLm/h0/g/e;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm/h0/k/f$a;->a:Z

    iput-object p2, p0, Lm/h0/k/f$a;->b:Lm/h0/g/e;

    sget-object p1, Lm/h0/k/f$c;->a:Lm/h0/k/f$c;

    iput-object p1, p0, Lm/h0/k/f$a;->g:Lm/h0/k/f$c;

    sget-object p1, Lm/h0/k/l;->a:Lm/h0/k/l;

    iput-object p1, p0, Lm/h0/k/f$a;->h:Lm/h0/k/l;

    return-void
.end method


# virtual methods
.method public final a()Lm/h0/k/f;
    .locals 1

    new-instance v0, Lm/h0/k/f;

    invoke-direct {v0, p0}, Lm/h0/k/f;-><init>(Lm/h0/k/f$a;)V

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/k/f$a;->a:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "connectionName"

    invoke-static {v0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()Lm/h0/k/f$c;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->g:Lm/h0/k/f$c;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lm/h0/k/f$a;->i:I

    return v0
.end method

.method public final f()Lm/h0/k/l;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->h:Lm/h0/k/l;

    return-object v0
.end method

.method public final g()Ln/c;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->f:Ln/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sink"

    invoke-static {v0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->c:Ljava/net/Socket;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "socket"

    invoke-static {v0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i()Ln/d;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->e:Ln/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "source"

    invoke-static {v0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()Lm/h0/g/e;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f$a;->b:Lm/h0/g/e;

    return-object v0
.end method

.method public final k(Lm/h0/k/f$c;)Lm/h0/k/f$a;
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/h0/k/f$a;->n(Lm/h0/k/f$c;)V

    return-object p0
.end method

.method public final l(I)Lm/h0/k/f$a;
    .locals 0

    invoke-virtual {p0, p1}, Lm/h0/k/f$a;->o(I)V

    return-object p0
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$a;->d:Ljava/lang/String;

    return-void
.end method

.method public final n(Lm/h0/k/f$c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$a;->g:Lm/h0/k/f$c;

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Lm/h0/k/f$a;->i:I

    return-void
.end method

.method public final p(Ln/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$a;->f:Ln/c;

    return-void
.end method

.method public final q(Ljava/net/Socket;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$a;->c:Ljava/net/Socket;

    return-void
.end method

.method public final r(Ln/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$a;->e:Ln/d;

    return-void
.end method

.method public final s(Ljava/net/Socket;Ljava/lang/String;Ln/d;Ln/c;)Lm/h0/k/f$a;
    .locals 1

    const-string v0, "socket"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerName"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/h0/k/f$a;->q(Ljava/net/Socket;)V

    invoke-virtual {p0}, Lm/h0/k/f$a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lm/h0/d;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "MockWebServer "

    invoke-static {p1, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lm/h0/k/f$a;->m(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lm/h0/k/f$a;->r(Ln/d;)V

    invoke-virtual {p0, p4}, Lm/h0/k/f$a;->p(Ln/c;)V

    return-object p0
.end method
