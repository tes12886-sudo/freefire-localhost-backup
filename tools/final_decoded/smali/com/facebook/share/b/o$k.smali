.class final Lcom/facebook/share/b/o$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/b/o;->l(Lcom/facebook/share/c/v;Ljava/util/UUID;)Landroid/os/Bundle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/internal/h0$b<",
        "Lcom/facebook/share/c/t;",
        "Lcom/facebook/internal/b0$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/UUID;


# direct methods
.method constructor <init>(Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/b/o$k;->a:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/share/c/t;)Lcom/facebook/internal/b0$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/share/b/o$k;->a:Ljava/util/UUID;

    invoke-static {v0, p1}, Lcom/facebook/share/b/o;->a(Ljava/util/UUID;Lcom/facebook/share/c/h;)Lcom/facebook/internal/b0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/t;

    invoke-virtual {p0, p1}, Lcom/facebook/share/b/o$k;->a(Lcom/facebook/share/c/t;)Lcom/facebook/internal/b0$a;

    move-result-object p1

    return-object p1
.end method
