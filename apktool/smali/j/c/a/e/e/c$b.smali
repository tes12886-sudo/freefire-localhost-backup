.class Lj/c/a/e/e/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/e/c;


# direct methods
.method constructor <init>(Lj/c/a/e/e/c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/e/c$b;->a:Lj/c/a/e/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/c/a/e/g/c/a;)V
    .locals 4

    invoke-static {}, Lj/c/a/e/i/a;->g()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x5265c00

    cmp-long p1, v2, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lj/c/a/e/e/c$b;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->g(Lj/c/a/e/e/c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj/c/a/e/e/c$b;->a:Lj/c/a/e/e/c;

    invoke-static {p1}, Lj/c/a/e/e/c;->h(Lj/c/a/e/e/c;)V

    :goto_0
    return-void
.end method
