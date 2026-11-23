.class public final Lcom/facebook/internal/m0/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/m0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/m0/b;
    .locals 2

    new-instance v0, Lcom/facebook/internal/m0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/internal/m0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/y/c/f;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Throwable;Lcom/facebook/internal/m0/b$c;)Lcom/facebook/internal/m0/b;
    .locals 2

    const-string v0, "t"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/internal/m0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/internal/m0/b;-><init>(Ljava/lang/Throwable;Lcom/facebook/internal/m0/b$c;Ll/y/c/f;)V

    return-object v0
.end method

.method public static final c(Lorg/json/JSONArray;)Lcom/facebook/internal/m0/b;
    .locals 2

    const-string v0, "features"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/internal/m0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/internal/m0/b;-><init>(Lorg/json/JSONArray;Ll/y/c/f;)V

    return-object v0
.end method

.method public static final d(Ljava/io/File;)Lcom/facebook/internal/m0/b;
    .locals 2

    const-string v0, "file"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/internal/m0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/internal/m0/b;-><init>(Ljava/io/File;Ll/y/c/f;)V

    return-object v0
.end method
