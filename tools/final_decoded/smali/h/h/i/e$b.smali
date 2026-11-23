.class Lh/h/i/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/h/k/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/i/e;->d(Landroid/content/Context;Lh/h/i/d;ILjava/util/concurrent/Executor;Lh/h/i/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh/h/k/a<",
        "Lh/h/i/e$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lh/h/i/a;


# direct methods
.method constructor <init>(Lh/h/i/a;)V
    .locals 0

    iput-object p1, p0, Lh/h/i/e$b;->a:Lh/h/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh/h/i/e$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lh/h/i/e$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lh/h/i/e$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lh/h/i/e$b;->a:Lh/h/i/a;

    invoke-virtual {v0, p1}, Lh/h/i/a;->b(Lh/h/i/e$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh/h/i/e$e;

    invoke-virtual {p0, p1}, Lh/h/i/e$b;->a(Lh/h/i/e$e;)V

    return-void
.end method
