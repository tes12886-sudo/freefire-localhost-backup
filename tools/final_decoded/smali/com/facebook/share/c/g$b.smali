.class public final Lcom/facebook/share/c/g$b;
.super Lcom/facebook/share/c/e$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/c/e$a<",
        "Lcom/facebook/share/c/g;",
        "Lcom/facebook/share/c/g$b;",
        ">;"
    }
.end annotation


# static fields
.field static final k:Ljava/lang/String; = "g$b"


# instance fields
.field private g:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private i:Landroid/net/Uri;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/share/c/e$a;-><init>()V

    return-void
.end method

.method static synthetic n(Lcom/facebook/share/c/g$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/g$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic o(Lcom/facebook/share/c/g$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/g$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/facebook/share/c/g$b;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/g$b;->i:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic q(Lcom/facebook/share/c/g$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/c/g$b;->j:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public r()Lcom/facebook/share/c/g;
    .locals 2

    new-instance v0, Lcom/facebook/share/c/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/c/g;-><init>(Lcom/facebook/share/c/g$b;Lcom/facebook/share/c/g$a;)V

    return-object v0
.end method

.method public s(Ljava/lang/String;)Lcom/facebook/share/c/g$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object p1, Lcom/facebook/share/c/g$b;->k:Ljava/lang/String;

    const-string v0, "This method does nothing. ContentDescription is deprecated in Graph API 2.9."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public t(Ljava/lang/String;)Lcom/facebook/share/c/g$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object p1, Lcom/facebook/share/c/g$b;->k:Ljava/lang/String;

    const-string v0, "This method does nothing. ContentTitle is deprecated in Graph API 2.9."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public u(Landroid/net/Uri;)Lcom/facebook/share/c/g$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object p1, Lcom/facebook/share/c/g$b;->k:Ljava/lang/String;

    const-string v0, "This method does nothing. ImageUrl is deprecated in Graph API 2.9."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method
