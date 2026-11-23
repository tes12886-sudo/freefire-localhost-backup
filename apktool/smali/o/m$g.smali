.class final Lo/m$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/m;->d(Ljava/lang/Exception;Ll/v/a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll/v/a;

.field final synthetic b:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Ll/v/a;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lo/m$g;->a:Ll/v/a;

    iput-object p2, p0, Lo/m$g;->b:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lo/m$g;->a:Ll/v/a;

    invoke-static {v0}, Ll/v/d/b;->a(Ll/v/a;)Ll/v/a;

    move-result-object v0

    iget-object v1, p0, Lo/m$g;->b:Ljava/lang/Exception;

    sget-object v2, Ll/m;->a:Ll/m$a;

    invoke-static {v1}, Ll/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Ll/v/a;->b(Ljava/lang/Object;)V

    return-void
.end method
