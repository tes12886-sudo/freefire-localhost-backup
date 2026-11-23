.class public final Lm/h0/k/f$k;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f;->Q0(ILm/h0/k/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;

.field final synthetic f:I

.field final synthetic g:Lm/h0/k/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;ILm/h0/k/b;)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$k;->e:Lm/h0/k/f;

    iput p4, p0, Lm/h0/k/f$k;->f:I

    iput-object p5, p0, Lm/h0/k/f$k;->g:Lm/h0/k/b;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f$k;->e:Lm/h0/k/f;

    iget v1, p0, Lm/h0/k/f$k;->f:I

    iget-object v2, p0, Lm/h0/k/f$k;->g:Lm/h0/k/b;

    invoke-virtual {v0, v1, v2}, Lm/h0/k/f;->P0(ILm/h0/k/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lm/h0/k/f$k;->e:Lm/h0/k/f;

    invoke-static {v1, v0}, Lm/h0/k/f;->b(Lm/h0/k/f;Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
