.class public final Lj/d/e/d;
.super Lj/d/e/f;
.source ""


# static fields
.field private static final c:Lj/d/e/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/e/d;

    invoke-direct {v0}, Lj/d/e/d;-><init>()V

    sput-object v0, Lj/d/e/d;->c:Lj/d/e/d;

    sget-object v1, Lj/d/e/f;->b:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/d/e/f;-><init>()V

    return-void
.end method

.method public static a()Lj/d/e/d;
    .locals 1

    sget-boolean v0, Lj/d/e/f;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lj/d/e/d;

    invoke-direct {v0}, Lj/d/e/d;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lj/d/e/d;->c:Lj/d/e/d;

    return-object v0
.end method
