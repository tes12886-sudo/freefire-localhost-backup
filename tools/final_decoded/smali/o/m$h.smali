.class final Lo/m$h;
.super Ll/v/e/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/m;->d(Ljava/lang/Exception;Ll/v/a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Ll/v/e/a/d;
    c = "retrofit2.KotlinExtensions"
    f = "KotlinExtensions.kt"
    l = {
        0x71
    }
    m = "suspendAndThrow"
.end annotation


# instance fields
.field synthetic d:Ljava/lang/Object;

.field e:I

.field f:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ll/v/a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll/v/e/a/c;-><init>(Ll/v/a;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo/m$h;->d:Ljava/lang/Object;

    iget p1, p0, Lo/m$h;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo/m$h;->e:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lo/m;->d(Ljava/lang/Exception;Ll/v/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
