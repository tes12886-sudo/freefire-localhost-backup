.class public final enum Lm/g0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lm/g0$a;

.field public static final enum c:Lm/g0;

.field public static final enum d:Lm/g0;

.field public static final enum e:Lm/g0;

.field public static final enum f:Lm/g0;

.field public static final enum g:Lm/g0;

.field private static final synthetic h:[Lm/g0;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm/g0;

    const-string v1, "TLS_1_3"

    const/4 v2, 0x0

    const-string v3, "TLSv1.3"

    invoke-direct {v0, v1, v2, v3}, Lm/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/g0;->c:Lm/g0;

    new-instance v0, Lm/g0;

    const-string v1, "TLS_1_2"

    const/4 v2, 0x1

    const-string v3, "TLSv1.2"

    invoke-direct {v0, v1, v2, v3}, Lm/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/g0;->d:Lm/g0;

    new-instance v0, Lm/g0;

    const-string v1, "TLS_1_1"

    const/4 v2, 0x2

    const-string v3, "TLSv1.1"

    invoke-direct {v0, v1, v2, v3}, Lm/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/g0;->e:Lm/g0;

    new-instance v0, Lm/g0;

    const-string v1, "TLS_1_0"

    const/4 v2, 0x3

    const-string v3, "TLSv1"

    invoke-direct {v0, v1, v2, v3}, Lm/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/g0;->f:Lm/g0;

    new-instance v0, Lm/g0;

    const-string v1, "SSL_3_0"

    const/4 v2, 0x4

    const-string v3, "SSLv3"

    invoke-direct {v0, v1, v2, v3}, Lm/g0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/g0;->g:Lm/g0;

    invoke-static {}, Lm/g0;->a()[Lm/g0;

    move-result-object v0

    sput-object v0, Lm/g0;->h:[Lm/g0;

    new-instance v0, Lm/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/g0$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/g0;->b:Lm/g0$a;

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

    iput-object p3, p0, Lm/g0;->a:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lm/g0;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lm/g0;

    sget-object v1, Lm/g0;->c:Lm/g0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm/g0;->d:Lm/g0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm/g0;->e:Lm/g0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm/g0;->f:Lm/g0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lm/g0;->g:Lm/g0;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm/g0;
    .locals 1

    const-class v0, Lm/g0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/g0;

    return-object p0
.end method

.method public static values()[Lm/g0;
    .locals 1

    sget-object v0, Lm/g0;->h:[Lm/g0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/g0;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/g0;->a:Ljava/lang/String;

    return-object v0
.end method
