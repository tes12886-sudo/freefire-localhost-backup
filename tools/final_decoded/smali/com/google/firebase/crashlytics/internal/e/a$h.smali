.class final Lcom/google/firebase/crashlytics/internal/e/a$h;
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
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/i/d<",
        "Lcom/google/firebase/crashlytics/internal/e/v$d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/firebase/crashlytics/internal/e/a$h;

.field private static final b:Lcom/google/firebase/i/c;

.field private static final c:Lcom/google/firebase/i/c;

.field private static final d:Lcom/google/firebase/i/c;

.field private static final e:Lcom/google/firebase/i/c;

.field private static final f:Lcom/google/firebase/i/c;

.field private static final g:Lcom/google/firebase/i/c;

.field private static final h:Lcom/google/firebase/i/c;

.field private static final i:Lcom/google/firebase/i/c;

.field private static final j:Lcom/google/firebase/i/c;

.field private static final k:Lcom/google/firebase/i/c;

.field private static final l:Lcom/google/firebase/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/crashlytics/internal/e/a$h;

    invoke-direct {v0}, Lcom/google/firebase/crashlytics/internal/e/a$h;-><init>()V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->a:Lcom/google/firebase/crashlytics/internal/e/a$h;

    const-string v0, "generator"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->b:Lcom/google/firebase/i/c;

    const-string v0, "identifier"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->c:Lcom/google/firebase/i/c;

    const-string v0, "startedAt"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->d:Lcom/google/firebase/i/c;

    const-string v0, "endedAt"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->e:Lcom/google/firebase/i/c;

    const-string v0, "crashed"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->f:Lcom/google/firebase/i/c;

    const-string v0, "app"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->g:Lcom/google/firebase/i/c;

    const-string v0, "user"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->h:Lcom/google/firebase/i/c;

    const-string v0, "os"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->i:Lcom/google/firebase/i/c;

    const-string v0, "device"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->j:Lcom/google/firebase/i/c;

    const-string v0, "events"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->k:Lcom/google/firebase/i/c;

    const-string v0, "generatorType"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->l:Lcom/google/firebase/i/c;

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

    check-cast p1, Lcom/google/firebase/crashlytics/internal/e/v$d;

    check-cast p2, Lcom/google/firebase/i/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/e/a$h;->b(Lcom/google/firebase/crashlytics/internal/e/v$d;Lcom/google/firebase/i/e;)V

    return-void
.end method

.method public b(Lcom/google/firebase/crashlytics/internal/e/v$d;Lcom/google/firebase/i/e;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->b:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->c:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->i()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->d:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->k()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->e:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->f:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->m()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->a(Lcom/google/firebase/i/c;Z)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->g:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->b()Lcom/google/firebase/crashlytics/internal/e/v$d$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->h:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->l()Lcom/google/firebase/crashlytics/internal/e/v$d$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->i:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->j()Lcom/google/firebase/crashlytics/internal/e/v$d$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->j:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->c()Lcom/google/firebase/crashlytics/internal/e/v$d$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->k:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->e()Lcom/google/firebase/crashlytics/internal/e/w;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$h;->l:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d;->g()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    return-void
.end method
