.class public final Lcom/facebook/j0/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/g;
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

    invoke-direct {p0}, Lcom/facebook/j0/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Application;Ljava/lang/String;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/j0/h$a;->d(Landroid/app/Application;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0, p1}, Lcom/facebook/j0/h$a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lcom/facebook/j0/g$b;
    .locals 1

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0}, Lcom/facebook/j0/h$a;->h()Lcom/facebook/j0/g$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/j0/b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/j0/h$a;->k(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Landroid/content/Context;)Lcom/facebook/j0/g;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/j0/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1, v1}, Lcom/facebook/j0/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/a;Ll/y/c/f;)V

    return-object v0
.end method

.method public final g()V
    .locals 1

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0}, Lcom/facebook/j0/h$a;->o()V

    return-void
.end method
