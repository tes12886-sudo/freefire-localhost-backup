.class public final Lm/h0/i/h;
.super Lm/e0;
.source ""


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:Ln/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLn/d;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm/e0;-><init>()V

    iput-object p1, p0, Lm/h0/i/h;->c:Ljava/lang/String;

    iput-wide p2, p0, Lm/h0/i/h;->d:J

    iput-object p4, p0, Lm/h0/i/h;->e:Ln/d;

    return-void
.end method


# virtual methods
.method public F()Ln/d;
    .locals 1

    iget-object v0, p0, Lm/h0/i/h;->e:Ln/d;

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lm/h0/i/h;->d:J

    return-wide v0
.end method

.method public l()Lm/x;
    .locals 2

    iget-object v0, p0, Lm/h0/i/h;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lm/x;->d:Lm/x$a;

    invoke-virtual {v1, v0}, Lm/x$a;->b(Ljava/lang/String;)Lm/x;

    move-result-object v0

    :goto_0
    return-object v0
.end method
