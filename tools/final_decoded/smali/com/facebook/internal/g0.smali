.class public final enum Lcom/facebook/internal/g0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/facebook/internal/g0;

.field public static final enum c:Lcom/facebook/internal/g0;

.field private static final synthetic d:[Lcom/facebook/internal/g0;

.field private static final e:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/facebook/internal/g0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lcom/facebook/internal/g0$a;


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/internal/g0;

    new-instance v1, Lcom/facebook/internal/g0;

    const-string v2, "None"

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/internal/g0;-><init>(Ljava/lang/String;IJ)V

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/internal/g0;

    const-string v2, "Enabled"

    const/4 v3, 0x1

    const-wide/16 v4, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/internal/g0;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, Lcom/facebook/internal/g0;->b:Lcom/facebook/internal/g0;

    aput-object v1, v0, v3

    new-instance v1, Lcom/facebook/internal/g0;

    const-string v2, "RequireConfirm"

    const/4 v3, 0x2

    const-wide/16 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/internal/g0;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, Lcom/facebook/internal/g0;->c:Lcom/facebook/internal/g0;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/internal/g0;->d:[Lcom/facebook/internal/g0;

    new-instance v0, Lcom/facebook/internal/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/g0$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/internal/g0;->f:Lcom/facebook/internal/g0$a;

    const-class v0, Lcom/facebook/internal/g0;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "EnumSet.allOf(SmartLoginOption::class.java)"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/internal/g0;->e:Ljava/util/EnumSet;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/facebook/internal/g0;->a:J

    return-void
.end method

.method public static final synthetic a()Ljava/util/EnumSet;
    .locals 1

    sget-object v0, Lcom/facebook/internal/g0;->e:Ljava/util/EnumSet;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/g0;
    .locals 1

    const-class v0, Lcom/facebook/internal/g0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/g0;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/g0;
    .locals 1

    sget-object v0, Lcom/facebook/internal/g0;->d:[Lcom/facebook/internal/g0;

    invoke-virtual {v0}, [Lcom/facebook/internal/g0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/g0;

    return-object v0
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/internal/g0;->a:J

    return-wide v0
.end method
