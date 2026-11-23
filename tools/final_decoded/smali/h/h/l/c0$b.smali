.class Lh/h/l/c0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/l/c0;->i(Lh/h/l/f0;)Lh/h/l/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh/h/l/f0;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lh/h/l/c0;Lh/h/l/f0;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lh/h/l/c0$b;->a:Lh/h/l/f0;

    iput-object p3, p0, Lh/h/l/c0$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object p1, p0, Lh/h/l/c0$b;->a:Lh/h/l/f0;

    iget-object v0, p0, Lh/h/l/c0$b;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lh/h/l/f0;->a(Landroid/view/View;)V

    return-void
.end method
