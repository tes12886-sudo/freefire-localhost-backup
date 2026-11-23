.class public Lcom/facebook/share/b/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static a(Lcom/facebook/share/c/d;Landroid/os/Bundle;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p2}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/share/c/d;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "effect_id"

    invoke-static {p2, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string v0, "effect_textures"

    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/share/c/d;->h()Lcom/facebook/share/c/a;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/share/b/b;->a(Lcom/facebook/share/c/a;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string p1, "effect_arguments"

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p1, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object p2

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/n;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to create a JSON Object from the provided CameraEffectArguments: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static b(Lcom/facebook/share/c/g;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p1}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/share/c/g;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TITLE"

    invoke-static {p1, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/g;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DESCRIPTION"

    invoke-static {p1, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/g;->j()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "IMAGE"

    invoke-static {p1, v1, v0}, Lcom/facebook/internal/h0;->p0(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/g;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "QUOTE"

    invoke-static {p1, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->a()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "MESSENGER_LINK"

    invoke-static {p1, v1, v0}, Lcom/facebook/internal/h0;->p0(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->a()Landroid/net/Uri;

    move-result-object p0

    const-string v0, "TARGET_DISPLAY"

    invoke-static {p1, v0, p0}, Lcom/facebook/internal/h0;->p0(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    return-object p1
.end method

.method private static c(Lcom/facebook/share/c/i;Ljava/util/List;Z)Landroid/os/Bundle;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/c/i;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;Z)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    invoke-static {p0, p2}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "MEDIA"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method private static d(Lcom/facebook/share/c/k;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p1}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p1

    :try_start_0
    invoke-static {p1, p0}, Lcom/facebook/share/b/g;->b(Landroid/os/Bundle;Lcom/facebook/share/c/k;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static e(Lcom/facebook/share/c/m;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p1}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p1

    :try_start_0
    invoke-static {p1, p0}, Lcom/facebook/share/b/g;->d(Landroid/os/Bundle;Lcom/facebook/share/c/m;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static f(Lcom/facebook/share/c/n;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p1}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p1

    :try_start_0
    invoke-static {p1, p0}, Lcom/facebook/share/b/g;->f(Landroid/os/Bundle;Lcom/facebook/share/c/n;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static g(Lcom/facebook/share/c/q;Lorg/json/JSONObject;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p2}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/share/c/q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/share/b/o;->f(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "PREVIEW_PROPERTY_NAME"

    invoke-static {p2, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/q;->h()Lcom/facebook/share/c/p;

    move-result-object p0

    invoke-virtual {p0}, Lcom/facebook/share/c/p;->e()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ACTION_TYPE"

    invoke-static {p2, v0, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ACTION"

    invoke-static {p2, p1, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method private static h(Lcom/facebook/share/c/u;Ljava/util/List;Z)Landroid/os/Bundle;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/c/u;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    invoke-static {p0, p2}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "PHOTOS"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method private static i(Lcom/facebook/share/c/v;Landroid/os/Bundle;Landroid/os/Bundle;Z)Landroid/os/Bundle;
    .locals 1

    invoke-static {p0, p3}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p3

    if-eqz p1, :cond_0

    const-string v0, "bg_asset"

    invoke-virtual {p3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    if-eqz p2, :cond_1

    const-string p1, "interactive_asset_uri"

    invoke-virtual {p3, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/c/v;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/h0;->Z(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "top_background_color_list"

    invoke-virtual {p3, p1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/share/c/v;->h()Ljava/lang/String;

    move-result-object p0

    const-string p1, "content_url"

    invoke-static {p3, p1, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method

.method private static j(Lcom/facebook/share/c/x;Ljava/lang/String;Z)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p2}, Lcom/facebook/share/b/h;->l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/share/c/x;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TITLE"

    invoke-static {p2, v1, v0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/x;->h()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DESCRIPTION"

    invoke-static {p2, v0, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "VIDEO"

    invoke-static {p2, p0, p1}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public static k(Ljava/util/UUID;Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;
    .locals 1

    const-string v0, "shareContent"

    invoke-static {p1, v0}, Lcom/facebook/internal/i0;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callId"

    invoke-static {p0, v0}, Lcom/facebook/internal/i0;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/facebook/share/c/g;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/share/c/g;

    invoke-static {p1, p2}, Lcom/facebook/share/b/h;->b(Lcom/facebook/share/c/g;Z)Landroid/os/Bundle;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lcom/facebook/share/c/u;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/facebook/share/c/u;

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->i(Lcom/facebook/share/c/u;Ljava/util/UUID;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/facebook/share/b/h;->h(Lcom/facebook/share/c/u;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object p0

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lcom/facebook/share/c/x;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/facebook/share/c/x;

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->o(Lcom/facebook/share/c/x;Ljava/util/UUID;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/facebook/share/b/h;->j(Lcom/facebook/share/c/x;Ljava/lang/String;Z)Landroid/os/Bundle;

    move-result-object p0

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lcom/facebook/share/c/q;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/facebook/share/c/q;

    :try_start_0
    invoke-static {p0, p1}, Lcom/facebook/share/b/o;->A(Ljava/util/UUID;Lcom/facebook/share/c/q;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/share/b/o;->z(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/facebook/share/b/h;->g(Lcom/facebook/share/c/q;Lorg/json/JSONObject;Z)Landroid/os/Bundle;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/facebook/n;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to create a JSON Object from the provided ShareOpenGraphContent: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v0, p1, Lcom/facebook/share/c/i;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/facebook/share/c/i;

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->g(Lcom/facebook/share/c/i;Ljava/util/UUID;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/facebook/share/b/h;->c(Lcom/facebook/share/c/i;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/facebook/share/c/d;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/facebook/share/c/d;

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->m(Lcom/facebook/share/c/d;Ljava/util/UUID;)Landroid/os/Bundle;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/facebook/share/b/h;->a(Lcom/facebook/share/c/d;Landroid/os/Bundle;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/facebook/share/c/k;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/facebook/share/c/k;

    invoke-static {p1, p2}, Lcom/facebook/share/b/h;->d(Lcom/facebook/share/c/k;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lcom/facebook/share/c/n;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/facebook/share/c/n;

    invoke-static {p1, p2}, Lcom/facebook/share/b/h;->f(Lcom/facebook/share/c/n;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_7
    instance-of v0, p1, Lcom/facebook/share/c/m;

    if-eqz v0, :cond_8

    check-cast p1, Lcom/facebook/share/c/m;

    invoke-static {p1, p2}, Lcom/facebook/share/b/h;->e(Lcom/facebook/share/c/m;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_8
    instance-of v0, p1, Lcom/facebook/share/c/v;

    if-eqz v0, :cond_9

    check-cast p1, Lcom/facebook/share/c/v;

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->e(Lcom/facebook/share/c/v;Ljava/util/UUID;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {p1, p0}, Lcom/facebook/share/b/o;->l(Lcom/facebook/share/c/v;Ljava/util/UUID;)Landroid/os/Bundle;

    move-result-object p0

    invoke-static {p1, v0, p0, p2}, Lcom/facebook/share/b/h;->i(Lcom/facebook/share/c/v;Landroid/os/Bundle;Landroid/os/Bundle;Z)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_9
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static l(Lcom/facebook/share/c/e;Z)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->a()Landroid/net/Uri;

    move-result-object v1

    const-string v2, "LINK"

    invoke-static {v0, v2, v1}, Lcom/facebook/internal/h0;->p0(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PLACE"

    invoke-static {v0, v2, v1}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PAGE"

    invoke-static {v0, v2, v1}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "REF"

    invoke-static {v0, v2, v1}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "DATA_FAILURES_FATAL"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/facebook/share/c/e;->c()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/internal/h0;->Z(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "FRIENDS"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/share/c/e;->f()Lcom/facebook/share/c/f;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/share/c/f;->a()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HASHTAG"

    invoke-static {v0, p1, p0}, Lcom/facebook/internal/h0;->o0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method
