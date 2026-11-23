.class Lh/p/a/b$c;
.super Landroidx/lifecycle/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/p/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final d:Landroidx/lifecycle/w$a;


# instance fields
.field private b:Lh/f/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/f/h<",
            "Lh/p/a/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh/p/a/b$c$a;

    invoke-direct {v0}, Lh/p/a/b$c$a;-><init>()V

    sput-object v0, Lh/p/a/b$c;->d:Landroidx/lifecycle/w$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/v;-><init>()V

    new-instance v0, Lh/f/h;

    invoke-direct {v0}, Lh/f/h;-><init>()V

    iput-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh/p/a/b$c;->c:Z

    return-void
.end method

.method static g(Landroidx/lifecycle/x;)Lh/p/a/b$c;
    .locals 2

    new-instance v0, Landroidx/lifecycle/w;

    sget-object v1, Lh/p/a/b$c;->d:Landroidx/lifecycle/w$a;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/w;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w$a;)V

    const-class p0, Lh/p/a/b$c;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/w;->a(Ljava/lang/Class;)Landroidx/lifecycle/v;

    move-result-object p0

    check-cast p0, Lh/p/a/b$c;

    return-object p0
.end method


# virtual methods
.method protected d()V
    .locals 4

    invoke-super {p0}, Landroidx/lifecycle/v;->d()V

    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0}, Lh/f/h;->n()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v2, v1}, Lh/f/h;->o(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/p/a/b$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lh/p/a/b$a;->o(Z)Lh/p/b/b;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0}, Lh/f/h;->d()V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0}, Lh/f/h;->n()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v2}, Lh/f/h;->n()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v2, v1}, Lh/f/h;->o(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/p/a/b$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v3, v1}, Lh/f/h;->k(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lh/p/a/b$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Lh/p/a/b$a;->p(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh/p/a/b$c;->c:Z

    return-void
.end method

.method h(I)Lh/p/a/b$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lh/p/a/b$a<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0, p1}, Lh/f/h;->h(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh/p/a/b$a;

    return-object p1
.end method

.method i()Z
    .locals 1

    iget-boolean v0, p0, Lh/p/a/b$c;->c:Z

    return v0
.end method

.method j()V
    .locals 3

    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0}, Lh/f/h;->n()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v2, v1}, Lh/f/h;->o(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/p/a/b$a;

    invoke-virtual {v2}, Lh/p/a/b$a;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method k(ILh/p/a/b$a;)V
    .locals 1

    iget-object v0, p0, Lh/p/a/b$c;->b:Lh/f/h;

    invoke-virtual {v0, p1, p2}, Lh/f/h;->m(ILjava/lang/Object;)V

    return-void
.end method

.method l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/p/a/b$c;->c:Z

    return-void
.end method
