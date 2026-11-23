.class Lj/c/a/e/a$b;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/a;


# direct methods
.method private constructor <init>(Lj/c/a/e/a;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/a$b;->a:Lj/c/a/e/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj/c/a/e/a;Lj/c/a/e/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/c/a/e/a$b;-><init>(Lj/c/a/e/a;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj/c/a/e/a$b;->a:Lj/c/a/e/a;

    invoke-virtual {v0, p1}, Lj/c/a/e/a;->d(Landroid/os/Message;)V

    goto :goto_1

    :pswitch_0
    const-string v0, "MSG_SELFDESTRUCT"

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/a$b;->a:Lj/c/a/e/a;

    invoke-virtual {v0}, Lj/c/a/e/a;->g()V

    const/4 v0, 0x3

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    :goto_0
    invoke-static {v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/a$b;->a:Lj/c/a/e/a;

    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {v1, p1, v0}, Lj/c/a/e/a;->h(Landroid/os/Messenger;Landroid/os/Message;)V

    :goto_1
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2707
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
