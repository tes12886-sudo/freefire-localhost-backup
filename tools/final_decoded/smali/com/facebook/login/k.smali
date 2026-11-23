.class public final enum Lcom/facebook/login/k;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lcom/facebook/login/k;

.field private static final synthetic i:[Lcom/facebook/login/k;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Z

.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 22

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/login/k;

    new-instance v11, Lcom/facebook/login/k;

    const-string v2, "NATIVE_WITH_FALLBACK"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v11, Lcom/facebook/login/k;->h:Lcom/facebook/login/k;

    const/4 v1, 0x0

    aput-object v11, v0, v1

    new-instance v1, Lcom/facebook/login/k;

    const-string v13, "NATIVE_ONLY"

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x1

    move-object v12, v1

    invoke-direct/range {v12 .. v21}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/facebook/login/k;

    const-string v4, "KATANA_ONLY"

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lcom/facebook/login/k;

    const-string v4, "WEB_ONLY"

    const/4 v5, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v10, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lcom/facebook/login/k;

    const-string v4, "WEB_VIEW_ONLY"

    const/4 v5, 0x4

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lcom/facebook/login/k;

    const-string v4, "DIALOG_ONLY"

    const/4 v5, 0x5

    const/4 v7, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lcom/facebook/login/k;

    const-string v4, "DEVICE_AUTH"

    const/4 v5, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/facebook/login/k;-><init>(Ljava/lang/String;IZZZZZZZ)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/login/k;->i:[Lcom/facebook/login/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZZZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/facebook/login/k;->a:Z

    iput-boolean p4, p0, Lcom/facebook/login/k;->b:Z

    iput-boolean p5, p0, Lcom/facebook/login/k;->c:Z

    iput-boolean p6, p0, Lcom/facebook/login/k;->d:Z

    iput-boolean p7, p0, Lcom/facebook/login/k;->e:Z

    iput-boolean p8, p0, Lcom/facebook/login/k;->f:Z

    iput-boolean p9, p0, Lcom/facebook/login/k;->g:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/k;
    .locals 1

    const-class v0, Lcom/facebook/login/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/k;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/k;
    .locals 1

    sget-object v0, Lcom/facebook/login/k;->i:[Lcom/facebook/login/k;

    invoke-virtual {v0}, [Lcom/facebook/login/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/k;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->e:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->f:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->a:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->g:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->b:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/k;->c:Z

    return v0
.end method
