.class public final Lm/h0/k/f$c$a;
.super Lm/h0/k/f$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/h0/k/f$c;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/h0/k/f$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lm/h0/k/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/h0/k/b;->j:Lm/h0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lm/h0/k/i;->d(Lm/h0/k/b;Ljava/io/IOException;)V

    return-void
.end method
