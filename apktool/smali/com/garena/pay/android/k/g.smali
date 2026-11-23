.class public Lcom/garena/pay/android/k/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected a:Lcom/garena/pay/android/k/c;

.field protected b:Landroid/view/View;

.field protected c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/garena/pay/android/k/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/garena/pay/android/k/g;->a:Lcom/garena/pay/android/k/c;

    sget p2, Lj/c/b/f;->b:I

    invoke-virtual {p0, p1, p2}, Lcom/garena/pay/android/k/g;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/garena/pay/android/k/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/garena/pay/android/k/g;->a:Lcom/garena/pay/android/k/c;

    invoke-virtual {p0, p1, p3}, Lcom/garena/pay/android/k/g;->a(Landroid/app/Activity;I)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/app/Activity;I)V
    .locals 1

    iput-object p1, p0, Lcom/garena/pay/android/k/g;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-static {p1}, Lcom/garena/pay/android/j/a;->b(Landroid/util/DisplayMetrics;)V

    iget-object p1, p0, Lcom/garena/pay/android/k/g;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    return-void
.end method

.method public b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    return-object v0
.end method

.method protected c(Lcom/garena/pay/android/k/e;Landroid/widget/ImageView;)V
    .locals 1

    iget-object v0, p1, Lcom/garena/pay/android/k/e;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/garena/pay/android/j/d;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, Lcom/garena/pay/android/k/e;->b:I

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/garena/pay/android/k/e;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/beetalk/sdk/x/f;->b(Ljava/lang/String;)Lcom/beetalk/sdk/x/f$b;

    move-result-object p1

    sget v0, Lj/c/b/d;->a:I

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/x/f$b;->b(I)Lcom/beetalk/sdk/x/f$b;

    invoke-virtual {p1, p2}, Lcom/beetalk/sdk/x/f$b;->a(Landroid/widget/ImageView;)V

    :goto_0
    return-void
.end method

.method public d(Lcom/garena/pay/android/k/e;)V
    .locals 7

    iget-object v0, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    if-eqz v0, :cond_3

    sget v1, Lj/c/b/e;->l:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    sget v2, Lj/c/b/e;->m:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    sget v3, Lj/c/b/e;->d:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    invoke-virtual {p0, p1, v1}, Lcom/garena/pay/android/k/g;->c(Lcom/garena/pay/android/k/e;Landroid/widget/ImageView;)V

    iget-object v1, p1, Lcom/garena/pay/android/k/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/garena/pay/android/k/e;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/garena/pay/android/k/e;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    iget-object v5, p0, Lcom/garena/pay/android/k/g;->c:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lj/c/b/b;->b:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v6, 0x21

    invoke-virtual {v3, v4, v5, v1, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p1, Lcom/garena/pay/android/k/e;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/garena/pay/android/j/d;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/garena/pay/android/k/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v0, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    iget-object v1, p1, Lcom/garena/pay/android/k/e;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p1, p1, Lcom/garena/pay/android/k/e;->e:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    new-instance p1, Lcom/garena/pay/android/k/g$a;

    invoke-direct {p1, p0}, Lcom/garena/pay/android/k/g$a;-><init>(Lcom/garena/pay/android/k/g;)V

    invoke-virtual {v2}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/garena/pay/android/k/g;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    :goto_0
    return-void
.end method
