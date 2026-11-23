.class public final Lcom/beetalk/sdk/g$l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/beetalk/sdk/c;

.field private f:Lcom/beetalk/sdk/t/k;

.field private g:I

.field private h:Lcom/beetalk/sdk/g$o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/beetalk/sdk/g$l;->f:Lcom/beetalk/sdk/t/k;

    sget-object v0, Lcom/beetalk/sdk/p;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/g$l;->g:I

    sget-object v0, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    iput-object v0, p0, Lcom/beetalk/sdk/g$l;->h:Lcom/beetalk/sdk/g$o;

    iput-object p1, p0, Lcom/beetalk/sdk/g$l;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/g;
    .locals 11

    new-instance v10, Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$l;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/beetalk/sdk/g$l;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/beetalk/sdk/g$l;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/beetalk/sdk/g$l;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/beetalk/sdk/g$l;->e:Lcom/beetalk/sdk/c;

    iget v6, p0, Lcom/beetalk/sdk/g$l;->g:I

    iget-object v7, p0, Lcom/beetalk/sdk/g$l;->h:Lcom/beetalk/sdk/g$o;

    iget-object v8, p0, Lcom/beetalk/sdk/g$l;->f:Lcom/beetalk/sdk/t/k;

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/beetalk/sdk/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/c;ILcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/t/k;Lcom/beetalk/sdk/g$e;)V

    return-object v10
.end method

.method public b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g$l;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g$l;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g$l;->e:Lcom/beetalk/sdk/c;

    return-object p0
.end method

.method public e(I)Lcom/beetalk/sdk/g$l;
    .locals 0

    iput p1, p0, Lcom/beetalk/sdk/g$l;->g:I

    return-object p0
.end method

.method public f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g$l;->h:Lcom/beetalk/sdk/g$o;

    return-object p0
.end method
