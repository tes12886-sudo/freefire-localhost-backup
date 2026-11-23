.class Lcom/beetalk/sdk/plugin/e/i/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/i/d$f;,
        Lcom/beetalk/sdk/plugin/e/i/d$g;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/ProgressBar;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/HorizontalScrollView;

.field private f:Lcom/beetalk/sdk/plugin/e/i/d$g;

.field private g:[Lcom/vk/sdk/k/l/b;

.field private h:Lcom/vk/sdk/k/k/t;

.field private i:Ljava/lang/CharSequence;

.field private j:Lcom/beetalk/sdk/plugin/e/i/c$a;

.field private final k:Lcom/beetalk/sdk/plugin/e/i/d$f;

.field l:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/beetalk/sdk/plugin/e/i/d$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/d$e;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/i/d$e;-><init>(Lcom/beetalk/sdk/plugin/e/i/d;)V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->l:Landroid/view/View$OnClickListener;

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/d$f;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    return-object p0
.end method

.method static synthetic b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->j:Lcom/beetalk/sdk/plugin/e/i/c$a;

    return-object p0
.end method

.method static synthetic c(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->j(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d;->k(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic e(Lcom/beetalk/sdk/plugin/e/i/d;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->i(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/plugin/e/i/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->s(Z)V

    return-void
.end method

.method static synthetic g(Lcom/beetalk/sdk/plugin/e/i/d;)[Lcom/vk/sdk/k/l/b;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->g:[Lcom/vk/sdk/k/l/b;

    return-object p0
.end method

.method static synthetic h(Lcom/beetalk/sdk/plugin/e/i/d;Lcom/vk/sdk/k/k/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/i/d;->l(Lcom/vk/sdk/k/k/r;)V

    return-void
.end method

.method private i(Landroid/graphics/Bitmap;)V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v0}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x64

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, Lcom/vk/sdk/j;->b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v1}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    const/16 v1, 0xa

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1, v2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->e:Landroid/widget/HorizontalScrollView;

    invoke-virtual {p1}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/beetalk/sdk/plugin/e/i/d;->k(Ljava/lang/String;I)V

    return-void
.end method

.method private k(Ljava/lang/String;I)V
    .locals 2

    const/16 v0, 0xa

    if-le p2, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/vk/sdk/k/i/d;

    invoke-direct {v0, p1}, Lcom/vk/sdk/k/i/d;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/beetalk/sdk/plugin/e/i/d$c;

    invoke-direct {v1, p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d$c;-><init>(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/i/d;->q(Lcom/vk/sdk/k/i/d$b;)V

    invoke-static {v0}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V

    return-void
.end method

.method private l(Lcom/vk/sdk/k/k/r;)V
    .locals 6

    if-nez p1, :cond_0

    new-instance p1, Lcom/vk/sdk/k/k/r;

    invoke-direct {p1}, Lcom/vk/sdk/k/k/r;-><init>()V

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/vk/sdk/k/k/f;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/i/d$g;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/k/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/k/s;->f(Lcom/vk/sdk/k/k/g;)Z

    :cond_2
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/vk/sdk/i;->g()Lcom/vk/sdk/e;

    move-result-object v1

    iget-object v1, v1, Lcom/vk/sdk/e;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Lcom/vk/sdk/k/a;->b()Lcom/vk/sdk/k/j/c;

    move-result-object v2

    const/4 v3, 0x6

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "owner_id"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    const-string v4, "message"

    aput-object v4, v3, v1

    const/4 v1, 0x3

    aput-object v0, v3, v1

    const/4 v0, 0x4

    const-string v1, "attachments"

    aput-object v1, v3, v0

    const/4 v0, 0x5

    invoke-virtual {p1}, Lcom/vk/sdk/k/k/r;->u()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v0

    invoke-static {v3}, Lcom/vk/sdk/k/d;->a([Ljava/lang/Object;)Lcom/vk/sdk/k/d;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/vk/sdk/k/j/c;->d(Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/d$d;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/i/d$d;-><init>(Lcom/beetalk/sdk/plugin/e/i/d;)V

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f;->n(Lcom/vk/sdk/k/f$d;)V

    return-void
.end method

.method private p()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    invoke-virtual {v1}, Lcom/vk/sdk/k/k/s;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    invoke-virtual {v1}, Lcom/vk/sdk/k/k/s;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vk/sdk/k/k/i;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/vk/sdk/k/k/i;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, v2, Lcom/vk/sdk/k/k/i;->a:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/vk/sdk/k/f;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "photo_sizes"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string v4, "photos"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, ","

    invoke-static {v0, v4}, Lcom/vk/sdk/m/b;->a(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/vk/sdk/k/d;->a([Ljava/lang/Object;)Lcom/vk/sdk/k/d;

    move-result-object v0

    const-class v2, Lcom/vk/sdk/k/k/t;

    const-string v3, "photos.getById"

    invoke-direct {v1, v3, v0, v2}, Lcom/vk/sdk/k/f;-><init>(Ljava/lang/String;Lcom/vk/sdk/k/d;Ljava/lang/Class;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/d$b;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/i/d$b;-><init>(Lcom/beetalk/sdk/plugin/e/i/d;)V

    invoke-virtual {v1, v0}, Lcom/vk/sdk/k/f;->n(Lcom/vk/sdk/k/f$d;)V

    return-void
.end method

.method private s(Z)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->b:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->c:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->b:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->c:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    :goto_0
    return-void
.end method


# virtual methods
.method public m(Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->j:Lcom/beetalk/sdk/plugin/e/i/c$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/beetalk/sdk/plugin/e/i/c$a;->c()V

    :cond_0
    return-void
.end method

.method public n(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v0}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lj/c/b/f;->e:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    sget v2, Lj/c/b/e;->c:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/beetalk/sdk/plugin/e/i/d$a;

    invoke-direct {v3, p0}, Lcom/beetalk/sdk/plugin/e/i/d$a;-><init>(Lcom/beetalk/sdk/plugin/e/i/d;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v2, Lj/c/b/e;->p:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->b:Landroid/widget/Button;

    sget v2, Lj/c/b/e;->q:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->c:Landroid/widget/ProgressBar;

    sget v2, Lj/c/b/e;->f:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    sget v2, Lj/c/b/e;->r:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    sget v2, Lj/c/b/e;->g:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/HorizontalScrollView;

    iput-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->e:Landroid/widget/HorizontalScrollView;

    sget v2, Lj/c/b/e;->a:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->b:Landroid/widget/Button;

    iget-object v4, p0, Lcom/beetalk/sdk/plugin/e/i/d;->l:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    const-string v4, "ShareText"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const-string v3, "ShareLink"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/beetalk/sdk/plugin/e/i/d$g;

    iput-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    const-string v3, "ShareImages"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, [Lcom/vk/sdk/k/l/b;

    iput-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->g:[Lcom/vk/sdk/k/l/b;

    const-string v3, "ShareUploadedImages"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/vk/sdk/k/k/t;

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->i:Ljava/lang/CharSequence;

    if-eqz p1, :cond_1

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->a:Landroid/widget/EditText;

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->g:[Lcom/vk/sdk/k/l/b;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    array-length v4, p1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, p1, v5

    iget-object v6, v6, Lcom/vk/sdk/k/l/b;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0, v6}, Lcom/beetalk/sdk/plugin/e/i/d;->i(Landroid/graphics/Bitmap;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_3
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/i/d;->p()V

    :cond_4
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    const/16 v4, 0x8

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->g:[Lcom/vk/sdk/k/l/b;

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_5
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    if-eqz p1, :cond_6

    sget p1, Lj/c/b/e;->i:I

    invoke-virtual {v2, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    sget v4, Lj/c/b/e;->h:I

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    iget-object v5, v5, Lcom/beetalk/sdk/plugin/e/i/d$g;->a:Ljava/lang/String;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    iget-object p1, p1, Lcom/beetalk/sdk/plugin/e/i/d$g;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/vk/sdk/m/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_2
    new-instance p1, Landroid/app/Dialog;

    invoke-direct {p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    return-object p1
.end method

.method public o()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, -0x2

    const/16 v2, 0xd

    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v0}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v2, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v2}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lj/c/b/c;->a:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    :goto_0
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v3}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getDialog()Landroid/app/Dialog;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->k:Lcom/beetalk/sdk/plugin/e/i/d$f;

    invoke-interface {v0}, Lcom/beetalk/sdk/plugin/e/i/d$f;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public q([Lcom/vk/sdk/k/l/b;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->g:[Lcom/vk/sdk/k/l/b;

    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/d$g;

    invoke-direct {v0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d;->f:Lcom/beetalk/sdk/plugin/e/i/d$g;

    return-void
.end method

.method public t(Lcom/beetalk/sdk/plugin/e/i/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->j:Lcom/beetalk/sdk/plugin/e/i/c$a;

    return-void
.end method

.method public u(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->i:Ljava/lang/CharSequence;

    return-void
.end method

.method public v(Lcom/vk/sdk/k/k/t;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d;->h:Lcom/vk/sdk/k/k/t;

    return-void
.end method
