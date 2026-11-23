.class public abstract Lj/f/a/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/f/a/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lj/f/a/b<",
        "TM;TB;>;B:",
        "Lj/f/a/b$a<",
        "TM;TB;>;>",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final transient a:Lj/f/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/f/a/e<",
            "TM;>;"
        }
    .end annotation
.end field

.field private final transient b:Ln/e;

.field protected transient c:I


# direct methods
.method protected constructor <init>(Lj/f/a/e;Ln/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/f/a/e<",
            "TM;>;",
            "Ln/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj/f/a/b;->c:I

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Lj/f/a/b;->a:Lj/f/a/e;

    iput-object p2, p0, Lj/f/a/b;->b:Ln/e;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "unknownFields == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "adapter == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lj/f/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/f/a/e<",
            "TM;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/f/a/b;->a:Lj/f/a/e;

    return-object v0
.end method

.method public final b()[B
    .locals 1

    iget-object v0, p0, Lj/f/a/b;->a:Lj/f/a/e;

    invoke-virtual {v0, p0}, Lj/f/a/e;->h(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method

.method public final c()Ln/e;
    .locals 1

    iget-object v0, p0, Lj/f/a/b;->b:Ln/e;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ln/e;->e:Ln/e;

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj/f/a/b;->a:Lj/f/a/e;

    invoke-virtual {v0, p0}, Lj/f/a/e;->m(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final writeReplace()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lj/f/a/c;

    invoke-virtual {p0}, Lj/f/a/b;->b()[B

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lj/f/a/c;-><init>([BLjava/lang/Class;)V

    return-object v0
.end method
