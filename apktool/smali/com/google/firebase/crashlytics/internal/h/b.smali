.class public final synthetic Lcom/google/firebase/crashlytics/internal/h/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/datatransport/g;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic b:Lcom/google/firebase/crashlytics/internal/common/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/crashlytics/internal/common/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/h/b;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/h/b;->b:Lcom/google/firebase/crashlytics/internal/common/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/h/b;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/h/b;->b:Lcom/google/firebase/crashlytics/internal/common/m;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/crashlytics/internal/h/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/crashlytics/internal/common/m;Ljava/lang/Exception;)V

    return-void
.end method
