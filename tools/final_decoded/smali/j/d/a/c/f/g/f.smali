.class public final Lj/d/a/c/f/g/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/firebase/i/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/firebase/i/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/firebase/i/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/i/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;Ljava/util/Map;Lcom/google/firebase/i/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/firebase/i/d<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/firebase/i/f<",
            "*>;>;",
            "Lcom/google/firebase/i/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/a/c/f/g/f;->a:Ljava/util/Map;

    iput-object p2, p0, Lj/d/a/c/f/g/f;->b:Ljava/util/Map;

    iput-object p3, p0, Lj/d/a/c/f/g/f;->c:Lcom/google/firebase/i/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/io/OutputStream;)V
    .locals 4

    new-instance v0, Lj/d/a/c/f/g/c;

    iget-object v1, p0, Lj/d/a/c/f/g/f;->a:Ljava/util/Map;

    iget-object v2, p0, Lj/d/a/c/f/g/f;->b:Ljava/util/Map;

    iget-object v3, p0, Lj/d/a/c/f/g/f;->c:Lcom/google/firebase/i/d;

    invoke-direct {v0, p2, v1, v2, v3}, Lj/d/a/c/f/g/c;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lcom/google/firebase/i/d;)V

    invoke-virtual {v0, p1}, Lj/d/a/c/f/g/c;->j(Ljava/lang/Object;)Lj/d/a/c/f/g/c;

    return-void
.end method
