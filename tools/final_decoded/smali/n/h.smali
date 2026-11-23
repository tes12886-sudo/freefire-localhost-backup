.class public Ln/h;
.super Ln/y;
.source ""


# instance fields
.field private e:Ln/y;


# direct methods
.method public constructor <init>(Ln/y;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ln/y;-><init>()V

    iput-object p1, p0, Ln/h;->e:Ln/y;

    return-void
.end method


# virtual methods
.method public a()Ln/y;
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0}, Ln/y;->a()Ln/y;

    move-result-object v0

    return-object v0
.end method

.method public b()Ln/y;
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0}, Ln/y;->b()Ln/y;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0}, Ln/y;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Ln/y;
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0, p1, p2}, Ln/y;->d(J)Ln/y;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0}, Ln/y;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0}, Ln/y;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Ln/y;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln/h;->e:Ln/y;

    invoke-virtual {v0, p1, p2, p3}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    move-result-object p1

    return-object p1
.end method

.method public final i()Ln/y;
    .locals 1

    iget-object v0, p0, Ln/h;->e:Ln/y;

    return-object v0
.end method

.method public final j(Ln/y;)Ln/h;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln/h;->e:Ln/y;

    return-object p0
.end method
