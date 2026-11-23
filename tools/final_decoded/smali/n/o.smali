.class public final Ln/o;
.super Ll/t/b;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/t/b<",
        "Ln/e;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final d:Ln/o$a;


# instance fields
.field private final b:[Ln/e;

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln/o$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Ln/o;->d:Ln/o$a;

    return-void
.end method

.method private constructor <init>([Ln/e;[I)V
    .locals 0

    invoke-direct {p0}, Ll/t/b;-><init>()V

    iput-object p1, p0, Ln/o;->b:[Ln/e;

    iput-object p2, p0, Ln/o;->c:[I

    return-void
.end method

.method public synthetic constructor <init>([Ln/e;[ILl/y/c/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ln/o;-><init>([Ln/e;[I)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Ln/o;->b:[Ln/e;

    array-length v0, v0

    return v0
.end method

.method public bridge c(Ln/e;)Z
    .locals 0

    invoke-super {p0, p1}, Ll/t/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ln/e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ln/e;

    invoke-virtual {p0, p1}, Ln/o;->c(Ln/e;)Z

    move-result p1

    return p1
.end method

.method public d(I)Ln/e;
    .locals 1

    iget-object v0, p0, Ln/o;->b:[Ln/e;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final f()[Ln/e;
    .locals 1

    iget-object v0, p0, Ln/o;->b:[Ln/e;

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln/o;->d(I)Ln/e;

    move-result-object p1

    return-object p1
.end method

.method public final h()[I
    .locals 1

    iget-object v0, p0, Ln/o;->c:[I

    return-object v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ln/e;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ln/e;

    invoke-virtual {p0, p1}, Ln/o;->j(Ln/e;)I

    move-result p1

    return p1
.end method

.method public bridge j(Ln/e;)I
    .locals 0

    invoke-super {p0, p1}, Ll/t/b;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge l(Ln/e;)I
    .locals 0

    invoke-super {p0, p1}, Ll/t/b;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ln/e;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ln/e;

    invoke-virtual {p0, p1}, Ln/o;->l(Ln/e;)I

    move-result p1

    return p1
.end method
