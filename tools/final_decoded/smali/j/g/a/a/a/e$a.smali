.class public Lj/g/a/a/a/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/g/a/a/a/y/k/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g/a/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/g/a/a/a/y/k/d<",
        "Lj/g/a/a/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/e;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/d/d/f;

    invoke-direct {v0}, Lj/d/d/f;-><init>()V

    const-class v1, Lj/g/a/a/a/y/j/a;

    new-instance v2, Lj/g/a/a/a/b;

    invoke-direct {v2}, Lj/g/a/a/a/b;-><init>()V

    invoke-virtual {v0, v1, v2}, Lj/d/d/f;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lj/d/d/f;

    invoke-virtual {v0}, Lj/d/d/f;->b()Lj/d/d/e;

    move-result-object v0

    iput-object v0, p0, Lj/g/a/a/a/e$a;->a:Lj/d/d/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/g/a/a/a/e$a;->c(Ljava/lang/String;)Lj/g/a/a/a/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lj/g/a/a/a/e;

    invoke-virtual {p0, p1}, Lj/g/a/a/a/e$a;->d(Lj/g/a/a/a/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lj/g/a/a/a/e;
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lj/g/a/a/a/e$a;->a:Lj/d/d/e;

    const-class v1, Lj/g/a/a/a/e;

    invoke-virtual {v0, p1, v1}, Lj/d/d/e;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to deserialize session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Twitter"

    invoke-interface {v0, v1, p1}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lj/g/a/a/a/e;)Ljava/lang/String;
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj/g/a/a/a/k;->a()Lj/g/a/a/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lj/g/a/a/a/e$a;->a:Lj/d/d/e;

    invoke-virtual {v0, p1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to serialize session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Twitter"

    invoke-interface {v0, v1, p1}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string p1, ""

    return-object p1
.end method
