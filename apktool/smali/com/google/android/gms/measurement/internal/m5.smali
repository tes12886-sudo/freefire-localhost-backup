.class final Lcom/google/android/gms/measurement/internal/m5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/t;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/ja;

.field final synthetic c:Lcom/google/android/gms/measurement/internal/t5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/t5;Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/ja;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/m5;->c:Lcom/google/android/gms/measurement/internal/t5;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/m5;->a:Lcom/google/android/gms/measurement/internal/t;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/m5;->b:Lcom/google/android/gms/measurement/internal/ja;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/m5;->c:Lcom/google/android/gms/measurement/internal/t5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/m5;->a:Lcom/google/android/gms/measurement/internal/t;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/m5;->b:Lcom/google/android/gms/measurement/internal/ja;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/t5;->p1(Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/ja;)Lcom/google/android/gms/measurement/internal/t;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/se;->a()Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/m5;->c:Lcom/google/android/gms/measurement/internal/t5;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/t5;->s1(Lcom/google/android/gms/measurement/internal/t5;)Lcom/google/android/gms/measurement/internal/v9;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/v9;->S()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/measurement/internal/f3;->B0:Lcom/google/android/gms/measurement/internal/d3;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/f;->w(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/d3;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/m5;->c:Lcom/google/android/gms/measurement/internal/t5;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/m5;->b:Lcom/google/android/gms/measurement/internal/ja;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/t5;->c1(Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/ja;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/m5;->c:Lcom/google/android/gms/measurement/internal/t5;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/m5;->b:Lcom/google/android/gms/measurement/internal/ja;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/t5;->t1(Lcom/google/android/gms/measurement/internal/t5;Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/ja;)V

    return-void
.end method
