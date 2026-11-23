.class public final Lm/h0/k/f$d$a;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f$d;->l(ZLm/h0/k/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;

.field final synthetic f:Ll/y/c/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;Ll/y/c/l;)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$d$a;->e:Lm/h0/k/f;

    iput-object p4, p0, Lm/h0/k/f$d$a;->f:Ll/y/c/l;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lm/h0/k/f$d$a;->e:Lm/h0/k/f;

    invoke-virtual {v0}, Lm/h0/k/f;->l0()Lm/h0/k/f$c;

    move-result-object v0

    iget-object v1, p0, Lm/h0/k/f$d$a;->e:Lm/h0/k/f;

    iget-object v2, p0, Lm/h0/k/f$d$a;->f:Ll/y/c/l;

    iget-object v2, v2, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast v2, Lm/h0/k/m;

    invoke-virtual {v0, v1, v2}, Lm/h0/k/f$c;->b(Lm/h0/k/f;Lm/h0/k/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
