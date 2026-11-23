.class public abstract Lj/f/a/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final c:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ln/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lj/f/a/a;

.field b:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Ljava/util/List<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-class v0, Ljava/lang/Long;

    const-class v1, Ljava/lang/Integer;

    sget-object v2, Lj/f/a/a;->b:Lj/f/a/a;

    new-instance v3, Lj/f/a/e$d;

    invoke-direct {v3, v2, v1}, Lj/f/a/e$d;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v3, Lj/f/a/e;->c:Lj/f/a/e;

    new-instance v3, Lj/f/a/e$e;

    sget-object v4, Lj/f/a/a;->e:Lj/f/a/a;

    invoke-direct {v3, v4, v1}, Lj/f/a/e$e;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v3, Lj/f/a/e;->d:Lj/f/a/e;

    new-instance v1, Lj/f/a/e$f;

    invoke-direct {v1, v2, v0}, Lj/f/a/e$f;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v1, Lj/f/a/e;->e:Lj/f/a/e;

    new-instance v1, Lj/f/a/e$g;

    sget-object v2, Lj/f/a/a;->c:Lj/f/a/a;

    invoke-direct {v1, v2, v0}, Lj/f/a/e$g;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v1, Lj/f/a/e;->f:Lj/f/a/e;

    new-instance v0, Lj/f/a/e$a;

    sget-object v1, Lj/f/a/a;->d:Lj/f/a/a;

    const-class v2, Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lj/f/a/e$a;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v0, Lj/f/a/e;->g:Lj/f/a/e;

    new-instance v0, Lj/f/a/e$b;

    const-class v2, Ln/e;

    invoke-direct {v0, v1, v2}, Lj/f/a/e$b;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    sput-object v0, Lj/f/a/e;->h:Lj/f/a/e;

    return-void
.end method

.method public constructor <init>(Lj/f/a/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/f/a/a;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/f/a/e;->a:Lj/f/a/a;

    return-void
.end method

.method private b()Lj/f/a/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/f/a/e<",
            "Ljava/util/List<",
            "TE;>;>;"
        }
    .end annotation

    new-instance v0, Lj/f/a/e$c;

    iget-object v1, p0, Lj/f/a/e;->a:Lj/f/a/a;

    const-class v2, Ljava/util/List;

    invoke-direct {v0, p0, v1, v2}, Lj/f/a/e$c;-><init>(Lj/f/a/e;Lj/f/a/a;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static l(Ljava/lang/Class;)Lj/f/a/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TM;>;)",
            "Lj/f/a/e<",
            "TM;>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "ADAPTER"

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/f/a/e;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to access "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "#ADAPTER"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final a()Lj/f/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/f/a/e<",
            "Ljava/util/List<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/f/a/e;->b:Lj/f/a/e;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj/f/a/e;->b()Lj/f/a/e;

    move-result-object v0

    iput-object v0, p0, Lj/f/a/e;->b:Lj/f/a/e;

    :goto_0
    return-object v0
.end method

.method public abstract c(Lj/f/a/f;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/f/a/f;",
            ")TE;"
        }
    .end annotation
.end method

.method public final d(Ln/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/d;",
            ")TE;"
        }
    .end annotation

    const-string v0, "source == null"

    invoke-static {p1, v0}, Lj/f/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj/f/a/f;

    invoke-direct {v0, p1}, Lj/f/a/f;-><init>(Ln/d;)V

    invoke-virtual {p0, v0}, Lj/f/a/e;->c(Lj/f/a/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e([B)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TE;"
        }
    .end annotation

    const-string v0, "bytes == null"

    invoke-static {p1, v0}, Lj/f/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    invoke-virtual {v0, p1}, Ln/b;->w0([B)Ln/b;

    invoke-virtual {p0, v0}, Lj/f/a/e;->d(Ln/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Lj/f/a/g;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/f/a/g;",
            "TE;)V"
        }
    .end annotation
.end method

.method public final g(Ln/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/c;",
            "TE;)V"
        }
    .end annotation

    const-string v0, "value == null"

    invoke-static {p2, v0}, Lj/f/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink == null"

    invoke-static {p1, v0}, Lj/f/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj/f/a/g;

    invoke-direct {v0, p1}, Lj/f/a/g;-><init>(Ln/c;)V

    invoke-virtual {p0, v0, p2}, Lj/f/a/e;->f(Lj/f/a/g;Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)[B"
        }
    .end annotation

    const-string v0, "value == null"

    invoke-static {p1, v0}, Lj/f/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lj/f/a/e;->g(Ln/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ln/b;->i0()[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public i(Lj/f/a/g;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/f/a/g;",
            "ITE;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/f/a/e;->a:Lj/f/a/a;

    invoke-virtual {p1, p2, v0}, Lj/f/a/g;->j(ILj/f/a/a;)V

    iget-object p2, p0, Lj/f/a/e;->a:Lj/f/a/a;

    sget-object v0, Lj/f/a/a;->d:Lj/f/a/a;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p3}, Lj/f/a/e;->j(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Lj/f/a/g;->k(I)V

    :cond_0
    invoke-virtual {p0, p1, p3}, Lj/f/a/e;->f(Lj/f/a/g;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract j(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation
.end method

.method public k(ILjava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)I"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lj/f/a/e;->j(Ljava/lang/Object;)I

    move-result p2

    iget-object v0, p0, Lj/f/a/e;->a:Lj/f/a/a;

    sget-object v1, Lj/f/a/a;->d:Lj/f/a/a;

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Lj/f/a/g;->d(I)I

    move-result v0

    add-int/2addr p2, v0

    :cond_0
    invoke-static {p1}, Lj/f/a/g;->b(I)I

    move-result p1

    add-int/2addr p2, p1

    return p2
.end method

.method public m(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
