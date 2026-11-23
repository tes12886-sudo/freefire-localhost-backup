.class public abstract Lcom/twitter/sdk/android/core/identity/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected final a:I

.field private final b:Lj/g/a/a/a/p;

.field private final c:Lj/g/a/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lj/g/a/a/a/p;Lj/g/a/a/a/c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/p;",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/a;->b:Lj/g/a/a/a/p;

    iput-object p2, p0, Lcom/twitter/sdk/android/core/identity/a;->c:Lj/g/a/a/a/c;

    iput p3, p0, Lcom/twitter/sdk/android/core/identity/a;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/app/Activity;)Z
.end method

.method b()Lj/g/a/a/a/p;
    .locals 1

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/a;->b:Lj/g/a/a/a/p;

    return-object v0
.end method

.method c()Lj/g/a/a/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/a;->c:Lj/g/a/a/a/c;

    return-object v0
.end method

.method public d(IILandroid/content/Intent;)Z
    .locals 6

    iget v0, p0, Lcom/twitter/sdk/android/core/identity/a;->a:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/identity/a;->c()Lj/g/a/a/a/c;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    const-string p2, "tk"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "ts"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "screen_name"

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-string v4, "user_id"

    invoke-virtual {p3, v4, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    new-instance p3, Lj/g/a/a/a/j;

    new-instance v4, Lj/g/a/a/a/x;

    new-instance v5, Lj/g/a/a/a/r;

    invoke-direct {v5, p2, v0}, Lj/g/a/a/a/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, v5, v2, v3, v1}, Lj/g/a/a/a/x;-><init>(Lj/g/a/a/a/r;JLjava/lang/String;)V

    const/4 p2, 0x0

    invoke-direct {p3, v4, p2}, Lj/g/a/a/a/j;-><init>(Ljava/lang/Object;Lo/t;)V

    invoke-virtual {p1, p3}, Lj/g/a/a/a/c;->d(Lj/g/a/a/a/j;)V

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    new-instance p2, Lj/g/a/a/a/q;

    const-string p3, "Authorize canceled."

    invoke-direct {p2, p3}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, p2}, Lj/g/a/a/a/c;->c(Lj/g/a/a/a/v;)V

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    const-string p2, "auth_error"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Lj/g/a/a/a/q;

    goto :goto_0

    :cond_3
    new-instance p2, Lj/g/a/a/a/q;

    const-string p3, "Authorize failed."

    invoke-direct {p2, p3}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
