.class public final Lm/h0/k/f$i;
.super Lm/h0/g/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f;->E0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lm/h0/k/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLm/h0/k/f;)V
    .locals 0

    iput-object p3, p0, Lm/h0/k/f$i;->e:Lm/h0/k/f;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lm/h0/k/f$i;->e:Lm/h0/k/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v1}, Lm/h0/k/f;->O0(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
