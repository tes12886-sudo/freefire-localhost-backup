.class public final Ll/c0/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll/c0/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ll/c0/c<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Ll/c0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/c0/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Ll/y/b/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/y/b/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll/c0/c;Ll/y/b/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/c0/c<",
            "+TT;>;",
            "Ll/y/b/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/c0/j;->a:Ll/c0/c;

    iput-object p2, p0, Ll/c0/j;->b:Ll/y/b/l;

    return-void
.end method

.method public static final synthetic b(Ll/c0/j;)Ll/c0/c;
    .locals 0

    iget-object p0, p0, Ll/c0/j;->a:Ll/c0/c;

    return-object p0
.end method

.method public static final synthetic c(Ll/c0/j;)Ll/y/b/l;
    .locals 0

    iget-object p0, p0, Ll/c0/j;->b:Ll/y/b/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Ll/c0/j$a;

    invoke-direct {v0, p0}, Ll/c0/j$a;-><init>(Ll/c0/j;)V

    return-object v0
.end method
