.class public Lcom/dts/freefireth/FFLocalNotification;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INTENT_EXTRA_LOCAL_NOTIFICATION_INDEX_NAME:Ljava/lang/String; = "LocalNotificationIndex"

.field public static final INTENT_EXTRA_LOCAL_NOTIFICATION_NAME:Ljava/lang/String; = "LocalNotification"

.field public static final INTENT_EXTRA_NOTIFY_TYPE:Ljava/lang/String; = "FreeFireNotifyType"

.field public static final SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATIONS:Ljava/lang/String; = "LocalNotifications"

.field public static final SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATION_RECORDS:Ljava/lang/String; = "LocalNotificationRecords"

.field public static final SHARED_PREFERENCE_NAME:Ljava/lang/String; = "FreeFireSharedPreference"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static _hideAllLocalNotifications(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/core/app/l;->d()V

    return-void
.end method

.method public static _hideLocalNotification(Landroid/content/Context;I)V
    .locals 0

    invoke-static {p0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/core/app/l;->b(I)V

    return-void
.end method

.method private static _loadLocalNotifcations(Landroid/content/Context;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/dts/freefireth/_FFLocalNotification;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    const-string v1, "FreeFireSharedPreference"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v1, "LocalNotifications"

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Lcom/dts/freefireth/FFLocalNotification$1;

    invoke-direct {v2}, Lcom/dts/freefireth/FFLocalNotification$1;-><init>()V

    invoke-virtual {v2}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lj/d/d/e;->l(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;
    :try_end_0
    .catch Lj/d/d/s; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    :catch_0
    :cond_0
    return-object v1
.end method

.method private static _loadLocalNotificationRecords(Landroid/content/Context;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    invoke-static {p0}, Lcom/dts/freefireth/FFLocalNotification;->_readLocalNotificationRecords(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    new-instance v2, Lcom/dts/freefireth/FFLocalNotification$2;

    invoke-direct {v2}, Lcom/dts/freefireth/FFLocalNotification$2;-><init>()V

    invoke-virtual {v2}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lj/d/d/e;->l(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;
    :try_end_0
    .catch Lj/d/d/s; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    :catch_0
    :cond_1
    return-object v1
.end method

.method private static _readLocalNotificationRecords(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "FreeFireSharedPreference"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "LocalNotificationRecords"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static _recordLocalNotification(Landroid/content/Context;I)V
    .locals 3

    invoke-static {p0}, Lcom/dts/freefireth/FFLocalNotification;->_loadLocalNotificationRecords(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotificationRecords(Landroid/content/Context;Ljava/util/HashMap;)V

    return-void
.end method

.method static _rescheduleAllLocalNotifications(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Lcom/dts/freefireth/FFLocalNotification;->_loadLocalNotifcations(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dts/freefireth/_FFLocalNotification;

    invoke-static {p0, v2}, Lcom/dts/freefireth/FFLocalNotification;->_scheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotifications(Landroid/content/Context;Ljava/util/HashMap;)V

    return-void
.end method

.method private static _saveLocalNotificationRecords(Landroid/content/Context;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    const-string v1, "FreeFireSharedPreference"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "LocalNotificationRecords"

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method static _saveLocalNotifications(Landroid/content/Context;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/dts/freefireth/_FFLocalNotification;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    const-string v1, "FreeFireSharedPreference"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-virtual {v0, p1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "LocalNotifications"

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method static _scheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V
    .locals 8

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iget-wide v1, p1, Lcom/dts/freefireth/_FFLocalNotification;->time_ms:J

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget v5, p1, Lcom/dts/freefireth/_FFLocalNotification;->repeat_times:I

    if-gt v4, v5, :cond_0

    iget v5, p1, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {v5, v4}, Lcom/dts/freefireth/FFLocalNotification;->getLocalNotificationRequestCode(II)I

    move-result v5

    invoke-static {p0, p1, v4}, Lcom/dts/freefireth/FFLocalNotification;->getLocalNotificationIntent(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;I)Landroid/content/Intent;

    move-result-object v6

    const/high16 v7, 0x14000000

    invoke-static {p0, v5, v6, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v0, v3, v1, v2, v5}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    iget v5, p1, Lcom/dts/freefireth/_FFLocalNotification;->repeat_interval_ms:I

    int-to-long v5, v5

    add-long/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static _showLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V
    .locals 7

    iget v0, p1, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_hideLocalNotification(Landroid/content/Context;I)V

    iget-object v0, p1, Lcom/dts/freefireth/_FFLocalNotification;->channel_id:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->isChannelEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/dts/freefireth/FFMainActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p1, Lcom/dts/freefireth/_FFLocalNotification;->uri:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget v2, p1, Lcom/dts/freefireth/_FFLocalNotification;->notify_type:I

    const-string v3, "FreeFireNotifyType"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v2, 0x0

    const/high16 v3, 0xc000000

    invoke-static {p0, v2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroidx/core/app/i$e;

    iget-object v3, p1, Lcom/dts/freefireth/_FFLocalNotification;->channel_id:Ljava/lang/String;

    invoke-direct {v2, p0, v3}, Landroidx/core/app/i$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v3, p1, Lcom/dts/freefireth/_FFLocalNotification;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroidx/core/app/i$e;->k(Ljava/lang/CharSequence;)Landroidx/core/app/i$e;

    iget-object v3, p1, Lcom/dts/freefireth/_FFLocalNotification;->content:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroidx/core/app/i$e;->j(Ljava/lang/CharSequence;)Landroidx/core/app/i$e;

    invoke-virtual {v2, v1}, Landroidx/core/app/i$e;->i(Landroid/app/PendingIntent;)Landroidx/core/app/i$e;

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Landroidx/core/app/i$e;->f(Z)Landroidx/core/app/i$e;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    const/16 v4, 0x15

    if-ge v1, v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "android.resource://"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/dts/freefireth/variant/FreeFireBuildVariant;->GetPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "raw"

    const-string v6, "fflogo"

    invoke-static {p0, v5, v6}, Lcom/dts/freefireth/FFAPI;->R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    if-lt v1, v4, :cond_1

    const/4 v5, 0x5

    invoke-virtual {v2, v3, v5}, Landroidx/core/app/i$e;->w(Landroid/net/Uri;I)Landroidx/core/app/i$e;

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, Landroidx/core/app/i$e;->v(Landroid/net/Uri;)Landroidx/core/app/i$e;

    :cond_2
    :goto_0
    const/16 v3, 0x17

    const-string v5, "notify_icon"

    if-lt v1, v3, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {p0, v5}, Lcom/dts/freefireth/FFAPI;->R_drawable(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    invoke-static {v3, v6}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/core/app/i$e;->o(Landroid/graphics/Bitmap;)Landroidx/core/app/i$e;

    :cond_3
    if-lt v1, v4, :cond_4

    const-string v1, "small_icon"

    invoke-static {p0, v1}, Lcom/dts/freefireth/FFAPI;->R_drawable(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_4
    invoke-static {p0, v5}, Lcom/dts/freefireth/FFAPI;->R_drawable(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    :goto_1
    invoke-virtual {v2, v1}, Landroidx/core/app/i$e;->u(I)Landroidx/core/app/i$e;

    iget v1, p1, Lcom/dts/freefireth/_FFLocalNotification;->notify_type:I

    invoke-static {p0, v1}, Lcom/dts/freefireth/FFLocalNotification;->_recordLocalNotification(Landroid/content/Context;I)V

    invoke-virtual {v2}, Landroidx/core/app/i$e;->b()Landroid/app/Notification;

    move-result-object p0

    iget p1, p1, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-virtual {v0, p1, p0}, Landroidx/core/app/l;->k(ILandroid/app/Notification;)V

    return-void
.end method

.method static _unscheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V
    .locals 5

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    const/4 v1, 0x0

    :goto_0
    iget v2, p1, Lcom/dts/freefireth/_FFLocalNotification;->repeat_times:I

    if-gt v1, v2, :cond_1

    iget v2, p1, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {v2, v1}, Lcom/dts/freefireth/FFLocalNotification;->getLocalNotificationRequestCode(II)I

    move-result v2

    invoke-static {p0, p1, v1}, Lcom/dts/freefireth/FFLocalNotification;->getLocalNotificationIntent(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;I)Landroid/content/Intent;

    move-result-object v3

    const/high16 v4, 0x24000000

    invoke-static {p0, v2, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method static _unsheduleAllLocalNotifications(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Lcom/dts/freefireth/FFLocalNotification;->_loadLocalNotifcations(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dts/freefireth/_FFLocalNotification;

    invoke-static {p0, v2}, Lcom/dts/freefireth/FFLocalNotification;->_unscheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotifications(Landroid/content/Context;Ljava/util/HashMap;)V

    return-void
.end method

.method public static areNotificationsEnabled()Z
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/l;->a()Z

    move-result v0

    return v0
.end method

.method public static clearAllNotifications()V
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/l;->d()V

    :cond_0
    return-void
.end method

.method public static clearLocalNotificationRecords()V
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotificationRecords(Landroid/content/Context;Ljava/util/HashMap;)V

    return-void
.end method

.method private static getLocalNotificationIntent(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;I)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.dts.freefireth.action.LOCAL_NOTIFICATION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/dts/freefireth/FFBroadcastReceiver;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "LocalNotification"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string p0, "LocalNotificationIndex"

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p0, p1, Lcom/dts/freefireth/_FFLocalNotification;->uri:Ljava/lang/String;

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object v0
.end method

.method private static getLocalNotificationRequestCode(II)I
    .locals 0

    mul-int/lit16 p0, p0, 0x3e8

    add-int/2addr p0, p1

    return p0
.end method

.method public static gotoChannelNotificationSettings(I)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.CHANNEL_NOTIFICATION_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.provider.extra.APP_PACKAGE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.provider.extra.CHANNEL_ID"

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static hasNotificationChannels()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isChannelEnabled(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    invoke-static {p0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object p0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/core/app/l;->h(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/NotificationChannel;->getImportance()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/app/NotificationChannel;->getGroup()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/core/app/l;->i(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/NotificationChannelGroup;->isBlocked()Z

    move-result p0

    if-eqz p0, :cond_1

    return v2

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static isNotificationChannelEnabled(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0, p0}, Lcom/dts/freefireth/FFLocalNotification;->isChannelEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static readLocalNotificationRecords()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0}, Lcom/dts/freefireth/FFLocalNotification;->_readLocalNotificationRecords(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static scheduleLocalNotification(IILjava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/dts/freefireth/_FFLocalNotification;

    invoke-direct {v0}, Lcom/dts/freefireth/_FFLocalNotification;-><init>()V

    iput p1, v0, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    iput-object p9, v0, Lcom/dts/freefireth/_FFLocalNotification;->channel_id:Ljava/lang/String;

    iput-object p2, v0, Lcom/dts/freefireth/_FFLocalNotification;->title:Ljava/lang/String;

    iput-object p3, v0, Lcom/dts/freefireth/_FFLocalNotification;->content:Ljava/lang/String;

    iput-wide p4, v0, Lcom/dts/freefireth/_FFLocalNotification;->time_ms:J

    iput p6, v0, Lcom/dts/freefireth/_FFLocalNotification;->repeat_interval_ms:I

    iput p7, v0, Lcom/dts/freefireth/_FFLocalNotification;->repeat_times:I

    iput-object p8, v0, Lcom/dts/freefireth/_FFLocalNotification;->uri:Ljava/lang/String;

    iput p0, v0, Lcom/dts/freefireth/_FFLocalNotification;->notify_type:I

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0}, Lcom/dts/freefireth/FFLocalNotification;->_loadLocalNotifcations(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object p0

    iget p1, v0, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, v0, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Lcom/dts/freefireth/_FFLocalNotification;->notification_id:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p1, p0}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotifications(Landroid/content/Context;Ljava/util/HashMap;)V

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_scheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V

    return-void
.end method

.method public static setLocalNotificationChannel(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, p0, p2, p1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, p3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "android.resource://"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/dts/freefireth/variant/FreeFireBuildVariant;->GetPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "raw"

    const-string p3, "fflogo"

    invoke-static {p1, p2, p3}, Lcom/dts/freefireth/FFAPI;->R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0}, Landroidx/core/app/l;->f(Landroid/content/Context;)Landroidx/core/app/l;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/core/app/l;->e(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public static unscheduleAllLocalNotifications()V
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0}, Lcom/dts/freefireth/FFLocalNotification;->_unsheduleAllLocalNotifications(Landroid/content/Context;)V

    return-void
.end method

.method public static unscheduleLocalNotification(I)V
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0}, Lcom/dts/freefireth/FFLocalNotification;->_loadLocalNotifcations(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/dts/freefireth/_FFLocalNotification;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFLocalNotification;->_saveLocalNotifications(Landroid/content/Context;Ljava/util/HashMap;)V

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, v1}, Lcom/dts/freefireth/FFLocalNotification;->_unscheduleLocalNotification(Landroid/content/Context;Lcom/dts/freefireth/_FFLocalNotification;)V

    return-void
.end method
