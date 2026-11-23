.class Lj/d/a/e/a/a/i/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/apache/http/HttpRequestInterceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lj/d/a/e/a/a/i/a;


# direct methods
.method private constructor <init>(Lj/d/a/e/a/a/i/a;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/a$c;->a:Lj/d/a/e/a/a/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj/d/a/e/a/a/i/a;Lj/d/a/e/a/a/i/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/d/a/e/a/a/i/a$c;-><init>(Lj/d/a/e/a/a/i/a;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 1

    iget-object p2, p0, Lj/d/a/e/a/a/i/a$c;->a:Lj/d/a/e/a/a/i/a;

    invoke-static {p2}, Lj/d/a/e/a/a/i/a;->b(Lj/d/a/e/a/a/i/a;)Lj/d/a/e/a/a/i/a$d;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2}, Lj/d/a/e/a/a/i/a$d;->a(Lj/d/a/e/a/a/i/a$d;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/apache/http/client/methods/HttpUriRequest;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lj/d/a/e/a/a/i/a;->c(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lj/d/a/e/a/a/i/a$d;->b(Lj/d/a/e/a/a/i/a$d;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
