.class public Lh/h/e/e$a;
.super Lh/h/i/f$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/h/e/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/core/content/d/h$d;


# direct methods
.method public constructor <init>(Landroidx/core/content/d/h$d;)V
    .locals 0

    invoke-direct {p0}, Lh/h/i/f$c;-><init>()V

    iput-object p1, p0, Lh/h/e/e$a;->a:Landroidx/core/content/d/h$d;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lh/h/e/e$a;->a:Landroidx/core/content/d/h$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/core/content/d/h$d;->d(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lh/h/e/e$a;->a:Landroidx/core/content/d/h$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/core/content/d/h$d;->e(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
