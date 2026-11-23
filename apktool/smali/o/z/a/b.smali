.class final Lo/z/a/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo/h<",
        "TT;",
        "Lm/c0;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lm/x;

.field private static final d:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Lj/d/d/e;

.field private final b:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lm/x;->e(Ljava/lang/String;)Lm/x;

    move-result-object v0

    sput-object v0, Lo/z/a/b;->c:Lm/x;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo/z/a/b;->d:Ljava/nio/charset/Charset;

    return-void
.end method

.method constructor <init>(Lj/d/d/e;Lj/d/d/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/e;",
            "Lj/d/d/w<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/z/a/b;->a:Lj/d/d/e;

    iput-object p2, p0, Lo/z/a/b;->b:Lj/d/d/w;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lo/z/a/b;->b(Ljava/lang/Object;)Lm/c0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lm/c0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lm/c0;"
        }
    .end annotation

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Ln/b;->h0()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Lo/z/a/b;->d:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    iget-object v2, p0, Lo/z/a/b;->a:Lj/d/d/e;

    invoke-virtual {v2, v1}, Lj/d/d/e;->r(Ljava/io/Writer;)Lj/d/d/b0/c;

    move-result-object v1

    iget-object v2, p0, Lo/z/a/b;->b:Lj/d/d/w;

    invoke-virtual {v2, v1, p1}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj/d/d/b0/c;->close()V

    sget-object p1, Lo/z/a/b;->c:Lm/x;

    invoke-virtual {v0}, Ln/b;->j0()Ln/e;

    move-result-object v0

    invoke-static {p1, v0}, Lm/c0;->d(Lm/x;Ln/e;)Lm/c0;

    move-result-object p1

    return-object p1
.end method
