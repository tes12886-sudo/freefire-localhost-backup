.class public final Lj/c/a/d/a/e$a;
.super Lj/f/a/b$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/d/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/b$a<",
        "Lj/c/a/d/a/e;",
        "Lj/c/a/d/a/e$a;",
        ">;"
    }
.end annotation


# instance fields
.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;

.field public e:Ln/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/f/a/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Integer;)Lj/c/a/d/a/e$a;
    .locals 0

    iput-object p1, p0, Lj/c/a/d/a/e$a;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Ln/e;)Lj/c/a/d/a/e$a;
    .locals 0

    iput-object p1, p0, Lj/c/a/d/a/e$a;->e:Ln/e;

    return-object p0
.end method

.method public e(Ljava/lang/Integer;)Lj/c/a/d/a/e$a;
    .locals 0

    iput-object p1, p0, Lj/c/a/d/a/e$a;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public f()Lj/c/a/d/a/e;
    .locals 5

    iget-object v0, p0, Lj/c/a/d/a/e$a;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/c/a/d/a/e$a;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lj/c/a/d/a/e$a;->e:Ln/e;

    if-eqz v1, :cond_0

    new-instance v0, Lj/c/a/d/a/e;

    iget-object v1, p0, Lj/c/a/d/a/e$a;->c:Ljava/lang/Integer;

    iget-object v2, p0, Lj/c/a/d/a/e$a;->d:Ljava/lang/Integer;

    iget-object v3, p0, Lj/c/a/d/a/e$a;->e:Ln/e;

    invoke-super {p0}, Lj/f/a/b$a;->b()Ln/e;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lj/c/a/d/a/e;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ln/e;Ln/e;)V

    return-object v0

    :cond_0
    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    const-string v2, "Appid"

    aput-object v2, v1, v0

    const/4 v0, 0x2

    iget-object v2, p0, Lj/c/a/d/a/e$a;->d:Ljava/lang/Integer;

    aput-object v2, v1, v0

    const/4 v0, 0x3

    const-string v2, "Msgid"

    aput-object v2, v1, v0

    const/4 v0, 0x4

    iget-object v2, p0, Lj/c/a/d/a/e$a;->e:Ln/e;

    aput-object v2, v1, v0

    const/4 v0, 0x5

    const-string v2, "Data"

    aput-object v2, v1, v0

    invoke-static {v1}, Lj/f/a/h/b;->c([Ljava/lang/Object;)Ljava/lang/IllegalStateException;

    const/4 v0, 0x0

    throw v0
.end method
