.class public abstract Lcom/facebook/internal/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONTENT:",
        "Ljava/lang/Object;",
        "RESU",
        "LT:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Object<",
        "TCONTENT;TRESU",
        "LT;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Ljava/lang/Object;


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lcom/facebook/internal/v;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/facebook/internal/j<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Lcom/facebook/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/internal/j;->f:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Landroid/app/Activity;I)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/j;->a:Landroid/app/Activity;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/internal/j;->b:Lcom/facebook/internal/v;

    iput p2, p0, Lcom/facebook/internal/j;->d:I

    iput-object p1, p0, Lcom/facebook/internal/j;->e:Lcom/facebook/j;

    return-void
.end method

.method private final a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/internal/j<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/internal/j;->c:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->g()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/j;->c:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/j;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler>"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/facebook/internal/a;"
        }
    .end annotation

    sget-object v0, Lcom/facebook/internal/j;->f:Ljava/lang/Object;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/facebook/internal/j;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/internal/j$a;

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/facebook/internal/j$a;->c()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p2}, Lcom/facebook/internal/h0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4, p1, v1}, Lcom/facebook/internal/j$a;->a(Ljava/lang/Object;Z)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {v4, p1}, Lcom/facebook/internal/j$a;->b(Ljava/lang/Object;)Lcom/facebook/internal/a;

    move-result-object p1
    :try_end_0
    .catch Lcom/facebook/n; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, p1

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/facebook/internal/j;->e()Lcom/facebook/internal/a;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/facebook/internal/i;->k(Lcom/facebook/internal/a;Lcom/facebook/n;)V

    move-object v2, p2

    :cond_3
    :goto_2
    if-nez v2, :cond_4

    invoke-virtual {p0}, Lcom/facebook/internal/j;->e()Lcom/facebook/internal/a;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/internal/i;->g(Lcom/facebook/internal/a;)V

    :cond_4
    return-object v2
.end method

.method private final i(Lcom/facebook/j;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/j;->e:Lcom/facebook/j;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/facebook/internal/j;->e:Lcom/facebook/j;

    goto :goto_0

    :cond_0
    if-eq v0, p1, :cond_1

    const-string p1, "FacebookDialog"

    const-string v0, "You\'re registering a callback on a Facebook dialog with two different callback managers. It\'s almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;)Z"
        }
    .end annotation

    sget-object v0, Lcom/facebook/internal/j;->f:Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/internal/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/internal/j;->f:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/facebook/internal/j;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/internal/j$a;

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lcom/facebook/internal/j$a;->c()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p2}, Lcom/facebook/internal/h0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4, p1, v2}, Lcom/facebook/internal/j$a;->a(Ljava/lang/Object;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_3
    return v2
.end method

.method protected abstract e()Lcom/facebook/internal/a;
.end method

.method protected final f()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/j;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/j;->b:Lcom/facebook/internal/v;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/internal/v;->a()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected abstract g()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/internal/j<",
            "TCONTENT;TRESU",
            "LT;",
            ">.a;>;"
        }
    .end annotation
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/facebook/internal/j;->d:I

    return v0
.end method

.method public j(Lcom/facebook/j;Lcom/facebook/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/j;",
            "Lcom/facebook/l<",
            "TRESU",
            "LT;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callbackManager"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/facebook/internal/e;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/internal/j;->i(Lcom/facebook/j;)V

    check-cast p1, Lcom/facebook/internal/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/internal/j;->k(Lcom/facebook/internal/e;Lcom/facebook/l;)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/n;

    const-string p2, "Unexpected CallbackManager, please use the provided Factory."

    invoke-direct {p1, p2}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected abstract k(Lcom/facebook/internal/e;Lcom/facebook/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/internal/e;",
            "Lcom/facebook/l<",
            "TRESU",
            "LT;",
            ">;)V"
        }
    .end annotation
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;)V"
        }
    .end annotation

    sget-object v0, Lcom/facebook/internal/j;->f:Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/internal/j;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method protected m(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/j;->d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p2

    instance-of p2, p2, Landroidx/activity/result/e;

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Landroidx/activity/result/e;

    invoke-interface {p2}, Landroidx/activity/result/e;->h()Landroidx/activity/result/d;

    move-result-object p2

    const-string v0, "registryOwner.activityResultRegistry"

    invoke-static {p2, v0}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/internal/j;->e:Lcom/facebook/j;

    invoke-static {p1, p2, v0}, Lcom/facebook/internal/i;->e(Lcom/facebook/internal/a;Landroidx/activity/result/d;Lcom/facebook/j;)V

    invoke-virtual {p1}, Lcom/facebook/internal/a;->g()Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p2, p0, Lcom/facebook/internal/j;->b:Lcom/facebook/internal/v;

    if-eqz p2, :cond_2

    invoke-static {p1, p2}, Lcom/facebook/internal/i;->f(Lcom/facebook/internal/a;Lcom/facebook/internal/v;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/facebook/internal/j;->a:Landroid/app/Activity;

    if-eqz p2, :cond_4

    invoke-static {p1, p2}, Lcom/facebook/internal/i;->d(Lcom/facebook/internal/a;Landroid/app/Activity;)V

    goto :goto_0

    :cond_3
    const-string p1, "No code path should ever result in a null appCall"

    const-string p2, "FacebookDialog"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/facebook/r;->v()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    :cond_4
    :goto_0
    return-void

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
