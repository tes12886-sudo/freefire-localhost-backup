.class Lcom/vk/sdk/i$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field public a:Lcom/vk/sdk/e;

.field public b:Lcom/vk/sdk/e;

.field public c:Lcom/vk/sdk/k/c;


# direct methods
.method public constructor <init>(Lcom/vk/sdk/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/vk/sdk/i$c;->a:Lcom/vk/sdk/e;

    return-void
.end method

.method public constructor <init>(Lcom/vk/sdk/e;Lcom/vk/sdk/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/vk/sdk/i$c;->a:Lcom/vk/sdk/e;

    iput-object p1, p0, Lcom/vk/sdk/i$c;->b:Lcom/vk/sdk/e;

    return-void
.end method

.method public constructor <init>(Lcom/vk/sdk/k/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/vk/sdk/i$c;->c:Lcom/vk/sdk/k/c;

    return-void
.end method
