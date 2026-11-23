.class public final Lcom/facebook/internal/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/internal/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/facebook/internal/c;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/internal/c;->a()Lcom/facebook/internal/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/internal/c;->a()Lcom/facebook/internal/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/internal/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/internal/c;-><init>(Landroid/content/Context;Ll/y/c/f;)V

    invoke-static {v0}, Lcom/facebook/internal/c;->b(Lcom/facebook/internal/c;)V

    invoke-static {v0}, Lcom/facebook/internal/c;->c(Lcom/facebook/internal/c;)V

    invoke-static {}, Lcom/facebook/internal/c;->a()Lcom/facebook/internal/c;

    move-result-object p1

    return-object p1
.end method
