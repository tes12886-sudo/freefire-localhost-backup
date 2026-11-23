.class final Lj/d/a/c/f/g/w;
.super Lj/d/a/c/f/g/t;
.source ""


# instance fields
.field private final a:Lj/d/a/c/f/g/v;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj/d/a/c/f/g/t;-><init>()V

    new-instance v0, Lj/d/a/c/f/g/v;

    invoke-direct {v0}, Lj/d/a/c/f/g/v;-><init>()V

    iput-object v0, p0, Lj/d/a/c/f/g/w;->a:Lj/d/a/c/f/g/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-eq p2, p1, :cond_0

    iget-object v0, p0, Lj/d/a/c/f/g/w;->a:Lj/d/a/c/f/g/v;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lj/d/a/c/f/g/v;->a(Ljava/lang/Throwable;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Self suppression is not allowed."

    invoke-direct {p1, v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
