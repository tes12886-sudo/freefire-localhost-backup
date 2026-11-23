.class public Lcom/FF/voiceengine/MemberChange;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public isJoin:Z

.field public userID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/FF/voiceengine/MemberChange;->userID:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/FF/voiceengine/MemberChange;->isJoin:Z

    iput-object v0, p0, Lcom/FF/voiceengine/MemberChange;->userID:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/FF/voiceengine/MemberChange;->isJoin:Z

    return-void
.end method
