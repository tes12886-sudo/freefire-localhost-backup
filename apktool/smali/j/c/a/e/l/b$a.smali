.class public abstract Lj/c/a/e/l/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/l/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "NETWORK THREAD CRASH"

    invoke-static {p1}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    invoke-static {p2}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    return-void
.end method
