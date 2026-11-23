.class public interface abstract Lj/g/a/a/a/a0/a;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public abstract a(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lo/d;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lo/a0/t;
            value = "include_entities"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lo/a0/t;
            value = "skip_status"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lo/a0/t;
            value = "include_email"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/a0/f;
        value = "/1.1/account/verify_credentials.json"
    .end annotation
.end method
