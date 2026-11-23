.class abstract Lj/d/e/i/b/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final b:Lj/d/e/i/b/g;


# instance fields
.field private final a:Lj/d/e/i/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj/d/e/i/b/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lj/d/e/i/b/e;-><init>(Lj/d/e/i/b/g;II)V

    sput-object v0, Lj/d/e/i/b/g;->b:Lj/d/e/i/b/g;

    return-void
.end method

.method constructor <init>(Lj/d/e/i/b/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/e/i/b/g;->a:Lj/d/e/i/b/g;

    return-void
.end method


# virtual methods
.method final a(II)Lj/d/e/i/b/g;
    .locals 1

    new-instance v0, Lj/d/e/i/b/e;

    invoke-direct {v0, p0, p1, p2}, Lj/d/e/i/b/e;-><init>(Lj/d/e/i/b/g;II)V

    return-object v0
.end method

.method final b(II)Lj/d/e/i/b/g;
    .locals 1

    new-instance v0, Lj/d/e/i/b/b;

    invoke-direct {v0, p0, p1, p2}, Lj/d/e/i/b/b;-><init>(Lj/d/e/i/b/g;II)V

    return-object v0
.end method

.method abstract c(Lj/d/e/j/a;[B)V
.end method

.method final d()Lj/d/e/i/b/g;
    .locals 1

    iget-object v0, p0, Lj/d/e/i/b/g;->a:Lj/d/e/i/b/g;

    return-object v0
.end method
