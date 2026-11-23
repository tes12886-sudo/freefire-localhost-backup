.class Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dtd/freefireth/AndroidMouse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MouseStatus_UnityFrame"
.end annotation


# instance fields
.field public Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

.field public DeltaScrollH:F

.field public DeltaScrollV:F

.field public DeltaX:F

.field public DeltaY:F

.field public HasPointerCapture:Z

.field public ScrollH:F

.field public ScrollV:F

.field public X:F

.field public Y:F


# direct methods
.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    new-instance v1, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;-><init>(Lcom/dtd/freefireth/AndroidMouse$1;)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    invoke-direct {v1, v2}, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;-><init>(Lcom/dtd/freefireth/AndroidMouse$1;)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    invoke-direct {v1, v2}, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;-><init>(Lcom/dtd/freefireth/AndroidMouse$1;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    return-void
.end method

.method synthetic constructor <init>(Lcom/dtd/freefireth/AndroidMouse$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;-><init>()V

    return-void
.end method
