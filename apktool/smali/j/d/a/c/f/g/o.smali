.class public final Lj/d/a/c/f/g/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj/d/a/c/f/g/l;

.field private static volatile b:Lj/d/a/c/f/g/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/c/f/g/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/d/a/c/f/g/n;-><init>(Lj/d/a/c/f/g/m;)V

    sput-object v0, Lj/d/a/c/f/g/o;->a:Lj/d/a/c/f/g/l;

    sput-object v0, Lj/d/a/c/f/g/o;->b:Lj/d/a/c/f/g/l;

    return-void
.end method

.method public static a()Lj/d/a/c/f/g/l;
    .locals 1

    sget-object v0, Lj/d/a/c/f/g/o;->b:Lj/d/a/c/f/g/l;

    return-object v0
.end method
