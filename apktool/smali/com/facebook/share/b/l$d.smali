.class Lcom/facebook/share/b/l$d;
.super Lcom/facebook/share/b/l$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/b/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/share/b/l$c;-><init>(Lcom/facebook/share/b/l$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/b/l$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/share/b/l$d;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/facebook/share/c/i;)V
    .locals 1

    new-instance p1, Lcom/facebook/n;

    const-string v0, "Cannot share ShareMediaContent via web sharing dialogs"

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Lcom/facebook/share/c/t;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/facebook/share/b/l;->m(Lcom/facebook/share/c/t;Lcom/facebook/share/b/l$c;)V

    return-void
.end method

.method public q(Lcom/facebook/share/c/x;)V
    .locals 1

    new-instance p1, Lcom/facebook/n;

    const-string v0, "Cannot share ShareVideoContent via web sharing dialogs"

    invoke-direct {p1, v0}, Lcom/facebook/n;-><init>(Ljava/lang/String;)V

    throw p1
.end method
