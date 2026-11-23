.class public final Lj/e/b/h/a/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/e/b/h/a/e$a;
    }
.end annotation


# static fields
.field private static final c:Lj/e/b/h/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/e/b/h/a/a/c<",
            "Lj/e/b/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Lj/e/b/h/a/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/e/b/h/a/e$a;

    invoke-direct {v0}, Lj/e/b/h/a/e$a;-><init>()V

    sput-object v0, Lj/e/b/h/a/e;->c:Lj/e/b/h/a/a/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    new-instance v0, Lj/e/b/h/a/a/a;

    const-string v1, "4.0.8"

    invoke-direct {v0, p1, v1}, Lj/e/b/h/a/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, Lj/e/b/h/a/e;-><init>(Landroid/net/Uri;Lj/e/b/h/a/a/a;)V

    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;Lj/e/b/h/a/a/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/h/a/e;->a:Landroid/net/Uri;

    iput-object p2, p0, Lj/e/b/h/a/e;->b:Lj/e/b/h/a/a/a;

    return-void
.end method


# virtual methods
.method public final a(Lj/e/b/h/e;)Lj/e/b/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/e/b/h/e;",
            ")",
            "Lj/e/b/c<",
            "Lj/e/b/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj/e/b/h/a/e;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "profile"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bearer "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lj/e/b/h/e;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Authorization"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lj/e/b/h/a/e;->b:Lj/e/b/h/a/a/a;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lj/e/b/h/a/e;->c:Lj/e/b/h/a/a/c;

    invoke-virtual {p1, v0, v1, v2, v3}, Lj/e/b/h/a/a/a;->f(Landroid/net/Uri;Ljava/util/Map;Ljava/util/Map;Lj/e/b/h/a/a/c;)Lj/e/b/c;

    move-result-object p1

    return-object p1
.end method
