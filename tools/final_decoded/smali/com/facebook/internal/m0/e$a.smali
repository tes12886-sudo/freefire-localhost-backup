.class final Lcom/facebook/internal/m0/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/m0/e;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/internal/m0/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/internal/m0/e$a;

    invoke-direct {v0}, Lcom/facebook/internal/m0/e$a;-><init>()V

    sput-object v0, Lcom/facebook/internal/m0/e$a;->a:Lcom/facebook/internal/m0/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    if-eqz p1, :cond_1

    sget-object p1, Lcom/facebook/internal/m0/h/a;->d:Lcom/facebook/internal/m0/h/a$a;

    invoke-virtual {p1}, Lcom/facebook/internal/m0/h/a$a;->a()V

    sget-object p1, Lcom/facebook/internal/p$b;->s:Lcom/facebook/internal/p$b;

    invoke-static {p1}, Lcom/facebook/internal/p;->g(Lcom/facebook/internal/p$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/facebook/internal/m0/a;->a()V

    invoke-static {}, Lcom/facebook/internal/m0/i/a;->a()V

    :cond_0
    sget-object p1, Lcom/facebook/internal/p$b;->t:Lcom/facebook/internal/p$b;

    invoke-static {p1}, Lcom/facebook/internal/p;->g(Lcom/facebook/internal/p$b;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/facebook/internal/m0/k/a;->a()V

    :cond_1
    return-void
.end method
