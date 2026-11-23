.class final Lcom/google/firebase/crashlytics/internal/e/a$o;
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
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/i/d<",
        "Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/firebase/crashlytics/internal/e/a$o;

.field private static final b:Lcom/google/firebase/i/c;

.field private static final c:Lcom/google/firebase/i/c;

.field private static final d:Lcom/google/firebase/i/c;

.field private static final e:Lcom/google/firebase/i/c;

.field private static final f:Lcom/google/firebase/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/crashlytics/internal/e/a$o;

    invoke-direct {v0}, Lcom/google/firebase/crashlytics/internal/e/a$o;-><init>()V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->a:Lcom/google/firebase/crashlytics/internal/e/a$o;

    const-string v0, "pc"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->b:Lcom/google/firebase/i/c;

    const-string v0, "symbol"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->c:Lcom/google/firebase/i/c;

    const-string v0, "file"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->d:Lcom/google/firebase/i/c;

    const-string v0, "offset"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->e:Lcom/google/firebase/i/c;

    const-string v0, "importance"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->f:Lcom/google/firebase/i/c;

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

    check-cast p1, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;

    check-cast p2, Lcom/google/firebase/i/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/e/a$o;->b(Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;Lcom/google/firebase/i/e;)V

    return-void
.end method

.method public b(Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;Lcom/google/firebase/i/e;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->b:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->c:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->d:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->e:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lcom/google/firebase/crashlytics/internal/e/a$o;->f:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/e/v$d$d$a$b$e$b;->c()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    return-void
.end method
