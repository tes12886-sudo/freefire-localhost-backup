.class Lj/d/a/e/a/a/d$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/e/a/a/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lj/d/a/e/a/a/g;

.field final b:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Lj/d/a/e/a/a/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj/d/a/e/a/a/d$b;->a:Lj/d/a/e/a/a/g;

    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lj/d/a/e/a/a/d$b$a;

    invoke-direct {v1, p0}, Lj/d/a/e/a/a/d$b$a;-><init>(Lj/d/a/e/a/a/d$b;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lj/d/a/e/a/a/d$b;->b:Landroid/os/Messenger;

    iput-object p1, p0, Lj/d/a/e/a/a/d$b;->a:Lj/d/a/e/a/a/g;

    return-void
.end method

.method static synthetic d(Lj/d/a/e/a/a/d$b;)Lj/d/a/e/a/a/g;
    .locals 0

    iget-object p0, p0, Lj/d/a/e/a/a/d$b;->a:Lj/d/a/e/a/a/g;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public b()Landroid/os/Messenger;
    .locals 1

    iget-object v0, p0, Lj/d/a/e/a/a/d$b;->b:Landroid/os/Messenger;

    return-object v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 0

    return-void
.end method
