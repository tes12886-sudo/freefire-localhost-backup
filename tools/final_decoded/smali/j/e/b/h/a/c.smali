.class public final Lj/e/b/h/a/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/e/b/h/a/c$c;,
        Lj/e/b/h/a/c$d;,
        Lj/e/b/h/a/c$a;,
        Lj/e/b/h/a/c$b;
    }
.end annotation


# static fields
.field public static final c:Lj/e/b/h/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/e/b/h/a/a/c<",
            "Lj/e/b/h/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lj/e/b/h/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/e/b/h/a/a/c<",
            "Lj/e/b/h/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lj/e/b/h/a/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/e/b/h/a/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/e/b/h/a/c$b;-><init>(B)V

    sput-object v0, Lj/e/b/h/a/c;->c:Lj/e/b/h/a/a/c;

    new-instance v0, Lj/e/b/h/a/c$a;

    invoke-direct {v0, v1}, Lj/e/b/h/a/c$a;-><init>(B)V

    sput-object v0, Lj/e/b/h/a/c;->d:Lj/e/b/h/a/a/c;

    new-instance v0, Lj/e/b/h/a/c$d;

    invoke-direct {v0, v1}, Lj/e/b/h/a/c$d;-><init>(B)V

    new-instance v0, Lj/e/b/h/a/c$c;

    invoke-direct {v0, v1}, Lj/e/b/h/a/c$c;-><init>(B)V

    new-instance v0, Lj/e/b/h/a/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    new-instance v0, Lj/e/b/h/a/a/a;

    const-string v1, "4.0.8"

    invoke-direct {v0, p1, v1}, Lj/e/b/h/a/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, Lj/e/b/h/a/c;-><init>(Landroid/net/Uri;Lj/e/b/h/a/a/a;)V

    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;Lj/e/b/h/a/a/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/h/a/c;->a:Landroid/net/Uri;

    iput-object p2, p0, Lj/e/b/h/a/c;->b:Lj/e/b/h/a/a/a;

    return-void
.end method
