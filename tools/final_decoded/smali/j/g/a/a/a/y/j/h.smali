.class abstract Lj/g/a/a/a/y/j/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lj/g/a/a/a/u;

.field private final b:Lj/g/a/a/a/y/g;

.field private final c:Ljava/lang/String;

.field private final d:Lo/u;


# direct methods
.method constructor <init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/g/a/a/a/y/j/h;->a:Lj/g/a/a/a/u;

    iput-object p2, p0, Lj/g/a/a/a/y/j/h;->b:Lj/g/a/a/a/y/g;

    invoke-virtual {p1}, Lj/g/a/a/a/u;->h()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TwitterAndroidSDK"

    invoke-static {p2, p1}, Lj/g/a/a/a/y/g;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj/g/a/a/a/y/j/h;->c:Ljava/lang/String;

    new-instance p1, Lm/i0/a;

    invoke-direct {p1}, Lm/i0/a;-><init>()V

    sget-object p2, Lm/i0/a$a;->d:Lm/i0/a$a;

    invoke-virtual {p1, p2}, Lm/i0/a;->e(Lm/i0/a$a;)Lm/i0/a;

    new-instance p2, Lm/z$a;

    invoke-direct {p2}, Lm/z$a;-><init>()V

    new-instance v0, Lj/g/a/a/a/y/j/h$a;

    invoke-direct {v0, p0}, Lj/g/a/a/a/y/j/h$a;-><init>(Lj/g/a/a/a/y/j/h;)V

    invoke-virtual {p2, v0}, Lm/z$a;->a(Lm/w;)Lm/z$a;

    invoke-virtual {p2, p1}, Lm/z$a;->a(Lm/w;)Lm/z$a;

    invoke-static {}, Lj/g/a/a/a/y/i/b;->b()Lm/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/z$a;->c(Lm/g;)Lm/z$a;

    invoke-virtual {p2}, Lm/z$a;->b()Lm/z;

    move-result-object p1

    new-instance p2, Lo/u$b;

    invoke-direct {p2}, Lo/u$b;-><init>()V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->a()Lj/g/a/a/a/y/g;

    move-result-object v0

    invoke-virtual {v0}, Lj/g/a/a/a/y/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/u$b;->b(Ljava/lang/String;)Lo/u$b;

    invoke-virtual {p2, p1}, Lo/u$b;->f(Lm/z;)Lo/u$b;

    invoke-static {}, Lo/z/a/a;->f()Lo/z/a/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/u$b;->a(Lo/h$a;)Lo/u$b;

    invoke-virtual {p2}, Lo/u$b;->d()Lo/u;

    move-result-object p1

    iput-object p1, p0, Lj/g/a/a/a/y/j/h;->d:Lo/u;

    return-void
.end method


# virtual methods
.method protected a()Lj/g/a/a/a/y/g;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/j/h;->b:Lj/g/a/a/a/y/g;

    return-object v0
.end method

.method protected b()Lo/u;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/j/h;->d:Lo/u;

    return-object v0
.end method

.method protected c()Lj/g/a/a/a/u;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/j/h;->a:Lj/g/a/a/a/u;

    return-object v0
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/j/h;->c:Ljava/lang/String;

    return-object v0
.end method
