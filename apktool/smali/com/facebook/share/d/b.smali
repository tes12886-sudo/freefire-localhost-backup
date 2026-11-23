.class public final Lcom/facebook/share/d/b;
.super Lcom/facebook/internal/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/d/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/j<",
        "Lcom/facebook/share/c/e;",
        "Lcom/facebook/share/a;",
        ">;",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final h:I


# instance fields
.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/facebook/internal/e$c;->d:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    sput v0, Lcom/facebook/share/d/b;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/facebook/share/d/b;->h:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/j;-><init>(Landroid/app/Activity;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/share/d/b;->g:Z

    invoke-static {v0}, Lcom/facebook/share/b/o;->x(I)V

    return-void
.end method

.method static synthetic n(Lcom/facebook/share/d/b;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/internal/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/share/d/b;->t(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/internal/a;)V

    return-void
.end method

.method static synthetic p(Ljava/lang/Class;)Lcom/facebook/internal/h;
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/d/b;->r(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/share/c/e;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0}, Lcom/facebook/share/d/b;->r(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/facebook/internal/i;->a(Lcom/facebook/internal/h;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static r(Ljava/lang/Class;)Lcom/facebook/internal/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/share/c/e;",
            ">;)",
            "Lcom/facebook/internal/h;"
        }
    .end annotation

    const-class v0, Lcom/facebook/share/c/g;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/facebook/share/b/f;->b:Lcom/facebook/share/b/f;

    return-object p0

    :cond_0
    const-class v0, Lcom/facebook/share/c/k;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/facebook/share/b/f;->e:Lcom/facebook/share/b/f;

    return-object p0

    :cond_1
    const-class v0, Lcom/facebook/share/c/n;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/facebook/share/b/f;->f:Lcom/facebook/share/b/f;

    return-object p0

    :cond_2
    const-class v0, Lcom/facebook/share/c/m;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/facebook/share/b/f;->g:Lcom/facebook/share/b/f;

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static t(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/internal/a;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/share/d/b;->r(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object v0

    sget-object v1, Lcom/facebook/share/b/f;->b:Lcom/facebook/share/b/f;

    if-ne v0, v1, :cond_0

    const-string v0, "status"

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/facebook/share/b/f;->e:Lcom/facebook/share/b/f;

    if-ne v0, v1, :cond_1

    const-string v0, "GenericTemplate"

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/facebook/share/b/f;->g:Lcom/facebook/share/b/f;

    if-ne v0, v1, :cond_2

    const-string v0, "MediaTemplate"

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/facebook/share/b/f;->f:Lcom/facebook/share/b/f;

    if-ne v0, v1, :cond_3

    const-string v0, "OpenGraphMusicTemplate"

    goto :goto_0

    :cond_3
    const-string v0, "unknown"

    :goto_0
    new-instance v1, Lcom/facebook/j0/m;

    invoke-direct {v1, p0}, Lcom/facebook/j0/m;-><init>(Landroid/content/Context;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "fb_share_dialog_content_type"

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "fb_share_dialog_content_uuid"

    invoke-virtual {p0, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "fb_share_dialog_content_page_id"

    invoke-virtual {p0, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "fb_messenger_share_dialog_show"

    invoke-virtual {v1, p1, p0}, Lcom/facebook/j0/m;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
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
            "Lcom/facebook/share/c/e;",
            "Lcom/facebook/share/a;",
            ">.a;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/facebook/share/d/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/b$b;-><init>(Lcom/facebook/share/d/b;Lcom/facebook/share/d/b$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected k(Lcom/facebook/internal/e;Lcom/facebook/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/internal/e;",
            "Lcom/facebook/l<",
            "Lcom/facebook/share/a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/internal/j;->h()I

    move-result v0

    invoke-static {v0, p1, p2}, Lcom/facebook/share/b/o;->w(ILcom/facebook/j;Lcom/facebook/l;)V

    return-void
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/share/d/b;->g:Z

    return v0
.end method
