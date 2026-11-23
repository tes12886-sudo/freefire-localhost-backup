.class public final Lj/d/a/c/f/d/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj/d/a/c/f/d/j;

.field private static volatile b:Lj/d/a/c/f/d/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/c/f/d/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/d/a/c/f/d/l;-><init>(Lj/d/a/c/f/d/k;)V

    sput-object v0, Lj/d/a/c/f/d/m;->a:Lj/d/a/c/f/d/j;

    sput-object v0, Lj/d/a/c/f/d/m;->b:Lj/d/a/c/f/d/j;

    return-void
.end method

.method public static a()Lj/d/a/c/f/d/j;
    .locals 1

    sget-object v0, Lj/d/a/c/f/d/m;->b:Lj/d/a/c/f/d/j;

    return-object v0
.end method
