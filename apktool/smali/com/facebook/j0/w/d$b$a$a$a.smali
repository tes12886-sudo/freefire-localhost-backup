.class final Lcom/facebook/j0/w/d$b$a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/j0/v/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/w/d$b$a$a;->a(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/w/d$b;

.field final synthetic b:Lcom/facebook/j0/w/b;


# direct methods
.method constructor <init>(Lcom/facebook/j0/w/d$b;Lcom/facebook/j0/w/b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/w/d$b$a$a$a;->a:Lcom/facebook/j0/w/d$b;

    iput-object p2, p0, Lcom/facebook/j0/w/d$b$a$a$a;->b:Lcom/facebook/j0/w/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)V
    .locals 2

    const-string v0, "file"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/j0/w/d$b$a$a$a;->a:Lcom/facebook/j0/w/d$b;

    iget-object v1, p0, Lcom/facebook/j0/w/d$b$a$a$a;->b:Lcom/facebook/j0/w/b;

    invoke-virtual {v0, v1}, Lcom/facebook/j0/w/d$b;->i(Lcom/facebook/j0/w/b;)V

    iget-object v0, p0, Lcom/facebook/j0/w/d$b$a$a$a;->a:Lcom/facebook/j0/w/d$b;

    invoke-virtual {v0, p1}, Lcom/facebook/j0/w/d$b;->k(Ljava/io/File;)V

    iget-object p1, p0, Lcom/facebook/j0/w/d$b$a$a$a;->a:Lcom/facebook/j0/w/d$b;

    invoke-static {p1}, Lcom/facebook/j0/w/d$b;->a(Lcom/facebook/j0/w/d$b;)Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
