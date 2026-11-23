.class final Lh/g/a/a$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/g/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# static fields
.field static final c:Lh/g/a/a$i;


# instance fields
.field volatile a:Ljava/lang/Thread;

.field volatile b:Lh/g/a/a$i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh/g/a/a$i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh/g/a/a$i;-><init>(Z)V

    sput-object v0, Lh/g/a/a$i;->c:Lh/g/a/a$i;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh/g/a/a;->f:Lh/g/a/a$b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lh/g/a/a$b;->e(Lh/g/a/a$i;Ljava/lang/Thread;)V

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lh/g/a/a$i;)V
    .locals 1

    sget-object v0, Lh/g/a/a;->f:Lh/g/a/a$b;

    invoke-virtual {v0, p0, p1}, Lh/g/a/a$b;->d(Lh/g/a/a$i;Lh/g/a/a$i;)V

    return-void
.end method

.method b()V
    .locals 2

    iget-object v0, p0, Lh/g/a/a$i;->a:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lh/g/a/a$i;->a:Ljava/lang/Thread;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
