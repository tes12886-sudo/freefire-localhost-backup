.class Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dtd/freefireth/AndroidMouse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ButtonStatus"
.end annotation


# instance fields
.field public JustPressed:Z

.field public JustReleased:Z

.field public Pressing:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/dtd/freefireth/AndroidMouse$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;-><init>()V

    return-void
.end method
