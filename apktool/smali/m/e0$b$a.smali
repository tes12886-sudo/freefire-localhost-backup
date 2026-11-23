.class public final Lm/e0$b$a;
.super Lm/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/e0$b;->b(Ln/d;Lm/x;J)Lm/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic c:Lm/x;

.field final synthetic d:J

.field final synthetic e:Ln/d;


# direct methods
.method constructor <init>(Lm/x;JLn/d;)V
    .locals 0

    iput-object p1, p0, Lm/e0$b$a;->c:Lm/x;

    iput-wide p2, p0, Lm/e0$b$a;->d:J

    iput-object p4, p0, Lm/e0$b$a;->e:Ln/d;

    invoke-direct {p0}, Lm/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public F()Ln/d;
    .locals 1

    iget-object v0, p0, Lm/e0$b$a;->e:Ln/d;

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lm/e0$b$a;->d:J

    return-wide v0
.end method

.method public l()Lm/x;
    .locals 1

    iget-object v0, p0, Lm/e0$b$a;->c:Lm/x;

    return-object v0
.end method
