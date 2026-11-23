.class Lj/d/d/e$d;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/e;->b(Lj/d/d/w;)Lj/d/d/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/w;


# direct methods
.method constructor <init>(Lj/d/d/w;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/e$d;->a:Lj/d/d/w;

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/e$d;->e(Lj/d/d/b0/a;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0, p1, p2}, Lj/d/d/e$d;->f(Lj/d/d/b0/c;Ljava/util/concurrent/atomic/AtomicLong;)V

    return-void
.end method

.method public e(Lj/d/d/b0/a;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 3

    iget-object v0, p0, Lj/d/d/e$d;->a:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    return-object v0
.end method

.method public f(Lj/d/d/b0/c;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 3

    iget-object v0, p0, Lj/d/d/e$d;->a:Lj/d/d/w;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
