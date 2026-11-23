.class public Lj/g/a/a/a/y/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/g/a/a/a/y/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/g/a/a/a/y/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/g/a/a/a/y/e<",
        "Lj/g/a/a/a/x;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/g/a/a/a/y/h$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lj/g/a/a/a/y/h$a;

    invoke-direct {v0}, Lj/g/a/a/a/y/h$a;-><init>()V

    invoke-direct {p0, v0}, Lj/g/a/a/a/y/h;-><init>(Lj/g/a/a/a/y/h$a;)V

    return-void
.end method

.method constructor <init>(Lj/g/a/a/a/y/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/g/a/a/a/y/h;->a:Lj/g/a/a/a/y/h$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj/g/a/a/a/k;)V
    .locals 0

    check-cast p1, Lj/g/a/a/a/x;

    invoke-virtual {p0, p1}, Lj/g/a/a/a/y/h;->b(Lj/g/a/a/a/x;)V

    return-void
.end method

.method public b(Lj/g/a/a/a/x;)V
    .locals 2

    iget-object v0, p0, Lj/g/a/a/a/y/h;->a:Lj/g/a/a/a/y/h$a;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/h$a;->a(Lj/g/a/a/a/x;)Lj/g/a/a/a/a0/a;

    move-result-object p1

    :try_start_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1, v1}, Lj/g/a/a/a/a0/a;->a(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lo/d;

    move-result-object p1

    invoke-interface {p1}, Lo/d;->b()Lo/t;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
