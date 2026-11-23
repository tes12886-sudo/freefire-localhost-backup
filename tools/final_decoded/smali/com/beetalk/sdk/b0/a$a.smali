.class Lcom/beetalk/sdk/b0/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/b0/a;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/vk/sdk/g<",
        "Lcom/vk/sdk/i$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/b0/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/b0/a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/a$a;->a:Lcom/beetalk/sdk/b0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/vk/sdk/k/c;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "vk session check error: %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/b0/a$a;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {v0}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/b0/a$a;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {v0}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/b0/a$d;->a(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/i$d;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/b0/a$a;->c(Lcom/vk/sdk/i$d;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/i$d;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v2, "vk session state: %s"

    invoke-static {v2, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/beetalk/sdk/b0/a$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/b0/a$a;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/a;->a(Lcom/beetalk/sdk/b0/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/b0/a;->c(Lcom/beetalk/sdk/b0/a;Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "vk already logged in"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/beetalk/sdk/b0/a$a;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/a;->a(Lcom/beetalk/sdk/b0/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/b0/a;->b(Lcom/beetalk/sdk/b0/a;Landroid/app/Activity;)V

    :goto_0
    return-void
.end method
