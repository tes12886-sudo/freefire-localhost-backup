.class public final Lcom/facebook/j0/l;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:Lcom/facebook/j0/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/j0/k;->a:Lcom/facebook/j0/k;

    iput-object v0, p0, Lcom/facebook/j0/l;->b:Lcom/facebook/j0/k;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/facebook/j0/l;->a:I

    return v0
.end method

.method public final b()Lcom/facebook/j0/k;
    .locals 1

    iget-object v0, p0, Lcom/facebook/j0/l;->b:Lcom/facebook/j0/k;

    return-object v0
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/j0/l;->a:I

    return-void
.end method

.method public final d(Lcom/facebook/j0/k;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/j0/l;->b:Lcom/facebook/j0/k;

    return-void
.end method
