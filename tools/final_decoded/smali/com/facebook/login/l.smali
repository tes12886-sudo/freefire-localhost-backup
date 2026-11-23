.class public Lcom/facebook/login/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/l$e;,
        Lcom/facebook/login/l$d;,
        Lcom/facebook/login/l$b;,
        Lcom/facebook/login/l$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:[Lcom/facebook/login/q;

.field b:I

.field c:Landroidx/fragment/app/Fragment;

.field d:Lcom/facebook/login/l$c;

.field e:Lcom/facebook/login/l$b;

.field f:Z

.field g:Lcom/facebook/login/l$d;

.field h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/facebook/login/o;

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/login/l$a;

    invoke-direct {v0}, Lcom/facebook/login/l$a;-><init>()V

    sput-object v0, Lcom/facebook/login/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/login/l;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/login/l;->k:I

    iput v0, p0, Lcom/facebook/login/l;->l:I

    const-class v1, Lcom/facebook/login/q;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v1

    array-length v2, v1

    new-array v2, v2, [Lcom/facebook/login/q;

    iput-object v2, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    aget-object v3, v1, v0

    check-cast v3, Lcom/facebook/login/q;

    aput-object v3, v2, v0

    aget-object v2, v2, v0

    invoke-virtual {v2, p0}, Lcom/facebook/login/q;->o(Lcom/facebook/login/l;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/login/l;->b:I

    const-class v0, Lcom/facebook/login/l$d;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/login/l$d;

    iput-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-static {p1}, Lcom/facebook/internal/h0;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    invoke-static {p1}, Lcom/facebook/internal/h0;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/l;->i:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/login/l;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/login/l;->k:I

    iput v0, p0, Lcom/facebook/login/l;->l:I

    iput-object p1, p0, Lcom/facebook/login/l;->c:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    iget-object p3, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    const-string v1, "Login attempt failed."

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/login/l;->f(Lcom/facebook/login/l$e;)V

    return-void
.end method

.method static k()Ljava/lang/String;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "init"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private o()Lcom/facebook/login/o;
    .locals 3

    iget-object v0, p0, Lcom/facebook/login/l;->j:Lcom/facebook/login/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/login/o;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v1}, Lcom/facebook/login/l$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/facebook/login/o;

    invoke-virtual {p0}, Lcom/facebook/login/l;->i()Landroidx/fragment/app/e;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v2}, Lcom/facebook/login/l$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/login/o;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/login/l;->j:Lcom/facebook/login/o;

    :cond_1
    iget-object v0, p0, Lcom/facebook/login/l;->j:Lcom/facebook/login/o;

    return-object v0
.end method

.method public static p()I
    .locals 1

    sget-object v0, Lcom/facebook/internal/e$c;->b:Lcom/facebook/internal/e$c;

    invoke-virtual {v0}, Lcom/facebook/internal/e$c;->a()I

    move-result v0

    return v0
.end method

.method private r(Ljava/lang/String;Lcom/facebook/login/l$e;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/login/l$e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p2, Lcom/facebook/login/l$e;->a:Lcom/facebook/login/l$e$b;

    invoke-virtual {v0}, Lcom/facebook/login/l$e$b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p2, Lcom/facebook/login/l$e;->d:Ljava/lang/String;

    iget-object v5, p2, Lcom/facebook/login/l$e;->e:Ljava/lang/String;

    move-object v1, p0

    move-object v2, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/facebook/login/l;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    const-string v1, "fb_mobile_login_method_complete"

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/login/l;->o()Lcom/facebook/login/o;

    move-result-object p2

    const-string p3, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    invoke-virtual {p2, v1, p3, p1}, Lcom/facebook/login/o;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/login/l;->o()Lcom/facebook/login/o;

    move-result-object v2

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v0}, Lcom/facebook/login/l$d;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v0}, Lcom/facebook/login/l$d;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v1, "foa_mobile_login_method_complete"

    :cond_1
    move-object v9, v1

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v2 .. v9}, Lcom/facebook/login/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private v(Lcom/facebook/login/l$e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->d:Lcom/facebook/login/l$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/facebook/login/l$c;->a(Lcom/facebook/login/l$e;)V

    :cond_0
    return-void
.end method


# virtual methods
.method A(Lcom/facebook/login/l$d;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/login/l;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->b(Lcom/facebook/login/l$d;)V

    :cond_0
    return-void
.end method

.method B()Z
    .locals 8

    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/q;->l()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/login/l;->d()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "no_internet_permission"

    const-string v1, "1"

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/login/l;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    return v2

    :cond_0
    iget-object v1, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v0, v1}, Lcom/facebook/login/q;->q(Lcom/facebook/login/l$d;)I

    move-result v1

    iput v2, p0, Lcom/facebook/login/l;->k:I

    const/4 v3, 0x1

    invoke-direct {p0}, Lcom/facebook/login/l;->o()Lcom/facebook/login/o;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v5}, Lcom/facebook/login/l$d;->b()Ljava/lang/String;

    move-result-object v5

    if-lez v1, :cond_2

    invoke-virtual {v0}, Lcom/facebook/login/q;->j()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v6}, Lcom/facebook/login/l$d;->n()Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "foa_mobile_login_method_start"

    goto :goto_0

    :cond_1
    const-string v6, "fb_mobile_login_method_start"

    :goto_0
    invoke-virtual {v4, v5, v0, v6}, Lcom/facebook/login/o;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v1, p0, Lcom/facebook/login/l;->l:I

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/facebook/login/q;->j()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {v7}, Lcom/facebook/login/l$d;->n()Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "foa_mobile_login_method_not_tried"

    goto :goto_1

    :cond_3
    const-string v7, "fb_mobile_login_method_not_tried"

    :goto_1
    invoke-virtual {v4, v5, v6, v7}, Lcom/facebook/login/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/login/q;->j()Ljava/lang/String;

    move-result-object v0

    const-string v4, "not_tried"

    invoke-direct {p0, v4, v0, v3}, Lcom/facebook/login/l;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_2
    if-lez v1, :cond_4

    const/4 v2, 0x1

    :cond_4
    return v2
.end method

.method C()V
    .locals 7

    iget v0, p0, Lcom/facebook/login/l;->b:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/q;->j()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/q;->i()Ljava/util/Map;

    move-result-object v6

    const-string v3, "skipped"

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/facebook/login/l;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/facebook/login/l;->b:I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v1, v0, :cond_1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/login/l;->b:I

    invoke-virtual {p0}, Lcom/facebook/login/l;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/facebook/login/l;->h()V

    :cond_2
    return-void
.end method

.method D(Lcom/facebook/login/l$e;)V
    .locals 2

    iget-object v0, p1, Lcom/facebook/login/l$e;->b:Lcom/facebook/a;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v0

    iget-object v1, p1, Lcom/facebook/login/l$e;->b:Lcom/facebook/a;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/a;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    iget-object v1, p1, Lcom/facebook/login/l$e;->b:Lcom/facebook/a;

    iget-object p1, p1, Lcom/facebook/login/l$e;->c:Lcom/facebook/f;

    invoke-static {v0, v1, p1}, Lcom/facebook/login/l$e;->b(Lcom/facebook/login/l$d;Lcom/facebook/a;Lcom/facebook/f;)Lcom/facebook/login/l$e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    const-string v0, "User logged in as different Facebook user."

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->f(Lcom/facebook/login/l$e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Caught exception"

    invoke-static {v0, v1, p1}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->f(Lcom/facebook/login/l$e;)V

    :goto_1
    return-void

    :cond_1
    new-instance p1, Lcom/facebook/n;

    const-string v0, "Can\'t validate without a token"

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method b(Lcom/facebook/login/l$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/facebook/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/login/l;->d()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iput-object p1, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->m(Lcom/facebook/login/l$d;)[Lcom/facebook/login/q;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    invoke-virtual {p0}, Lcom/facebook/login/l;->C()V

    return-void

    :cond_2
    new-instance p1, Lcom/facebook/n;

    const-string v0, "Attempted to authorize while a request is pending."

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method c()V
    .locals 1

    iget v0, p0, Lcom/facebook/login/l;->b:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/q;->b()V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 3

    iget-boolean v0, p0, Lcom/facebook/login/l;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p0, v0}, Lcom/facebook/login/l;->e(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/login/l;->i()Landroidx/fragment/app/e;

    move-result-object v0

    sget v1, Lcom/facebook/common/d;->c:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/facebook/common/d;->b:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-static {v2, v1, v0}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/login/l;->f(Lcom/facebook/login/l$e;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-boolean v1, p0, Lcom/facebook/login/l;->f:Z

    return v1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method e(Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/login/l;->i()Landroidx/fragment/app/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method f(Lcom/facebook/login/l$e;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/login/q;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/login/q;->i()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v1, p1, v0}, Lcom/facebook/login/l;->r(Ljava/lang/String;Lcom/facebook/login/l$e;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    if-eqz v0, :cond_1

    iput-object v0, p1, Lcom/facebook/login/l$e;->g:Ljava/util/Map;

    :cond_1
    iget-object v0, p0, Lcom/facebook/login/l;->i:Ljava/util/Map;

    if-eqz v0, :cond_2

    iput-object v0, p1, Lcom/facebook/login/l$e;->h:Ljava/util/Map;

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    const/4 v1, -0x1

    iput v1, p0, Lcom/facebook/login/l;->b:I

    iput-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    iput-object v0, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/login/l;->k:I

    iput v0, p0, Lcom/facebook/login/l;->l:I

    invoke-direct {p0, p1}, Lcom/facebook/login/l;->v(Lcom/facebook/login/l$e;)V

    return-void
.end method

.method g(Lcom/facebook/login/l$e;)V
    .locals 1

    iget-object v0, p1, Lcom/facebook/login/l$e;->b:Lcom/facebook/a;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->D(Lcom/facebook/login/l$e;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/login/l;->f(Lcom/facebook/login/l$e;)V

    :goto_0
    return-void
.end method

.method i()Landroidx/fragment/app/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->m()Landroidx/fragment/app/e;

    move-result-object v0

    return-object v0
.end method

.method j()Lcom/facebook/login/q;
    .locals 2

    iget v0, p0, Lcom/facebook/login/l;->b:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->c:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method protected m(Lcom/facebook/login/l$d;)[Lcom/facebook/login/q;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->g()Lcom/facebook/login/k;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-boolean v2, Lcom/facebook/r;->q:Z

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lcom/facebook/login/k;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/facebook/login/i;

    invoke-direct {v2, p0}, Lcom/facebook/login/i;-><init>(Lcom/facebook/login/l;)V

    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/facebook/login/k;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/facebook/login/h;

    invoke-direct {v2, p0}, Lcom/facebook/login/h;-><init>(Lcom/facebook/login/l;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-boolean v2, Lcom/facebook/r;->q:Z

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/facebook/login/k;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/facebook/login/j;

    invoke-direct {v2, p0}, Lcom/facebook/login/j;-><init>(Lcom/facebook/login/l;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-boolean v2, Lcom/facebook/r;->q:Z

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lcom/facebook/login/k;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/facebook/login/f;

    invoke-direct {v2, p0}, Lcom/facebook/login/f;-><init>(Lcom/facebook/login/l;)V

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/facebook/login/k;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Lcom/facebook/login/a;

    invoke-direct {v2, p0}, Lcom/facebook/login/a;-><init>(Lcom/facebook/login/l;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v1}, Lcom/facebook/login/k;->h()Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lcom/facebook/login/y;

    invoke-direct {v2, p0}, Lcom/facebook/login/y;-><init>(Lcom/facebook/login/l;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p1}, Lcom/facebook/login/l$d;->o()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v1}, Lcom/facebook/login/k;->c()Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lcom/facebook/login/e;

    invoke-direct {p1, p0}, Lcom/facebook/login/e;-><init>(Lcom/facebook/login/l;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lcom/facebook/login/q;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p1
.end method

.method n()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/login/l;->b:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Lcom/facebook/login/l$d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    return-object v0
.end method

.method t()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->e:Lcom/facebook/login/l$b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/login/l$b;->a()V

    :cond_0
    return-void
.end method

.method u()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->e:Lcom/facebook/login/l$b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/login/l$b;->b()V

    :cond_0
    return-void
.end method

.method public w(IILandroid/content/Intent;)Z
    .locals 3

    iget v0, p0, Lcom/facebook/login/l;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/login/l;->k:I

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p3, :cond_0

    sget-object v0, Lcom/facebook/CustomTabMainActivity;->i:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/login/l;->C()V

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/q;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    iget v0, p0, Lcom/facebook/login/l;->k:I

    iget v2, p0, Lcom/facebook/login/l;->l:I

    if-lt v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/login/l;->j()Lcom/facebook/login/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/login/q;->m(IILandroid/content/Intent;)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->a:[Lcom/facebook/login/q;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    iget v0, p0, Lcom/facebook/login/l;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/facebook/login/l;->g:Lcom/facebook/login/l$d;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/facebook/login/l;->h:Ljava/util/Map;

    invoke-static {p1, p2}, Lcom/facebook/internal/h0;->E0(Landroid/os/Parcel;Ljava/util/Map;)V

    iget-object p2, p0, Lcom/facebook/login/l;->i:Ljava/util/Map;

    invoke-static {p1, p2}, Lcom/facebook/internal/h0;->E0(Landroid/os/Parcel;Ljava/util/Map;)V

    return-void
.end method

.method x(Lcom/facebook/login/l$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/l;->e:Lcom/facebook/login/l$b;

    return-void
.end method

.method y(Landroidx/fragment/app/Fragment;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/l;->c:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/facebook/login/l;->c:Landroidx/fragment/app/Fragment;

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/n;

    const-string v0, "Can\'t set fragment once it is already set."

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method z(Lcom/facebook/login/l$c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/l;->d:Lcom/facebook/login/l$c;

    return-void
.end method
