.class public final Lj/d/a/c/f/f/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj/d/a/c/f/f/e;

.field private static volatile b:Lj/d/a/c/f/f/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/c/f/f/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/d/a/c/f/f/g;-><init>(Lj/d/a/c/f/f/f;)V

    sput-object v0, Lj/d/a/c/f/f/h;->a:Lj/d/a/c/f/f/e;

    sput-object v0, Lj/d/a/c/f/f/h;->b:Lj/d/a/c/f/f/e;

    return-void
.end method

.method public static a()Lj/d/a/c/f/f/e;
    .locals 1

    sget-object v0, Lj/d/a/c/f/f/h;->b:Lj/d/a/c/f/f/e;

    return-object v0
.end method
