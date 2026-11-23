.class final synthetic Lj/d/a/c/d/q;
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

    iput-object p1, p0, Lj/d/a/c/d/q;->a:Lj/d/a/c/d/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lj/d/a/c/d/q;->a:Lj/d/a/c/d/j;

    const/4 v1, 0x2

    const-string v2, "Service disconnected"

    invoke-virtual {v0, v1, v2}, Lj/d/a/c/d/j;->c(ILjava/lang/String;)V

    return-void
.end method
