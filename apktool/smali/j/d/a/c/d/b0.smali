.class final synthetic Lj/d/a/c/d/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field private final a:Lj/d/a/c/d/d;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method constructor <init>(Lj/d/a/c/d/d;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/a/c/d/b0;->a:Lj/d/a/c/d/d;

    iput-object p2, p0, Lj/d/a/c/d/b0;->b:Ljava/lang/String;

    iput-object p3, p0, Lj/d/a/c/d/b0;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lj/d/a/c/d/b0;->a:Lj/d/a/c/d/d;

    iget-object v1, p0, Lj/d/a/c/d/b0;->b:Ljava/lang/String;

    iget-object v2, p0, Lj/d/a/c/d/b0;->c:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {v0, v1, v2, p1}, Lj/d/a/c/d/d;->k(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
