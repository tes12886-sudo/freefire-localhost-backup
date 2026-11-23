.class Lj/g/a/a/a/z/h$a;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g/a/a/a/z/h;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/w;

.field final synthetic b:Lj/d/d/a0/a;


# direct methods
.method constructor <init>(Lj/g/a/a/a/z/h;Lj/d/d/w;Lj/d/d/a0/a;)V
    .locals 0

    iput-object p2, p0, Lj/g/a/a/a/z/h$a;->a:Lj/d/d/w;

    iput-object p3, p0, Lj/g/a/a/a/z/h$a;->b:Lj/d/d/a0/a;

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/z/h$a;->a:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    const-class v0, Ljava/util/Map;

    iget-object v1, p0, Lj/g/a/a/a/z/h$a;->b:Lj/d/d/a0/a;

    invoke-virtual {v1}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    :cond_0
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/z/h$a;->a:Lj/d/d/w;

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
