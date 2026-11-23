.class public final Lj/c/a/d/a/e;
.super Lj/f/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/c/a/d/a/e$a;,
        Lj/c/a/d/a/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/b<",
        "Lj/c/a/d/a/e;",
        "Lj/c/a/d/a/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final g:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "Lj/c/a/d/a/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;

.field public final f:Ln/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/c/a/d/a/e$b;

    invoke-direct {v0}, Lj/c/a/d/a/e$b;-><init>()V

    sput-object v0, Lj/c/a/d/a/e;->g:Lj/f/a/e;

    sget-object v0, Ln/e;->e:Ln/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ln/e;Ln/e;)V
    .locals 1

    sget-object v0, Lj/c/a/d/a/e;->g:Lj/f/a/e;

    invoke-direct {p0, v0, p4}, Lj/f/a/b;-><init>(Lj/f/a/e;Ln/e;)V

    iput-object p1, p0, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    iput-object p2, p0, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    iput-object p3, p0, Lj/c/a/d/a/e;->f:Ln/e;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj/c/a/d/a/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj/c/a/d/a/e;

    invoke-virtual {p0}, Lj/f/a/b;->c()Ln/e;

    move-result-object v1

    invoke-virtual {p1}, Lj/f/a/b;->c()Ln/e;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    iget-object v3, p1, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    iget-object v3, p1, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/c/a/d/a/e;->f:Ln/e;

    iget-object p1, p1, Lj/c/a/d/a/e;->f:Ln/e;

    invoke-virtual {v1, p1}, Ln/e;->equals(Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lj/c/a/d/a/e;->f:Ln/e;

    invoke-virtual {v1}, Ln/e;->hashCode()I

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

    const-string v1, ", Appid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", Msgid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", Data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/d/a/e;->f:Ln/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "MsgType{"

    invoke-virtual {v0, v1, v2, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
