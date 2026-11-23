.class public Landroidx/lifecycle/w;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/w$b;,
        Landroidx/lifecycle/w$c;,
        Landroidx/lifecycle/w$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/w$a;

.field private final b:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/w$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    iput-object p1, p0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/x;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/v;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/w;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/v;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/v;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/x;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->b(Ljava/lang/String;)Landroidx/lifecycle/v;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    instance-of p2, p1, Landroidx/lifecycle/w$c;

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/lifecycle/w$c;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/w$c;->b(Landroidx/lifecycle/v;)V

    :cond_0
    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    instance-of v1, v0, Landroidx/lifecycle/w$b;

    if-eqz v1, :cond_2

    check-cast v0, Landroidx/lifecycle/w$b;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/w$b;->c(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/v;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-interface {v0, p2}, Landroidx/lifecycle/w$a;->a(Ljava/lang/Class;)Landroidx/lifecycle/v;

    move-result-object p2

    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/x;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/x;->d(Ljava/lang/String;Landroidx/lifecycle/v;)V

    return-object p2
.end method
