.class final Lj/d/a/c/f/g/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/i/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lcom/google/firebase/i/c;

.field private final d:Lj/d/a/c/f/g/c;


# direct methods
.method constructor <init>(Lj/d/a/c/f/g/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/d/a/c/f/g/g;->a:Z

    iput-boolean v0, p0, Lj/d/a/c/f/g/g;->b:Z

    iput-object p1, p0, Lj/d/a/c/f/g/g;->d:Lj/d/a/c/f/g/c;

    return-void
.end method

.method private final b()V
    .locals 2

    iget-boolean v0, p0, Lj/d/a/c/f/g/g;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/d/a/c/f/g/g;->a:Z

    return-void

    :cond_0
    new-instance v0, Lcom/google/firebase/i/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lcom/google/firebase/i/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method final a(Lcom/google/firebase/i/c;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/d/a/c/f/g/g;->a:Z

    iput-object p1, p0, Lj/d/a/c/f/g/g;->c:Lcom/google/firebase/i/c;

    iput-boolean p2, p0, Lj/d/a/c/f/g/g;->b:Z

    return-void
.end method

.method public final d(Ljava/lang/String;)Lcom/google/firebase/i/g;
    .locals 3

    invoke-direct {p0}, Lj/d/a/c/f/g/g;->b()V

    iget-object v0, p0, Lj/d/a/c/f/g/g;->d:Lj/d/a/c/f/g/c;

    iget-object v1, p0, Lj/d/a/c/f/g/g;->c:Lcom/google/firebase/i/c;

    iget-boolean v2, p0, Lj/d/a/c/f/g/g;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lj/d/a/c/f/g/c;->d(Lcom/google/firebase/i/c;Ljava/lang/Object;Z)Lcom/google/firebase/i/e;

    return-object p0
.end method

.method public final e(Z)Lcom/google/firebase/i/g;
    .locals 3

    invoke-direct {p0}, Lj/d/a/c/f/g/g;->b()V

    iget-object v0, p0, Lj/d/a/c/f/g/g;->d:Lj/d/a/c/f/g/c;

    iget-object v1, p0, Lj/d/a/c/f/g/g;->c:Lcom/google/firebase/i/c;

    iget-boolean v2, p0, Lj/d/a/c/f/g/g;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lj/d/a/c/f/g/c;->h(Lcom/google/firebase/i/c;IZ)Lj/d/a/c/f/g/c;

    return-object p0
.end method
