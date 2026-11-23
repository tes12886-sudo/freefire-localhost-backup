.class final Lcom/facebook/j0/i$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/i$a;->b(Lcom/facebook/internal/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/j0/i$a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/i$a$e;

    invoke-direct {v0}, Lcom/facebook/j0/i$a$e;-><init>()V

    sput-object v0, Lcom/facebook/j0/i$a$e;->a:Lcom/facebook/j0/i$a$e;

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

    invoke-static {}, Lcom/facebook/j0/t/f;->a()V

    :cond_0
    return-void
.end method
