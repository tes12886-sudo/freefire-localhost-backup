.class public final Lcom/facebook/j0/m$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/m;
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

    invoke-direct {p0}, Lcom/facebook/j0/m$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0}, Lcom/facebook/j0/h$a;->f()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/facebook/j0/g$b;
    .locals 1

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0}, Lcom/facebook/j0/h$a;->h()Lcom/facebook/j0/g$b;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/j0/h;->j:Lcom/facebook/j0/h$a;

    invoke-virtual {v0}, Lcom/facebook/j0/h$a;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ud"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/facebook/j0/p;->i(Ljava/util/Map;)V

    return-void
.end method
