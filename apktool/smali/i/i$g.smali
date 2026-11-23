.class final Li/i$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li/i;->p(JLjava/util/concurrent/ScheduledExecutorService;Li/d;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Li/j;


# direct methods
.method constructor <init>(Li/j;)V
    .locals 0

    iput-object p1, p0, Li/i$g;->a:Li/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Li/i$g;->a:Li/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li/j;->g(Ljava/lang/Object;)Z

    return-void
.end method
