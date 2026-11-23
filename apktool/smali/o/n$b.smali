.class final Lo/n$b;
.super Lm/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final c:Lm/e0;

.field private final d:Ln/d;

.field e:Ljava/io/IOException;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm/e0;)V
    .locals 1

    invoke-direct {p0}, Lm/e0;-><init>()V

    iput-object p1, p0, Lo/n$b;->c:Lm/e0;

    new-instance v0, Lo/n$b$a;

    invoke-virtual {p1}, Lm/e0;->F()Ln/d;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lo/n$b$a;-><init>(Lo/n$b;Ln/x;)V

    invoke-static {v0}, Ln/l;->b(Ln/x;)Ln/d;

    move-result-object p1

    iput-object p1, p0, Lo/n$b;->d:Ln/d;

    return-void
.end method


# virtual methods
.method public F()Ln/d;
    .locals 1

    iget-object v0, p0, Lo/n$b;->d:Ln/d;

    return-object v0
.end method

.method Q()V
    .locals 1

    iget-object v0, p0, Lo/n$b;->e:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lo/n$b;->c:Lm/e0;

    invoke-virtual {v0}, Lm/e0;->close()V

    return-void
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lo/n$b;->c:Lm/e0;

    invoke-virtual {v0}, Lm/e0;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public l()Lm/x;
    .locals 1

    iget-object v0, p0, Lo/n$b;->c:Lm/e0;

    invoke-virtual {v0}, Lm/e0;->l()Lm/x;

    move-result-object v0

    return-object v0
.end method
