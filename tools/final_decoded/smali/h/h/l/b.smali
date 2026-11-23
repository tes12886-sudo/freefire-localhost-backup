.class public final synthetic Lh/h/l/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Lh/h/l/y$s;


# direct methods
.method public synthetic constructor <init>(Lh/h/l/y$s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/h/l/b;->a:Lh/h/l/y$s;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lh/h/l/b;->a:Lh/h/l/y$s;

    invoke-interface {v0, p1, p2}, Lh/h/l/y$s;->onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
