.class final Lo/m$a;
.super Ll/y/c/j;
.source ""

# interfaces
.implements Ll/y/b/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/m;->a(Lo/d;Ll/v/a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/y/c/j;",
        "Ll/y/b/l<",
        "Ljava/lang/Throwable;",
        "Ll/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/d;


# direct methods
.method constructor <init>(Lo/d;)V
    .locals 0

    iput-object p1, p0, Lo/m$a;->a:Lo/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/y/c/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lo/m$a;->d(Ljava/lang/Throwable;)V

    sget-object p1, Ll/s;->a:Ll/s;

    return-object p1
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lo/m$a;->a:Lo/d;

    invoke-interface {p1}, Lo/d;->cancel()V

    return-void
.end method
