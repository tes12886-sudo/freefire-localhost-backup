.class Lj/d/d/z/p/c;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# static fields
.field static final b:Lj/d/d/x;


# instance fields
.field private final a:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/d/z/p/c$a;

    invoke-direct {v0}, Lj/d/d/z/p/c$a;-><init>()V

    sput-object v0, Lj/d/d/z/p/c;->b:Lj/d/d/x;

    return-void
.end method

.method private constructor <init>(Lj/d/d/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/w<",
            "Ljava/util/Date;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    iput-object p1, p0, Lj/d/d/z/p/c;->a:Lj/d/d/w;

    return-void
.end method

.method synthetic constructor <init>(Lj/d/d/w;Lj/d/d/z/p/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/d/d/z/p/c;-><init>(Lj/d/d/w;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/z/p/c;->e(Lj/d/d/b0/a;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lj/d/d/z/p/c;->f(Lj/d/d/b0/c;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public e(Lj/d/d/b0/a;)Ljava/sql/Timestamp;
    .locals 3

    iget-object v0, p0, Lj/d/d/z/p/c;->a:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f(Lj/d/d/b0/c;Ljava/sql/Timestamp;)V
    .locals 1

    iget-object v0, p0, Lj/d/d/z/p/c;->a:Lj/d/d/w;

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
