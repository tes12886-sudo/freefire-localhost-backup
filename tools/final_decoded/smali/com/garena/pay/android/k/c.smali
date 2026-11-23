.class public Lcom/garena/pay/android/k/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/pay/android/k/c$b;
    }
.end annotation


# instance fields
.field private a:Lcom/garena/pay/android/k/b;

.field private b:Landroid/app/Activity;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/garena/pay/android/k/e;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/garena/pay/android/k/c$b;

.field private e:Landroid/view/ViewGroup;

.field private f:Ljava/lang/String;

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/k/c;->c:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/garena/pay/android/k/c;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/garena/pay/android/k/c;->g:I

    iput-object p1, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    return-void
.end method

.method private a()V
    .locals 5

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lj/c/b/f;->c:I

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/garena/pay/android/k/c;->e:Landroid/view/ViewGroup;

    sget v1, Lj/c/b/e;->n:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->e:Landroid/view/ViewGroup;

    sget v2, Lj/c/b/e;->k:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/garena/pay/android/k/c;->f:Ljava/lang/String;

    invoke-static {v2}, Lcom/garena/pay/android/j/d;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v2, p0, Lcom/garena/pay/android/k/c;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->e:Landroid/view/ViewGroup;

    sget v2, Lj/c/b/e;->b:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/garena/pay/android/k/c;->g:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/garena/pay/android/k/e;

    instance-of v3, v2, Lcom/garena/pay/android/k/d;

    if-eqz v3, :cond_1

    new-instance v3, Lcom/garena/pay/android/k/f;

    iget-object v4, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    invoke-direct {v3, v4, p0}, Lcom/garena/pay/android/k/f;-><init>(Landroid/app/Activity;Lcom/garena/pay/android/k/c;)V

    goto :goto_2

    :cond_1
    new-instance v3, Lcom/garena/pay/android/k/g;

    iget-object v4, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    invoke-direct {v3, v4, p0}, Lcom/garena/pay/android/k/g;-><init>(Landroid/app/Activity;Lcom/garena/pay/android/k/c;)V

    :goto_2
    invoke-virtual {v3, v2}, Lcom/garena/pay/android/k/g;->d(Lcom/garena/pay/android/k/e;)V

    invoke-virtual {v3}, Lcom/garena/pay/android/k/g;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/garena/pay/android/k/c;)Lcom/garena/pay/android/k/c$b;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/k/c;->d:Lcom/garena/pay/android/k/c$b;

    return-object p0
.end method


# virtual methods
.method public c(Lcom/garena/pay/android/k/e;)V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/c;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    new-instance p4, Lcom/garena/pay/android/k/e;

    invoke-direct {p4}, Lcom/garena/pay/android/k/e;-><init>()V

    iput p2, p4, Lcom/garena/pay/android/k/e;->b:I

    iput-object p1, p4, Lcom/garena/pay/android/k/e;->a:Ljava/lang/String;

    iput-object p5, p4, Lcom/garena/pay/android/k/e;->e:Ljava/lang/Object;

    iput-object p3, p4, Lcom/garena/pay/android/k/e;->d:Ljava/lang/String;

    iget-object p1, p0, Lcom/garena/pay/android/k/c;->c:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lcom/garena/pay/android/k/e;

    invoke-direct {v0}, Lcom/garena/pay/android/k/e;-><init>()V

    iput-object p2, v0, Lcom/garena/pay/android/k/e;->c:Ljava/lang/String;

    iput-object p1, v0, Lcom/garena/pay/android/k/e;->a:Ljava/lang/String;

    iput-object p5, v0, Lcom/garena/pay/android/k/e;->e:Ljava/lang/Object;

    iput-object p3, v0, Lcom/garena/pay/android/k/e;->d:Ljava/lang/String;

    iput-object p4, v0, Lcom/garena/pay/android/k/e;->f:Ljava/lang/String;

    iget-object p1, p0, Lcom/garena/pay/android/k/c;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/c;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/garena/pay/android/j/a;->a(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/garena/pay/android/k/c;->a()V

    return-void
.end method

.method public g(Z)V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/c;->a:Lcom/garena/pay/android/k/b;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/garena/pay/android/k/b;->b()V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lcom/garena/pay/android/k/b;->f()V

    :cond_1
    :goto_0
    return-void
.end method

.method public h()Lcom/garena/pay/android/k/c$b;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/c;->d:Lcom/garena/pay/android/k/c$b;

    return-object v0
.end method

.method public i(Lcom/garena/pay/android/k/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/c;->d:Lcom/garena/pay/android/k/c$b;

    return-void
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lcom/garena/pay/android/k/c;->g:I

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/k/c;->f:Ljava/lang/String;

    return-void
.end method

.method public l(Landroid/view/View;)V
    .locals 3

    new-instance v0, Lcom/garena/pay/android/k/b;

    iget-object v1, p0, Lcom/garena/pay/android/k/c;->e:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/garena/pay/android/k/b;-><init>(Landroid/view/View;ZZ)V

    iput-object v0, p0, Lcom/garena/pay/android/k/c;->a:Lcom/garena/pay/android/k/b;

    new-instance v1, Lcom/garena/pay/android/k/c$a;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/k/c$a;-><init>(Lcom/garena/pay/android/k/c;)V

    invoke-virtual {v0, v1}, Lcom/garena/pay/android/k/b;->d(Lcom/garena/pay/android/k/b$c;)V

    iget-object v0, p0, Lcom/garena/pay/android/k/c;->a:Lcom/garena/pay/android/k/b;

    invoke-virtual {v0, p1}, Lcom/garena/pay/android/k/b;->e(Landroid/view/View;)V

    return-void
.end method
