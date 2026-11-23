.class public final Lcom/facebook/internal/c0$g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/c0$g;
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

    invoke-direct {p0}, Lcom/facebook/internal/c0$g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/internal/c0$f;I)Lcom/facebook/internal/c0$g;
    .locals 2

    new-instance v0, Lcom/facebook/internal/c0$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/c0$g;-><init>(Ll/y/c/f;)V

    invoke-static {v0, p1}, Lcom/facebook/internal/c0$g;->a(Lcom/facebook/internal/c0$g;Lcom/facebook/internal/c0$f;)V

    invoke-static {v0, p2}, Lcom/facebook/internal/c0$g;->b(Lcom/facebook/internal/c0$g;I)V

    return-object v0
.end method

.method public final b()Lcom/facebook/internal/c0$g;
    .locals 2

    new-instance v0, Lcom/facebook/internal/c0$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/c0$g;-><init>(Ll/y/c/f;)V

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/facebook/internal/c0$g;->b(Lcom/facebook/internal/c0$g;I)V

    return-object v0
.end method
