.class public final Lcom/facebook/internal/p$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/p$a;

.field final synthetic b:Lcom/facebook/internal/p$b;


# direct methods
.method constructor <init>(Lcom/facebook/internal/p$a;Lcom/facebook/internal/p$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/p$c;->a:Lcom/facebook/internal/p$a;

    iput-object p2, p0, Lcom/facebook/internal/p$c;->b:Lcom/facebook/internal/p$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/internal/p$c;->a:Lcom/facebook/internal/p$a;

    iget-object v1, p0, Lcom/facebook/internal/p$c;->b:Lcom/facebook/internal/p$b;

    invoke-static {v1}, Lcom/facebook/internal/p;->g(Lcom/facebook/internal/p$b;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/facebook/internal/p$a;->a(Z)V

    return-void
.end method
