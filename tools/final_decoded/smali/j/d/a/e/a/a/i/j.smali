.class public Lj/d/a/e/a/a/i/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/e/a/a/i/e$a;


# instance fields
.field a:Ljava/lang/CharSequence;

.field b:I

.field c:J

.field d:J

.field e:J

.field f:Landroid/app/PendingIntent;

.field g:Landroid/app/Notification;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj/d/a/e/a/a/i/j;->c:J

    iput-wide v0, p0, Lj/d/a/e/a/a/i/j;->d:J

    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    iput-object v0, p0, Lj/d/a/e/a/a/i/j;->g:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lj/d/a/e/a/a/i/j;->c:J

    return-void
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Lj/d/a/e/a/a/i/j;->d:J

    return-void
.end method

.method public c(Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/j;->f:Landroid/app/PendingIntent;

    return-void
.end method

.method public d(Landroid/content/Context;)Landroid/app/Notification;
    .locals 12

    iget-object v0, p0, Lj/d/a/e/a/a/i/j;->g:Landroid/app/Notification;

    iget v1, p0, Lj/d/a/e/a/a/i/j;->b:I

    iput v1, v0, Landroid/app/Notification;->icon:I

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x8

    const/16 v4, 0xa

    if-le v2, v4, :cond_0

    or-int/2addr v1, v3

    iput v1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "status_bar_ongoing_event_progress_bar"

    invoke-static {p1, v4}, Lj/d/a/e/a/a/e;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v2, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    const-string v2, "title"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    iget-object v4, p0, Lj/d/a/e/a/a/i/j;->a:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const-string v2, "description"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    iget-wide v6, p0, Lj/d/a/e/a/a/i/j;->d:J

    iget-wide v8, p0, Lj/d/a/e/a/a/i/j;->c:J

    invoke-static {v6, v7, v8, v9}, Lj/d/a/e/a/a/e;->e(JJ)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const-string v2, "progress_bar_frame"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    const-string v2, "progress_bar"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    iget-wide v6, p0, Lj/d/a/e/a/a/i/j;->c:J

    shr-long v8, v6, v3

    long-to-int v4, v8

    iget-wide v8, p0, Lj/d/a/e/a/a/i/j;->d:J

    shr-long/2addr v8, v3

    long-to-int v3, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    cmp-long v11, v6, v8

    if-gtz v11, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v1, v2, v4, v3, v6}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    const-string v2, "time_remaining"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const-string v3, "time_remaining_notification"

    invoke-static {p1, v3}, Lj/d/a/e/a/a/e;->l(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    new-array v4, v10, [Ljava/lang/Object;

    iget-wide v6, p0, Lj/d/a/e/a/a/i/j;->e:J

    invoke-static {v6, v7}, Lj/d/a/e/a/a/e;->m(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const-string v2, "progress_text"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    iget-wide v3, p0, Lj/d/a/e/a/a/i/j;->d:J

    iget-wide v5, p0, Lj/d/a/e/a/a/i/j;->c:J

    invoke-static {v3, v4, v5, v6}, Lj/d/a/e/a/a/e;->d(JJ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const-string v2, "appIcon"

    invoke-static {p1, v2}, Lj/d/a/e/a/a/e;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iget v2, p0, Lj/d/a/e/a/a/i/j;->b:I

    invoke-virtual {v1, p1, v2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    iget-object p1, p0, Lj/d/a/e/a/a/i/j;->f:Landroid/app/PendingIntent;

    iput-object p1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public e(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method public f(J)V
    .locals 0

    iput-wide p1, p0, Lj/d/a/e/a/a/i/j;->e:J

    return-void
.end method

.method public setIcon(I)V
    .locals 0

    iput p1, p0, Lj/d/a/e/a/a/i/j;->b:I

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/j;->a:Ljava/lang/CharSequence;

    return-void
.end method
