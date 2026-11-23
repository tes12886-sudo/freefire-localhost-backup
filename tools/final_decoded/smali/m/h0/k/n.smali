.class public final Lm/h0/k/n;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final a:Lm/h0/k/b;


# direct methods
.method public constructor <init>(Lm/h0/k/b;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stream was reset: "

    invoke-static {v0, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/n;->a:Lm/h0/k/b;

    return-void
.end method
