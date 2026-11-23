.class final Lj/d/a/c/h/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lj/d/a/c/h/a;


# direct methods
.method constructor <init>(Lj/d/a/c/h/a;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/c/h/b;->a:Lj/d/a/c/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj/d/a/c/h/b;->a:Lj/d/a/c/h/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lj/d/a/c/h/a;->g(Lj/d/a/c/h/a;I)V

    return-void
.end method
