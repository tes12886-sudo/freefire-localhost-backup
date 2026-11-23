.class final Lj/d/d/z/n/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/q;
.implements Lj/d/d/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/n/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lj/d/d/z/n/l;


# direct methods
.method private constructor <init>(Lj/d/d/z/n/l;)V
    .locals 0

    iput-object p1, p0, Lj/d/d/z/n/l$b;->a:Lj/d/d/z/n/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj/d/d/z/n/l;Lj/d/d/z/n/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/d/d/z/n/l$b;-><init>(Lj/d/d/z/n/l;)V

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/k;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/k;",
            "Ljava/lang/reflect/Type;",
            ")TR;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/n/l$b;->a:Lj/d/d/z/n/l;

    iget-object v0, v0, Lj/d/d/z/n/l;->c:Lj/d/d/e;

    invoke-virtual {v0, p1, p2}, Lj/d/d/e;->h(Lj/d/d/k;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
