.class Lh/h/i/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/i/a;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh/h/i/f$c;

.field final synthetic b:Landroid/graphics/Typeface;


# direct methods
.method constructor <init>(Lh/h/i/a;Lh/h/i/f$c;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p2, p0, Lh/h/i/a$a;->a:Lh/h/i/f$c;

    iput-object p3, p0, Lh/h/i/a$a;->b:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh/h/i/a$a;->a:Lh/h/i/f$c;

    iget-object v1, p0, Lh/h/i/a$a;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lh/h/i/f$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
