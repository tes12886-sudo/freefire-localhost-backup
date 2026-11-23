.class final Lcom/linecorp/linesdk/auth/internal/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linecorp/linesdk/auth/internal/c$a;,
        Lcom/linecorp/linesdk/auth/internal/c$b;,
        Lcom/linecorp/linesdk/auth/internal/c$c;
    }
.end annotation


# instance fields
.field final a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

.field final b:Lj/e/b/i/a;

.field final c:Lj/e/b/h/a/c;

.field final d:Lj/e/b/h/a/e;

.field final e:Lcom/linecorp/linesdk/auth/internal/a;

.field final f:Lj/e/b/h/b;

.field final g:[Ljava/lang/String;

.field final h:Lcom/linecorp/linesdk/auth/internal/d;


# direct methods
.method constructor <init>(Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;Lj/e/b/i/a;Lcom/linecorp/linesdk/auth/internal/d;[Ljava/lang/String;)V
    .locals 9

    new-instance v3, Lj/e/b/h/a/c;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lj/e/b/i/a;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lj/e/b/h/a/c;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    new-instance v4, Lj/e/b/h/a/e;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lj/e/b/i/a;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lj/e/b/h/a/e;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    new-instance v5, Lcom/linecorp/linesdk/auth/internal/a;

    invoke-direct {v5, p3}, Lcom/linecorp/linesdk/auth/internal/a;-><init>(Lcom/linecorp/linesdk/auth/internal/d;)V

    new-instance v6, Lj/e/b/h/b;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lj/e/b/i/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lj/e/b/h/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v0 .. v8}, Lcom/linecorp/linesdk/auth/internal/c;-><init>(Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;Lj/e/b/i/a;Lj/e/b/h/a/c;Lj/e/b/h/a/e;Lcom/linecorp/linesdk/auth/internal/a;Lj/e/b/h/b;Lcom/linecorp/linesdk/auth/internal/d;[Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;Lj/e/b/i/a;Lj/e/b/h/a/c;Lj/e/b/h/a/e;Lcom/linecorp/linesdk/auth/internal/a;Lj/e/b/h/b;Lcom/linecorp/linesdk/auth/internal/d;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iput-object p2, p0, Lcom/linecorp/linesdk/auth/internal/c;->b:Lj/e/b/i/a;

    iput-object p3, p0, Lcom/linecorp/linesdk/auth/internal/c;->c:Lj/e/b/h/a/c;

    iput-object p4, p0, Lcom/linecorp/linesdk/auth/internal/c;->d:Lj/e/b/h/a/e;

    iput-object p5, p0, Lcom/linecorp/linesdk/auth/internal/c;->e:Lcom/linecorp/linesdk/auth/internal/a;

    iput-object p6, p0, Lcom/linecorp/linesdk/auth/internal/c;->f:Lj/e/b/h/b;

    iput-object p7, p0, Lcom/linecorp/linesdk/auth/internal/c;->h:Lcom/linecorp/linesdk/auth/internal/d;

    iput-object p8, p0, Lcom/linecorp/linesdk/auth/internal/c;->g:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lj/e/b/c;)Lj/e/b/i/c;
    .locals 2

    new-instance v0, Lj/e/b/i/c;

    invoke-virtual {p0}, Lj/e/b/c;->d()Lj/e/b/d;

    move-result-object v1

    invoke-virtual {p0}, Lj/e/b/c;->c()Lj/e/b/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/b;)V

    return-object v0
.end method
