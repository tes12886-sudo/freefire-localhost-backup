.class interface abstract Lj/g/a/a/a/y/j/d$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g/a/a/a/y/j/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "b"
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Lo/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lo/a0/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lo/a0/t;
            value = "oauth_verifier"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo/d<",
            "Lm/e0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/a0/o;
        value = "/oauth/access_token"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lo/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lo/a0/i;
            value = "Authorization"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo/d<",
            "Lm/e0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/a0/o;
        value = "/oauth/request_token"
    .end annotation
.end method
