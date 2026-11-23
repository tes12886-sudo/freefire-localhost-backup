.class final enum Lj/d/d/u$b;
.super Lj/d/d/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lj/d/d/u;-><init>(Ljava/lang/String;ILj/d/d/u$a;)V

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/b0/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lj/d/d/z/g;

    invoke-virtual {p1}, Lj/d/d/b0/a;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj/d/d/z/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
