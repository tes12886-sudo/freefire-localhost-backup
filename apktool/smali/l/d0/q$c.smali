.class final Ll/d0/q$c;
.super Ll/y/c/j;
.source ""

# interfaces
.implements Ll/y/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/d0/q;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ll/c0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/y/c/j;",
        "Ll/y/b/l<",
        "Ll/a0/f;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Ll/d0/q$c;->a:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/y/c/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll/a0/f;

    invoke-virtual {p0, p1}, Ll/d0/q$c;->d(Ll/a0/f;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ll/a0/f;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll/d0/q$c;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ll/d0/q;->n0(Ljava/lang/CharSequence;Ll/a0/f;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
