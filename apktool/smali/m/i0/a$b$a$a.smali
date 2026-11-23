.class final Lm/i0/a$b$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/i0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/i0/a$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lm/h0/l/h;->k(Lm/h0/l/h;Ljava/lang/String;ILjava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method
