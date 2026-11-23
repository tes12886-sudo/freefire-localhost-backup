.class public Lcom/facebook/share/d/a;
.super Lcom/facebook/internal/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/d/a$e;,
        Lcom/facebook/share/d/a$c;,
        Lcom/facebook/share/d/a$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/j<",
        "Lcom/facebook/share/c/c;",
        "Lcom/facebook/share/d/a$d;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/facebook/internal/e$c;->e:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    sput v0, Lcom/facebook/share/d/a;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/facebook/share/d/a;->g:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/j;-><init>(Landroid/app/Activity;I)V

    return-void
.end method

.method static synthetic n(Lcom/facebook/share/d/a;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method protected e()Lcom/facebook/internal/a;
    .locals 2

    new-instance v0, Lcom/facebook/internal/a;

    invoke-virtual {p0}, Lcom/facebook/internal/j;->h()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/internal/a;-><init>(I)V

    return-object v0
.end method

.method protected g()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/internal/j<",
            "Lcom/facebook/share/c/c;",
            "Lcom/facebook/share/d/a$d;",
            ">.a;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/facebook/share/d/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/a$c;-><init>(Lcom/facebook/share/d/a;Lcom/facebook/share/d/a$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/facebook/share/d/a$e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/a$e;-><init>(Lcom/facebook/share/d/a;Lcom/facebook/share/d/a$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected k(Lcom/facebook/internal/e;Lcom/facebook/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/internal/e;",
            "Lcom/facebook/l<",
            "Lcom/facebook/share/d/a$d;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/share/d/a$a;

    invoke-direct {v0, p0, p2, p2}, Lcom/facebook/share/d/a$a;-><init>(Lcom/facebook/share/d/a;Lcom/facebook/l;Lcom/facebook/l;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/internal/j;->h()I

    move-result v0

    new-instance v1, Lcom/facebook/share/d/a$b;

    invoke-direct {v1, p0, p2}, Lcom/facebook/share/d/a$b;-><init>(Lcom/facebook/share/d/a;Lcom/facebook/share/b/k;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/internal/e;->c(ILcom/facebook/internal/e$a;)V

    return-void
.end method
