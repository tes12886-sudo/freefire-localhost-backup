.class public Lcom/vk/sdk/l/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/vk/sdk/k/c;

.field private b:Landroid/widget/EditText;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ProgressBar;

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/vk/sdk/k/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/vk/sdk/l/a;->a:Lcom/vk/sdk/k/c;

    return-void
.end method

.method static synthetic a(Lcom/vk/sdk/l/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/l/a;->g()V

    return-void
.end method

.method static synthetic b(Lcom/vk/sdk/l/a;)Lcom/vk/sdk/k/c;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/l/a;->a:Lcom/vk/sdk/k/c;

    return-object p0
.end method

.method static synthetic c(Lcom/vk/sdk/l/a;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/l/a;->c:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic d(Lcom/vk/sdk/l/a;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/l/a;->d:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic e(Lcom/vk/sdk/l/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/l/a;->f()V

    return-void
.end method

.method private f()V
    .locals 2

    new-instance v0, Lcom/vk/sdk/k/i/d;

    iget-object v1, p0, Lcom/vk/sdk/l/a;->a:Lcom/vk/sdk/k/c;

    iget-object v1, v1, Lcom/vk/sdk/k/c;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/i/d;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/vk/sdk/l/a;->e:F

    iput v1, v0, Lcom/vk/sdk/k/i/d;->i:F

    new-instance v1, Lcom/vk/sdk/l/a$e;

    invoke-direct {v1, p0}, Lcom/vk/sdk/l/a$e;-><init>(Lcom/vk/sdk/l/a;)V

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/i/d;->q(Lcom/vk/sdk/k/i/d$b;)V

    invoke-static {v0}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V

    return-void
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/l/a;->a:Lcom/vk/sdk/k/c;

    iget-object v1, p0, Lcom/vk/sdk/l/a;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/vk/sdk/l/a;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/c;->d(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public h(Landroid/content/Context;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 3

    sget v0, Lcom/vk/sdk/b;->a:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/vk/sdk/a;->a:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/vk/sdk/l/a;->b:Landroid/widget/EditText;

    sget v1, Lcom/vk/sdk/a;->c:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/vk/sdk/l/a;->c:Landroid/widget/ImageView;

    sget v1, Lcom/vk/sdk/a;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Lcom/vk/sdk/l/a;->d:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/vk/sdk/l/a;->e:F

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iget-object v1, p0, Lcom/vk/sdk/l/a;->b:Landroid/widget/EditText;

    new-instance v2, Lcom/vk/sdk/l/a$a;

    invoke-direct {v2, p0, v0}, Lcom/vk/sdk/l/a$a;-><init>(Lcom/vk/sdk/l/a;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v1, p0, Lcom/vk/sdk/l/a;->b:Landroid/widget/EditText;

    new-instance v2, Lcom/vk/sdk/l/a$b;

    invoke-direct {v2, p0, v0}, Lcom/vk/sdk/l/a$b;-><init>(Lcom/vk/sdk/l/a;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    const/4 v1, -0x2

    const v2, 0x104000a

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/vk/sdk/l/a$c;

    invoke-direct {v2, p0}, Lcom/vk/sdk/l/a$c;-><init>(Lcom/vk/sdk/l/a;)V

    invoke-virtual {v0, v1, p1, v2}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Lcom/vk/sdk/l/a$d;

    invoke-direct {p1, p0, v0}, Lcom/vk/sdk/l/a$d;-><init>(Lcom/vk/sdk/l/a;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    invoke-direct {p0}, Lcom/vk/sdk/l/a;->f()V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
