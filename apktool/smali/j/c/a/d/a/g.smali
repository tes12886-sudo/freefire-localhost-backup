.class public final Lj/c/a/d/a/g;
.super Lj/f/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/c/a/d/a/g$a;,
        Lj/c/a/d/a/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/b<",
        "Lj/c/a/d/a/g;",
        "Lj/c/a/d/a/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Lj/c/a/d/a/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/c/a/d/a/g$b;

    invoke-direct {v0}, Lj/c/a/d/a/g$b;-><init>()V

    sput-object v0, Lj/c/a/d/a/g;->f:Lj/f/a/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/util/List;Ln/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ln/e;",
            ")V"
        }
    .end annotation

    sget-object v0, Lj/c/a/d/a/g;->f:Lj/f/a/e;

    invoke-direct {p0, v0, p3}, Lj/f/a/b;-><init>(Lj/f/a/e;Ln/e;)V

    iput-object p1, p0, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    const-string p1, "FailList"

    invoke-static {p1, p2}, Lj/f/a/h/b;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lj/c/a/d/a/g;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj/c/a/d/a/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj/c/a/d/a/g;

    invoke-virtual {p0}, Lj/f/a/b;->c()Ln/e;

    move-result-object v1

    invoke-virtual {p1}, Lj/f/a/b;->c()Ln/e;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    iget-object v3, p1, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/c/a/d/a/g;->e:Ljava/util/List;

    iget-object p1, p1, Lj/c/a/d/a/g;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lj/f/a/b;->c:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj/f/a/b;->c()Ln/e;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lj/c/a/d/a/g;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lj/f/a/b;->c:I

    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", Msgid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/g;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ", FailList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/g;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "PushMsgAck{"

    invoke-virtual {v0, v1, v2, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
