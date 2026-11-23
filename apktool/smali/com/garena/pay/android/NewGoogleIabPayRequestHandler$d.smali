.class Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->q(Landroid/app/Activity;Lcom/garena/pay/android/d;Ljava/lang/String;Li/g;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Ljava/lang/Boolean;",
        "Li/i<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/garena/pay/android/d;

.field final synthetic d:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->d:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iput-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->c:Lcom/garena/pay/android/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->b(Li/i;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Li/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->d:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;->c:Lcom/garena/pay/android/d;

    invoke-static {p1, v0, v1, v2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->w(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)Li/i;

    move-result-object p1

    return-object p1
.end method
