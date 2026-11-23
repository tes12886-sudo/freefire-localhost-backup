.class final Lo/p$o;
.super Lo/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/p<",
        "Lm/y$b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lo/p$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/p$o;

    invoke-direct {v0}, Lo/p$o;-><init>()V

    sput-object v0, Lo/p$o;->a:Lo/p$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo/p;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lo/r;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    check-cast p2, Lm/y$b;

    invoke-virtual {p0, p1, p2}, Lo/p$o;->d(Lo/r;Lm/y$b;)V

    return-void
.end method

.method d(Lo/r;Lm/y$b;)V
    .locals 0
    .param p2    # Lm/y$b;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lo/r;->e(Lm/y$b;)V

    :cond_0
    return-void
.end method
