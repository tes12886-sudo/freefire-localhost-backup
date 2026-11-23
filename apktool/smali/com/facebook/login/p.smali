.class public Lcom/facebook/login/p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/p$e;,
        Lcom/facebook/login/p$d;
    }
.end annotation


# static fields
.field private static final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final k:Ljava/lang/String;

.field private static volatile l:Lcom/facebook/login/p;


# instance fields
.field private a:Lcom/facebook/login/k;

.field private b:Lcom/facebook/login/c;

.field private final c:Landroid/content/SharedPreferences;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Lcom/facebook/login/s;

.field private h:Z

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/facebook/login/p;->f()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/p;->j:Ljava/util/Set;

    const-class v0, Lcom/facebook/login/p;

    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/p;->k:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/login/k;->h:Lcom/facebook/login/k;

    iput-object v0, p0, Lcom/facebook/login/p;->a:Lcom/facebook/login/k;

    sget-object v0, Lcom/facebook/login/c;->b:Lcom/facebook/login/c;

    iput-object v0, p0, Lcom/facebook/login/p;->b:Lcom/facebook/login/c;

    const-string v0, "rerequest"

    iput-object v0, p0, Lcom/facebook/login/p;->d:Ljava/lang/String;

    sget-object v0, Lcom/facebook/login/s;->b:Lcom/facebook/login/s;

    iput-object v0, p0, Lcom/facebook/login/p;->g:Lcom/facebook/login/s;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/login/p;->h:Z

    iput-boolean v0, p0, Lcom/facebook/login/p;->i:Z

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.facebook.loginManager"

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/p;->c:Landroid/content/SharedPreferences;

    sget-boolean v0, Lcom/facebook/r;->o:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/internal/g;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/login/b;

    invoke-direct {v0}, Lcom/facebook/login/b;-><init>()V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.android.chrome"

    invoke-static {v1, v2, v0}, Lh/d/b/c;->a(Landroid/content/Context;Ljava/lang/String;Lh/d/b/e;)Z

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lh/d/b/c;->b(Landroid/content/Context;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method static a(Lcom/facebook/login/l$d;Lcom/facebook/a;Lcom/facebook/f;)Lcom/facebook/login/r;
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/login/l$d;->k()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/facebook/a;->k()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lcom/facebook/login/l$d;->p()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    new-instance v0, Lcom/facebook/login/r;

    invoke-direct {v0, p1, p2, v1, p0}, Lcom/facebook/login/r;-><init>(Lcom/facebook/a;Lcom/facebook/f;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method private c(Lcom/facebook/a;Lcom/facebook/f;Lcom/facebook/login/l$d;Lcom/facebook/n;ZLcom/facebook/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/a;",
            "Lcom/facebook/f;",
            "Lcom/facebook/login/l$d;",
            "Lcom/facebook/n;",
            "Z",
            "Lcom/facebook/l<",
            "Lcom/facebook/login/r;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    invoke-static {}, Lcom/facebook/b0;->b()V

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/facebook/f;->b(Lcom/facebook/f;)V

    :cond_1
    if-eqz p6, :cond_6

    if-eqz p1, :cond_2

    invoke-static {p3, p1, p2}, Lcom/facebook/login/p;->a(Lcom/facebook/login/l$d;Lcom/facebook/a;Lcom/facebook/f;)Lcom/facebook/login/r;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p5, :cond_5

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/facebook/login/r;->b()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    if-nez p3, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    invoke-interface {p6, p4}, Lcom/facebook/l;->b(Lcom/facebook/n;)V

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_6

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/facebook/login/p;->q(Z)V

    invoke-interface {p6, p2}, Lcom/facebook/l;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p6}, Lcom/facebook/l;->a()V

    :cond_6
    :goto_2
    return-void
.end method

.method public static e()Lcom/facebook/login/p;
    .locals 2

    sget-object v0, Lcom/facebook/login/p;->l:Lcom/facebook/login/p;

    if-nez v0, :cond_1

    const-class v0, Lcom/facebook/login/p;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/login/p;->l:Lcom/facebook/login/p;

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/login/p;

    invoke-direct {v1}, Lcom/facebook/login/p;-><init>()V

    sput-object v1, Lcom/facebook/login/p;->l:Lcom/facebook/login/p;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/facebook/login/p;->l:Lcom/facebook/login/p;

    return-object v0
.end method

.method private static f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/login/p$b;

    invoke-direct {v0}, Lcom/facebook/login/p$b;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method static g(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_1

    const-string v0, "publish"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "manage"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/login/p;->j:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private h(Landroid/content/Context;Lcom/facebook/login/l$e$b;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/l$d;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/login/l$e$b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Exception;",
            "Z",
            "Lcom/facebook/login/l$d;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lcom/facebook/login/p$e;->a(Landroid/content/Context;)Lcom/facebook/login/o;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string p1, "fb_mobile_login_complete"

    if-nez p6, :cond_1

    const-string p2, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    invoke-virtual {v0, p1, p2}, Lcom/facebook/login/o;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-eqz p5, :cond_2

    const-string p5, "1"

    goto :goto_0

    :cond_2
    const-string p5, "0"

    :goto_0
    const-string v1, "try_login_activity"

    invoke-virtual {v2, v1, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6}, Lcom/facebook/login/l$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p6}, Lcom/facebook/login/l$d;->n()Z

    move-result p5

    if-eqz p5, :cond_3

    const-string p1, "foa_mobile_login_complete"

    :cond_3
    move-object v6, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/login/o;->f(Ljava/lang/String;Ljava/util/Map;Lcom/facebook/login/l$e$b;Ljava/util/Map;Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private l(Landroid/content/Context;Lcom/facebook/login/l$d;)V
    .locals 1

    invoke-static {p1}, Lcom/facebook/login/p$e;->a(Landroid/content/Context;)Lcom/facebook/login/o;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/facebook/login/l$d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "foa_mobile_login_start"

    goto :goto_0

    :cond_0
    const-string v0, "fb_mobile_login_start"

    :goto_0
    invoke-virtual {p1, p2, v0}, Lcom/facebook/login/o;->h(Lcom/facebook/login/l$d;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private p(Landroid/content/Intent;)Z
    .locals 2

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private q(Z)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/p;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "express_login_allowed"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private r(Lcom/facebook/login/w;Lcom/facebook/login/l$d;)V
    .locals 8

    invoke-interface {p1}, Lcom/facebook/login/w;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/login/p;->l(Landroid/content/Context;Lcom/facebook/login/l$d;)V

    sget-object v0, Lcom/facebook/internal/e$c;->b:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    new-instance v1, Lcom/facebook/login/p$c;

    invoke-direct {v1, p0}, Lcom/facebook/login/p$c;-><init>(Lcom/facebook/login/p;)V

    invoke-static {v0, v1}, Lcom/facebook/internal/e;->d(ILcom/facebook/internal/e$a;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/login/p;->s(Lcom/facebook/login/w;Lcom/facebook/login/l$d;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/n;

    const-string v1, "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."

    invoke-direct {v0, v1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-interface {p1}, Lcom/facebook/login/w;->a()Landroid/app/Activity;

    move-result-object v2

    sget-object v3, Lcom/facebook/login/l$e$b;->d:Lcom/facebook/login/l$e$b;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, v0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/facebook/login/p;->h(Landroid/content/Context;Lcom/facebook/login/l$e$b;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/l$d;)V

    throw v0
.end method

.method private s(Lcom/facebook/login/w;Lcom/facebook/login/l$d;)Z
    .locals 2

    invoke-virtual {p0, p2}, Lcom/facebook/login/p;->d(Lcom/facebook/login/l$d;)Landroid/content/Intent;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/facebook/login/p;->p(Landroid/content/Intent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/login/l;->p()I

    move-result v0

    invoke-interface {p1, p2, v0}, Lcom/facebook/login/w;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v1
.end method

.method private t(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/login/p;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/facebook/n;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "Cannot pass a publish or manage permission (%s) to a request for read authorization"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method


# virtual methods
.method protected b(Lcom/facebook/login/m;)Lcom/facebook/login/l$d;
    .locals 10

    new-instance v9, Lcom/facebook/login/l$d;

    iget-object v1, p0, Lcom/facebook/login/p;->a:Lcom/facebook/login/k;

    invoke-virtual {p1}, Lcom/facebook/login/m;->b()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/facebook/login/m;->b()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/login/p;->b:Lcom/facebook/login/c;

    iget-object v4, p0, Lcom/facebook/login/p;->d:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/facebook/login/p;->g:Lcom/facebook/login/s;

    invoke-virtual {p1}, Lcom/facebook/login/m;->a()Ljava/lang/String;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/facebook/login/l$d;-><init>(Lcom/facebook/login/k;Ljava/util/Set;Lcom/facebook/login/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/s;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/a;->o()Z

    move-result p1

    invoke-virtual {v9, p1}, Lcom/facebook/login/l$d;->t(Z)V

    iget-object p1, p0, Lcom/facebook/login/p;->e:Ljava/lang/String;

    invoke-virtual {v9, p1}, Lcom/facebook/login/l$d;->r(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/facebook/login/p;->f:Z

    invoke-virtual {v9, p1}, Lcom/facebook/login/l$d;->u(Z)V

    iget-boolean p1, p0, Lcom/facebook/login/p;->h:Z

    invoke-virtual {v9, p1}, Lcom/facebook/login/l$d;->q(Z)V

    iget-boolean p1, p0, Lcom/facebook/login/p;->i:Z

    invoke-virtual {v9, p1}, Lcom/facebook/login/l$d;->v(Z)V

    return-object v9
.end method

.method protected d(Lcom/facebook/login/l$d;)Landroid/content/Intent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/FacebookActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->g()Lcom/facebook/login/k;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "request"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "com.facebook.LoginFragment:Request"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method

.method public i(Landroid/app/Activity;Lcom/facebook/login/m;)V
    .locals 2

    instance-of v0, p1, Landroidx/activity/result/e;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/login/p;->k:Ljava/lang/String;

    const-string v1, "You\'re calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult()."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/login/p;->b(Lcom/facebook/login/m;)Lcom/facebook/login/l$d;

    move-result-object p2

    new-instance v0, Lcom/facebook/login/p$d;

    invoke-direct {v0, p1}, Lcom/facebook/login/p$d;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0, v0, p2}, Lcom/facebook/login/p;->r(Lcom/facebook/login/w;Lcom/facebook/login/l$d;)V

    return-void
.end method

.method public j(Landroid/app/Activity;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/facebook/login/p;->t(Ljava/util/Collection;)V

    new-instance v0, Lcom/facebook/login/m;

    invoke-direct {v0, p2}, Lcom/facebook/login/m;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1, v0}, Lcom/facebook/login/p;->i(Landroid/app/Activity;Lcom/facebook/login/m;)V

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    invoke-static {v0}, Lcom/facebook/f;->b(Lcom/facebook/f;)V

    invoke-static {v0}, Lcom/facebook/b0;->c(Lcom/facebook/b0;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/login/p;->q(Z)V

    return-void
.end method

.method m(ILandroid/content/Intent;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/login/p;->n(ILandroid/content/Intent;Lcom/facebook/l;)Z

    move-result p1

    return p1
.end method

.method n(ILandroid/content/Intent;Lcom/facebook/l;)Z
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Lcom/facebook/l<",
            "Lcom/facebook/login/r;",
            ">;)Z"
        }
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    sget-object v2, Lcom/facebook/login/l$e$b;->d:Lcom/facebook/login/l$e$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    const-string v6, "com.facebook.LoginFragment:Result"

    invoke-virtual {v1, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/login/l$e;

    if-eqz v1, :cond_3

    iget-object v2, v1, Lcom/facebook/login/l$e;->f:Lcom/facebook/login/l$d;

    iget-object v6, v1, Lcom/facebook/login/l$e;->a:Lcom/facebook/login/l$e$b;

    const/4 v7, -0x1

    if-ne v0, v7, :cond_1

    sget-object v0, Lcom/facebook/login/l$e$b;->b:Lcom/facebook/login/l$e$b;

    if-ne v6, v0, :cond_0

    iget-object v0, v1, Lcom/facebook/login/l$e;->b:Lcom/facebook/a;

    iget-object v7, v1, Lcom/facebook/login/l$e;->c:Lcom/facebook/f;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/k;

    iget-object v7, v1, Lcom/facebook/login/l$e;->d:Ljava/lang/String;

    invoke-direct {v0, v7}, Lcom/facebook/k;-><init>(Ljava/lang/String;)V

    move-object v7, v4

    move-object v4, v0

    move-object v0, v7

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    move-object v0, v4

    move-object v7, v0

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v4

    move-object v7, v0

    :goto_0
    iget-object v1, v1, Lcom/facebook/login/l$e;->g:Ljava/util/Map;

    move v15, v5

    move-object v5, v2

    move-object v2, v6

    move v6, v15

    goto :goto_1

    :cond_3
    move-object v0, v4

    move-object v1, v0

    move-object v5, v1

    move-object v7, v5

    const/4 v6, 0x0

    :goto_1
    move-object v8, v1

    move v13, v6

    move-object v1, v7

    move-object v7, v2

    move-object v2, v5

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    sget-object v2, Lcom/facebook/login/l$e$b;->c:Lcom/facebook/login/l$e$b;

    move-object v7, v2

    move-object v0, v4

    move-object v1, v0

    move-object v2, v1

    move-object v8, v2

    const/4 v13, 0x1

    goto :goto_2

    :cond_5
    move-object v7, v2

    move-object v0, v4

    move-object v1, v0

    move-object v2, v1

    move-object v8, v2

    const/4 v13, 0x0

    :goto_2
    if-nez v4, :cond_6

    if-nez v0, :cond_6

    if-nez v13, :cond_6

    new-instance v4, Lcom/facebook/n;

    const-string v5, "Unexpected call to LoginManager.onActivityResult"

    invoke-direct {v4, v5}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    :cond_6
    move-object v12, v4

    const/4 v10, 0x1

    const/4 v6, 0x0

    move-object/from16 v5, p0

    move-object v9, v12

    move-object v11, v2

    invoke-direct/range {v5 .. v11}, Lcom/facebook/login/p;->h(Landroid/content/Context;Lcom/facebook/login/l$e$b;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/l$d;)V

    move-object/from16 v8, p0

    move-object v9, v0

    move-object v10, v1

    move-object/from16 v14, p3

    invoke-direct/range {v8 .. v14}, Lcom/facebook/login/p;->c(Lcom/facebook/a;Lcom/facebook/f;Lcom/facebook/login/l$d;Lcom/facebook/n;ZLcom/facebook/l;)V

    return v3
.end method

.method public o(Lcom/facebook/j;Lcom/facebook/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/j;",
            "Lcom/facebook/l<",
            "Lcom/facebook/login/r;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/facebook/internal/e;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/internal/e;

    sget-object v0, Lcom/facebook/internal/e$c;->b:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    new-instance v1, Lcom/facebook/login/p$a;

    invoke-direct {v1, p0, p2}, Lcom/facebook/login/p$a;-><init>(Lcom/facebook/login/p;Lcom/facebook/l;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/internal/e;->c(ILcom/facebook/internal/e$a;)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/n;

    const-string p2, "Unexpected CallbackManager, please use the provided Factory."

    invoke-direct {p1, p2}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method
