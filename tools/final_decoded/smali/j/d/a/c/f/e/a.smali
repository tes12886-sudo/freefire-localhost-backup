.class public final Lj/d/a/c/f/e/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile a:Lj/d/a/c/f/e/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/c/f/e/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/d/a/c/f/e/c;-><init>(Lj/d/a/c/f/e/d;)V

    sput-object v0, Lj/d/a/c/f/e/a;->a:Lj/d/a/c/f/e/b;

    return-void
.end method

.method public static a()Lj/d/a/c/f/e/b;
    .locals 1

    sget-object v0, Lj/d/a/c/f/e/a;->a:Lj/d/a/c/f/e/b;

    return-object v0
.end method
