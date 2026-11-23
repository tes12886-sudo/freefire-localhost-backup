.class final Lcom/google/firebase/crashlytics/internal/e/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/i/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/crashlytics/internal/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/i/d<",
        "Lcom/google/firebase/crashlytics/internal/e/v$d$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/firebase/crashlytics/internal/e/a$g;

.field private static final b:Lcom/google/firebase/i/c;

.field private static final c:Lcom/google/firebase/i/c;

.field private static final d:Lcom/google/firebase/i/c;

.field private static final e:Lcom/google/firebase/i/c;

.field private static final f:Lcom/google/firebase/i/c;

.field private static final g:Lcom/google/firebase/i/c;

.field private static final h:Lcom/google/firebase/i/c;

.field private static final i:Lcom/google/firebase/i/c;

.field private static final j:Lcom/google/firebase/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/crashlytics/internal/e/a$g;

    invoke-direct {v0}, Lcom/google/firebase/crashlytics/internal/e/a$g;-><init>()V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->a:Lcom/google/firebase/crashlytics/internal/e/a$g;

    const-string v0, "arch"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->b:Lcom/google/firebase/i/c;

    const-string v0, "model"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->c:Lcom/google/firebase/i/c;

    const-string v0, "cores"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->d:Lcom/google/firebase/i/c;

    const-string v0, "ram"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->e:Lcom/google/firebase/i/c;

    const-string v0, "diskSpace"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->f:Lcom/google/firebase/i/c;

    const-string v0, "simulator"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->g:Lcom/google/firebase/i/c;

    const-string v0, "state"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->h:Lcom/google/firebase/i/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->i:Lcom/google/firebase/i/c;

    const-string v0, "modelClass"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->j:Lcom/google/firebase/i/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/crashlytics/internal/e/v$d$c;

    check-cast p2, Lcom/google/firebase/i/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/e/a$g;->b(Lcom/google/firebase/crashlytics/internal/e/v$d$c;Lcom/google/firebase/i/e;)V

    return-void
.end method

.method public b(Lcom/google/firebase/crashlytics/internal/e/v$d$c;Lcom/google/firebase/i/e;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->b:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->c:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->d:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->e:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->f:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->g:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->j()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->a(Lcom/google/firebase/i/c;Z)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->h:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->i()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->i:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$g;->j:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    return-void
.end method
