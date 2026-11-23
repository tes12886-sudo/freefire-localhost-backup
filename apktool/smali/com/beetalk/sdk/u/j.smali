.class public Lcom/beetalk/sdk/u/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/u/j$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/beetalk/sdk/u/j$a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Integer;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/garena/pay/android/d;Lcom/beetalk/sdk/u/j$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/garena/pay/android/d;",
            "Lcom/beetalk/sdk/u/j$a;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/beetalk/sdk/u/j;->a:Lcom/beetalk/sdk/u/j$a;

    iput-object p3, p0, Lcom/beetalk/sdk/u/j;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/beetalk/sdk/u/j;->c:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/beetalk/sdk/u/j;->d:Ljava/util/Map;

    return-void
.end method

.method public static a(Lcom/garena/pay/android/d;Lcom/garena/pay/android/b;Ljava/lang/String;)Lcom/beetalk/sdk/u/j;
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const-string p2, ": "

    invoke-static {p2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance p2, Lcom/beetalk/sdk/u/j;

    sget-object v3, Lcom/beetalk/sdk/u/j$a;->d:Lcom/beetalk/sdk/u/j$a;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/beetalk/sdk/u/j;-><init>(Lcom/garena/pay/android/d;Lcom/beetalk/sdk/u/j$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    return-object p2
.end method

.method public static b(Lcom/garena/pay/android/d;Ljava/util/Map;)Lcom/beetalk/sdk/u/j;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/garena/pay/android/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/beetalk/sdk/u/j;"
        }
    .end annotation

    new-instance v6, Lcom/beetalk/sdk/u/j;

    sget-object v2, Lcom/beetalk/sdk/u/j$a;->b:Lcom/beetalk/sdk/u/j$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/beetalk/sdk/u/j;-><init>(Lcom/garena/pay/android/d;Lcom/beetalk/sdk/u/j$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    return-object v6
.end method

.method public static g(Lcom/beetalk/sdk/u/j$a;)Z
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/u/j$a;->b:Lcom/beetalk/sdk/u/j$a;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/beetalk/sdk/u/j;->d:Ljava/util/Map;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/j;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/beetalk/sdk/u/j$a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/j;->a:Lcom/beetalk/sdk/u/j$a;

    return-object v0
.end method
