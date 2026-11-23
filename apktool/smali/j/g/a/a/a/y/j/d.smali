.class public Lj/g/a/a/a/y/j/d;
.super Lj/g/a/a/a/y/j/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/g/a/a/a/y/j/d$b;
    }
.end annotation


# instance fields
.field e:Lj/g/a/a/a/y/j/d$b;


# direct methods
.method public constructor <init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/g/a/a/a/y/j/h;-><init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->b()Lo/u;

    move-result-object p1

    const-class p2, Lj/g/a/a/a/y/j/d$b;

    invoke-virtual {p1, p2}, Lo/u;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/y/j/d$b;

    iput-object p1, p0, Lj/g/a/a/a/y/j/d;->e:Lj/g/a/a/a/y/j/d$b;

    return-void
.end method

.method public static j(Ljava/lang/String;)Lj/g/a/a/a/y/j/g;
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lj/g/a/a/a/y/i/c;->a(Ljava/lang/String;Z)Ljava/util/TreeMap;

    move-result-object p0

    const-string v0, "oauth_token"

    invoke-virtual {p0, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "oauth_token_secret"

    invoke-virtual {p0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "screen_name"

    invoke-virtual {p0, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "user_id"

    invoke-virtual {p0, v3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Lj/g/a/a/a/y/j/g;

    new-instance v5, Lj/g/a/a/a/r;

    invoke-direct {v5, v0, v1}, Lj/g/a/a/a/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v5, v2, v3, v4}, Lj/g/a/a/a/y/j/g;-><init>(Lj/g/a/a/a/r;Ljava/lang/String;J)V

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public e(Lj/g/a/a/a/p;)Ljava/lang/String;
    .locals 3

    const-string v0, "twittersdk://callback"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->c()Lj/g/a/a/a/u;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/u;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lj/g/a/a/a/p;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "app"

    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method f()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->a()Lj/g/a/a/a/y/g;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/y/g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/oauth/access_token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Lj/g/a/a/a/r;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->a()Lj/g/a/a/a/y/g;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "oauth"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "authorize"

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lj/g/a/a/a/y/g;->a([Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object p1, p1, Lj/g/a/a/a/r;->a:Ljava/lang/String;

    const-string v1, "oauth_token"

    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method h(Lj/g/a/a/a/c;)Lj/g/a/a/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/y/j/g;",
            ">;)",
            "Lj/g/a/a/a/c<",
            "Lm/e0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj/g/a/a/a/y/j/d$a;

    invoke-direct {v0, p0, p1}, Lj/g/a/a/a/y/j/d$a;-><init>(Lj/g/a/a/a/y/j/d;Lj/g/a/a/a/c;)V

    return-object v0
.end method

.method i()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->a()Lj/g/a/a/a/y/g;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/y/g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/oauth/request_token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k(Lj/g/a/a/a/c;Lj/g/a/a/a/r;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/y/j/g;",
            ">;",
            "Lj/g/a/a/a/r;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/d;->f()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lj/g/a/a/a/y/j/b;

    invoke-direct {v0}, Lj/g/a/a/a/y/j/b;-><init>()V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->c()Lj/g/a/a/a/u;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/u;->c()Lj/g/a/a/a/p;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "POST"

    const/4 v6, 0x0

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lj/g/a/a/a/y/j/b;->a(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lj/g/a/a/a/y/j/d;->e:Lj/g/a/a/a/y/j/d$b;

    invoke-interface {v0, p2, p3}, Lj/g/a/a/a/y/j/d$b;->a(Ljava/lang/String;Ljava/lang/String;)Lo/d;

    move-result-object p2

    invoke-virtual {p0, p1}, Lj/g/a/a/a/y/j/d;->h(Lj/g/a/a/a/c;)Lj/g/a/a/a/c;

    move-result-object p1

    invoke-interface {p2, p1}, Lo/d;->Q(Lo/f;)V

    return-void
.end method

.method public l(Lj/g/a/a/a/c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/y/j/g;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->c()Lj/g/a/a/a/u;

    move-result-object v0

    invoke-virtual {v0}, Lj/g/a/a/a/u;->c()Lj/g/a/a/a/p;

    move-result-object v2

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/d;->i()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lj/g/a/a/a/y/j/d;->e:Lj/g/a/a/a/y/j/d$b;

    new-instance v1, Lj/g/a/a/a/y/j/b;

    invoke-direct {v1}, Lj/g/a/a/a/y/j/b;-><init>()V

    invoke-virtual {p0, v2}, Lj/g/a/a/a/y/j/d;->e(Lj/g/a/a/a/p;)Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const-string v5, "POST"

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Lj/g/a/a/a/y/j/b;->a(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lj/g/a/a/a/y/j/d$b;->b(Ljava/lang/String;)Lo/d;

    move-result-object v0

    invoke-virtual {p0, p1}, Lj/g/a/a/a/y/j/d;->h(Lj/g/a/a/a/c;)Lj/g/a/a/a/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lo/d;->Q(Lo/f;)V

    return-void
.end method
