.class public final Lh/h/l/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/l/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lh/h/l/e$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, Lh/h/l/e$b;

    invoke-direct {v0, p1, p2}, Lh/h/l/e$b;-><init>(Landroid/content/ClipData;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lh/h/l/e$d;

    invoke-direct {v0, p1, p2}, Lh/h/l/e$d;-><init>(Landroid/content/ClipData;I)V

    :goto_0
    iput-object v0, p0, Lh/h/l/e$a;->a:Lh/h/l/e$c;

    return-void
.end method


# virtual methods
.method public a()Lh/h/l/e;
    .locals 1

    iget-object v0, p0, Lh/h/l/e$a;->a:Lh/h/l/e$c;

    invoke-interface {v0}, Lh/h/l/e$c;->a()Lh/h/l/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Lh/h/l/e$a;
    .locals 1

    iget-object v0, p0, Lh/h/l/e$a;->a:Lh/h/l/e$c;

    invoke-interface {v0, p1}, Lh/h/l/e$c;->b(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public c(I)Lh/h/l/e$a;
    .locals 1

    iget-object v0, p0, Lh/h/l/e$a;->a:Lh/h/l/e$c;

    invoke-interface {v0, p1}, Lh/h/l/e$c;->d(I)V

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lh/h/l/e$a;
    .locals 1

    iget-object v0, p0, Lh/h/l/e$a;->a:Lh/h/l/e$c;

    invoke-interface {v0, p1}, Lh/h/l/e$c;->c(Landroid/net/Uri;)V

    return-object p0
.end method
