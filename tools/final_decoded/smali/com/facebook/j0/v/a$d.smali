.class final Lcom/facebook/j0/v/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/v/a;->x(Landroid/app/Application;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/j0/v/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/v/a$d;

    invoke-direct {v0}, Lcom/facebook/j0/v/a$d;-><init>()V

    sput-object v0, Lcom/facebook/j0/v/a$d;->a:Lcom/facebook/j0/v/a$d;

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

    invoke-static {}, Lcom/facebook/j0/r/b;->g()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/j0/r/b;->f()V

    :goto_0
    return-void
.end method
