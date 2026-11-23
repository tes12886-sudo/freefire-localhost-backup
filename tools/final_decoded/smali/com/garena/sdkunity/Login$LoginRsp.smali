.class public Lcom/garena/sdkunity/Login$LoginRsp;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/garena/sdkunity/Login;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LoginRsp"
.end annotation


# instance fields
.field public accessToken:Ljava/lang/String;

.field public errCode:I

.field public mainPlatform:I

.field public openID:Ljava/lang/String;

.field public platform:I

.field final synthetic this$0:Lcom/garena/sdkunity/Login;


# direct methods
.method public constructor <init>(Lcom/garena/sdkunity/Login;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/sdkunity/Login$LoginRsp;->this$0:Lcom/garena/sdkunity/Login;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
