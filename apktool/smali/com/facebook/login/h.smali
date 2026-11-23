.class Lcom/facebook/login/h;
.super Lcom/facebook/login/q;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private d:Lcom/facebook/login/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/login/h$c;

    invoke-direct {v0}, Lcom/facebook/login/h$c;-><init>()V

    sput-object v0, Lcom/facebook/login/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/q;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/login/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/q;-><init>(Lcom/facebook/login/l;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/internal/d0;->b()V

    iget-object v0, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/internal/d0;->f(Lcom/facebook/internal/d0$b;)V

    iput-object v1, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    :cond_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    const-string v0, "get_token"

    return-object v0
.end method

.method public q(Lcom/facebook/login/l$d;)I
    .locals 2

    new-instance v0, Lcom/facebook/login/g;

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/l;->i()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/facebook/login/g;-><init>(Landroid/content/Context;Lcom/facebook/login/l$d;)V

    iput-object v0, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    invoke-virtual {v0}, Lcom/facebook/internal/d0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/l;->t()V

    new-instance v0, Lcom/facebook/login/h$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/login/h$a;-><init>(Lcom/facebook/login/h;Lcom/facebook/login/l$d;)V

    iget-object p1, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    invoke-virtual {p1, v0}, Lcom/facebook/internal/d0;->f(Lcom/facebook/internal/d0$b;)V

    const/4 p1, 0x1

    return p1
.end method

.method r(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "com.facebook.platform.extra.USER_ID"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/login/h;->t(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/login/l;->t()V

    const-string v0, "com.facebook.platform.extra.ACCESS_TOKEN"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/facebook/login/h$b;

    invoke-direct {v2, p0, p2, p1, v1}, Lcom/facebook/login/h$b;-><init>(Lcom/facebook/login/h;Landroid/os/Bundle;Lcom/facebook/login/l$d;Lcom/facebook/login/l;)V

    invoke-static {v0, v2}, Lcom/facebook/internal/h0;->D(Ljava/lang/String;Lcom/facebook/internal/h0$a;)V

    :goto_1
    return-void
.end method

.method s(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/facebook/internal/d0;->f(Lcom/facebook/internal/d0$b;)V

    :cond_0
    iput-object v1, p0, Lcom/facebook/login/h;->d:Lcom/facebook/login/g;

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/l;->u()V

    if-eqz p2, :cond_8

    const-string v1, "com.facebook.platform.extra.PERMISSIONS"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->k()Ljava/util/Set;

    move-result-object v2

    const-string v3, "com.facebook.platform.extra.ID_TOKEN"

    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "openid"

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-virtual {v0}, Lcom/facebook/login/l;->C()V

    return-void

    :cond_2
    if-eqz v1, :cond_4

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->containsAll(Ljava/util/Collection;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/facebook/login/h;->r(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V

    return-void

    :cond_4
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, ","

    invoke-static {v1, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "new_permissions"

    invoke-virtual {p0, v2, v1}, Lcom/facebook/login/q;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {p1, p2}, Lcom/facebook/login/l$d;->s(Ljava/util/Set;)V

    :cond_8
    invoke-virtual {v0}, Lcom/facebook/login/l;->C()V

    return-void
.end method

.method t(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v0

    :try_start_0
    sget-object v1, Lcom/facebook/e;->c:Lcom/facebook/e;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v1, v2}, Lcom/facebook/login/q;->c(Landroid/os/Bundle;Lcom/facebook/e;Ljava/lang/String;)Lcom/facebook/a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lcom/facebook/login/q;->e(Landroid/os/Bundle;Ljava/lang/String;)Lcom/facebook/f;

    move-result-object p2

    invoke-static {p1, v1, p2}, Lcom/facebook/login/l$e;->b(Lcom/facebook/login/l$d;Lcom/facebook/a;Lcom/facebook/f;)Lcom/facebook/login/l$e;

    move-result-object p1
    :try_end_0
    .catch Lcom/facebook/n; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lcom/facebook/login/l;->q()Lcom/facebook/login/l$d;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v1, p1}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lcom/facebook/login/l;->g(Lcom/facebook/login/l$e;)V

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/facebook/login/q;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
