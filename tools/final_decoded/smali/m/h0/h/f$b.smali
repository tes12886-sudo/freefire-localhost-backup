.class final Lm/h0/h/f$b;
.super Ll/y/c/j;
.source ""

# interfaces
.implements Ll/y/b/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/h/f;->j(Lm/h0/h/b;)V
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
.field final synthetic a:Lm/g;

.field final synthetic b:Lm/t;

.field final synthetic c:Lm/a;


# direct methods
.method constructor <init>(Lm/g;Lm/t;Lm/a;)V
    .locals 0

    iput-object p1, p0, Lm/h0/h/f$b;->a:Lm/g;

    iput-object p2, p0, Lm/h0/h/f$b;->b:Lm/t;

    iput-object p3, p0, Lm/h0/h/f$b;->c:Lm/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/y/c/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm/h0/h/f$b;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/h0/h/f$b;->a:Lm/g;

    invoke-virtual {v0}, Lm/g;->d()Lm/h0/n/c;

    move-result-object v0

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lm/h0/h/f$b;->b:Lm/t;

    invoke-virtual {v1}, Lm/t;->d()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lm/h0/h/f$b;->c:Lm/a;

    invoke-virtual {v2}, Lm/a;->l()Lm/v;

    move-result-object v2

    invoke-virtual {v2}, Lm/v;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lm/h0/n/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
