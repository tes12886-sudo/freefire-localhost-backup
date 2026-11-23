.class Lj/d/d/z/c$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/z/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/c;->b(Ljava/lang/Class;)Lj/d/d/z/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/d/z/i<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Lj/d/d/z/c;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lj/d/d/z/c$k;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lj/d/d/l;

    iget-object v1, p0, Lj/d/d/z/c$k;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lj/d/d/l;-><init>(Ljava/lang/String;)V

    throw v0
.end method
