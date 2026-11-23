.class abstract Lh/a/a/a$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "e"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Lh/a/a/g/a;J)Lh/a/a/a$e;
    .locals 1

    new-instance v0, Lh/a/a/e;

    invoke-direct {v0, p0, p1, p2}, Lh/a/a/e;-><init>(Lh/a/a/g/a;J)V

    return-object v0
.end method


# virtual methods
.method abstract a()Lh/a/a/g/a;
.end method

.method abstract b()J
.end method
