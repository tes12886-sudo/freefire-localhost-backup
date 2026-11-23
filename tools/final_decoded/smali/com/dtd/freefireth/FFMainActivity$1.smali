.class Lcom/dtd/freefireth/FFMainActivity$1;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/FFMainActivity;->watchBattery()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/dtd/freefireth/FFMainActivity;


# direct methods
.method constructor <init>(Lcom/dtd/freefireth/FFMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/dtd/freefireth/FFMainActivity$1;->this$0:Lcom/dtd/freefireth/FFMainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p2}, Lcom/dtd/freefireth/FFAPI;->updateBattery(Landroid/content/Intent;)V

    return-void
.end method
