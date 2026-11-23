.class public final Lcom/google/android/gms/common/api/internal/d2;
.super Lj/d/a/c/g/b/d;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/e$b;
.implements Lcom/google/android/gms/common/api/e$c;


# static fields
.field private static final h:Lcom/google/android/gms/common/api/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lcom/google/android/gms/common/api/a$a;

.field private final d:Ljava/util/Set;

.field private final e:Lcom/google/android/gms/common/internal/d;

.field private f:Lj/d/a/c/g/g;

.field private g:Lcom/google/android/gms/common/api/internal/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj/d/a/c/g/f;->c:Lcom/google/android/gms/common/api/a$a;

    sput-object v0, Lcom/google/android/gms/common/api/internal/d2;->h:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/d;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/api/internal/d2;->h:Lcom/google/android/gms/common/api/a$a;

    invoke-direct {p0}, Lj/d/a/c/g/b/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/d2;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lcom/google/android/gms/common/internal/q;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, p3

    check-cast p1, Lcom/google/android/gms/common/internal/d;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->e:Lcom/google/android/gms/common/internal/d;

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/d;->g()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->d:Ljava/util/Set;

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->c:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method static bridge synthetic q1(Lcom/google/android/gms/common/api/internal/d2;)Lcom/google/android/gms/common/api/internal/c2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/d2;->g:Lcom/google/android/gms/common/api/internal/c2;

    return-object p0
.end method

.method static bridge synthetic r1(Lcom/google/android/gms/common/api/internal/d2;Lj/d/a/c/g/b/l;)V
    .locals 3

    invoke-virtual {p1}, Lj/d/a/c/g/b/l;->f()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lj/d/a/c/g/b/l;->h()Lcom/google/android/gms/common/internal/u0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/q;->k(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/internal/u0;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/u0;->f()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->n()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->g:Lcom/google/android/gms/common/api/internal/c2;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/internal/c2;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_0
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    invoke-interface {p0}, Lcom/google/android/gms/common/api/a$f;->s()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->g:Lcom/google/android/gms/common/api/internal/c2;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/u0;->h()Lcom/google/android/gms/common/internal/j;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d2;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/c2;->b(Lcom/google/android/gms/common/internal/j;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final g0(Lj/d/a/c/g/b/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->b:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/common/api/internal/b2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/common/api/internal/b2;-><init>(Lcom/google/android/gms/common/api/internal/d2;Lj/d/a/c/g/b/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final j(I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/a$f;->s()V

    return-void
.end method

.method public final m(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->g:Lcom/google/android/gms/common/api/internal/c2;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/c2;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final o(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    invoke-interface {p1, p0}, Lj/d/a/c/g/g;->j(Lj/d/a/c/g/b/f;)V

    return-void
.end method

.method public final s1(Lcom/google/android/gms/common/api/internal/c2;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->s()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->e:Lcom/google/android/gms/common/internal/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/d;->l(Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/d2;->c:Lcom/google/android/gms/common/api/a$a;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/d2;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/d2;->e:Lcom/google/android/gms/common/internal/d;

    invoke-virtual {v5}, Lcom/google/android/gms/common/internal/d;->h()Lj/d/a/c/g/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/common/api/a$a;->c(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/d;Ljava/lang/Object;Lcom/google/android/gms/common/api/e$b;Lcom/google/android/gms/common/api/e$c;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->g:Lcom/google/android/gms/common/api/internal/c2;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    invoke-interface {p1}, Lj/d/a/c/g/g;->b()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d2;->b:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/common/api/internal/a2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/internal/a2;-><init>(Lcom/google/android/gms/common/api/internal/d2;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final t1()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d2;->f:Lj/d/a/c/g/g;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->s()V

    :cond_0
    return-void
.end method
