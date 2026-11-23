.class public final enum Lcom/facebook/share/c/c$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/share/c/c$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/facebook/share/c/c$d;

.field public static final enum b:Lcom/facebook/share/c/c$d;

.field public static final enum c:Lcom/facebook/share/c/c$d;

.field private static final synthetic d:[Lcom/facebook/share/c/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/facebook/share/c/c$d;

    const-string v1, "APP_USERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/share/c/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/share/c/c$d;->a:Lcom/facebook/share/c/c$d;

    new-instance v1, Lcom/facebook/share/c/c$d;

    const-string v3, "APP_NON_USERS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/facebook/share/c/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/share/c/c$d;->b:Lcom/facebook/share/c/c$d;

    new-instance v3, Lcom/facebook/share/c/c$d;

    const-string v5, "EVERYBODY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/facebook/share/c/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/facebook/share/c/c$d;->c:Lcom/facebook/share/c/c$d;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/facebook/share/c/c$d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/facebook/share/c/c$d;->d:[Lcom/facebook/share/c/c$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/c/c$d;
    .locals 1

    const-class v0, Lcom/facebook/share/c/c$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/share/c/c$d;

    return-object p0
.end method

.method public static values()[Lcom/facebook/share/c/c$d;
    .locals 1

    sget-object v0, Lcom/facebook/share/c/c$d;->d:[Lcom/facebook/share/c/c$d;

    invoke-virtual {v0}, [Lcom/facebook/share/c/c$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/share/c/c$d;

    return-object v0
.end method
