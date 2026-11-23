.class final synthetic Lj/d/a/c/d/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lj/d/a/c/d/j;


# direct methods
.method constructor <init>(Lj/d/a/c/d/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/a/c/d/l;->a:Lj/d/a/c/d/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj/d/a/c/d/l;->a:Lj/d/a/c/d/j;

    invoke-virtual {v0}, Lj/d/a/c/d/j;->g()V

    return-void
.end method
