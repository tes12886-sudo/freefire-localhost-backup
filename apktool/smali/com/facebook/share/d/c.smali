.class public final Lcom/facebook/share/d/c;
.super Lcom/facebook/internal/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/d/c$f;,
        Lcom/facebook/share/d/c$b;,
        Lcom/facebook/share/d/c$c;,
        Lcom/facebook/share/d/c$g;,
        Lcom/facebook/share/d/c$e;,
        Lcom/facebook/share/d/c$d;
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


# static fields
.field private static final i:Ljava/lang/String; = "c"

.field private static final j:I


# instance fields
.field private g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/facebook/internal/e$c;->c:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    sput v0, Lcom/facebook/share/d/c;->j:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/facebook/share/d/c;->j:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/j;-><init>(Landroid/app/Activity;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/share/d/c;->g:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/share/d/c;->h:Z

    invoke-static {v0}, Lcom/facebook/share/b/o;->x(I)V

    return-void
.end method

.method private A(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/share/d/c;->h:Z

    if-eqz v0, :cond_0

    sget-object p3, Lcom/facebook/share/d/c$d;->a:Lcom/facebook/share/d/c$d;

    :cond_0
    sget-object v0, Lcom/facebook/share/d/c$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    const-string v1, "unknown"

    if-eq p3, v0, :cond_3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_2

    const/4 v0, 0x3

    if-eq p3, v0, :cond_1

    move-object p3, v1

    goto :goto_0

    :cond_1
    const-string p3, "native"

    goto :goto_0

    :cond_2
    const-string p3, "web"

    goto :goto_0

    :cond_3
    const-string p3, "automatic"

    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/share/d/c;->y(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p2

    sget-object v0, Lcom/facebook/share/b/m;->b:Lcom/facebook/share/b/m;

    if-ne p2, v0, :cond_4

    const-string v1, "status"

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/facebook/share/b/m;->c:Lcom/facebook/share/b/m;

    if-ne p2, v0, :cond_5

    const-string v1, "photo"

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/facebook/share/b/m;->d:Lcom/facebook/share/b/m;

    if-ne p2, v0, :cond_6

    const-string v1, "video"

    goto :goto_1

    :cond_6
    sget-object v0, Lcom/facebook/share/b/i;->b:Lcom/facebook/share/b/i;

    if-ne p2, v0, :cond_7

    const-string v1, "open_graph"

    :cond_7
    :goto_1
    new-instance p2, Lcom/facebook/j0/m;

    invoke-direct {p2, p1}, Lcom/facebook/j0/m;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "fb_share_dialog_show"

    invoke-virtual {p1, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "fb_share_dialog_content_type"

    invoke-virtual {p1, p3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0, p1}, Lcom/facebook/j0/m;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic n(Lcom/facebook/share/d/c;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Lcom/facebook/share/d/c;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Ljava/lang/Class;)Z
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/d/c;->v(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method static synthetic q(Lcom/facebook/share/d/c;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/internal/j;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Lcom/facebook/share/d/c;Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/share/d/c;->A(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V

    return-void
.end method

.method static synthetic s(Ljava/lang/Class;)Lcom/facebook/internal/h;
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/d/c;->y(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(Lcom/facebook/share/c/e;)Z
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/d/c;->w(Lcom/facebook/share/c/e;)Z

    move-result p0

    return p0
.end method

.method public static u(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/share/c/e;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0}, Lcom/facebook/share/d/c;->x(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/facebook/share/d/c;->v(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static v(Ljava/lang/Class;)Z
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

    invoke-static {p0}, Lcom/facebook/share/d/c;->y(Ljava/lang/Class;)Lcom/facebook/internal/h;

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

.method private static w(Lcom/facebook/share/c/e;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/share/d/c;->x(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p0, Lcom/facebook/share/c/q;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/share/c/q;

    :try_start_0
    invoke-static {p0}, Lcom/facebook/share/b/o;->B(Lcom/facebook/share/c/q;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, Lcom/facebook/share/d/c;->i:Ljava/lang/String;

    const-string v2, "canShow returned false because the content of the Opem Graph object can\'t be shared via the web dialog"

    invoke-static {v0, v2, p0}, Lcom/facebook/internal/h0;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static x(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/share/c/e;",
            ">;)Z"
        }
    .end annotation

    const-class v0, Lcom/facebook/share/c/g;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/facebook/share/c/q;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/facebook/share/c/u;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/facebook/a;->o()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static y(Ljava/lang/Class;)Lcom/facebook/internal/h;
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

    sget-object p0, Lcom/facebook/share/b/m;->b:Lcom/facebook/share/b/m;

    return-object p0

    :cond_0
    const-class v0, Lcom/facebook/share/c/u;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/facebook/share/b/m;->c:Lcom/facebook/share/b/m;

    return-object p0

    :cond_1
    const-class v0, Lcom/facebook/share/c/x;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/facebook/share/b/m;->d:Lcom/facebook/share/b/m;

    return-object p0

    :cond_2
    const-class v0, Lcom/facebook/share/c/q;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcom/facebook/share/b/i;->b:Lcom/facebook/share/b/i;

    return-object p0

    :cond_3
    const-class v0, Lcom/facebook/share/c/i;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lcom/facebook/share/b/m;->e:Lcom/facebook/share/b/m;

    return-object p0

    :cond_4
    const-class v0, Lcom/facebook/share/c/d;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lcom/facebook/share/b/a;->b:Lcom/facebook/share/b/a;

    return-object p0

    :cond_5
    const-class v0, Lcom/facebook/share/c/v;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Lcom/facebook/share/b/p;->b:Lcom/facebook/share/b/p;

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0
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

    new-instance v1, Lcom/facebook/share/d/c$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/c$e;-><init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/facebook/share/d/c$c;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/c$c;-><init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/facebook/share/d/c$g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/c$g;-><init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/facebook/share/d/c$b;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/c$b;-><init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/facebook/share/d/c$f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/d/c$f;-><init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V

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

.method public z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/share/d/c;->g:Z

    return v0
.end method
