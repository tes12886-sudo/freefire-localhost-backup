.class abstract Lj/e/b/h/a/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/e/b/h/a/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj/e/b/h/a/a/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lj/e/b/h/a/a/b;


# direct methods
.method constructor <init>()V
    .locals 1

    new-instance v0, Lj/e/b/h/a/a/b;

    invoke-direct {v0}, Lj/e/b/h/a/a/b;-><init>()V

    invoke-direct {p0, v0}, Lj/e/b/h/a/b;-><init>(Lj/e/b/h/a/a/b;)V

    return-void
.end method

.method private constructor <init>(Lj/e/b/h/a/a/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/b/h/a/b;->a:Lj/e/b/h/a/a/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lj/e/b/h/a/b;->a:Lj/e/b/h/a/a/b;

    invoke-virtual {v0, p1}, Lj/e/b/h/a/a/b;->b(Ljava/io/InputStream;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/e/b/h/a/b;->b(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method abstract b(Lorg/json/JSONObject;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation
.end method
