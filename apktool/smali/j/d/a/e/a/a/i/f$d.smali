.class Lj/d/a/e/a/a/i/f$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/io/FileOutputStream;

.field public c:Z

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj/d/a/e/a/a/i/d;Lj/d/a/e/a/a/i/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/d/a/e/a/a/i/f$d;->c:Z

    iput v0, p0, Lj/d/a/e/a/a/i/f$d;->d:I

    iput v0, p0, Lj/d/a/e/a/a/i/f$d;->e:I

    iput-boolean v0, p0, Lj/d/a/e/a/a/i/f$d;->g:Z

    iget v0, p1, Lj/d/a/e/a/a/i/d;->l:I

    iput v0, p0, Lj/d/a/e/a/a/i/f$d;->e:I

    iget-object v0, p1, Lj/d/a/e/a/a/i/d;->a:Ljava/lang/String;

    iput-object v0, p0, Lj/d/a/e/a/a/i/f$d;->h:Ljava/lang/String;

    iget-object p1, p1, Lj/d/a/e/a/a/i/d;->c:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lj/d/a/e/a/a/i/g;->generateTempSaveFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lj/d/a/e/a/a/i/f$d;->a:Ljava/lang/String;

    return-void
.end method
