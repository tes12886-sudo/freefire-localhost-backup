.class Lcom/facebook/share/b/l$b;
.super Lcom/facebook/share/b/l$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/b/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
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

    invoke-direct {p0}, Lcom/facebook/share/b/l$b;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Lcom/facebook/share/c/v;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/facebook/share/b/l;->l(Lcom/facebook/share/c/v;Lcom/facebook/share/b/l$c;)V

    return-void
.end method
