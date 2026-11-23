.class public final Lm/h0/g/c;
.super Lm/h0/g/a;
.source ""


# instance fields
.field final synthetic e:Ll/y/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/y/b/a<",
            "Ll/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLl/y/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ll/y/b/a<",
            "Ll/s;",
            ">;)V"
        }
    .end annotation

    iput-object p3, p0, Lm/h0/g/c;->e:Ll/y/b/a;

    invoke-direct {p0, p1, p2}, Lm/h0/g/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, Lm/h0/g/c;->e:Ll/y/b/a;

    invoke-interface {v0}, Ll/y/b/a;->a()Ljava/lang/Object;

    const-wide/16 v0, -0x1

    return-wide v0
.end method
