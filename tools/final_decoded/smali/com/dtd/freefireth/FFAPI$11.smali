.class Lcom/dtd/freefireth/FFAPI$11;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/FFAPI;->relaunch(J)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$am:Landroid/app/AlarmManager;

.field final synthetic val$delayMS:J


# direct methods
.method constructor <init>(Landroid/app/AlarmManager;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/dtd/freefireth/FFAPI$11;->val$am:Landroid/app/AlarmManager;

    iput-wide p2, p0, Lcom/dtd/freefireth/FFAPI$11;->val$delayMS:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :try_start_0
    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lcom/dtd/freefireth/FFAPI$11;->val$am:Landroid/app/AlarmManager;

    const/4 v2, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/dtd/freefireth/FFAPI$11;->val$delayMS:J

    add-long/2addr v3, v5

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "FreeFire"

    const-string v2, "@FFAPI.scheduleLaunch() relaunching: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void

    :goto_1
    sget-object v1, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :cond_1
    throw v0
.end method
