.class Lcom/beetalk/sdk/g$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->N()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g$i;->a:Lcom/beetalk/sdk/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/g$i;->a:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/g$i;->a:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/beetalk/sdk/g$i;->a:Lcom/beetalk/sdk/g;

    invoke-static {v1}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/z/i/b;->o(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
