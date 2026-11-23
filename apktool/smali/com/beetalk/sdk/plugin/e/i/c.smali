.class public Lcom/beetalk/sdk/plugin/e/i/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/i/c$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:[Lcom/vk/sdk/k/l/b;

.field d:Lcom/vk/sdk/k/k/t;

.field e:Ljava/lang/CharSequence;

.field f:Lcom/beetalk/sdk/plugin/e/i/c$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Lcom/vk/sdk/k/l/b;)Lcom/beetalk/sdk/plugin/e/i/c;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/c;->c:[Lcom/vk/sdk/k/l/b;

    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/i/c;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/i/c;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lcom/beetalk/sdk/plugin/e/i/c$a;)Lcom/beetalk/sdk/plugin/e/i/c;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/c;->f:Lcom/beetalk/sdk/plugin/e/i/c$a;

    return-object p0
.end method

.method public d(Ljava/lang/CharSequence;)Lcom/beetalk/sdk/plugin/e/i/c;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/c;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public e(Landroid/app/FragmentManager;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/b;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/i/b;-><init>(Lcom/beetalk/sdk/plugin/e/i/c;)V

    invoke-virtual {v0, p1, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
