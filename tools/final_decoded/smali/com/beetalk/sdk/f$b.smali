.class Lcom/beetalk/sdk/f$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/f;
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
.field final synthetic a:Lcom/beetalk/sdk/f;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/f;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/f$b;->a:Lcom/beetalk/sdk/f;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/f;Lcom/beetalk/sdk/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/f$b;-><init>(Lcom/beetalk/sdk/f;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;
    .locals 2

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/beetalk/sdk/f$b;->a:Lcom/beetalk/sdk/f;

    iget-object v1, v0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/f;->h(Lcom/beetalk/sdk/f;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lcom/beetalk/sdk/b$e;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/f$b;->a:Lcom/beetalk/sdk/f;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/f;->i(Lcom/beetalk/sdk/f;Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/f$b;->a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/beetalk/sdk/b$e;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/f$b;->b(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method
