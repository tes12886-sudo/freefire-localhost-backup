.class final Ll/t/a$a;
.super Ll/y/c/j;
.source ""

# interfaces
.implements Ll/y/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/t/a;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/y/c/j;",
        "Ll/y/b/l<",
        "TE;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ll/t/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/t/a<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ll/t/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/t/a<",
            "+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ll/t/a$a;->a:Ll/t/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/y/c/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ll/t/a$a;->d(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/CharSequence;"
        }
    .end annotation

    iget-object v0, p0, Ll/t/a$a;->a:Ll/t/a;

    if-ne p1, v0, :cond_0

    const-string p1, "(this Collection)"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
