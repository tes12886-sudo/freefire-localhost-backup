.class public final Lm/h0/k/f$d$c;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f$d;->e(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;II)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$d$c;->e:Lm/h0/k/f;

    iput p4, p0, Lm/h0/k/f$d$c;->f:I

    iput p5, p0, Lm/h0/k/f$d$c;->g:I

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    iget-object v0, p0, Lm/h0/k/f$d$c;->e:Lm/h0/k/f;

    iget v1, p0, Lm/h0/k/f$d$c;->f:I

    iget v2, p0, Lm/h0/k/f$d$c;->g:I

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lm/h0/k/f;->O0(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
