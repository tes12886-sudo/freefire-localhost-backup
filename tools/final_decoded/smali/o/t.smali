.class public final Lo/t;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lm/d0;

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final c:Lm/e0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lm/d0;Ljava/lang/Object;Lm/e0;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lm/e0;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/d0;",
            "TT;",
            "Lm/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/t;->a:Lm/d0;

    iput-object p2, p0, Lo/t;->b:Ljava/lang/Object;

    iput-object p3, p0, Lo/t;->c:Lm/e0;

    return-void
.end method

.method public static c(Lm/e0;Lm/d0;)Lo/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lm/e0;",
            "Lm/d0;",
            ")",
            "Lo/t<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "body == null"

    invoke-static {p0, v0}, Le;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Le;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lm/d0;->Y()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lo/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lo/t;-><init>(Lm/d0;Ljava/lang/Object;Lm/e0;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse should not be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Ljava/lang/Object;Lm/d0;)Lo/t;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lm/d0;",
            ")",
            "Lo/t<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Le;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lm/d0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lo/t;-><init>(Lm/d0;Ljava/lang/Object;Lm/e0;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse must be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lo/t;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lo/t;->a:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->l()I

    move-result v0

    return v0
.end method

.method public d()Lm/e0;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lo/t;->c:Lm/e0;

    return-object v0
.end method

.method public e()Lm/u;
    .locals 1

    iget-object v0, p0, Lo/t;->a:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->T()Lm/u;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lo/t;->a:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->Y()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/t;->a:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->Z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/t;->a:Lm/d0;

    invoke-virtual {v0}, Lm/d0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
