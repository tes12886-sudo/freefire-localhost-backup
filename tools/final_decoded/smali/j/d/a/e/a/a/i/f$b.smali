.class Lj/d/a/e/a/a/i/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:J


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj/d/a/e/a/a/i/f$b;->a:I

    iput v0, p0, Lj/d/a/e/a/a/i/f$b;->b:I

    iput-boolean v0, p0, Lj/d/a/e/a/a/i/f$b;->d:Z

    iput v0, p0, Lj/d/a/e/a/a/i/f$b;->h:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lj/d/a/e/a/a/i/f$b;->i:J

    return-void
.end method

.method synthetic constructor <init>(Lj/d/a/e/a/a/i/f$a;)V
    .locals 0

    invoke-direct {p0}, Lj/d/a/e/a/a/i/f$b;-><init>()V

    return-void
.end method
