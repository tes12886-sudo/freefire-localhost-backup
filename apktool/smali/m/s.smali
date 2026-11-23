.class public final Lm/s;
.super Lm/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/s$a;
    }
.end annotation


# static fields
.field private static final d:Lm/x;


# instance fields
.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lm/x;->d:Lm/x$a;

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v0, v1}, Lm/x$a;->a(Ljava/lang/String;)Lm/x;

    move-result-object v0

    sput-object v0, Lm/s;->d:Lm/x;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "encodedNames"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodedValues"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm/c0;-><init>()V

    invoke-static {p1}, Lm/h0/d;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm/s;->b:Ljava/util/List;

    invoke-static {p2}, Lm/h0/d;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm/s;->c:Ljava/util/List;

    return-void
.end method

.method private final m(Ln/c;Z)J
    .locals 4

    if-eqz p2, :cond_0

    new-instance p1, Ln/b;

    invoke-direct {p1}, Ln/b;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, Ln/c;->a()Ln/b;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    iget-object v1, p0, Lm/s;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_2

    add-int/lit8 v2, v0, 0x1

    if-lez v0, :cond_1

    const/16 v3, 0x26

    invoke-virtual {p1, v3}, Ln/b;->z0(I)Ln/b;

    :cond_1
    iget-object v3, p0, Lm/s;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ln/b;->I0(Ljava/lang/String;)Ln/b;

    const/16 v3, 0x3d

    invoke-virtual {p1, v3}, Ln/b;->z0(I)Ln/b;

    iget-object v3, p0, Lm/s;->c:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ln/b;->I0(Ljava/lang/String;)Ln/b;

    move v0, v2

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ln/b;->r0()J

    move-result-wide v0

    invoke-virtual {p1}, Ln/b;->Y()V

    goto :goto_2

    :cond_3
    const-wide/16 v0, 0x0

    :goto_2
    return-wide v0
.end method


# virtual methods
.method public a()J
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lm/s;->m(Ln/c;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lm/x;
    .locals 1

    sget-object v0, Lm/s;->d:Lm/x;

    return-object v0
.end method

.method public h(Ln/c;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm/s;->m(Ln/c;Z)J

    return-void
.end method

.method public final i(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/s;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final j(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/s;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lm/s;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final l(I)Ljava/lang/String;
    .locals 7

    sget-object v0, Lm/v;->k:Lm/v$b;

    invoke-virtual {p0, p1}, Lm/s;->j(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lm/v$b;->g(Lm/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
