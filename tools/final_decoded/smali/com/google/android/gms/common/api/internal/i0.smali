.class final Lcom/google/android/gms/common/api/internal/i0;
.super Lcom/google/android/gms/common/api/internal/o0;
.source ""


# instance fields
.field private final b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/google/android/gms/common/api/internal/p0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/p0;Ljava/util/ArrayList;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/i0;->c:Lcom/google/android/gms/common/api/internal/p0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/o0;-><init>(Lcom/google/android/gms/common/api/internal/p0;Lcom/google/android/gms/common/api/internal/n0;)V

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i0;->c:Lcom/google/android/gms/common/api/internal/p0;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/p0;->t(Lcom/google/android/gms/common/api/internal/p0;)Lcom/google/android/gms/common/api/internal/b1;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/b1;->n:Lcom/google/android/gms/common/api/internal/x0;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/p0;->x(Lcom/google/android/gms/common/api/internal/p0;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/common/api/internal/x0;->p:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/api/a$f;

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/i0;->c:Lcom/google/android/gms/common/api/internal/p0;

    invoke-static {v4}, Lcom/google/android/gms/common/api/internal/p0;->v(Lcom/google/android/gms/common/api/internal/p0;)Lcom/google/android/gms/common/internal/j;

    move-result-object v5

    invoke-static {v4}, Lcom/google/android/gms/common/api/internal/p0;->t(Lcom/google/android/gms/common/api/internal/p0;)Lcom/google/android/gms/common/api/internal/b1;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/common/api/internal/b1;->n:Lcom/google/android/gms/common/api/internal/x0;

    iget-object v4, v4, Lcom/google/android/gms/common/api/internal/x0;->p:Ljava/util/Set;

    invoke-interface {v3, v5, v4}, Lcom/google/android/gms/common/api/a$f;->f(Lcom/google/android/gms/common/internal/j;Ljava/util/Set;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
