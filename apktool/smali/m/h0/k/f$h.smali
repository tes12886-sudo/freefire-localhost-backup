.class public final Lm/h0/k/f$h;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f;->B0(ILm/h0/k/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;

.field final synthetic f:I

.field final synthetic g:Lm/h0/k/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;ILm/h0/k/b;)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$h;->e:Lm/h0/k/f;

    iput p4, p0, Lm/h0/k/f$h;->f:I

    iput-object p5, p0, Lm/h0/k/f$h;->g:Lm/h0/k/b;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lm/h0/k/f$h;->e:Lm/h0/k/f;

    invoke-static {v0}, Lm/h0/k/f;->O(Lm/h0/k/f;)Lm/h0/k/l;

    move-result-object v0

    iget v1, p0, Lm/h0/k/f$h;->f:I

    iget-object v2, p0, Lm/h0/k/f$h;->g:Lm/h0/k/b;

    invoke-interface {v0, v1, v2}, Lm/h0/k/l;->c(ILm/h0/k/b;)V

    iget-object v0, p0, Lm/h0/k/f$h;->e:Lm/h0/k/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm/h0/k/f$h;->e:Lm/h0/k/f;

    invoke-static {v1}, Lm/h0/k/f;->f(Lm/h0/k/f;)Ljava/util/Set;

    move-result-object v1

    iget v2, p0, Lm/h0/k/f$h;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v1, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
