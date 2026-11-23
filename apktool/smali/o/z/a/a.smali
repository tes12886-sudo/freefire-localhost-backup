.class public final Lo/z/a/a;
.super Lo/h$a;
.source ""


# instance fields
.field private final a:Lj/d/d/e;


# direct methods
.method private constructor <init>(Lj/d/d/e;)V
    .locals 0

    invoke-direct {p0}, Lo/h$a;-><init>()V

    iput-object p1, p0, Lo/z/a/a;->a:Lj/d/d/e;

    return-void
.end method

.method public static f()Lo/z/a/a;
    .locals 1

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    invoke-static {v0}, Lo/z/a/a;->g(Lj/d/d/e;)Lo/z/a/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Lj/d/d/e;)Lo/z/a/a;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lo/z/a/a;

    invoke-direct {v0, p0}, Lo/z/a/a;-><init>(Lj/d/d/e;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lo/u;)Lo/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lo/u;",
            ")",
            "Lo/h<",
            "*",
            "Lm/c0;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lo/z/a/a;->a:Lj/d/d/e;

    invoke-static {p1}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    new-instance p2, Lo/z/a/b;

    iget-object p3, p0, Lo/z/a/a;->a:Lj/d/d/e;

    invoke-direct {p2, p3, p1}, Lo/z/a/b;-><init>(Lj/d/d/e;Lj/d/d/w;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lo/u;)Lo/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lo/u;",
            ")",
            "Lo/h<",
            "Lm/e0;",
            "*>;"
        }
    .end annotation

    iget-object p2, p0, Lo/z/a/a;->a:Lj/d/d/e;

    invoke-static {p1}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    new-instance p2, Lo/z/a/c;

    iget-object p3, p0, Lo/z/a/a;->a:Lj/d/d/e;

    invoke-direct {p2, p3, p1}, Lo/z/a/c;-><init>(Lj/d/d/e;Lj/d/d/w;)V

    return-object p2
.end method
