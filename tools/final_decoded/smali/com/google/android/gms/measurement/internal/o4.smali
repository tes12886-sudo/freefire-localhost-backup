.class final synthetic Lcom/google/android/gms/measurement/internal/o4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/s4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/s4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/o4;->a:Lcom/google/android/gms/measurement/internal/s4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/o4;->a:Lcom/google/android/gms/measurement/internal/s4;

    new-instance v1, Lcom/google/android/gms/internal/measurement/wf;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/s4;->j:Lcom/google/android/gms/internal/measurement/uf;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/wf;-><init>(Lcom/google/android/gms/internal/measurement/uf;)V

    return-object v1
.end method
