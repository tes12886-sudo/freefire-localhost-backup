.class public final Lj/c/a/d/a/a$a;
.super Lj/f/a/b$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/d/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/b$a<",
        "Lj/c/a/d/a/a;",
        "Lj/c/a/d/a/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public c:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/f/a/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Long;)Lj/c/a/d/a/a$a;
    .locals 0

    iput-object p1, p0, Lj/c/a/d/a/a$a;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public d()Lj/c/a/d/a/a;
    .locals 3

    iget-object v0, p0, Lj/c/a/d/a/a$a;->c:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v0, Lj/c/a/d/a/a;

    iget-object v1, p0, Lj/c/a/d/a/a$a;->c:Ljava/lang/Long;

    invoke-super {p0}, Lj/f/a/b$a;->b()Ln/e;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lj/c/a/d/a/a;-><init>(Ljava/lang/Long;Ln/e;)V

    return-object v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    const-string v2, "GPid"

    aput-object v2, v1, v0

    invoke-static {v1}, Lj/f/a/h/b;->c([Ljava/lang/Object;)Ljava/lang/IllegalStateException;

    const/4 v0, 0x0

    throw v0
.end method
