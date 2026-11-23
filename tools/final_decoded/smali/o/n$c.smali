.class final Lo/n$c;
.super Lm/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final c:Lm/x;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final d:J


# direct methods
.method constructor <init>(Lm/x;J)V
    .locals 0
    .param p1    # Lm/x;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lm/e0;-><init>()V

    iput-object p1, p0, Lo/n$c;->c:Lm/x;

    iput-wide p2, p0, Lo/n$c;->d:J

    return-void
.end method


# virtual methods
.method public F()Ln/d;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read raw response body of a converted body."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lo/n$c;->d:J

    return-wide v0
.end method

.method public l()Lm/x;
    .locals 1

    iget-object v0, p0, Lo/n$c;->c:Lm/x;

    return-object v0
.end method
