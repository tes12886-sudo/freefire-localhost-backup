.class final Lo/p$h;
.super Lo/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/p<",
        "Lm/u;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 0

    invoke-direct {p0}, Lo/p;-><init>()V

    iput-object p1, p0, Lo/p$h;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lo/p$h;->b:I

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lo/r;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    check-cast p2, Lm/u;

    invoke-virtual {p0, p1, p2}, Lo/p$h;->d(Lo/r;Lm/u;)V

    return-void
.end method

.method d(Lo/r;Lm/u;)V
    .locals 2
    .param p2    # Lm/u;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lo/r;->c(Lm/u;)V

    return-void

    :cond_0
    iget-object p1, p0, Lo/p$h;->a:Ljava/lang/reflect/Method;

    iget p2, p0, Lo/p$h;->b:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Headers parameter must not be null."

    invoke-static {p1, p2, v1, v0}, Lo/y;->o(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
