.class Lo/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/n;->Q(Lo/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/f;

.field final synthetic b:Lo/n;


# direct methods
.method constructor <init>(Lo/n;Lo/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lo/n$a;->b:Lo/n;

    iput-object p2, p0, Lo/n$a;->a:Lo/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lo/n$a;->a:Lo/f;

    iget-object v1, p0, Lo/n$a;->b:Lo/n;

    invoke-interface {v0, v1, p1}, Lo/f;->b(Lo/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lo/y;->s(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public onFailure(Lm/e;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p2}, Lo/n$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onResponse(Lm/e;Lm/d0;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lo/n$a;->b:Lo/n;

    invoke-virtual {p1, p2}, Lo/n;->g(Lm/d0;)Lo/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, Lo/n$a;->a:Lo/f;

    iget-object v0, p0, Lo/n$a;->b:Lo/n;

    invoke-interface {p2, v0, p1}, Lo/f;->a(Lo/d;Lo/t;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lo/y;->s(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lo/y;->s(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lo/n$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
