.class public Lcom/vk/sdk/k/f;
.super Lcom/vk/sdk/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/f$d;
    }
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Ljava/lang/String;

.field private final e:Lcom/vk/sdk/k/d;

.field private f:Lcom/vk/sdk/k/d;

.field private g:Lcom/vk/sdk/k/i/a;

.field private h:I

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/vk/sdk/k/f;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/vk/sdk/k/k/g;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/vk/sdk/k/e;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Landroid/os/Looper;

.field public o:Lcom/vk/sdk/k/f$d;

.field public p:Z

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/vk/sdk/k/f;-><init>(Ljava/lang/String;Lcom/vk/sdk/k/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/vk/sdk/k/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/vk/sdk/k/f;-><init>(Ljava/lang/String;Lcom/vk/sdk/k/d;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/vk/sdk/k/d;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/vk/sdk/k/d;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/vk/sdk/k/k/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/vk/sdk/h;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/vk/sdk/k/f;->m:Z

    invoke-static {}, Lcom/vk/sdk/j;->a()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/vk/sdk/k/f;->c:Landroid/content/Context;

    iput-object p1, p0, Lcom/vk/sdk/k/f;->d:Ljava/lang/String;

    if-nez p2, :cond_0

    new-instance p2, Lcom/vk/sdk/k/d;

    invoke-direct {p2}, Lcom/vk/sdk/k/d;-><init>()V

    :cond_0
    new-instance p1, Lcom/vk/sdk/k/d;

    invoke-direct {p1, p2}, Lcom/vk/sdk/k/d;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/vk/sdk/k/f;->e:Lcom/vk/sdk/k/d;

    const/4 p1, 0x0

    iput p1, p0, Lcom/vk/sdk/k/f;->h:I

    iput-boolean v0, p0, Lcom/vk/sdk/k/f;->r:Z

    iput v0, p0, Lcom/vk/sdk/k/f;->q:I

    const-string p1, "en"

    iput-object p1, p0, Lcom/vk/sdk/k/f;->l:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/vk/sdk/k/f;->s:Z

    iput-boolean v0, p0, Lcom/vk/sdk/k/f;->p:Z

    invoke-virtual {p0, p3}, Lcom/vk/sdk/k/f;->C(Ljava/lang/Class;)V

    return-void
.end method

.method private A(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/vk/sdk/k/f;->B(Ljava/lang/Runnable;I)V

    return-void
.end method

.method private B(Ljava/lang/Runnable;I)V
    .locals 3

    iget-object v0, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    :cond_0
    if-lez p2, :cond_1

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/os/Handler;

    iget-object v0, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/vk/sdk/k/f;Lcom/vk/sdk/k/c;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/f;->w(Lcom/vk/sdk/k/c;)Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lcom/vk/sdk/k/f;Lcom/vk/sdk/k/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/f;->x(Lcom/vk/sdk/k/c;)V

    return-void
.end method

.method static synthetic f(Lcom/vk/sdk/k/f;)Lcom/vk/sdk/k/i/a;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    return-object p0
.end method

.method static synthetic g(Lcom/vk/sdk/k/f;Lorg/json/JSONObject;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/vk/sdk/k/f;->y(Lorg/json/JSONObject;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic h(Lcom/vk/sdk/k/f;)I
    .locals 0

    iget p0, p0, Lcom/vk/sdk/k/f;->h:I

    return p0
.end method

.method static synthetic i(Lcom/vk/sdk/k/f;)I
    .locals 1

    iget v0, p0, Lcom/vk/sdk/k/f;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/vk/sdk/k/f;->h:I

    return v0
.end method

.method static synthetic j(Lcom/vk/sdk/k/f;Ljava/lang/Runnable;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/vk/sdk/k/f;->B(Ljava/lang/Runnable;I)V

    return-void
.end method

.method static synthetic k(Lcom/vk/sdk/k/f;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/k/f;->i:Ljava/util/ArrayList;

    return-object p0
.end method

.method private o(Lcom/vk/sdk/e;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    invoke-static {v0}, Lcom/vk/sdk/m/b;->b(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/vk/sdk/k/f;->d:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v0, "/method/%s?%s"

    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/vk/sdk/e;->d:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/vk/sdk/m/c;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private p()Lcom/vk/sdk/k/i/e$a;
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/f$a;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/f$a;-><init>(Lcom/vk/sdk/k/f;)V

    return-object v0
.end method

.method private q()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/vk/sdk/k/f;->l:Ljava/lang/String;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    iget-boolean v2, p0, Lcom/vk/sdk/k/f;->s:Z

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "uk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "ua"

    if-eqz v1, :cond_0

    move-object v0, v2

    :cond_0
    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "ru"

    aput-object v4, v1, v3

    const/4 v3, 0x1

    const-string v4, "en"

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    const-string v3, "es"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "fi"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "de"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "it"

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/vk/sdk/k/f;->l:Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public static v(J)Lcom/vk/sdk/k/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/vk/sdk/h;->a(J)Lcom/vk/sdk/h;

    move-result-object p0

    check-cast p0, Lcom/vk/sdk/k/f;

    return-object p0
.end method

.method private w(Lcom/vk/sdk/k/c;)Z
    .locals 4

    iget v0, p1, Lcom/vk/sdk/k/c;->e:I

    const/16 v1, -0x65

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lcom/vk/sdk/k/c;->c:Lcom/vk/sdk/k/c;

    invoke-static {v0}, Lcom/vk/sdk/i;->p(Lcom/vk/sdk/k/c;)V

    iget v1, v0, Lcom/vk/sdk/k/c;->e:I

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    invoke-static {}, Lcom/vk/sdk/e;->b()Lcom/vk/sdk/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-boolean v3, p1, Lcom/vk/sdk/e;->e:Z

    invoke-virtual {p1}, Lcom/vk/sdk/e;->g()V

    :cond_0
    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->z()V

    return v3

    :cond_1
    iget-boolean v2, p0, Lcom/vk/sdk/k/f;->p:Z

    if-eqz v2, :cond_3

    iput-object p0, v0, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    iget-object p1, p1, Lcom/vk/sdk/k/c;->c:Lcom/vk/sdk/k/c;

    iget p1, p1, Lcom/vk/sdk/k/c;->e:I

    const/16 v2, 0xe

    if-ne p1, v2, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    iget-object p1, p0, Lcom/vk/sdk/k/f;->c:Landroid/content/Context;

    sget-object v1, Lcom/vk/sdk/VKServiceActivity$c;->c:Lcom/vk/sdk/VKServiceActivity$c;

    :goto_0
    invoke-static {p1, v0, v1}, Lcom/vk/sdk/VKServiceActivity;->f(Landroid/content/Context;Lcom/vk/sdk/k/c;Lcom/vk/sdk/VKServiceActivity$c;)V

    return v3

    :cond_2
    const/16 p1, 0x11

    if-ne v1, p1, :cond_3

    iget-object p1, p0, Lcom/vk/sdk/k/f;->c:Landroid/content/Context;

    sget-object v1, Lcom/vk/sdk/VKServiceActivity$c;->d:Lcom/vk/sdk/VKServiceActivity$c;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private x(Lcom/vk/sdk/k/c;)V
    .locals 2

    iput-object p0, p1, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    iget-boolean v0, p0, Lcom/vk/sdk/k/f;->m:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    new-instance v1, Lcom/vk/sdk/k/f$b;

    invoke-direct {v1, p0, v0, p1}, Lcom/vk/sdk/k/f$b;-><init>(Lcom/vk/sdk/k/f;ZLcom/vk/sdk/k/c;)V

    invoke-direct {p0, v1}, Lcom/vk/sdk/k/f;->A(Ljava/lang/Runnable;)V

    return-void
.end method

.method private y(Lorg/json/JSONObject;Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/g;

    invoke-direct {v0}, Lcom/vk/sdk/k/g;-><init>()V

    iput-object p1, v0, Lcom/vk/sdk/k/g;->b:Lorg/json/JSONObject;

    iput-object p2, v0, Lcom/vk/sdk/k/g;->c:Ljava/lang/Object;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    instance-of p2, p1, Lcom/vk/sdk/k/i/c;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/vk/sdk/k/i/c;

    invoke-virtual {p1}, Lcom/vk/sdk/k/i/c;->k()Ljava/lang/String;

    :cond_0
    iget-boolean p1, p0, Lcom/vk/sdk/k/f;->m:Z

    new-instance p2, Lcom/vk/sdk/k/f$c;

    invoke-direct {p2, p0, p1, v0}, Lcom/vk/sdk/k/f$c;-><init>(Lcom/vk/sdk/k/f;ZLcom/vk/sdk/k/g;)V

    invoke-direct {p0, p2}, Lcom/vk/sdk/k/f;->A(Ljava/lang/Runnable;)V

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f$d;->b(Lcom/vk/sdk/k/g;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/vk/sdk/k/k/g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/vk/sdk/k/f;->j:Ljava/lang/Class;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/vk/sdk/k/f;->t:Z

    :cond_0
    return-void
.end method

.method public D(Lcom/vk/sdk/k/f$d;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    return-void
.end method

.method public E()V
    .locals 1

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->s()Lcom/vk/sdk/k/i/a;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/f;->n:Landroid/os/Looper;

    :cond_1
    iget-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    invoke-static {v0}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V

    return-void
.end method

.method public l(Lcom/vk/sdk/k/d;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/f;->e:Lcom/vk/sdk/k/d;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/a;->b()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/vk/sdk/k/c;

    const/16 v1, -0x66

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/c;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/vk/sdk/k/f;->x(Lcom/vk/sdk/k/c;)V

    :goto_0
    return-void
.end method

.method public n(Lcom/vk/sdk/k/f$d;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->E()V

    return-void
.end method

.method public r()Lcom/vk/sdk/k/d;
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/f;->e:Lcom/vk/sdk/k/d;

    return-object v0
.end method

.method s()Lcom/vk/sdk/k/i/a;
    .locals 3

    iget-boolean v0, p0, Lcom/vk/sdk/k/f;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/vk/sdk/k/f;->j:Ljava/lang/Class;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/vk/sdk/k/i/f;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->u()Lcom/vk/sdk/k/i/b$d;

    move-result-object v1

    iget-object v2, p0, Lcom/vk/sdk/k/f;->j:Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Lcom/vk/sdk/k/i/f;-><init>(Lcom/vk/sdk/k/i/b$d;Ljava/lang/Class;)V

    :goto_0
    iput-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/vk/sdk/k/f;->k:Lcom/vk/sdk/k/e;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/vk/sdk/k/i/f;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->u()Lcom/vk/sdk/k/i/b$d;

    move-result-object v1

    iget-object v2, p0, Lcom/vk/sdk/k/f;->k:Lcom/vk/sdk/k/e;

    invoke-direct {v0, v1, v2}, Lcom/vk/sdk/k/i/f;-><init>(Lcom/vk/sdk/k/i/b$d;Lcom/vk/sdk/k/e;)V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    if-nez v0, :cond_2

    new-instance v0, Lcom/vk/sdk/k/i/e;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->u()Lcom/vk/sdk/k/i/b$d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/i/e;-><init>(Lcom/vk/sdk/k/i/b$d;)V

    iput-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    :cond_2
    iget-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    instance-of v1, v0, Lcom/vk/sdk/k/i/c;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/vk/sdk/k/i/c;

    invoke-direct {p0}, Lcom/vk/sdk/k/f;->p()Lcom/vk/sdk/k/i/e$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/i/c;->o(Lcom/vk/sdk/k/i/a$c;)V

    :cond_3
    iget-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    return-object v0
.end method

.method public t()Lcom/vk/sdk/k/d;
    .locals 4

    iget-object v0, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    if-nez v0, :cond_2

    new-instance v0, Lcom/vk/sdk/k/d;

    iget-object v1, p0, Lcom/vk/sdk/k/f;->e:Lcom/vk/sdk/k/d;

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/d;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    invoke-static {}, Lcom/vk/sdk/e;->b()Lcom/vk/sdk/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    iget-object v2, v0, Lcom/vk/sdk/e;->a:Ljava/lang/String;

    const-string v3, "access_token"

    invoke-virtual {v1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, v0, Lcom/vk/sdk/e;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/vk/sdk/k/f;->r:Z

    :cond_0
    iget-object v1, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    invoke-static {}, Lcom/vk/sdk/i;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "v"

    invoke-virtual {v1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    invoke-direct {p0}, Lcom/vk/sdk/k/f;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "lang"

    invoke-virtual {v1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/vk/sdk/k/f;->r:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    const-string v2, "https"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/vk/sdk/e;->d:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lcom/vk/sdk/k/f;->o(Lcom/vk/sdk/e;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    const-string v2, "sig"

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/vk/sdk/k/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->r()Lcom/vk/sdk/k/d;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/vk/sdk/k/i/b$d;
    .locals 2

    invoke-static {p0}, Lcom/vk/sdk/k/i/b;->g(Lcom/vk/sdk/k/f;)Lcom/vk/sdk/k/i/b$d;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/vk/sdk/k/c;

    const/16 v1, -0x67

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/c;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/vk/sdk/k/f;->x(Lcom/vk/sdk/k/c;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public z()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/vk/sdk/k/f;->h:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/vk/sdk/k/f;->f:Lcom/vk/sdk/k/d;

    iput-object v0, p0, Lcom/vk/sdk/k/f;->g:Lcom/vk/sdk/k/i/a;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->E()V

    return-void
.end method
