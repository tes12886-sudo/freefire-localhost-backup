.class public final Lcom/facebook/b0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/b0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lcom/facebook/a;->p:Lcom/facebook/a$c;

    invoke-virtual {v0}, Lcom/facebook/a$c;->e()Lcom/facebook/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/facebook/a$c;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/b0$b;->c(Lcom/facebook/b0;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/facebook/a;->m()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/b0$b$a;

    invoke-direct {v1}, Lcom/facebook/b0$b$a;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/h0;->D(Ljava/lang/String;Lcom/facebook/internal/h0$a;)V

    :cond_1
    return-void
.end method

.method public final b()Lcom/facebook/b0;
    .locals 1

    sget-object v0, Lcom/facebook/d0;->e:Lcom/facebook/d0$a;

    invoke-virtual {v0}, Lcom/facebook/d0$a;->a()Lcom/facebook/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/d0;->c()Lcom/facebook/b0;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lcom/facebook/b0;)V
    .locals 1

    sget-object v0, Lcom/facebook/d0;->e:Lcom/facebook/d0$a;

    invoke-virtual {v0}, Lcom/facebook/d0$a;->a()Lcom/facebook/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/d0;->f(Lcom/facebook/b0;)V

    return-void
.end method
