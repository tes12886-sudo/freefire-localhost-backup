.class Lj/d/d/z/c$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/z/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/d/d/z/c;->a(Lj/d/d/a0/a;)Lj/d/d/z/i;
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
.field final synthetic a:Lj/d/d/g;

.field final synthetic b:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lj/d/d/z/c;Lj/d/d/g;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p2, p0, Lj/d/d/z/c$j;->a:Lj/d/d/g;

    iput-object p3, p0, Lj/d/d/z/c$j;->b:Ljava/lang/reflect/Type;

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

    iget-object v0, p0, Lj/d/d/z/c$j;->a:Lj/d/d/g;

    iget-object v1, p0, Lj/d/d/z/c$j;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Lj/d/d/g;->a(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
