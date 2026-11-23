.class public final Ll/c0/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;
.implements Ll/y/c/q/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/c0/i;->a(Ll/c0/c;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;",
        "Ll/y/c/q/a;"
    }
.end annotation


# instance fields
.field final synthetic a:Ll/c0/c;


# direct methods
.method public constructor <init>(Ll/c0/c;)V
    .locals 0

    iput-object p1, p0, Ll/c0/i$a;->a:Ll/c0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ll/c0/i$a;->a:Ll/c0/c;

    invoke-interface {v0}, Ll/c0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
