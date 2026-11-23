.class Lj/d/d/z/h$c$a;
.super Lj/d/d/z/h$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/h$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/z/h<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lj/d/d/z/h$c;)V
    .locals 0

    iget-object p1, p1, Lj/d/d/z/h$c;->a:Lj/d/d/z/h;

    invoke-direct {p0, p1}, Lj/d/d/z/h$d;-><init>(Lj/d/d/z/h;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/d/d/z/h$d;->a()Lj/d/d/z/h$e;

    move-result-object v0

    iget-object v0, v0, Lj/d/d/z/h$e;->f:Ljava/lang/Object;

    return-object v0
.end method
