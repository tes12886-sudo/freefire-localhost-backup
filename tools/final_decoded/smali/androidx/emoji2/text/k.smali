.class public Landroidx/emoji2/text/k;
.super Landroidx/emoji2/text/g$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/k$a;,
        Landroidx/emoji2/text/k$b;,
        Landroidx/emoji2/text/k$c;
    }
.end annotation


# static fields
.field private static final j:Landroidx/emoji2/text/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/k$a;

    invoke-direct {v0}, Landroidx/emoji2/text/k$a;-><init>()V

    sput-object v0, Landroidx/emoji2/text/k;->j:Landroidx/emoji2/text/k$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh/h/i/d;)V
    .locals 2

    new-instance v0, Landroidx/emoji2/text/k$b;

    sget-object v1, Landroidx/emoji2/text/k;->j:Landroidx/emoji2/text/k$a;

    invoke-direct {v0, p1, p2, v1}, Landroidx/emoji2/text/k$b;-><init>(Landroid/content/Context;Lh/h/i/d;Landroidx/emoji2/text/k$a;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/g$c;-><init>(Landroidx/emoji2/text/g$g;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/concurrent/Executor;)Landroidx/emoji2/text/k;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/g$c;->a()Landroidx/emoji2/text/g$g;

    move-result-object v0

    check-cast v0, Landroidx/emoji2/text/k$b;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/k$b;->g(Ljava/util/concurrent/Executor;)V

    return-object p0
.end method
