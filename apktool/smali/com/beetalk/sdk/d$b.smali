.class Lcom/beetalk/sdk/d$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/d;->c()Lcom/beetalk/sdk/b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/d;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/d$b;->a:Lcom/beetalk/sdk/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/d$b;->a:Lcom/beetalk/sdk/d;

    invoke-static {v0}, Lcom/beetalk/sdk/d;->a(Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/beetalk/sdk/a;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/d$b;->a:Lcom/beetalk/sdk/d;

    invoke-static {v0}, Lcom/beetalk/sdk/d;->a(Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/beetalk/sdk/a;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
