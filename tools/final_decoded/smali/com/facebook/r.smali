.class public final Lcom/facebook/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/r$b;,
        Lcom/facebook/r$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "com.facebook.r"

.field private static final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/facebook/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Ljava/util/concurrent/Executor;

.field private static volatile d:Ljava/lang/String;

.field private static volatile e:Ljava/lang/String;

.field private static volatile f:Ljava/lang/String;

.field private static volatile g:Ljava/lang/Boolean;

.field private static h:Ljava/util/concurrent/atomic/AtomicLong;

.field private static volatile i:Z

.field private static j:Z

.field private static k:Landroid/content/Context;

.field private static l:I

.field private static final m:Ljava/util/concurrent/locks/ReentrantLock;

.field private static n:Ljava/lang/String;

.field public static o:Z

.field public static p:Z

.field public static q:Z

.field private static final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static volatile s:Ljava/lang/String;

.field private static volatile t:Ljava/lang/String;

.field private static u:Lcom/facebook/r$a;

.field private static v:Z

.field public static final w:Lcom/facebook/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/facebook/r;

    invoke-direct {v0}, Lcom/facebook/r;-><init>()V

    sput-object v0, Lcom/facebook/r;->w:Lcom/facebook/r;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/a0;

    sget-object v1, Lcom/facebook/a0;->f:Lcom/facebook/a0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/t/f0;->c([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    sput-object v0, Lcom/facebook/r;->b:Ljava/util/HashSet;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/32 v3, 0x10000

    invoke-direct {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/facebook/r;->h:Ljava/util/concurrent/atomic/AtomicLong;

    const v0, 0xface

    sput v0, Lcom/facebook/r;->l:I

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/facebook/r;->m:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-static {}, Lcom/facebook/internal/f0;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/r;->n:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/facebook/r;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, "instagram.com"

    sput-object v0, Lcom/facebook/r;->s:Ljava/lang/String;

    const-string v0, "facebook.com"

    sput-object v0, Lcom/facebook/r;->t:Ljava/lang/String;

    sget-object v0, Lcom/facebook/r$c;->a:Lcom/facebook/r$c;

    sput-object v0, Lcom/facebook/r;->u:Lcom/facebook/r$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final A(Landroid/content/Context;)V
    .locals 6

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lcom/facebook/r;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.ApplicationId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "Locale.ROOT"

    invoke-static {v2, v3}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v2, v3}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const-string v4, "fb"

    const/4 v5, 0x2

    invoke-static {v2, v4, v1, v5, v3}, Ll/d0/g;->x(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v0, v2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    sput-object v0, Lcom/facebook/r;->d:Ljava/lang/String;

    goto :goto_0

    :cond_3
    instance-of v0, v0, Ljava/lang/Number;

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Lcom/facebook/n;

    const-string v0, "App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file."

    invoke-direct {p0, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_0
    sget-object v0, Lcom/facebook/r;->e:Ljava/lang/String;

    if-nez v0, :cond_6

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.ApplicationName"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/r;->e:Ljava/lang/String;

    :cond_6
    sget-object v0, Lcom/facebook/r;->f:Ljava/lang/String;

    if-nez v0, :cond_7

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.ClientToken"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/r;->f:Ljava/lang/String;

    :cond_7
    sget v0, Lcom/facebook/r;->l:I

    const v2, 0xface

    if-ne v0, v2, :cond_8

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.facebook.sdk.CallbackOffset"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/facebook/r;->l:I

    :cond_8
    sget-object v0, Lcom/facebook/r;->g:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.facebook.sdk.CodelessDebugLogEnabled"

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lcom/facebook/r;->g:Ljava/lang/Boolean;

    :catch_0
    :cond_9
    return-void
.end method

.method private final B(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/internal/b;->h:Lcom/facebook/internal/b$a;

    invoke-virtual {v0, p1}, Lcom/facebook/internal/b$a;->e(Landroid/content/Context;)Lcom/facebook/internal/b;

    move-result-object v0

    const-string v1, "com.facebook.sdk.attributionTracking"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "ping"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v8, Lcom/facebook/j0/v/c$a;->a:Lcom/facebook/j0/v/c$a;

    sget-object v9, Lcom/facebook/j0/g;->b:Lcom/facebook/j0/g$a;

    invoke-virtual {v9, p1}, Lcom/facebook/j0/g$a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-static {p1}, Lcom/facebook/r;->s(Landroid/content/Context;)Z

    move-result v10

    invoke-static {v8, v0, v9, v10, p1}, Lcom/facebook/j0/v/c;->a(Lcom/facebook/j0/v/c$a;Lcom/facebook/internal/b;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v0, Ll/y/c/o;->a:Ll/y/c/o;

    const-string v0, "%s/activities"

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object p2, v9, v2

    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "java.lang.String.format(format, *args)"

    invoke-static {p2, v0}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/r;->u:Lcom/facebook/r$a;

    const/4 v2, 0x0

    invoke-interface {v0, v2, p2, p1, v2}, Lcom/facebook/r$a;->a(Lcom/facebook/a;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/u$b;)Lcom/facebook/u;

    move-result-object p1

    cmp-long p2, v6, v4

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/facebook/u;->i()Lcom/facebook/x;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/x;->b()Lcom/facebook/q;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lcom/facebook/n;

    const-string v0, "An error occurred while publishing install."

    invoke-direct {p2, v0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_3
    const-string p2, "Facebook-publish"

    invoke-static {p2, p1}, Lcom/facebook/internal/h0;->e0(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_1
    :goto_0
    return-void

    :goto_1
    invoke-static {p1, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final C(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-class v0, Lcom/facebook/r;

    invoke-static {v0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "context"

    invoke-static {p0, v1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "applicationId"

    invoke-static {p1, v1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Lcom/facebook/r;->n()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/facebook/r$d;

    invoke-direct {v2, p0, p1}, Lcom/facebook/r$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p0, Lcom/facebook/internal/p$b;->m:Lcom/facebook/internal/p$b;

    invoke-static {p0}, Lcom/facebook/internal/p;->g(Lcom/facebook/internal/p$b;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/facebook/j0/x/a;->b()Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "com.facebook.sdk.attributionTracking"

    invoke-static {p1, p0}, Lcom/facebook/j0/x/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final declared-synchronized D(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/facebook/r;

    monitor-enter v0

    :try_start_0
    const-string v1, "applicationContext"

    invoke-static {p0, v1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lcom/facebook/r;->E(Landroid/content/Context;Lcom/facebook/r$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final declared-synchronized E(Landroid/content/Context;Lcom/facebook/r$b;)V
    .locals 4

    const-class v0, Lcom/facebook/r;

    monitor-enter v0

    :try_start_0
    const-string v1, "applicationContext"

    invoke-static {p0, v1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/r;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/r$b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    const/4 v2, 0x0

    :try_start_1
    invoke-static {p0, v2}, Lcom/facebook/internal/i0;->g(Landroid/content/Context;Z)V

    invoke-static {p0, v2}, Lcom/facebook/internal/i0;->i(Landroid/content/Context;Z)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "applicationContext.applicationContext"

    invoke-static {v2, v3}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v2, Lcom/facebook/r;->k:Landroid/content/Context;

    sget-object v2, Lcom/facebook/j0/g;->b:Lcom/facebook/j0/g$a;

    invoke-virtual {v2, p0}, Lcom/facebook/j0/g$a;->b(Landroid/content/Context;)Ljava/lang/String;

    sget-object p0, Lcom/facebook/r;->k:Landroid/content/Context;

    const/4 v2, 0x0

    if-eqz p0, :cond_9

    invoke-static {p0}, Lcom/facebook/r;->A(Landroid/content/Context;)V

    sget-object p0, Lcom/facebook/r;->d:Ljava/lang/String;

    invoke-static {p0}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Lcom/facebook/r;->i()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, Lcom/facebook/r;->d()V

    :cond_2
    sget-object p0, Lcom/facebook/r;->k:Landroid/content/Context;

    if-eqz p0, :cond_7

    instance-of p0, p0, Landroid/app/Application;

    if-eqz p0, :cond_5

    invoke-static {}, Lcom/facebook/i0;->g()Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lcom/facebook/r;->k:Landroid/content/Context;

    if-eqz p0, :cond_4

    if-eqz p0, :cond_3

    check-cast p0, Landroid/app/Application;

    sget-object v1, Lcom/facebook/r;->d:Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/facebook/j0/v/a;->x(Landroid/app/Application;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.app.Application"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    const-string p0, "applicationContext"

    invoke-static {p0}, Ll/y/c/i;->q(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    :cond_5
    :goto_0
    :try_start_2
    invoke-static {}, Lcom/facebook/internal/u;->k()V

    invoke-static {}, Lcom/facebook/internal/c0;->G()V

    sget-object p0, Lcom/facebook/internal/c;->d:Lcom/facebook/internal/c$a;

    sget-object v1, Lcom/facebook/r;->k:Landroid/content/Context;

    if-eqz v1, :cond_6

    invoke-virtual {p0, v1}, Lcom/facebook/internal/c$a;->a(Landroid/content/Context;)Lcom/facebook/internal/c;

    new-instance p0, Lcom/facebook/internal/z;

    sget-object v1, Lcom/facebook/r$e;->a:Lcom/facebook/r$e;

    invoke-direct {p0, v1}, Lcom/facebook/internal/z;-><init>(Ljava/util/concurrent/Callable;)V

    sget-object p0, Lcom/facebook/internal/p$b;->q:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/r$f;->a:Lcom/facebook/r$f;

    invoke-static {p0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    sget-object p0, Lcom/facebook/internal/p$b;->d:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/r$g;->a:Lcom/facebook/r$g;

    invoke-static {p0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    sget-object p0, Lcom/facebook/internal/p$b;->I:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/r$h;->a:Lcom/facebook/r$h;

    invoke-static {p0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    sget-object p0, Lcom/facebook/internal/p$b;->J:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/r$i;->a:Lcom/facebook/r$i;

    invoke-static {p0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    sget-object p0, Lcom/facebook/internal/p$b;->K:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/r$j;->a:Lcom/facebook/r$j;

    invoke-static {p0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    new-instance p0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/facebook/r$k;

    invoke-direct {v1, p1}, Lcom/facebook/r$k;-><init>(Lcom/facebook/r$b;)V

    invoke-direct {p0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {}, Lcom/facebook/r;->n()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_6
    :try_start_3
    const-string p0, "applicationContext"

    invoke-static {p0}, Ll/y/c/i;->q(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v2

    :cond_7
    :try_start_4
    const-string p0, "applicationContext"

    invoke-static {p0}, Ll/y/c/i;->q(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v2

    :cond_8
    :try_start_5
    new-instance p0, Lcom/facebook/n;

    const-string p1, "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."

    invoke-direct {p0, p1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    const-string p0, "applicationContext"

    invoke-static {p0}, Ll/y/c/i;->q(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final synthetic a(Lcom/facebook/r;)Landroid/content/Context;
    .locals 0

    sget-object p0, Lcom/facebook/r;->k:Landroid/content/Context;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "applicationContext"

    invoke-static {p0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final synthetic b(Lcom/facebook/r;)Ljava/lang/String;
    .locals 0

    sget-object p0, Lcom/facebook/r;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(Lcom/facebook/r;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/r;->B(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static final d()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/r;->v:Z

    return-void
.end method

.method public static final e()Z
    .locals 1

    invoke-static {}, Lcom/facebook/i0;->e()Z

    move-result v0

    return v0
.end method

.method public static final f()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget-object v0, Lcom/facebook/r;->k:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "applicationContext"

    invoke-static {v0}, Ll/y/c/i;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final g()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget-object v0, Lcom/facebook/r;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/n;

    const-string v1, "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."

    invoke-direct {v0, v1}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget-object v0, Lcom/facebook/r;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static final i()Z
    .locals 1

    invoke-static {}, Lcom/facebook/i0;->f()Z

    move-result v0

    return v0
.end method

.method public static final j()Z
    .locals 1

    invoke-static {}, Lcom/facebook/i0;->g()Z

    move-result v0

    return v0
.end method

.method public static final k()I
    .locals 1

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget v0, Lcom/facebook/r;->l:I

    return v0
.end method

.method public static final l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget-object v0, Lcom/facebook/r;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static final m()Z
    .locals 1

    invoke-static {}, Lcom/facebook/i0;->h()Z

    move-result v0

    return v0
.end method

.method public static final n()Ljava/util/concurrent/Executor;
    .locals 2

    sget-object v0, Lcom/facebook/r;->m:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    sget-object v1, Lcom/facebook/r;->c:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v1, Lcom/facebook/r;->c:Ljava/util/concurrent/Executor;

    :cond_0
    sget-object v1, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    sget-object v0, Lcom/facebook/r;->c:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public static final o()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/r;->t:Ljava/lang/String;

    return-object v0
.end method

.method public static final p()Ljava/lang/String;
    .locals 5

    sget-object v0, Lcom/facebook/r;->a:Ljava/lang/String;

    sget-object v1, Ll/y/c/o;->a:Ll/y/c/o;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    sget-object v3, Lcom/facebook/r;->n:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "getGraphApiVersion: %s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "java.lang.String.format(format, *args)"

    invoke-static {v1, v2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/internal/h0;->f0(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/r;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static final q()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/a;->p:Lcom/facebook/a$c;

    invoke-virtual {v0}, Lcom/facebook/a$c;->e()Lcom/facebook/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/facebook/internal/h0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final r()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/r;->s:Ljava/lang/String;

    return-object v0
.end method

.method public static final s(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    const-string v0, "com.facebook.sdk.appEventPreferences"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "limitEventUsage"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static final t()J
    .locals 2

    invoke-static {}, Lcom/facebook/internal/i0;->o()V

    sget-object v0, Lcom/facebook/r;->h:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final u()Ljava/lang/String;
    .locals 1

    const-string v0, "12.2.0"

    return-object v0
.end method

.method public static final v()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/r;->i:Z

    return v0
.end method

.method public static final declared-synchronized w()Z
    .locals 2

    const-class v0, Lcom/facebook/r;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/facebook/r;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final x()Z
    .locals 1

    sget-object v0, Lcom/facebook/r;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static final y()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/r;->j:Z

    return v0
.end method

.method public static final z(Lcom/facebook/a0;)Z
    .locals 2

    const-string v0, "behavior"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/r;->b:Ljava/util/HashSet;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/facebook/r;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
