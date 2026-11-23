.class final Ll/t/b$d;
.super Ll/t/b;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/t/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ll/t/b<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final b:Ll/t/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/t/b<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final c:I

.field private d:I


# direct methods
.method public constructor <init>(Ll/t/b;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/t/b<",
            "+TE;>;II)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ll/t/b;-><init>()V

    iput-object p1, p0, Ll/t/b$d;->b:Ll/t/b;

    iput p2, p0, Ll/t/b$d;->c:I

    sget-object v0, Ll/t/b;->a:Ll/t/b$a;

    invoke-virtual {p1}, Ll/t/a;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Ll/t/b$a;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Ll/t/b$d;->d:I

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ll/t/b$d;->d:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, Ll/t/b;->a:Ll/t/b$a;

    iget v1, p0, Ll/t/b$d;->d:I

    invoke-virtual {v0, p1, v1}, Ll/t/b$a;->b(II)V

    iget-object v0, p0, Ll/t/b$d;->b:Ll/t/b;

    iget v1, p0, Ll/t/b$d;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ll/t/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
