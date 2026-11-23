.class final Lcom/facebook/j0/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/e;->i(Lcom/facebook/j0/a;Lcom/facebook/j0/o;ZLcom/facebook/j0/l;)Lcom/facebook/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/a;

.field final synthetic b:Lcom/facebook/u;

.field final synthetic c:Lcom/facebook/j0/o;

.field final synthetic d:Lcom/facebook/j0/l;


# direct methods
.method constructor <init>(Lcom/facebook/j0/a;Lcom/facebook/u;Lcom/facebook/j0/o;Lcom/facebook/j0/l;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/e$b;->a:Lcom/facebook/j0/a;

    iput-object p2, p0, Lcom/facebook/j0/e$b;->b:Lcom/facebook/u;

    iput-object p3, p0, Lcom/facebook/j0/e$b;->c:Lcom/facebook/j0/o;

    iput-object p4, p0, Lcom/facebook/j0/e$b;->d:Lcom/facebook/j0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/facebook/x;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/j0/e$b;->a:Lcom/facebook/j0/a;

    iget-object v1, p0, Lcom/facebook/j0/e$b;->b:Lcom/facebook/u;

    iget-object v2, p0, Lcom/facebook/j0/e$b;->c:Lcom/facebook/j0/o;

    iget-object v3, p0, Lcom/facebook/j0/e$b;->d:Lcom/facebook/j0/l;

    invoke-static {v0, v1, p1, v2, v3}, Lcom/facebook/j0/e;->n(Lcom/facebook/j0/a;Lcom/facebook/u;Lcom/facebook/x;Lcom/facebook/j0/o;Lcom/facebook/j0/l;)V

    return-void
.end method
