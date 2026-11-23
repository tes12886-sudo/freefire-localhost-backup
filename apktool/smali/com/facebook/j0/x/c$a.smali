.class public final enum Lcom/facebook/j0/x/c$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/x/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/j0/x/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/j0/x/c$a;

.field public static final enum c:Lcom/facebook/j0/x/c$a;

.field private static final synthetic d:[Lcom/facebook/j0/x/c$a;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/j0/x/c$a;

    new-instance v1, Lcom/facebook/j0/x/c$a;

    const-string v2, "MOBILE_APP_INSTALL"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v2}, Lcom/facebook/j0/x/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/facebook/j0/x/c$a;->b:Lcom/facebook/j0/x/c$a;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/j0/x/c$a;

    const-string v2, "CUSTOM_APP_EVENTS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/facebook/j0/x/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/facebook/j0/x/c$a;->c:Lcom/facebook/j0/x/c$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/j0/x/c$a;->d:[Lcom/facebook/j0/x/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/facebook/j0/x/c$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/j0/x/c$a;
    .locals 1

    const-class v0, Lcom/facebook/j0/x/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/j0/x/c$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/j0/x/c$a;
    .locals 1

    sget-object v0, Lcom/facebook/j0/x/c$a;->d:[Lcom/facebook/j0/x/c$a;

    invoke-virtual {v0}, [Lcom/facebook/j0/x/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/j0/x/c$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/j0/x/c$a;->a:Ljava/lang/String;

    return-object v0
.end method
