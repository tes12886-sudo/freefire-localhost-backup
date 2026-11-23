.class final Lj/c/a/e/i/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static b:Lj/c/a/e/i/b;


# instance fields
.field private a:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SERVICE_PREF"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lj/c/a/e/i/b;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method static a()Lj/c/a/e/i/b;
    .locals 2

    sget-object v0, Lj/c/a/e/i/b;->b:Lj/c/a/e/i/b;

    if-nez v0, :cond_0

    new-instance v0, Lj/c/a/e/i/b;

    invoke-static {}, Lj/c/a/e/a;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lj/c/a/e/i/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lj/c/a/e/i/b;->b:Lj/c/a/e/i/b;

    :cond_0
    sget-object v0, Lj/c/a/e/i/b;->b:Lj/c/a/e/i/b;

    return-object v0
.end method


# virtual methods
.method b(Ljava/lang/String;J)J
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj/c/a/e/i/b;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1

    :cond_0
    return-wide p2
.end method

.method c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj/c/a/e/i/b;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method d(Ljava/lang/String;J)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj/c/a/e/i/b;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lj/c/a/e/i/b;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method
