.class public interface abstract Lm/h0/k/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/k/l$a;
    }
.end annotation


# static fields
.field public static final a:Lm/h0/k/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm/h0/k/l$a;->a:Lm/h0/k/l$a;

    new-instance v0, Lm/h0/k/l$a$a;

    invoke-direct {v0}, Lm/h0/k/l$a$a;-><init>()V

    sput-object v0, Lm/h0/k/l;->a:Lm/h0/k/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract b(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract c(ILm/h0/k/b;)V
.end method

.method public abstract d(ILn/d;IZ)Z
.end method
