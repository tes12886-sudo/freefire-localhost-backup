.class Lo/r$a;
.super Lm/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final b:Lm/c0;

.field private final c:Lm/x;


# direct methods
.method constructor <init>(Lm/c0;Lm/x;)V
    .locals 0

    invoke-direct {p0}, Lm/c0;-><init>()V

    iput-object p1, p0, Lo/r$a;->b:Lm/c0;

    iput-object p2, p0, Lo/r$a;->c:Lm/x;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lo/r$a;->b:Lm/c0;

    invoke-virtual {v0}, Lm/c0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lm/x;
    .locals 1

    iget-object v0, p0, Lo/r$a;->c:Lm/x;

    return-object v0
.end method

.method public h(Ln/c;)V
    .locals 1

    iget-object v0, p0, Lo/r$a;->b:Lm/c0;

    invoke-virtual {v0, p1}, Lm/c0;->h(Ln/c;)V

    return-void
.end method
