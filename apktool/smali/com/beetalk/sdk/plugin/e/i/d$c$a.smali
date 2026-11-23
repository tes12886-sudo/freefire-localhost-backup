.class Lcom/beetalk/sdk/plugin/e/i/d$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/d$c;->c(Lcom/vk/sdk/k/i/d;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/i/d$c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/d$c;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$c$a;->a:Lcom/beetalk/sdk/plugin/e/i/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$c$a;->a:Lcom/beetalk/sdk/plugin/e/i/d$c;

    iget-object v1, v0, Lcom/beetalk/sdk/plugin/e/i/d$c;->c:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object v2, v0, Lcom/beetalk/sdk/plugin/e/i/d$c;->a:Ljava/lang/String;

    iget v0, v0, Lcom/beetalk/sdk/plugin/e/i/d$c;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v2, v0}, Lcom/beetalk/sdk/plugin/e/i/d;->d(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;I)V

    return-void
.end method
