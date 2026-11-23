.class Lcom/twitter/sdk/android/core/identity/h$b;
.super Lj/g/a/a/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/twitter/sdk/android/core/identity/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/g/a/a/a/c<",
        "Lj/g/a/a/a/x;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/g/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/l<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lj/g/a/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lj/g/a/a/a/l;Lj/g/a/a/a/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/l<",
            "Lj/g/a/a/a/x;",
            ">;",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj/g/a/a/a/c;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/h$b;->a:Lj/g/a/a/a/l;

    iput-object p2, p0, Lcom/twitter/sdk/android/core/identity/h$b;->b:Lj/g/a/a/a/c;

    return-void
.end method


# virtual methods
.method public c(Lj/g/a/a/a/v;)V
    .locals 3

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Authorization completed with an error"

    invoke-interface {v0, v1, v2, p1}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/h$b;->b:Lj/g/a/a/a/c;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/c;->c(Lj/g/a/a/a/v;)V

    return-void
.end method

.method public d(Lj/g/a/a/a/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/j<",
            "Lj/g/a/a/a/x;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Authorization completed successfully"

    invoke-interface {v0, v1, v2}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/h$b;->a:Lj/g/a/a/a/l;

    iget-object v1, p1, Lj/g/a/a/a/j;->a:Ljava/lang/Object;

    check-cast v1, Lj/g/a/a/a/x;

    invoke-interface {v0, v1}, Lj/g/a/a/a/l;->a(Lj/g/a/a/a/k;)V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/h$b;->b:Lj/g/a/a/a/c;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/c;->d(Lj/g/a/a/a/j;)V

    return-void
.end method
