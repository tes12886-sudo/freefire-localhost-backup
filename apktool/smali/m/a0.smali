.class public final enum Lm/a0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/a0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lm/a0$a;

.field public static final enum c:Lm/a0;

.field public static final enum d:Lm/a0;

.field public static final enum e:Lm/a0;

.field public static final enum f:Lm/a0;

.field public static final enum g:Lm/a0;

.field public static final enum h:Lm/a0;

.field private static final synthetic i:[Lm/a0;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm/a0;

    const-string v1, "HTTP_1_0"

    const/4 v2, 0x0

    const-string v3, "http/1.0"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->c:Lm/a0;

    new-instance v0, Lm/a0;

    const-string v1, "HTTP_1_1"

    const/4 v2, 0x1

    const-string v3, "http/1.1"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->d:Lm/a0;

    new-instance v0, Lm/a0;

    const-string v1, "SPDY_3"

    const/4 v2, 0x2

    const-string v3, "spdy/3.1"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->e:Lm/a0;

    new-instance v0, Lm/a0;

    const-string v1, "HTTP_2"

    const/4 v2, 0x3

    const-string v3, "h2"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->f:Lm/a0;

    new-instance v0, Lm/a0;

    const-string v1, "H2_PRIOR_KNOWLEDGE"

    const/4 v2, 0x4

    const-string v3, "h2_prior_knowledge"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->g:Lm/a0;

    new-instance v0, Lm/a0;

    const-string v1, "QUIC"

    const/4 v2, 0x5

    const-string v3, "quic"

    invoke-direct {v0, v1, v2, v3}, Lm/a0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lm/a0;->h:Lm/a0;

    invoke-static {}, Lm/a0;->a()[Lm/a0;

    move-result-object v0

    sput-object v0, Lm/a0;->i:[Lm/a0;

    new-instance v0, Lm/a0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/a0$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/a0;->b:Lm/a0$a;

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

    iput-object p3, p0, Lm/a0;->a:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Lm/a0;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lm/a0;

    sget-object v1, Lm/a0;->c:Lm/a0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm/a0;->d:Lm/a0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm/a0;->e:Lm/a0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm/a0;->f:Lm/a0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lm/a0;->g:Lm/a0;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lm/a0;->h:Lm/a0;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final synthetic c(Lm/a0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lm/a0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lm/a0;
    .locals 1

    const-class v0, Lm/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/a0;

    return-object p0
.end method

.method public static values()[Lm/a0;
    .locals 1

    sget-object v0, Lm/a0;->i:[Lm/a0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/a0;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/a0;->a:Ljava/lang/String;

    return-object v0
.end method
