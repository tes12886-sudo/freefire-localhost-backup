.class final Lh/h/l/e$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/h/l/e$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/l/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field a:Landroid/content/ClipData;

.field b:I

.field c:I

.field d:Landroid/net/Uri;

.field e:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/h/l/e$d;->a:Landroid/content/ClipData;

    iput p2, p0, Lh/h/l/e$d;->b:I

    return-void
.end method


# virtual methods
.method public a()Lh/h/l/e;
    .locals 2

    new-instance v0, Lh/h/l/e;

    new-instance v1, Lh/h/l/e$g;

    invoke-direct {v1, p0}, Lh/h/l/e$g;-><init>(Lh/h/l/e$d;)V

    invoke-direct {v0, v1}, Lh/h/l/e;-><init>(Lh/h/l/e$f;)V

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lh/h/l/e$d;->e:Landroid/os/Bundle;

    return-void
.end method

.method public c(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lh/h/l/e$d;->d:Landroid/net/Uri;

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lh/h/l/e$d;->c:I

    return-void
.end method
