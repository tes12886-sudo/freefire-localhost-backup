.class public final Lj/e/b/h/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lj/e/a/a/a$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Lj/e/b/h/d;->a()Lj/e/a/a/a$d;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lj/e/b/h/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lj/e/a/a/a$d;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lj/e/a/a/a$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/h/b;->a:Landroid/content/Context;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "com.linecorp.linesdk.accesstoken."

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj/e/b/h/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lj/e/b/h/b;->c:Lj/e/a/a/a$d;

    return-void
.end method

.method private a(J)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lj/e/b/h/b;->c:Lj/e/a/a/a$d;

    iget-object v1, p0, Lj/e/b/h/b;->a:Landroid/content/Context;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lj/e/a/a/a$d;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lj/e/b/h/b;->c:Lj/e/a/a/a$d;

    iget-object v1, p0, Lj/e/b/h/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lj/e/a/a/a$d;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Lj/e/b/h/e;)V
    .locals 3

    iget-object v0, p0, Lj/e/b/h/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lj/e/b/h/b;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p1, Lj/e/b/h/e;->a:Ljava/lang/String;

    invoke-direct {p0, v1}, Lj/e/b/h/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "accessToken"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-wide v1, p1, Lj/e/b/h/e;->b:J

    invoke-direct {p0, v1, v2}, Lj/e/b/h/b;->a(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expiresIn"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-wide v1, p1, Lj/e/b/h/e;->c:J

    invoke-direct {p0, v1, v2}, Lj/e/b/h/b;->a(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "issuedClientTime"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object p1, p1, Lj/e/b/h/e;->d:Ljava/lang/String;

    invoke-direct {p0, p1}, Lj/e/b/h/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "refreshToken"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
