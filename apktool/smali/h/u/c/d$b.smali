.class Lh/u/c/d$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/u/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Lh/u/c/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lh/u/c/d;->a()Lh/u/c/e;

    move-result-object v0

    sput-object v0, Lh/u/c/d$b;->a:Lh/u/c/e;

    return-void
.end method
