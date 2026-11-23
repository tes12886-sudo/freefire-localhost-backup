.class public final Lm/h0/h/g$a;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/h/g;-><init>(Lm/h0/g/e;IJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/h/g;


# direct methods
.method constructor <init>(Lm/h0/h/g;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lm/h0/h/g$a;->e:Lm/h0/h/g;

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p2, p1, v0, v1}, Lm/h0/g/a;-><init>(Ljava/lang/String;ZILl/y/c/f;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lm/h0/h/g$a;->e:Lm/h0/h/g;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lm/h0/h/g;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
