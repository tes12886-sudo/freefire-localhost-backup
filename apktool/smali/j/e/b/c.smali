.class public Lj/e/b/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final d:Lj/e/b/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/e/b/c<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lj/e/b/d;

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private final c:Lj/e/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lj/e/b/c;

    sget-object v1, Lj/e/b/d;->a:Lj/e/b/d;

    sget-object v2, Lj/e/b/b;->c:Lj/e/b/b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lj/e/b/c;-><init>(Lj/e/b/d;Ljava/lang/Object;Lj/e/b/b;)V

    sput-object v0, Lj/e/b/c;->d:Lj/e/b/c;

    return-void
.end method

.method private constructor <init>(Lj/e/b/d;Ljava/lang/Object;Lj/e/b/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/e/b/d;",
            "TR;",
            "Lj/e/b/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/c;->a:Lj/e/b/d;

    iput-object p2, p0, Lj/e/b/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lj/e/b/c;->c:Lj/e/b/b;

    return-void
.end method

.method public static a(Lj/e/b/d;Lj/e/b/b;)Lj/e/b/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/e/b/d;",
            "Lj/e/b/b;",
            ")",
            "Lj/e/b/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lj/e/b/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lj/e/b/c;-><init>(Lj/e/b/d;Ljava/lang/Object;Lj/e/b/b;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Lj/e/b/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lj/e/b/c<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lj/e/b/c;->d:Lj/e/b/c;

    return-object p0

    :cond_0
    new-instance v0, Lj/e/b/c;

    sget-object v1, Lj/e/b/d;->a:Lj/e/b/d;

    sget-object v2, Lj/e/b/b;->c:Lj/e/b/b;

    invoke-direct {v0, v1, p0, v2}, Lj/e/b/c;-><init>(Lj/e/b/d;Ljava/lang/Object;Lj/e/b/b;)V

    return-object v0
.end method


# virtual methods
.method public c()Lj/e/b/b;
    .locals 1

    iget-object v0, p0, Lj/e/b/c;->c:Lj/e/b/b;

    return-object v0
.end method

.method public d()Lj/e/b/d;
    .locals 1

    iget-object v0, p0, Lj/e/b/c;->a:Lj/e/b/d;

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v0, p0, Lj/e/b/c;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "response data is null. Please check result by isSuccess before."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    const-class v1, Lj/e/b/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lj/e/b/c;

    iget-object v1, p0, Lj/e/b/c;->a:Lj/e/b/d;

    iget-object v2, p1, Lj/e/b/c;->a:Lj/e/b/d;

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lj/e/b/c;->b:Ljava/lang/Object;

    if-eqz v1, :cond_3

    iget-object v2, p1, Lj/e/b/c;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_3
    iget-object v1, p1, Lj/e/b/c;->b:Ljava/lang/Object;

    if-eqz v1, :cond_4

    :goto_0
    return v0

    :cond_4
    iget-object v0, p0, Lj/e/b/c;->c:Lj/e/b/b;

    iget-object p1, p1, Lj/e/b/c;->c:Lj/e/b/b;

    invoke-virtual {v0, p1}, Lj/e/b/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_1
    return v0
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lj/e/b/c;->a:Lj/e/b/d;

    sget-object v1, Lj/e/b/d;->a:Lj/e/b/d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lj/e/b/c;->a:Lj/e/b/d;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj/e/b/c;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj/e/b/c;->c:Lj/e/b/b;

    invoke-virtual {v1}, Lj/e/b/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LineApiResponse{errorData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj/e/b/c;->c:Lj/e/b/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/e/b/c;->a:Lj/e/b/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responseData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/e/b/c;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
