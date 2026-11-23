.class Lj/g/a/a/a/y/j/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g/a/a/a/y/j/h;-><init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/g/a/a/a/y/j/h;


# direct methods
.method constructor <init>(Lj/g/a/a/a/y/j/h;)V
    .locals 0

    iput-object p1, p0, Lj/g/a/a/a/y/j/h$a;->a:Lj/g/a/a/a/y/j/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/w$a;)Lm/d0;
    .locals 3

    invoke-interface {p1}, Lm/w$a;->c()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->h()Lm/b0$a;

    move-result-object v0

    iget-object v1, p0, Lj/g/a/a/a/y/j/h$a;->a:Lj/g/a/a/a/y/j/h;

    invoke-virtual {v1}, Lj/g/a/a/a/y/j/h;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Lm/b0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;

    invoke-virtual {v0}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    invoke-interface {p1, v0}, Lm/w$a;->a(Lm/b0;)Lm/d0;

    move-result-object p1

    return-object p1
.end method
