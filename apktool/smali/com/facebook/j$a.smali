.class public final Lcom/facebook/j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a()Lcom/facebook/j;
    .locals 1

    new-instance v0, Lcom/facebook/internal/e;

    invoke-direct {v0}, Lcom/facebook/internal/e;-><init>()V

    return-object v0
.end method
