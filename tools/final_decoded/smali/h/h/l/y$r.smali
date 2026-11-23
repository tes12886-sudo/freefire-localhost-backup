.class final Lh/h/l/y$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/l/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "r"
.end annotation


# instance fields
.field private final a:Lh/h/l/u;


# direct methods
.method constructor <init>(Lh/h/l/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/h/l/y$r;->a:Lh/h/l/u;

    return-void
.end method


# virtual methods
.method public onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    invoke-static {p2}, Lh/h/l/e;->g(Landroid/view/ContentInfo;)Lh/h/l/e;

    move-result-object v0

    iget-object v1, p0, Lh/h/l/y$r;->a:Lh/h/l/u;

    invoke-interface {v1, p1, v0}, Lh/h/l/u;->a(Landroid/view/View;Lh/h/l/e;)Lh/h/l/e;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p1}, Lh/h/l/e;->f()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
