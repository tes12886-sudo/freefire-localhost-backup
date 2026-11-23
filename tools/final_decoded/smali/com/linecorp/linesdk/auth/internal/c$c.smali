.class final Lcom/linecorp/linesdk/auth/internal/c$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/linecorp/linesdk/auth/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lj/e/b/c<",
        "Lj/e/b/h/g;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/linecorp/linesdk/auth/internal/c;


# direct methods
.method private constructor <init>(Lcom/linecorp/linesdk/auth/internal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/linecorp/linesdk/auth/internal/c;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/linecorp/linesdk/auth/internal/c$c;-><init>(Lcom/linecorp/linesdk/auth/internal/c;)V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v0, p1, Lcom/linecorp/linesdk/auth/internal/c;->c:Lj/e/b/h/a/c;

    iget-object p1, p1, Lcom/linecorp/linesdk/auth/internal/c;->b:Lj/e/b/i/a;

    invoke-virtual {p1}, Lj/e/b/i/a;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v1, v0, Lj/e/b/h/a/c;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "oauth"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "otp"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    const-string v3, "client_id"

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v0, Lj/e/b/h/a/c;->b:Lj/e/b/h/a/a/a;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    sget-object v3, Lj/e/b/h/a/c;->c:Lj/e/b/h/a/a/c;

    invoke-virtual {p1, v1, v0, v2, v3}, Lj/e/b/h/a/a/a;->a(Landroid/net/Uri;Ljava/util/Map;Ljava/util/Map;Lj/e/b/h/a/a/c;)Lj/e/b/c;

    move-result-object p1

    return-object p1
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 14

    check-cast p1, Lj/e/b/c;

    invoke-virtual {p1}, Lj/e/b/c;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/c;->h:Lcom/linecorp/linesdk/auth/internal/d;

    sget v2, Lcom/linecorp/linesdk/auth/internal/d$b;->d:I

    iput v2, v1, Lcom/linecorp/linesdk/auth/internal/d;->d:I

    iget-object v0, v0, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    invoke-static {p1}, Lcom/linecorp/linesdk/auth/internal/c;->a(Lj/e/b/c;)Lj/e/b/i/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;->c(Lj/e/b/i/c;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lj/e/b/c;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/e/b/h/g;

    iget-object v0, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/c;->h:Lcom/linecorp/linesdk/auth/internal/d;

    iput-object p1, v1, Lcom/linecorp/linesdk/auth/internal/d;->a:Lj/e/b/h/g;

    :try_start_0
    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/c;->e:Lcom/linecorp/linesdk/auth/internal/a;

    iget-object v2, v0, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iget-object v3, v0, Lcom/linecorp/linesdk/auth/internal/c;->b:Lj/e/b/i/a;

    iget-object v0, v0, Lcom/linecorp/linesdk/auth/internal/c;->g:[Ljava/lang/String;

    const/16 v4, 0x8

    new-array v5, v4, [B

    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v6}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v4, :cond_1

    long-to-int v10, v6

    int-to-byte v10, v10

    aput-byte v10, v5, v9

    shr-long/2addr v6, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    const/16 v4, 0xb

    invoke-static {v5, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    iget-object v1, v1, Lcom/linecorp/linesdk/auth/internal/a;->a:Lcom/linecorp/linesdk/auth/internal/d;

    iput-object v4, v1, Lcom/linecorp/linesdk/auth/internal/d;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "intent://result#Intent;package="

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";scheme=lineauth;end"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lj/e/b/i/a;->c()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "response_type"

    const-string v7, "code"

    invoke-virtual {v5, v6, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "client_id"

    invoke-virtual {v3}, Lj/e/b/i/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "state"

    invoke-virtual {v5, v6, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    const-string v5, "otpId"

    iget-object p1, p1, Lj/e/b/h/g;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    const-string v4, "redirect_uri"

    invoke-virtual {p1, v4, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    if-eqz v0, :cond_2

    array-length v4, v0

    if-lez v4, :cond_2

    const-string v4, "scope"

    const-string v5, " "

    invoke-static {v5, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v3}, Lj/e/b/i/a;->e()Z

    move-result v0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v4, 0x10

    const/4 v5, 0x1

    if-lt v3, v4, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x0

    const-string v9, "android.intent.action.VIEW"

    if-eqz v6, :cond_4

    :try_start_1
    new-instance v6, Lh/d/b/d$a;

    invoke-direct {v6}, Lh/d/b/d$a;-><init>()V

    const v10, 0x106000b

    invoke-static {v2, v10}, Landroidx/core/content/a;->d(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v6, v10}, Lh/d/b/d$a;->d(I)Lh/d/b/d$a;

    invoke-virtual {v6}, Lh/d/b/d$a;->a()Lh/d/b/d;

    move-result-object v6

    iget-object v10, v6, Lh/d/b/d;->a:Landroid/content/Intent;

    invoke-virtual {v10, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v10

    iget-object v6, v6, Lh/d/b/d;->b:Landroid/os/Bundle;

    goto :goto_2

    :cond_4
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v10

    move-object v6, v7

    :goto_2
    invoke-static {v2}, Lcom/linecorp/linesdk/auth/internal/b;->a(Landroid/content/Context;)Lcom/linecorp/linesdk/auth/internal/b;

    move-result-object v11

    if-nez v11, :cond_5

    new-instance p1, Lcom/linecorp/linesdk/auth/internal/a$a;

    invoke-direct {p1, v10, v6, v8}, Lcom/linecorp/linesdk/auth/internal/a$a;-><init>(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    goto/16 :goto_6

    :cond_5
    if-nez v0, :cond_9

    sget-object v0, Lcom/linecorp/linesdk/auth/internal/a;->b:Lcom/linecorp/linesdk/auth/internal/b;

    if-eqz v0, :cond_8

    iget v12, v11, Lcom/linecorp/linesdk/auth/internal/b;->a:I

    iget v13, v0, Lcom/linecorp/linesdk/auth/internal/b;->a:I

    if-eq v12, v13, :cond_6

    if-lt v12, v13, :cond_8

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    iget v12, v11, Lcom/linecorp/linesdk/auth/internal/b;->b:I

    iget v13, v0, Lcom/linecorp/linesdk/auth/internal/b;->b:I

    if-eq v12, v13, :cond_7

    if-lt v12, v13, :cond_8

    goto :goto_3

    :cond_7
    iget v11, v11, Lcom/linecorp/linesdk/auth/internal/b;->c:I

    iget v0, v0, Lcom/linecorp/linesdk/auth/internal/b;->c:I

    if-lt v11, v0, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_5

    :cond_9
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_a

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p1, "jp.naver.line.android"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Lcom/linecorp/linesdk/auth/internal/a$a;

    invoke-direct {p1, v0, v6, v5}, Lcom/linecorp/linesdk/auth/internal/a$a;-><init>(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    goto :goto_6

    :cond_a
    new-instance v0, Landroid/content/Intent;

    const-string v11, "http://"

    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v0, v9, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v0, v8}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v10}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lcom/linecorp/linesdk/auth/internal/a;->a(Landroid/net/Uri;Ljava/util/Collection;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_f

    if-ne v2, v5, :cond_b

    new-instance p1, Lcom/linecorp/linesdk/auth/internal/a$a;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-direct {p1, v0, v6, v8}, Lcom/linecorp/linesdk/auth/internal/a$a;-><init>(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    goto :goto_6

    :cond_b
    invoke-interface {v0, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    invoke-static {p1, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const-string v2, "android.intent.extra.INITIAL_INTENTS"

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Landroid/os/Parcelable;

    invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/Parcelable;

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    new-instance v0, Lcom/linecorp/linesdk/auth/internal/a$a;

    invoke-direct {v0, p1, v6, v8}, Lcom/linecorp/linesdk/auth/internal/a$a;-><init>(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    move-object p1, v0

    :goto_6
    new-instance v0, Lcom/linecorp/linesdk/auth/internal/a$b;

    iget-object v2, p1, Lcom/linecorp/linesdk/auth/internal/a$a;->a:Landroid/content/Intent;

    iget-object v5, p1, Lcom/linecorp/linesdk/auth/internal/a$a;->b:Landroid/os/Bundle;

    iget-boolean p1, p1, Lcom/linecorp/linesdk/auth/internal/a$a;->c:Z

    invoke-direct {v0, v2, v5, v1, p1}, Lcom/linecorp/linesdk/auth/internal/a$b;-><init>(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;Z)V

    iget-boolean p1, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->d:Z

    if-eqz p1, :cond_d

    if-lt v3, v4, :cond_c

    iget-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object p1, p1, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->a:Landroid/content/Intent;

    iget-object v2, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->b:Landroid/os/Bundle;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_c
    iget-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object p1, p1, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->a:Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_7

    :cond_d
    const/4 p1, 0x3

    if-lt v3, v4, :cond_e

    iget-object v1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v1, v1, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iget-object v2, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->a:Landroid/content/Intent;

    iget-object v3, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->b:Landroid/os/Bundle;

    invoke-virtual {v1, v2, p1, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v1, v1, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    iget-object v2, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_7
    iget-object p1, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object p1, p1, Lcom/linecorp/linesdk/auth/internal/c;->h:Lcom/linecorp/linesdk/auth/internal/d;

    iget-object v0, v0, Lcom/linecorp/linesdk/auth/internal/a$b;->c:Ljava/lang/String;

    iput-object v0, p1, Lcom/linecorp/linesdk/auth/internal/d;->b:Ljava/lang/String;

    return-void

    :cond_f
    new-instance v0, Landroid/content/ActivityNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity for LINE log-in is not found. uri="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/content/ActivityNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/linecorp/linesdk/auth/internal/c$c;->a:Lcom/linecorp/linesdk/auth/internal/c;

    iget-object v1, v0, Lcom/linecorp/linesdk/auth/internal/c;->h:Lcom/linecorp/linesdk/auth/internal/d;

    sget v2, Lcom/linecorp/linesdk/auth/internal/d$b;->d:I

    iput v2, v1, Lcom/linecorp/linesdk/auth/internal/d;->d:I

    iget-object v0, v0, Lcom/linecorp/linesdk/auth/internal/c;->a:Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;

    new-instance v1, Lj/e/b/i/c;

    sget-object v2, Lj/e/b/d;->f:Lj/e/b/d;

    new-instance v3, Lj/e/b/b;

    invoke-direct {v3, p1}, Lj/e/b/b;-><init>(Ljava/lang/Exception;)V

    invoke-direct {v1, v2, v3}, Lj/e/b/i/c;-><init>(Lj/e/b/d;Lj/e/b/b;)V

    invoke-virtual {v0, v1}, Lcom/linecorp/linesdk/auth/internal/LineAuthenticationActivity;->c(Lj/e/b/i/c;)V

    return-void
.end method
