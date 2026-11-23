.class public final enum Lcom/facebook/e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/e;

.field public static final enum c:Lcom/facebook/e;

.field public static final enum d:Lcom/facebook/e;

.field public static final enum e:Lcom/facebook/e;

.field public static final enum f:Lcom/facebook/e;

.field public static final enum g:Lcom/facebook/e;

.field public static final enum h:Lcom/facebook/e;

.field public static final enum i:Lcom/facebook/e;

.field private static final synthetic j:[Lcom/facebook/e;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0xc

    new-array v0, v0, [Lcom/facebook/e;

    new-instance v1, Lcom/facebook/e;

    const-string v2, "NONE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/e;

    const-string v2, "FACEBOOK_APPLICATION_WEB"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->b:Lcom/facebook/e;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/e;

    const-string v2, "FACEBOOK_APPLICATION_NATIVE"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "FACEBOOK_APPLICATION_SERVICE"

    const/4 v4, 0x3

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->c:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "WEB_VIEW"

    const/4 v4, 0x4

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->d:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "CHROME_CUSTOM_TAB"

    const/4 v4, 0x5

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->e:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "TEST_USER"

    const/4 v4, 0x6

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "CLIENT_TOKEN"

    const/4 v4, 0x7

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "DEVICE_AUTH"

    const/16 v4, 0x8

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->f:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "INSTAGRAM_APPLICATION_WEB"

    const/16 v4, 0x9

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->g:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "INSTAGRAM_CUSTOM_CHROME_TAB"

    const/16 v4, 0xa

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->h:Lcom/facebook/e;

    aput-object v1, v0, v4

    new-instance v1, Lcom/facebook/e;

    const-string v2, "INSTAGRAM_WEB_VIEW"

    const/16 v4, 0xb

    invoke-direct {v1, v2, v4, v3}, Lcom/facebook/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/facebook/e;->i:Lcom/facebook/e;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/e;->j:[Lcom/facebook/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/facebook/e;->a:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/e;
    .locals 1

    const-class v0, Lcom/facebook/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/e;

    return-object p0
.end method

.method public static values()[Lcom/facebook/e;
    .locals 1

    sget-object v0, Lcom/facebook/e;->j:[Lcom/facebook/e;

    invoke-virtual {v0}, [Lcom/facebook/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/e;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/e;->a:Z

    return v0
.end method
