.class public abstract Lh/p/a/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/p/a/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroidx/lifecycle/k;)Lh/p/a/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/lifecycle/k;",
            ":",
            "Landroidx/lifecycle/y;",
            ">(TT;)",
            "Lh/p/a/a;"
        }
    .end annotation

    new-instance v0, Lh/p/a/b;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/y;

    invoke-interface {v1}, Landroidx/lifecycle/y;->j()Landroidx/lifecycle/x;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lh/p/a/b;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/x;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c(ILandroid/os/Bundle;Lh/p/a/a$a;)Lh/p/b/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Lh/p/a/a$a<",
            "TD;>;)",
            "Lh/p/b/b<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract d()V
.end method
