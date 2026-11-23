.class public Lj/e/b/i/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/e/b/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Landroid/net/Uri;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lj/e/b/i/a$b;->a:Ljava/lang/String;

    const-string p1, "https://access.line.me/v2"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lj/e/b/i/a$b;->b:Landroid/net/Uri;

    const-string p1, "https://access.line.me/dialog/oauth/weblogin"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lj/e/b/i/a$b;->c:Landroid/net/Uri;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "channelId is empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic a(Lj/e/b/i/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lj/e/b/i/a$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lj/e/b/i/a$b;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lj/e/b/i/a$b;->b:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic c(Lj/e/b/i/a$b;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lj/e/b/i/a$b;->c:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic d(Lj/e/b/i/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lj/e/b/i/a$b;->d:Z

    return p0
.end method

.method static synthetic e(Lj/e/b/i/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lj/e/b/i/a$b;->e:Z

    return p0
.end method


# virtual methods
.method public f()Lj/e/b/i/a;
    .locals 2

    new-instance v0, Lj/e/b/i/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lj/e/b/i/a;-><init>(Lj/e/b/i/a$b;Lj/e/b/i/a$a;)V

    return-object v0
.end method
