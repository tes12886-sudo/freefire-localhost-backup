.class Lcom/beetalk/sdk/o$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/o;
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
.field final synthetic a:Lcom/beetalk/sdk/o;


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/o;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/o$b;->a:Lcom/beetalk/sdk/o;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/o;Lcom/beetalk/sdk/o$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/o$b;-><init>(Lcom/beetalk/sdk/o;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;
    .locals 2

    const/4 v0, 0x0

    aget-object p1, p1, v0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/beetalk/sdk/x/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/o$b;->a:Lcom/beetalk/sdk/o;

    iget-object v1, v0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/o;->f(Lcom/beetalk/sdk/o;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/beetalk/sdk/o$b;->a:Lcom/beetalk/sdk/o;

    iget-object p1, p1, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    sget-object v0, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lcom/beetalk/sdk/b$e;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/o$b;->a:Lcom/beetalk/sdk/o;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/o;->g(Lcom/beetalk/sdk/o;Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/o$b;->a([Ljava/lang/String;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/beetalk/sdk/b$e;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/o$b;->b(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method
