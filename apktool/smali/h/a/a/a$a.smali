.class final Lh/a/a/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/g/a/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/a/a/a;->a(Landroid/content/Context;)Lj/d/b/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh/g/a/b$c<",
        "Lh/a/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lh/a/a/a$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh/g/a/b$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/g/a/b$a<",
            "Lh/a/a/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lh/a/a/a$a;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lh/a/a/a;->g(Landroid/content/Context;Lh/g/a/b$a;)V

    const-string p1, "getAdvertisingIdInfo"

    return-object p1
.end method
