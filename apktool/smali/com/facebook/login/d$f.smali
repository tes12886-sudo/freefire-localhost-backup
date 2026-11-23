.class Lcom/facebook/login/d$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/d;->s2(Ljava/lang/String;Lcom/facebook/internal/h0$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/d;


# direct methods
.method constructor <init>(Lcom/facebook/login/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d$f;->a:Lcom/facebook/login/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/login/d$f;->a:Lcom/facebook/login/d;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/facebook/login/d;->m2(Z)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/login/d$f;->a:Lcom/facebook/login/d;

    invoke-virtual {p2}, Landroidx/fragment/app/d;->N1()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/facebook/login/d$f;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->d2(Lcom/facebook/login/d;)Lcom/facebook/login/l$d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/login/d;->v2(Lcom/facebook/login/l$d;)V

    return-void
.end method
