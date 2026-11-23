.class public final Lcom/facebook/internal/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/i$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/internal/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/internal/i;

    invoke-direct {v0}, Lcom/facebook/internal/i;-><init>()V

    sput-object v0, Lcom/facebook/internal/i;->a:Lcom/facebook/internal/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/facebook/internal/h;)Z
    .locals 1

    const-string v0, "feature"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/facebook/internal/i;->b(Lcom/facebook/internal/h;)Lcom/facebook/internal/c0$g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/facebook/internal/c0$g;->d()I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(Lcom/facebook/internal/h;)Lcom/facebook/internal/c0$g;
    .locals 3

    const-string v0, "feature"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/facebook/internal/h;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/facebook/internal/i;->a:Lcom/facebook/internal/i;

    invoke-direct {v2, v0, v1, p0}, Lcom/facebook/internal/i;->c(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/internal/h;)[I

    move-result-object p0

    invoke-static {v1, p0}, Lcom/facebook/internal/c0;->w(Ljava/lang/String;[I)Lcom/facebook/internal/c0$g;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/internal/h;)[I
    .locals 2

    sget-object v0, Lcom/facebook/internal/t;->n:Lcom/facebook/internal/t$a;

    invoke-interface {p3}, Lcom/facebook/internal/h;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/facebook/internal/t$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/t$b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/internal/t$b;->c()[I

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    new-array p1, p1, [I

    const/4 p2, 0x0

    invoke-interface {p3}, Lcom/facebook/internal/h;->c()I

    move-result p3

    aput p3, p1, p2

    :goto_0
    return-object p1
.end method

.method public static final d(Lcom/facebook/internal/a;Landroid/app/Activity;)V
    .locals 2

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/a;->e()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->g()Z

    return-void
.end method

.method public static final e(Lcom/facebook/internal/a;Landroidx/activity/result/d;Lcom/facebook/j;)V
    .locals 2

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->f()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/internal/a;->e()I

    move-result v1

    invoke-static {p1, p2, v0, v1}, Lcom/facebook/internal/i;->m(Landroidx/activity/result/d;Lcom/facebook/j;Landroid/content/Intent;I)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->g()Z

    :cond_0
    return-void
.end method

.method public static final f(Lcom/facebook/internal/a;Lcom/facebook/internal/v;)V
    .locals 2

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentWrapper"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/a;->e()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/internal/v;->b(Landroid/content/Intent;I)V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->g()Z

    return-void
.end method

.method public static final g(Lcom/facebook/internal/a;)V
    .locals 2

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/n;

    const-string v1, "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."

    invoke-direct {v0, v1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/facebook/internal/i;->k(Lcom/facebook/internal/a;Lcom/facebook/n;)V

    return-void
.end method

.method public static final h(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/facebook/internal/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/internal/i0;->e(Landroid/content/Context;Ljava/lang/String;)Z

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/i0;->h(Landroid/content/Context;)V

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/CustomTabMainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lcom/facebook/CustomTabMainActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Lcom/facebook/CustomTabMainActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    sget-object p2, Lcom/facebook/CustomTabMainActivity;->e:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/internal/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lcom/facebook/internal/c0;->z()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, p2, p1, v1, v2}, Lcom/facebook/internal/c0;->F(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/facebook/internal/a;->h(Landroid/content/Intent;)V

    return-void
.end method

.method public static final i(Lcom/facebook/internal/a;Lcom/facebook/n;)V
    .locals 4

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/i0;->f(Landroid/content/Context;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/FacebookActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v1, "PassThrough"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {}, Lcom/facebook/internal/c0;->z()I

    move-result v3

    invoke-static {p1}, Lcom/facebook/internal/c0;->j(Lcom/facebook/n;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/internal/c0;->F(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lcom/facebook/internal/a;->h(Landroid/content/Intent;)V

    return-void
.end method

.method public static final j(Lcom/facebook/internal/a;Lcom/facebook/internal/i$a;Lcom/facebook/internal/h;)V
    .locals 4

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterProvider"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feature"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p2}, Lcom/facebook/internal/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/facebook/internal/i;->b(Lcom/facebook/internal/h;)Lcom/facebook/internal/c0$g;

    move-result-object p2

    invoke-virtual {p2}, Lcom/facebook/internal/c0$g;->d()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    invoke-static {v2}, Lcom/facebook/internal/c0;->E(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Lcom/facebook/internal/i$a;->b()Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/facebook/internal/i$a;->a()Landroid/os/Bundle;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1, p2, p1}, Lcom/facebook/internal/c0;->n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/internal/c0$g;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/facebook/internal/a;->h(Landroid/content/Intent;)V

    return-void

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Unable to create Intent; this likely means theFacebook app is not installed."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Cannot present this dialog. This likely means that the Facebook app is not installed."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final k(Lcom/facebook/internal/a;Lcom/facebook/n;)V
    .locals 1

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/facebook/internal/i;->i(Lcom/facebook/internal/a;Lcom/facebook/n;)V

    return-void
.end method

.method public static final l(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "appCall"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/i0;->f(Landroid/content/Context;)V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/i0;->h(Landroid/content/Context;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "params"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/facebook/internal/c0;->z()I

    move-result v2

    invoke-static {p2, v1, p1, v2, v0}, Lcom/facebook/internal/c0;->F(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object p1

    const-class v0, Lcom/facebook/FacebookActivity;

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string p1, "FacebookDialogFragment"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Lcom/facebook/internal/a;->h(Landroid/content/Intent;)V

    return-void
.end method

.method public static final m(Landroidx/activity/result/d;Lcom/facebook/j;Landroid/content/Intent;I)V
    .locals 4

    const-string v0, "registry"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll/y/c/l;

    invoke-direct {v0}, Ll/y/c/l;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "facebook-dialog-request-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/internal/i$b;

    invoke-direct {v2}, Lcom/facebook/internal/i$b;-><init>()V

    new-instance v3, Lcom/facebook/internal/i$c;

    invoke-direct {v3, p1, p3, v0}, Lcom/facebook/internal/i$c;-><init>(Lcom/facebook/j;ILl/y/c/l;)V

    invoke-virtual {p0, v1, v2, v3}, Landroidx/activity/result/d;->i(Ljava/lang/String;Landroidx/activity/result/g/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object p0

    iput-object p0, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast p0, Landroidx/activity/result/c;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p2}, Landroidx/activity/result/c;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
