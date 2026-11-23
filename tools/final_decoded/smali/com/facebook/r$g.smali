.class final Lcom/facebook/r$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/r;->E(Landroid/content/Context;Lcom/facebook/r$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/r$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/r$g;

    invoke-direct {v0}, Lcom/facebook/r$g;-><init>()V

    sput-object v0, Lcom/facebook/r$g;->a:Lcom/facebook/r$g;

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

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/facebook/j0/i;->a()V

    :cond_0
    return-void
.end method
