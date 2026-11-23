.class Lj/g/a/a/a/y/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g/a/a/a/y/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/app/Application$ActivityLifecycleCallbacks;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/app/Application;


# direct methods
.method constructor <init>(Landroid/app/Application;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lj/g/a/a/a/y/a$a;->a:Ljava/util/Set;

    iput-object p1, p0, Lj/g/a/a/a/y/a$a;->b:Landroid/app/Application;

    return-void
.end method

.method static synthetic a(Lj/g/a/a/a/y/a$a;Lj/g/a/a/a/y/a$b;)Z
    .locals 0

    invoke-direct {p0, p1}, Lj/g/a/a/a/y/a$a;->b(Lj/g/a/a/a/y/a$b;)Z

    move-result p0

    return p0
.end method

.method private b(Lj/g/a/a/a/y/a$b;)Z
    .locals 2

    iget-object v0, p0, Lj/g/a/a/a/y/a$a;->b:Landroid/app/Application;

    if-eqz v0, :cond_0

    new-instance v1, Lj/g/a/a/a/y/a$a$a;

    invoke-direct {v1, p0, p1}, Lj/g/a/a/a/y/a$a$a;-><init>(Lj/g/a/a/a/y/a$a;Lj/g/a/a/a/y/a$b;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lj/g/a/a/a/y/a$a;->a:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
