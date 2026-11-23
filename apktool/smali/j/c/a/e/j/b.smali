.class public Lj/c/a/e/j/b;
.super Lj/c/a/e/j/a;
.source ""


# instance fields
.field b:Landroid/content/IntentFilter;

.field c:Landroid/content/BroadcastReceiver;

.field private d:I

.field private e:Landroid/os/Handler;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Landroid/content/Context;

.field private i:Ljava/lang/Runnable;

.field private j:Landroid/content/ComponentName;

.field private k:I

.field private l:Z


# direct methods
.method public constructor <init>(Lj/c/a/e/j/a$a;)V
    .locals 2

    invoke-direct {p0}, Lj/c/a/e/j/a;-><init>()V

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.garena.android.gpns.check"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lj/c/a/e/j/b;->b:Landroid/content/IntentFilter;

    new-instance v0, Lj/c/a/e/j/b$a;

    invoke-direct {v0, p0}, Lj/c/a/e/j/b$a;-><init>(Lj/c/a/e/j/b;)V

    iput-object v0, p0, Lj/c/a/e/j/b;->c:Landroid/content/BroadcastReceiver;

    const/4 v0, 0x0

    iput v0, p0, Lj/c/a/e/j/b;->f:I

    const-string v1, ""

    iput-object v1, p0, Lj/c/a/e/j/b;->g:Ljava/lang/String;

    new-instance v1, Lj/c/a/e/j/b$b;

    invoke-direct {v1, p0}, Lj/c/a/e/j/b$b;-><init>(Lj/c/a/e/j/b;)V

    iput-object v1, p0, Lj/c/a/e/j/b;->i:Ljava/lang/Runnable;

    iput v0, p0, Lj/c/a/e/j/b;->k:I

    iput-boolean v0, p0, Lj/c/a/e/j/b;->l:Z

    iput-object p1, p0, Lj/c/a/e/j/a;->a:Lj/c/a/e/j/a$a;

    return-void
.end method

.method static synthetic b(Lj/c/a/e/j/b;)I
    .locals 0

    iget p0, p0, Lj/c/a/e/j/b;->d:I

    return p0
.end method

.method static synthetic c(Lj/c/a/e/j/b;I)I
    .locals 0

    iput p1, p0, Lj/c/a/e/j/b;->d:I

    return p1
.end method

.method static synthetic d(Lj/c/a/e/j/b;)I
    .locals 0

    iget p0, p0, Lj/c/a/e/j/b;->f:I

    return p0
.end method

.method static synthetic e(Lj/c/a/e/j/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/j/b;->g:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lj/c/a/e/j/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/j/b;->h:Landroid/content/Context;

    return-object p0
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private h(Landroid/content/Context;Landroid/content/ComponentName;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempt to kill:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.garena.android.gpns.enquiry"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "_action"

    const/4 v1, 0x2

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;)V
    .locals 6

    if-eqz p1, :cond_5

    iput-object p1, p0, Lj/c/a/e/j/b;->h:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.garena.android.gpns.enquiry"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    const-string v2, "_action"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "component"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iput v1, p0, Lj/c/a/e/j/b;->d:I

    if-nez v1, :cond_0

    iget-object p1, p0, Lj/c/a/e/j/a;->a:Lj/c/a/e/j/a$a;

    invoke-interface {p1}, Lj/c/a/e/j/a$a;->a()V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ApplicationInfo;

    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.garena.sdk.push.version"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget v5, p0, Lj/c/a/e/j/b;->f:I

    if-gt v4, v5, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget v5, p0, Lj/c/a/e/j/b;->f:I

    if-ne v4, v5, :cond_2

    iget-object v4, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v5, p0, Lj/c/a/e/j/b;->g:Ljava/lang/String;

    invoke-static {v4, v5}, Lj/c/a/e/j/b;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "service_version:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "we have a better choice now:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, p0, Lj/c/a/e/j/b;->f:I

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v2, p0, Lj/c/a/e/j/b;->g:Ljava/lang/String;

    goto :goto_0

    :cond_4
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lj/c/a/e/j/b;->e:Landroid/os/Handler;

    iget-object v2, p0, Lj/c/a/e/j/b;->i:Ljava/lang/Runnable;

    const-wide/16 v3, 0x2710

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lj/c/a/e/j/b;->c:Landroid/content/BroadcastReceiver;

    iget-object v3, p0, Lj/c/a/e/j/b;->b:Landroid/content/IntentFilter;

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_5
    return-void
.end method

.method protected i(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    iget v0, p0, Lj/c/a/e/j/b;->d:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lj/c/a/e/j/b;->d:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive query response on"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " count:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lj/c/a/e/j/b;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    const-string v0, "status_is_running"

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v3, "query_version"

    invoke-virtual {p2, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "component"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/content/ComponentName;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "responder: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " v:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const-string v5, " running"

    goto :goto_0

    :cond_0
    const-string v5, " not running"

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    const/4 v0, 0x4

    if-ge v3, v0, :cond_2

    :cond_1
    invoke-direct {p0, p1, p2}, Lj/c/a/e/j/b;->h(Landroid/content/Context;Landroid/content/ComponentName;)V

    goto/16 :goto_3

    :cond_2
    iget v0, p0, Lj/c/a/e/j/b;->k:I

    if-le v3, v0, :cond_4

    iget-boolean v0, p0, Lj/c/a/e/j/b;->l:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, v0}, Lj/c/a/e/j/b;->h(Landroid/content/Context;Landroid/content/ComponentName;)V

    :cond_3
    iput v3, p0, Lj/c/a/e/j/b;->k:I

    iput-object p2, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "a winner is:"

    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iput-boolean v1, p0, Lj/c/a/e/j/b;->l:Z

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lj/c/a/e/j/b;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lj/c/a/e/j/b;->l:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-direct {p0, p1, v0}, Lj/c/a/e/j/b;->h(Landroid/content/Context;Landroid/content/ComponentName;)V

    iput-boolean v2, p0, Lj/c/a/e/j/b;->l:Z

    :cond_5
    iput v3, p0, Lj/c/a/e/j/b;->k:I

    iput-object p2, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "b winner is:"

    goto :goto_1

    :cond_6
    iget v0, p0, Lj/c/a/e/j/b;->k:I

    const-string v1, "c winner is:"

    if-le v3, v0, :cond_8

    iget-boolean v0, p0, Lj/c/a/e/j/b;->l:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    if-eqz v0, :cond_7

    invoke-direct {p0, p1, v0}, Lj/c/a/e/j/b;->h(Landroid/content/Context;Landroid/content/ComponentName;)V

    :cond_7
    iput-object p2, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iput v3, p0, Lj/c/a/e/j/b;->k:I

    iput-boolean v2, p0, Lj/c/a/e/j/b;->l:Z

    goto :goto_3

    :cond_8
    if-ne v3, v0, :cond_b

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    if-nez v0, :cond_9

    iput-object p2, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_9
    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lj/c/a/e/j/b;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lj/c/a/e/j/b;->l:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-direct {p0, p1, v0}, Lj/c/a/e/j/b;->h(Landroid/content/Context;Landroid/content/ComponentName;)V

    :cond_a
    iput-object p2, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_b
    :goto_3
    iget p2, p0, Lj/c/a/e/j/b;->d:I

    if-nez p2, :cond_e

    const-string p2, "get all feedback"

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object p2, p0, Lj/c/a/e/j/b;->e:Landroid/os/Handler;

    iget-object v0, p0, Lj/c/a/e/j/b;->i:Ljava/lang/Runnable;

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-boolean p2, p0, Lj/c/a/e/j/b;->l:Z

    const-string v0, "start & bind service:"

    if-eqz p2, :cond_c

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    :goto_4
    iget-object p2, p0, Lj/c/a/e/j/a;->a:Lj/c/a/e/j/a$a;

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-interface {p2, v0}, Lj/c/a/e/j/a$a;->b(Landroid/content/ComponentName;)V

    goto :goto_5

    :cond_c
    const-string p2, "no service running"

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget p2, p0, Lj/c/a/e/j/b;->k:I

    if-lez p2, :cond_d

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "found a better candidate rather than myself "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    iget-object v0, p0, Lj/c/a/e/j/b;->j:Landroid/content/ComponentName;

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_4

    :cond_d
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "I am the candidate to run "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object p2, p0, Lj/c/a/e/j/a;->a:Lj/c/a/e/j/a$a;

    invoke-interface {p2}, Lj/c/a/e/j/a$a;->a()V

    :goto_5
    const/4 p2, 0x0

    iput-object p2, p0, Lj/c/a/e/j/a;->a:Lj/c/a/e/j/a$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lj/c/a/e/j/b;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object p2, p0, Lj/c/a/e/j/b;->e:Landroid/os/Handler;

    iput-object p2, p0, Lj/c/a/e/j/b;->h:Landroid/content/Context;

    :cond_e
    return-void
.end method
