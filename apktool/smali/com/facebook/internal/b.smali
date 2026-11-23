.class public final Lcom/facebook/internal/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/b$c;,
        Lcom/facebook/internal/b$b;,
        Lcom/facebook/internal/b$a;
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String; = "com.facebook.internal.b"

.field public static g:Lcom/facebook/internal/b;

.field public static final h:Lcom/facebook/internal/b$a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/b$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/internal/b;->h:Lcom/facebook/internal/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/internal/b;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/internal/b;->b:J

    return-wide v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/internal/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic c(Lcom/facebook/internal/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic d(Lcom/facebook/internal/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/b;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic e(Lcom/facebook/internal/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/b;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic f(Lcom/facebook/internal/b;J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/internal/b;->b:J

    return-void
.end method

.method public static final synthetic g(Lcom/facebook/internal/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/internal/b;->e:Z

    return-void
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/r;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/r;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/b;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/internal/b;->e:Z

    return v0
.end method
