.class Lj/a/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/a/a;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lj/a/a$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lj/a/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/a/a$c;Lj/a/a$c;)I
    .locals 7

    iget-wide v0, p1, Lj/a/a$c;->b:J

    iget-wide p1, p2, Lj/a/a$c;->b:J

    sub-long v2, v0, p1

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    sub-long/2addr v0, p1

    cmp-long p1, v0, v4

    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj/a/a$c;

    check-cast p2, Lj/a/a$c;

    invoke-virtual {p0, p1, p2}, Lj/a/a$b;->a(Lj/a/a$c;Lj/a/a$c;)I

    move-result p1

    return p1
.end method
