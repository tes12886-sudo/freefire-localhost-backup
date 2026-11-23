.class Lcom/facebook/login/y;
.super Lcom/facebook/login/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/y$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Lcom/facebook/internal/j0;

.field private f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/login/y$b;

    invoke-direct {v0}, Lcom/facebook/login/y$b;-><init>()V

    sput-object v0, Lcom/facebook/login/y;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/x;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/y;->f:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/facebook/login/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/x;-><init>(Lcom/facebook/login/l;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/y;->e:Lcom/facebook/internal/j0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/internal/j0;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/y;->e:Lcom/facebook/internal/j0;

    :cond_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    const-string v0, "web_view"

    return-object v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public q(Lcom/facebook/login/l$d;)I
    .locals 6

    invoke-virtual {p0, p1}, Lcom/facebook/login/x;->s(Lcom/facebook/login/l$d;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/facebook/login/y$a;

    invoke-direct {v1, p0, p1}, Lcom/facebook/login/y$a;-><init>(Lcom/facebook/login/y;Lcom/facebook/login/l$d;)V

    invoke-static {}, Lcom/facebook/login/l;->k()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/login/y;->f:Ljava/lang/String;

    const-string v3, "e2e"

    invoke-virtual {p0, v3, v2}, Lcom/facebook/login/q;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/login/l;->i()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/internal/h0;->S(Landroid/content/Context;)Z

    move-result v3

    new-instance v4, Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5, v0}, Lcom/facebook/login/y$c;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/facebook/login/y;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/facebook/login/y$c;->j(Ljava/lang/String;)Lcom/facebook/login/y$c;

    invoke-virtual {v4, v3}, Lcom/facebook/login/y$c;->l(Z)Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/login/y$c;->i(Ljava/lang/String;)Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->g()Lcom/facebook/login/k;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/login/y$c;->m(Lcom/facebook/login/k;)Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->h()Lcom/facebook/login/s;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/login/y$c;->n(Lcom/facebook/login/s;)Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->n()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/facebook/login/y$c;->k(Z)Lcom/facebook/login/y$c;

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->w()Z

    move-result p1

    invoke-virtual {v4, p1}, Lcom/facebook/login/y$c;->o(Z)Lcom/facebook/login/y$c;

    invoke-virtual {v4, v1}, Lcom/facebook/internal/j0$a;->h(Lcom/facebook/internal/j0$e;)Lcom/facebook/internal/j0$a;

    invoke-virtual {v4}, Lcom/facebook/internal/j0$a;->a()Lcom/facebook/internal/j0;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/y;->e:Lcom/facebook/internal/j0;

    new-instance p1, Lcom/facebook/internal/k;

    invoke-direct {p1}, Lcom/facebook/internal/k;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->F1(Z)V

    iget-object v1, p0, Lcom/facebook/login/y;->e:Lcom/facebook/internal/j0;

    invoke-virtual {p1, v1}, Lcom/facebook/internal/k;->b2(Landroid/app/Dialog;)V

    invoke-virtual {v2}, Landroidx/fragment/app/e;->s()Landroidx/fragment/app/n;

    move-result-object v1

    const-string v2, "FacebookDialogFragment"

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/d;->V1(Landroidx/fragment/app/n;Ljava/lang/String;)V

    return v0
.end method

.method v()Lcom/facebook/e;
    .locals 1

    sget-object v0, Lcom/facebook/e;->d:Lcom/facebook/e;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/facebook/login/q;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/facebook/login/y;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method z(Lcom/facebook/login/l$d;Landroid/os/Bundle;Lcom/facebook/n;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/login/x;->x(Lcom/facebook/login/l$d;Landroid/os/Bundle;Lcom/facebook/n;)V

    return-void
.end method
