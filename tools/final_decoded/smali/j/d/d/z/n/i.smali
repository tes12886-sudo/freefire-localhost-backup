.class public final Lj/d/d/z/n/i;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field private static final b:Lj/d/d/x;


# instance fields
.field private final a:Lj/d/d/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj/d/d/u;->b:Lj/d/d/u;

    invoke-static {v0}, Lj/d/d/z/n/i;->f(Lj/d/d/v;)Lj/d/d/x;

    move-result-object v0

    sput-object v0, Lj/d/d/z/n/i;->b:Lj/d/d/x;

    return-void
.end method

.method private constructor <init>(Lj/d/d/v;)V
    .locals 0

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/i;->a:Lj/d/d/v;

    return-void
.end method

.method public static e(Lj/d/d/v;)Lj/d/d/x;
    .locals 1

    sget-object v0, Lj/d/d/u;->b:Lj/d/d/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Lj/d/d/z/n/i;->b:Lj/d/d/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Lj/d/d/z/n/i;->f(Lj/d/d/v;)Lj/d/d/x;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lj/d/d/v;)Lj/d/d/x;
    .locals 1

    new-instance v0, Lj/d/d/z/n/i;

    invoke-direct {v0, p0}, Lj/d/d/z/n/i;-><init>(Lj/d/d/v;)V

    new-instance p0, Lj/d/d/z/n/i$a;

    invoke-direct {p0, v0}, Lj/d/d/z/n/i$a;-><init>(Lj/d/d/z/n/i;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/z/n/i;->g(Lj/d/d/b0/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lj/d/d/z/n/i;->h(Lj/d/d/b0/c;Ljava/lang/Number;)V

    return-void
.end method

.method public g(Lj/d/d/b0/a;)Ljava/lang/Number;
    .locals 4

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/z/n/i$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lj/d/d/s;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expecting number, got: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj/d/d/b0/a;->Q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj/d/d/s;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lj/d/d/z/n/i;->a:Lj/d/d/v;

    invoke-interface {v0, p1}, Lj/d/d/v;->a(Lj/d/d/b0/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Lj/d/d/b0/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Lj/d/d/b0/c;->n0(Ljava/lang/Number;)Lj/d/d/b0/c;

    return-void
.end method
