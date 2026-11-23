.class Lcom/seagroup/gamesdk/MambetSdkLibrary$4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/seagroup/gamesdk/MambetSdkLibrary;->retrySend(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

.field final synthetic val$sdkEventString:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iput-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;->val$sdkEventString:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1308(Lcom/seagroup/gamesdk/MambetSdkLibrary;)I

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;->val$sdkEventString:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$400(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    const-string v0, "MambetSDK"

    const-string v1, "retry uploading events..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
