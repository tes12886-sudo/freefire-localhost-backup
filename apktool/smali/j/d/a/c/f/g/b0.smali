.class public final Lj/d/a/c/f/g/b0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private final b:Lj/d/a/c/f/g/e0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj/d/a/c/f/g/e0;->a:Lj/d/a/c/f/g/e0;

    iput-object v0, p0, Lj/d/a/c/f/g/b0;->b:Lj/d/a/c/f/g/e0;

    return-void
.end method


# virtual methods
.method public final a(I)Lj/d/a/c/f/g/b0;
    .locals 0

    iput p1, p0, Lj/d/a/c/f/g/b0;->a:I

    return-object p0
.end method

.method public final b()Lj/d/a/c/f/g/f0;
    .locals 3

    new-instance v0, Lj/d/a/c/f/g/a0;

    iget v1, p0, Lj/d/a/c/f/g/b0;->a:I

    iget-object v2, p0, Lj/d/a/c/f/g/b0;->b:Lj/d/a/c/f/g/e0;

    invoke-direct {v0, v1, v2}, Lj/d/a/c/f/g/a0;-><init>(ILj/d/a/c/f/g/e0;)V

    return-object v0
.end method
