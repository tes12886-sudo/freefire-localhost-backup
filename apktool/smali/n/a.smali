.class public Ln/a;
.super Ln/y;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/a$b;,
        Ln/a$a;
    }
.end annotation


# static fields
.field public static final h:Ln/a$a;

.field private static final i:J

.field private static final j:J

.field private static k:Ln/a;


# instance fields
.field private e:Z

.field private f:Ln/a;

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln/a$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Ln/a;->h:Ln/a$a;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ln/a;->i:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ln/a;->j:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ln/y;-><init>()V

    return-void
.end method

.method public static final synthetic i()Ln/a;
    .locals 1

    sget-object v0, Ln/a;->k:Ln/a;

    return-object v0
.end method

.method public static final synthetic j()J
    .locals 2

    sget-wide v0, Ln/a;->i:J

    return-wide v0
.end method

.method public static final synthetic k()J
    .locals 2

    sget-wide v0, Ln/a;->j:J

    return-wide v0
.end method

.method public static final synthetic l(Ln/a;)Z
    .locals 0

    iget-boolean p0, p0, Ln/a;->e:Z

    return p0
.end method

.method public static final synthetic m(Ln/a;)Ln/a;
    .locals 0

    iget-object p0, p0, Ln/a;->f:Ln/a;

    return-object p0
.end method

.method public static final synthetic o(Ln/a;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Ln/a;->w(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic p(Ln/a;)V
    .locals 0

    sput-object p0, Ln/a;->k:Ln/a;

    return-void
.end method

.method public static final synthetic q(Ln/a;Z)V
    .locals 0

    iput-boolean p1, p0, Ln/a;->e:Z

    return-void
.end method

.method public static final synthetic r(Ln/a;Ln/a;)V
    .locals 0

    iput-object p1, p0, Ln/a;->f:Ln/a;

    return-void
.end method

.method public static final synthetic s(Ln/a;J)V
    .locals 0

    iput-wide p1, p0, Ln/a;->g:J

    return-void
.end method

.method private final w(J)J
    .locals 2

    iget-wide v0, p0, Ln/a;->g:J

    sub-long/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method public final n(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    invoke-virtual {p0, p1}, Ln/a;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final t()V
    .locals 6

    invoke-virtual {p0}, Ln/y;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Ln/y;->e()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v3, Ln/a;->h:Ln/a$a;

    invoke-static {v3, p0, v0, v1, v2}, Ln/a$a;->b(Ln/a$a;Ln/a;JZ)V

    return-void
.end method

.method public final u()Z
    .locals 1

    sget-object v0, Ln/a;->h:Ln/a$a;

    invoke-static {v0, p0}, Ln/a$a;->a(Ln/a$a;Ln/a;)Z

    move-result v0

    return v0
.end method

.method protected v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final x(Ln/v;)Ln/v;
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln/a$c;

    invoke-direct {v0, p0, p1}, Ln/a$c;-><init>(Ln/a;Ln/v;)V

    return-object v0
.end method

.method public final y(Ln/x;)Ln/x;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln/a$d;

    invoke-direct {v0, p0, p1}, Ln/a$d;-><init>(Ln/a;Ln/x;)V

    return-object v0
.end method

.method protected z()V
    .locals 0

    return-void
.end method
