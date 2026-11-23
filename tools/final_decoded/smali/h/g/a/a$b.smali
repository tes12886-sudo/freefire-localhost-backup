.class abstract Lh/g/a/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/g/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lh/g/a/a$a;)V
    .locals 0

    invoke-direct {p0}, Lh/g/a/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(Lh/g/a/a;Lh/g/a/a$e;Lh/g/a/a$e;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/g/a/a<",
            "*>;",
            "Lh/g/a/a$e;",
            "Lh/g/a/a$e;",
            ")Z"
        }
    .end annotation
.end method

.method abstract b(Lh/g/a/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/g/a/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation
.end method

.method abstract c(Lh/g/a/a;Lh/g/a/a$i;Lh/g/a/a$i;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/g/a/a<",
            "*>;",
            "Lh/g/a/a$i;",
            "Lh/g/a/a$i;",
            ")Z"
        }
    .end annotation
.end method

.method abstract d(Lh/g/a/a$i;Lh/g/a/a$i;)V
.end method

.method abstract e(Lh/g/a/a$i;Ljava/lang/Thread;)V
.end method
