.class public Lcom/dtd/freefireth/FFApplication;
.super Lcom/ano/gshell/AnoApplication;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/ano/gshell/AnoApplication;-><init>()V

    return-void
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ano/gshell/AnoApplication;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p0}, Lh/r/a;->k(Landroid/content/Context;)V

    return-void
.end method

.method public onCreate()V
    .locals 0

    invoke-super {p0}, Lcom/ano/gshell/AnoApplication;->onCreate()V

    return-void
.end method
