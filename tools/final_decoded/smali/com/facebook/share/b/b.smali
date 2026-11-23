.class public final Lcom/facebook/share/b/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/b/b$d;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/facebook/share/b/b$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/l;

    const-class v1, Ljava/lang/String;

    new-instance v2, Lcom/facebook/share/b/b$a;

    invoke-direct {v2}, Lcom/facebook/share/b/b$a;-><init>()V

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, [Ljava/lang/String;

    new-instance v2, Lcom/facebook/share/b/b$b;

    invoke-direct {v2}, Lcom/facebook/share/b/b$b;-><init>()V

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Lorg/json/JSONArray;

    new-instance v2, Lcom/facebook/share/b/b$c;

    invoke-direct {v2}, Lcom/facebook/share/b/b$c;-><init>()V

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/t/a0;->e([Ll/l;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/share/b/b;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static final a(Lcom/facebook/share/c/a;)Lorg/json/JSONObject;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/share/c/a;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/facebook/share/c/a;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "arguments[key] ?: // Nul\u2026orted.\n          continue"

    invoke-static {v3, v4}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/facebook/share/b/b;->a:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/share/b/b$d;

    if-eqz v4, :cond_2

    const-string v5, "SETTERS[value.javaClass]\u2026ype: \" + value.javaClass)"

    invoke-static {v4, v5}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "key"

    invoke-static {v2, v5}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v0, v2, v3}, Lcom/facebook/share/b/b$d;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-object v0
.end method
