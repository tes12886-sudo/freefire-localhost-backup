.class Lcom/beetalk/sdk/t/i$b;
.super Lcom/beetalk/sdk/t/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/t/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/t/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/t/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/t/i;Lcom/beetalk/sdk/t/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/t/i$b;-><init>(Lcom/beetalk/sdk/t/i;)V

    return-void
.end method


# virtual methods
.method protected a()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
