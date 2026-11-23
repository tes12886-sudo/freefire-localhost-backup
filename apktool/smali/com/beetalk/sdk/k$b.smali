.class Lcom/beetalk/sdk/k$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/b$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/k;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/k;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/k$b;->a:Lcom/beetalk/sdk/k;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/k;Lcom/beetalk/sdk/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/k$b;-><init>(Lcom/beetalk/sdk/k;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;
    .locals 1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/beetalk/sdk/k$b;->a:Lcom/beetalk/sdk/k;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/k;->f(Lcom/beetalk/sdk/k;Ljava/lang/String;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lcom/beetalk/sdk/b$e;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/k$b;->a:Lcom/beetalk/sdk/k;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/k;->g(Lcom/beetalk/sdk/k;Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/k$b;->a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/beetalk/sdk/b$e;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/k$b;->b(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method
