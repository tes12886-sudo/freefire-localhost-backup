.class Lh/h/e/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/h/e/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/h/e/k;->h([Lh/h/i/f$b;I)Lh/h/i/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh/h/e/k$c<",
        "Lh/h/i/f$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lh/h/e/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh/h/i/f$b;

    invoke-virtual {p0, p1}, Lh/h/e/k$a;->c(Lh/h/i/f$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lh/h/i/f$b;

    invoke-virtual {p0, p1}, Lh/h/e/k$a;->d(Lh/h/i/f$b;)Z

    move-result p1

    return p1
.end method

.method public c(Lh/h/i/f$b;)I
    .locals 0

    invoke-virtual {p1}, Lh/h/i/f$b;->e()I

    move-result p1

    return p1
.end method

.method public d(Lh/h/i/f$b;)Z
    .locals 0

    invoke-virtual {p1}, Lh/h/i/f$b;->f()Z

    move-result p1

    return p1
.end method
