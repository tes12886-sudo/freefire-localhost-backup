.class public Lj/d/a/e/a/a/i/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/e/a/a/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/a/e/a/a/i/e$a;
    }
.end annotation


# static fields
.field static final m:I = -0x362ab24d


# instance fields
.field private a:I

.field private final b:Landroid/content/Context;

.field private final c:Landroid/app/NotificationManager;

.field private d:Ljava/lang/String;

.field private e:Lj/d/a/e/a/a/f;

.field final f:Lj/d/a/e/a/a/i/e$a;

.field private g:Landroid/app/Notification;

.field private h:Landroid/app/Notification;

.field private i:Ljava/lang/CharSequence;

.field private j:Ljava/lang/String;

.field private k:Landroid/app/PendingIntent;

.field private l:Lj/d/a/e/a/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lj/d/a/e/a/a/i/e;->a:I

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    iput-object p2, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    const-string p2, "notification"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->c:Landroid/app/NotificationManager;

    invoke-static {}, Lj/d/a/e/a/a/i/c;->a()Lj/d/a/e/a/a/i/e$a;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    new-instance p1, Landroid/app/Notification;

    invoke-direct {p1}, Landroid/app/Notification;-><init>()V

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->g:Landroid/app/Notification;

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->h:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->e:Lj/d/a/e/a/a/f;

    if-eqz v0, :cond_0

    iget v1, p0, Lj/d/a/e/a/a/i/e;->a:I

    invoke-interface {v0, v1}, Lj/d/a/e/a/a/f;->onDownloadStateChanged(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->k:Landroid/app/PendingIntent;

    return-void
.end method

.method public c(Landroid/os/Messenger;)V
    .locals 1

    invoke-static {p1}, Lj/d/a/e/a/a/c;->a(Landroid/os/Messenger;)Lj/d/a/e/a/a/f;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->e:Lj/d/a/e/a/a/f;

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->l:Lj/d/a/e/a/a/b;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lj/d/a/e/a/a/f;->onDownloadProgress(Lj/d/a/e/a/a/b;)V

    :cond_0
    iget p1, p0, Lj/d/a/e/a/a/i/e;->a:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->e:Lj/d/a/e/a/a/f;

    invoke-interface {v0, p1}, Lj/d/a/e/a/a/f;->onDownloadStateChanged(I)V

    :cond_1
    return-void
.end method

.method public onDownloadProgress(Lj/d/a/e/a/a/b;)V
    .locals 6

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->l:Lj/d/a/e/a/a/b;

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->e:Lj/d/a/e/a/a/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lj/d/a/e/a/a/f;->onDownloadProgress(Lj/d/a/e/a/a/b;)V

    :cond_0
    iget-wide v0, p1, Lj/d/a/e/a/a/b;->a:J

    const-wide/16 v2, 0x0

    const v4, 0x1080081

    cmp-long v5, v0, v2

    if-gtz v5, :cond_1

    new-instance p1, Landroid/app/Notification$Builder;

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v4}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->k:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->g:Landroid/app/Notification;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-wide v1, p1, Lj/d/a/e/a/a/b;->b:J

    invoke-interface {v0, v1, v2}, Lj/d/a/e/a/a/i/e$a;->b(J)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-wide v1, p1, Lj/d/a/e/a/a/b;->a:J

    invoke-interface {v0, v1, v2}, Lj/d/a/e/a/a/i/e$a;->a(J)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    invoke-interface {v0, v4}, Lj/d/a/e/a/a/i/e$a;->setIcon(I)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->k:Landroid/app/PendingIntent;

    invoke-interface {v0, v1}, Lj/d/a/e/a/a/i/e$a;->c(Landroid/app/PendingIntent;)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj/d/a/e/a/a/i/e;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lj/d/a/e/a/a/i/e$a;->e(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Lj/d/a/e/a/a/i/e$a;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-wide v1, p1, Lj/d/a/e/a/a/b;->c:J

    invoke-interface {v0, v1, v2}, Lj/d/a/e/a/a/i/e$a;->f(J)V

    iget-object p1, p0, Lj/d/a/e/a/a/i/e;->f:Lj/d/a/e/a/a/i/e$a;

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-interface {p1, v0}, Lj/d/a/e/a/a/i/e$a;->d(Landroid/content/Context;)Landroid/app/Notification;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->h:Landroid/app/Notification;

    iget-object p1, p0, Lj/d/a/e/a/a/i/e;->c:Landroid/app/NotificationManager;

    sget v0, Lj/d/a/e/a/a/i/e;->m:I

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->h:Landroid/app/Notification;

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public onDownloadStateChanged(I)V
    .locals 6

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->e:Lj/d/a/e/a/a/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lj/d/a/e/a/a/f;->onDownloadStateChanged(I)V

    :cond_0
    iget v0, p0, Lj/d/a/e/a/a/i/e;->a:I

    if-eq p1, v0, :cond_7

    iput p1, p0, Lj/d/a/e/a/a/i/e;->a:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->k:Landroid/app/PendingIntent;

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const v1, 0x1080082

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x108008a

    if-eqz p1, :cond_5

    const/4 v5, 0x7

    if-eq p1, v5, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v5, 0x3

    if-eq p1, v5, :cond_3

    const/4 v5, 0x4

    if-eq p1, v5, :cond_2

    const/4 v5, 0x5

    if-eq p1, v5, :cond_4

    packed-switch p1, :pswitch_data_0

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-static {v1, p1}, Lj/d/a/e/a/a/e;->f(Landroid/content/Context;I)I

    move-result p1

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lj/d/a/e/a/a/e;->f(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_2
    const v1, 0x1080081

    :cond_3
    iget-object v3, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-static {v3, p1}, Lj/d/a/e/a/a/e;->f(Landroid/content/Context;I)I

    move-result p1

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lj/d/a/e/a/a/e;->f(Landroid/content/Context;I)I

    move-result p1

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    const-string v0, "state_unknown"

    invoke-static {p1, v0}, Lj/d/a/e/a/a/e;->l(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    :goto_0
    const/4 v0, 0x0

    :goto_1
    const v1, 0x108008a

    :goto_2
    iget-object v3, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-virtual {v3, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->j:Ljava/lang/String;

    iget-object p1, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->d:Ljava/lang/String;

    new-instance p1, Landroid/app/Notification$Builder;

    iget-object v3, p0, Lj/d/a/e/a/a/i/e;->b:Landroid/content/Context;

    invoke-direct {p1, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lj/d/a/e/a/a/i/e;->i:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lj/d/a/e/a/a/i/e;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->d:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->j:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v1, p0, Lj/d/a/e/a/a/i/e;->k:Landroid/app/PendingIntent;

    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/e;->h:Landroid/app/Notification;

    if-eqz v0, :cond_6

    iget v0, p1, Landroid/app/Notification;->flags:I

    or-int/2addr v0, v2

    goto :goto_3

    :cond_6
    iget v0, p1, Landroid/app/Notification;->flags:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p1, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    :goto_3
    iput v0, p1, Landroid/app/Notification;->flags:I

    iget-object v0, p0, Lj/d/a/e/a/a/i/e;->c:Landroid/app/NotificationManager;

    sget v1, Lj/d/a/e/a/a/i/e;->m:I

    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    nop

    :cond_7
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onServiceConnected(Landroid/os/Messenger;)V
    .locals 0

    return-void
.end method
