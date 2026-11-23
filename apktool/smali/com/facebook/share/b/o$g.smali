.class final Lcom/facebook/share/b/o$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/o;->i(Lcom/facebook/share/c/u;Ljava/util/UUID;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/internal/h0$b<",
        "Lcom/facebook/internal/b0$a;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/internal/b0$a;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/internal/b0$a;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/facebook/internal/b0$a;

    invoke-virtual {p0, p1}, Lcom/facebook/share/b/o$g;->a(Lcom/facebook/internal/b0$a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
