.class public Lcom/dtd/freefireth/AndroidMouse;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;,
        Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;,
        Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;,
        Lcom/dtd/freefireth/AndroidMouse$MotionEventJSON;
    }
.end annotation


# static fields
.field public static final PRIMARY_BUTTON:I = 0x0

.field public static final SECONDARY_BUTTON:I = 0x1

.field public static final TERTIARY_BUTTON:I = 0x2

.field private static _InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

.field private static _OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

.field private static gson:Lj/d/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;-><init>(Lcom/dtd/freefireth/AndroidMouse$1;)V

    sput-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    new-instance v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    invoke-direct {v0, v1}, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;-><init>(Lcom/dtd/freefireth/AndroidMouse$1;)V

    sput-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    sput-object v0, Lcom/dtd/freefireth/AndroidMouse;->gson:Lj/d/d/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _hasPointerCapture()Z
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->hasPointerCapture()Z

    move-result v0

    return v0
.end method

.method public static getDeltaScrollHorizontal()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollH:F

    return v0
.end method

.method public static getDeltaScrollVertical()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollV:F

    return v0
.end method

.method public static getMouseDeltaX()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaX:F

    return v0
.end method

.method public static getMouseDeltaY()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaY:F

    return v0
.end method

.method public static getMouseX()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    return v0
.end method

.method public static getMouseY()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    return v0
.end method

.method public static getScrollHorizontal()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->ScrollH:F

    return v0
.end method

.method public static getScrollVertical()F
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->ScrollV:F

    return v0
.end method

.method public static hasPointerCapture()Z
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-boolean v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->HasPointerCapture:Z

    return v0
.end method

.method public static isPressingButton(I)Z
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-object v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    aget-object p0, v0, p0

    iget-boolean p0, p0, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->Pressing:Z

    return p0
.end method

.method public static justPressedButton(I)Z
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-object v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    aget-object p0, v0, p0

    iget-boolean p0, p0, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustPressed:Z

    return p0
.end method

.method public static justReleasedButton(I)Z
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-object v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    aget-object p0, v0, p0

    iget-boolean p0, p0, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustReleased:Z

    return p0
.end method

.method public static onCapturedPointer(Landroid/view/MotionEvent;)V
    .locals 4

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    iget v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaX:F

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    add-float/2addr v2, v3

    iput v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaX:F

    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaY:F

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    add-float/2addr v2, v3

    iput v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaY:F

    invoke-static {p0}, Lcom/dtd/freefireth/AndroidMouse;->updateInputMouseStatus(Landroid/view/MotionEvent;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static onGenericMotionEvent(Landroid/view/MotionEvent;)V
    .locals 3

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iput v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_X:F

    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iput v2, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_Y:F

    invoke-static {p0}, Lcom/dtd/freefireth/AndroidMouse;->updateInputMouseStatus(Landroid/view/MotionEvent;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static onUnityFrame()V
    .locals 8

    invoke-static {}, Lcom/dtd/freefireth/AndroidMouse;->_hasPointerCapture()Z

    move-result v0

    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-boolean v3, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->HasPointerCapture:Z

    const/4 v4, 0x0

    if-eq v3, v0, :cond_1

    iput-boolean v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->HasPointerCapture:Z

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaX:F

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaY:F

    sget-object v3, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-boolean v5, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    if-eqz v5, :cond_4

    if-nez v0, :cond_0

    iget v0, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_X:F

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    iget v0, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_Y:F

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    goto :goto_1

    :cond_0
    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    iput v4, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaX:F

    :goto_0
    iput v4, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaY:F

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-boolean v5, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    if-eqz v5, :cond_3

    if-eqz v0, :cond_2

    iget v0, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaX:F

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaX:F

    iget v5, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaY:F

    iput v5, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaY:F

    iget v6, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    add-float/2addr v6, v0

    iput v6, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    iget v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    add-float/2addr v0, v5

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    iput v4, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->CapturedPointer_DeltaX:F

    goto :goto_0

    :cond_2
    iget v0, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_X:F

    iget v5, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    sub-float v5, v0, v5

    iput v5, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaX:F

    iget v3, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->GenericMotionEvent_Y:F

    iget v5, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    sub-float v5, v3, v5

    iput v5, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaY:F

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->X:F

    iput v3, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Y:F

    goto :goto_1

    :cond_3
    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaX:F

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaY:F

    :cond_4
    :goto_1
    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-boolean v3, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_7

    iget v3, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->ScrollH:F

    iget v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollH:F

    sub-float v4, v3, v4

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollH:F

    iget v0, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->ScrollV:F

    iget v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollV:F

    sub-float v4, v0, v4

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollV:F

    iput v3, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->ScrollH:F

    iput v0, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->ScrollV:F

    const/4 v0, 0x0

    :goto_2
    sget-object v2, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-object v2, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Buttons:[Z

    array-length v3, v2

    if-ge v0, v3, :cond_8

    sget-object v3, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-object v3, v3, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    aget-object v4, v3, v0

    aget-object v6, v3, v0

    iget-boolean v6, v6, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->Pressing:Z

    const/4 v7, 0x1

    if-nez v6, :cond_5

    aget-boolean v6, v2, v0

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    iput-boolean v6, v4, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustPressed:Z

    aget-object v4, v3, v0

    aget-object v6, v3, v0

    iget-boolean v6, v6, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->Pressing:Z

    if-eqz v6, :cond_6

    aget-boolean v6, v2, v0

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    iput-boolean v7, v4, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustReleased:Z

    aget-object v3, v3, v0

    aget-boolean v4, v2, v0

    iput-boolean v4, v3, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->Pressing:Z

    aput-boolean v5, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollH:F

    iput v4, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->DeltaScrollV:F

    const/4 v0, 0x0

    :goto_5
    sget-object v2, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-object v2, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Buttons:[Z

    array-length v2, v2

    if-ge v0, v2, :cond_8

    sget-object v2, Lcom/dtd/freefireth/AndroidMouse;->_OutputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;

    iget-object v2, v2, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_UnityFrame;->Buttons:[Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;

    aget-object v3, v2, v0

    iput-boolean v5, v3, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustPressed:Z

    aget-object v2, v2, v0

    iput-boolean v5, v2, Lcom/dtd/freefireth/AndroidMouse$ButtonStatus;->JustReleased:Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_8
    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iput-boolean v5, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Dirty:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method public static registerCapturedPointerListener()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->registerCapturedPointerListener()V

    return-void
.end method

.method public static registerGenericMotionEventListener()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->registerGenericMotionEventListener()V

    return-void
.end method

.method public static releasePointerCapture()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->releasePointerCapture()V

    return-void
.end method

.method public static requestPointerCapture()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->requestPointerCapture()V

    return-void
.end method

.method private static sendMotionEventToUnity(Ljava/lang/String;Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public static unregisterCapturedPointerListener()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->unregisterCapturedPointerListener()V

    return-void
.end method

.method public static unregisterGenericMotionEventListener()V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/dtd/freefireth/FFMainActivity;->registerGenericMotionEventListener()V

    return-void
.end method

.method private static updateInputMouseStatus(Landroid/view/MotionEvent;)V
    .locals 4

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    iput v1, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->ScrollH:F

    sget-object v0, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    const/16 v1, 0x9

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    iput v1, v0, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->ScrollV:F

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/dtd/freefireth/AndroidMouse;->_InputStatus:Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;

    iget-object v1, v1, Lcom/dtd/freefireth/AndroidMouse$MouseStatus_RealTime;->Buttons:[Z

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-boolean v2, v1, v0

    const/4 v3, 0x1

    shl-int/2addr v3, v0

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->isButtonPressed(I)Z

    move-result v3

    or-int/2addr v2, v3

    aput-boolean v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
