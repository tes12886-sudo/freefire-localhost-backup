.class Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnCapturedPointerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dtd/freefireth/FFMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CapturedPointerListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/dtd/freefireth/FFMainActivity;


# direct methods
.method private constructor <init>(Lcom/dtd/freefireth/FFMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;->this$0:Lcom/dtd/freefireth/FFMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/dtd/freefireth/FFMainActivity;Lcom/dtd/freefireth/FFMainActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    return-void
.end method


# virtual methods
.method public onCapturedPointer(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p2}, Lcom/dtd/freefireth/AndroidMouse;->onCapturedPointer(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method
