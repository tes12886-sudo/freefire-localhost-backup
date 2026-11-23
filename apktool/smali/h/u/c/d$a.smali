.class Lh/u/c/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/u/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lh/u/c/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh/u/c/g;

    invoke-static {}, Lh/u/c/d;->d()Lh/u/c/e;

    move-result-object v1

    invoke-interface {v1}, Lh/u/c/e;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Lh/u/c/g;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Lh/u/c/d$a;->a:Lh/u/c/g;

    return-void
.end method
