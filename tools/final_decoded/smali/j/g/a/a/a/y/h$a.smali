.class public Lj/g/a/a/a/y/h$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g/a/a/a/y/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/g/a/a/a/x;)Lj/g/a/a/a/a0/a;
    .locals 1

    new-instance v0, Lj/g/a/a/a/n;

    invoke-direct {v0, p1}, Lj/g/a/a/a/n;-><init>(Lj/g/a/a/a/x;)V

    invoke-virtual {v0}, Lj/g/a/a/a/n;->d()Lj/g/a/a/a/a0/a;

    move-result-object p1

    return-object p1
.end method
