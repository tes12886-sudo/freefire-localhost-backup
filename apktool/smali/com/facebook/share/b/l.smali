.class public Lcom/facebook/share/b/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/b/l$c;,
        Lcom/facebook/share/b/l$d;,
        Lcom/facebook/share/b/l$b;
    }
.end annotation


# static fields
.field private static a:Lcom/facebook/share/b/l$c;

.field private static b:Lcom/facebook/share/b/l$c;

.field private static c:Lcom/facebook/share/b/l$c;


# direct methods
.method private static A(Lcom/facebook/share/c/i;Lcom/facebook/share/b/l$c;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/share/c/i;->h()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/c/h;

    invoke-virtual {p1, v0}, Lcom/facebook/share/b/l$c;->d(Lcom/facebook/share/c/h;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p0, Lcom/facebook/n;

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "Cannot add more than %d media."

    invoke-static {p1, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must specify at least one medium in ShareMediaContent."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static B(Lcom/facebook/share/c/h;Lcom/facebook/share/b/l$c;)V
    .locals 3

    instance-of v0, p0, Lcom/facebook/share/c/t;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/facebook/share/c/t;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->m(Lcom/facebook/share/c/t;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/facebook/share/c/w;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/share/c/w;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->p(Lcom/facebook/share/c/w;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lcom/facebook/n;

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    const-string p0, "Invalid media type: %s"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static C(Lcom/facebook/share/c/n;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/n;->i()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/c/n;->h()Lcom/facebook/share/c/j;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/share/b/l;->O(Lcom/facebook/share/c/j;)V

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify url for ShareMessengerOpenGraphMusicTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static D(Lcom/facebook/share/c/p;Lcom/facebook/share/b/l$c;)V
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/p;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lcom/facebook/share/b/l$c;->l(Lcom/facebook/share/c/s;Z)V

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "ShareOpenGraphAction must have a non-empty actionType"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must specify a non-null ShareOpenGraphAction"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static E(Lcom/facebook/share/c/q;Lcom/facebook/share/b/l$c;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/share/c/q;->h()Lcom/facebook/share/c/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/share/b/l$c;->i(Lcom/facebook/share/c/p;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/q;->h()Lcom/facebook/share/c/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/facebook/share/c/s;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Property \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" was not found on the action. The name of the preview property must match the name of an action property."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must specify a previewPropertyName."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static F(Ljava/lang/String;Z)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, ":"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_3

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v4, p1, v1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/facebook/n;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p0, v0, v3

    const-string p0, "Invalid key found in Open Graph dictionary: %s"

    invoke-direct {p1, p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lcom/facebook/n;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p0, v0, v3

    const-string p0, "Open Graph keys must be namespaced: %s"

    invoke-direct {p1, p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private static G(Lcom/facebook/share/c/r;Lcom/facebook/share/b/l$c;)V
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lcom/facebook/share/b/l$c;->l(Lcom/facebook/share/c/s;Z)V

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Cannot share a null ShareOpenGraphObject"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static H(Lcom/facebook/share/c/s;Lcom/facebook/share/b/l$c;Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/share/c/s;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, p2}, Lcom/facebook/share/b/l;->F(Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lcom/facebook/share/c/s;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2, p1}, Lcom/facebook/share/b/l;->I(Ljava/lang/Object;Lcom/facebook/share/b/l$c;)V

    goto :goto_1

    :cond_1
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v1, p1}, Lcom/facebook/share/b/l;->I(Ljava/lang/Object;Lcom/facebook/share/b/l$c;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static I(Ljava/lang/Object;Lcom/facebook/share/b/l$c;)V
    .locals 1

    instance-of v0, p0, Lcom/facebook/share/c/r;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/facebook/share/c/r;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->k(Lcom/facebook/share/c/r;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/facebook/share/c/t;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/share/c/t;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->m(Lcom/facebook/share/c/t;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static J(Lcom/facebook/share/c/t;)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->e()Landroid/net/Uri;

    move-result-object p0

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string v0, "SharePhoto does not have a Bitmap or ImageUrl specified"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Cannot share a null SharePhoto"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static K(Lcom/facebook/share/c/u;Lcom/facebook/share/b/l$c;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/share/c/u;->h()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/c/t;

    invoke-virtual {p1, v0}, Lcom/facebook/share/b/l$c;->m(Lcom/facebook/share/c/t;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p0, Lcom/facebook/n;

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "Cannot add more than %d photos."

    invoke-static {p1, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must specify at least one Photo in SharePhotoContent."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method private static L(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V
    .locals 1

    invoke-static {p0}, Lcom/facebook/share/b/l;->J(Lcom/facebook/share/c/t;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->e()Landroid/net/Uri;

    move-result-object p0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/facebook/internal/h0;->a0(Landroid/net/Uri;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/share/b/l$c;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method private static M(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->L(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->c()Landroid/graphics/Bitmap;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/c/t;->e()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/internal/h0;->a0(Landroid/net/Uri;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/internal/i0;->d(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method private static N(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/b/l;->J(Lcom/facebook/share/c/t;)V

    return-void
.end method

.method private static O(Lcom/facebook/share/c/j;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/share/c/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/facebook/share/c/o;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/share/c/o;

    invoke-static {p0}, Lcom/facebook/share/b/l;->R(Lcom/facebook/share/c/o;)V

    :cond_1
    return-void

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify title for ShareMessengerActionButton"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static P(Lcom/facebook/share/c/k;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/share/c/k;->h()Lcom/facebook/share/c/l;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/k;->h()Lcom/facebook/share/c/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/c/l;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/c/k;->h()Lcom/facebook/share/c/l;

    move-result-object p0

    invoke-virtual {p0}, Lcom/facebook/share/c/l;->a()Lcom/facebook/share/c/j;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/share/b/l;->O(Lcom/facebook/share/c/j;)V

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify title for ShareMessengerGenericTemplateElement"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify element for ShareMessengerGenericTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify Page Id for ShareMessengerGenericTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static Q(Lcom/facebook/share/c/m;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/share/c/m;->k()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/m;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/share/c/m;->i()Lcom/facebook/share/c/j;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/share/b/l;->O(Lcom/facebook/share/c/j;)V

    return-void

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify Page Id for ShareMessengerMediaTemplateContent"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static R(Lcom/facebook/share/c/o;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/c/o;->e()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string v0, "Must specify url for ShareMessengerURLActionButton"

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static S(Lcom/facebook/share/c/v;Lcom/facebook/share/b/l$c;)V
    .locals 1

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/facebook/share/c/v;->i()Lcom/facebook/share/c/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/c/v;->k()Lcom/facebook/share/c/t;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/share/c/v;->i()Lcom/facebook/share/c/h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/v;->i()Lcom/facebook/share/c/h;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/share/b/l$c;->d(Lcom/facebook/share/c/h;)V

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/c/v;->k()Lcom/facebook/share/c/t;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/share/c/v;->k()Lcom/facebook/share/c/t;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->m(Lcom/facebook/share/c/t;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must pass the Facebook app a background asset, a sticker asset, or both"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static T(Lcom/facebook/share/c/w;Lcom/facebook/share/b/l$c;)V
    .locals 0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/facebook/share/c/w;->c()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/facebook/internal/h0;->T(Landroid/net/Uri;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Lcom/facebook/internal/h0;->W(Landroid/net/Uri;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "ShareVideo must reference a video that is on the device"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p0, Lcom/facebook/n;

    const-string p1, "ShareVideo does not have a LocalUrl specified"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Cannot share a null ShareVideo"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static U(Lcom/facebook/share/c/x;Lcom/facebook/share/b/l$c;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/share/c/x;->k()Lcom/facebook/share/c/w;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/share/b/l$c;->p(Lcom/facebook/share/c/w;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/x;->j()Lcom/facebook/share/c/t;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->m(Lcom/facebook/share/c/t;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/share/c/i;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->A(Lcom/facebook/share/c/i;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/share/c/d;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->u(Lcom/facebook/share/c/d;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/share/c/q;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->E(Lcom/facebook/share/c/q;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic d(Lcom/facebook/share/c/p;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->D(Lcom/facebook/share/c/p;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic e(Lcom/facebook/share/c/r;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->G(Lcom/facebook/share/c/r;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic f(Lcom/facebook/share/c/s;Lcom/facebook/share/b/l$c;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/facebook/share/b/l;->H(Lcom/facebook/share/c/s;Lcom/facebook/share/b/l$c;Z)V

    return-void
.end method

.method static synthetic g(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->M(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic h(Lcom/facebook/share/c/w;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->T(Lcom/facebook/share/c/w;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic i(Lcom/facebook/share/c/n;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/b/l;->C(Lcom/facebook/share/c/n;)V

    return-void
.end method

.method static synthetic j(Lcom/facebook/share/c/k;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/b/l;->P(Lcom/facebook/share/c/k;)V

    return-void
.end method

.method static synthetic k(Lcom/facebook/share/c/m;)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/share/b/l;->Q(Lcom/facebook/share/c/m;)V

    return-void
.end method

.method static synthetic l(Lcom/facebook/share/c/v;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->S(Lcom/facebook/share/c/v;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic m(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->N(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic n(Lcom/facebook/share/c/g;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->z(Lcom/facebook/share/c/g;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic o(Lcom/facebook/share/c/u;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->K(Lcom/facebook/share/c/u;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method static synthetic p(Lcom/facebook/share/c/x;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/share/b/l;->U(Lcom/facebook/share/c/x;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method private static q()Lcom/facebook/share/b/l$c;
    .locals 2

    sget-object v0, Lcom/facebook/share/b/l;->b:Lcom/facebook/share/b/l$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/share/b/l$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/share/b/l$c;-><init>(Lcom/facebook/share/b/l$a;)V

    sput-object v0, Lcom/facebook/share/b/l;->b:Lcom/facebook/share/b/l$c;

    :cond_0
    sget-object v0, Lcom/facebook/share/b/l;->b:Lcom/facebook/share/b/l$c;

    return-object v0
.end method

.method private static r()Lcom/facebook/share/b/l$c;
    .locals 2

    sget-object v0, Lcom/facebook/share/b/l;->c:Lcom/facebook/share/b/l$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/share/b/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/share/b/l$b;-><init>(Lcom/facebook/share/b/l$a;)V

    sput-object v0, Lcom/facebook/share/b/l;->c:Lcom/facebook/share/b/l$c;

    :cond_0
    sget-object v0, Lcom/facebook/share/b/l;->c:Lcom/facebook/share/b/l$c;

    return-object v0
.end method

.method private static s()Lcom/facebook/share/b/l$c;
    .locals 2

    sget-object v0, Lcom/facebook/share/b/l;->a:Lcom/facebook/share/b/l$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/share/b/l$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/share/b/l$d;-><init>(Lcom/facebook/share/b/l$a;)V

    sput-object v0, Lcom/facebook/share/b/l;->a:Lcom/facebook/share/b/l$c;

    :cond_0
    sget-object v0, Lcom/facebook/share/b/l;->a:Lcom/facebook/share/b/l$c;

    return-object v0
.end method

.method private static t(Lcom/facebook/share/c/e;Lcom/facebook/share/b/l$c;)V
    .locals 1

    if-eqz p0, :cond_a

    instance-of v0, p0, Lcom/facebook/share/c/g;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/facebook/share/c/g;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->c(Lcom/facebook/share/c/g;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/facebook/share/c/u;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/share/c/u;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->n(Lcom/facebook/share/c/u;)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/facebook/share/c/x;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/facebook/share/c/x;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->q(Lcom/facebook/share/c/x;)V

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lcom/facebook/share/c/q;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/facebook/share/c/q;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->j(Lcom/facebook/share/c/q;)V

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lcom/facebook/share/c/i;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/facebook/share/c/i;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->e(Lcom/facebook/share/c/i;)V

    goto :goto_0

    :cond_4
    instance-of v0, p0, Lcom/facebook/share/c/d;

    if-eqz v0, :cond_5

    check-cast p0, Lcom/facebook/share/c/d;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->b(Lcom/facebook/share/c/d;)V

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lcom/facebook/share/c/n;

    if-eqz v0, :cond_6

    check-cast p0, Lcom/facebook/share/c/n;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->h(Lcom/facebook/share/c/n;)V

    goto :goto_0

    :cond_6
    instance-of v0, p0, Lcom/facebook/share/c/m;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/facebook/share/c/m;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->g(Lcom/facebook/share/c/m;)V

    goto :goto_0

    :cond_7
    instance-of v0, p0, Lcom/facebook/share/c/k;

    if-eqz v0, :cond_8

    check-cast p0, Lcom/facebook/share/c/k;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->f(Lcom/facebook/share/c/k;)V

    goto :goto_0

    :cond_8
    instance-of v0, p0, Lcom/facebook/share/c/v;

    if-eqz v0, :cond_9

    check-cast p0, Lcom/facebook/share/c/v;

    invoke-virtual {p1, p0}, Lcom/facebook/share/b/l$c;->o(Lcom/facebook/share/c/v;)V

    :cond_9
    :goto_0
    return-void

    :cond_a
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must provide non-null content to share"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static u(Lcom/facebook/share/c/d;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/c/d;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Must specify a non-empty effectId"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v(Lcom/facebook/share/c/e;)V
    .locals 1

    invoke-static {}, Lcom/facebook/share/b/l;->q()Lcom/facebook/share/b/l$c;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/share/b/l;->t(Lcom/facebook/share/c/e;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method public static w(Lcom/facebook/share/c/e;)V
    .locals 1

    invoke-static {}, Lcom/facebook/share/b/l;->q()Lcom/facebook/share/b/l$c;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/share/b/l;->t(Lcom/facebook/share/c/e;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method public static x(Lcom/facebook/share/c/e;)V
    .locals 1

    invoke-static {}, Lcom/facebook/share/b/l;->r()Lcom/facebook/share/b/l$c;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/share/b/l;->t(Lcom/facebook/share/c/e;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method public static y(Lcom/facebook/share/c/e;)V
    .locals 1

    invoke-static {}, Lcom/facebook/share/b/l;->s()Lcom/facebook/share/b/l$c;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/share/b/l;->t(Lcom/facebook/share/c/e;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method private static z(Lcom/facebook/share/c/g;Lcom/facebook/share/b/l$c;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/c/g;->j()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/facebook/internal/h0;->a0(Landroid/net/Uri;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/facebook/n;

    const-string p1, "Image Url must be an http:// or https:// url"

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method
