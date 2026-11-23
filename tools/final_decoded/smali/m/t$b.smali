.class final Lm/t$b;
.super Ll/y/c/j;
.source ""

# interfaces
.implements Ll/y/b/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/t;-><init>(Lm/g0;Lm/i;Ljava/util/List;Ll/y/b/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/y/c/j;",
        "Ll/y/b/a<",
        "Ljava/util/List<",
        "+",
        "Ljava/security/cert/Certificate;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ll/y/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/y/b/a<",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ll/y/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/y/b/a<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lm/t$b;->a:Ll/y/b/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/y/c/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm/t$b;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lm/t$b;->a:Ll/y/b/a;

    invoke-interface {v0}, Ll/y/b/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ll/t/k;->g()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method
