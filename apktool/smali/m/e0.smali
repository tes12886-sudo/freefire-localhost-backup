.class public abstract Lm/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/e0$a;,
        Lm/e0$b;
    }
.end annotation


# static fields
.field public static final b:Lm/e0$b;


# instance fields
.field private a:Ljava/io/Reader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm/e0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/e0$b;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/e0;->b:Lm/e0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f()Ljava/nio/charset/Charset;
    .locals 2

    invoke-virtual {p0}, Lm/e0;->l()Lm/x;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Ll/d0/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lm/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Ll/d0/d;->b:Ljava/nio/charset/Charset;

    :cond_1
    return-object v0
.end method

.method public static final u(Lm/x;JLn/d;)Lm/e0;
    .locals 1

    sget-object v0, Lm/e0;->b:Lm/e0$b;

    invoke-virtual {v0, p0, p1, p2, p3}, Lm/e0$b;->a(Lm/x;JLn/d;)Lm/e0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract F()Ln/d;
.end method

.method public final O()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lm/e0;->F()Ln/d;

    move-result-object v0

    :try_start_0
    invoke-direct {p0}, Lm/e0;->f()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lm/h0/d;->H(Ln/d;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {v0, v1}, Ln/d;->V(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ll/x/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ll/x/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final b()Ljava/io/InputStream;
    .locals 1

    invoke-virtual {p0}, Lm/e0;->F()Ln/d;

    move-result-object v0

    invoke-interface {v0}, Ln/d;->W()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/io/Reader;
    .locals 3

    iget-object v0, p0, Lm/e0;->a:Ljava/io/Reader;

    if-nez v0, :cond_0

    new-instance v0, Lm/e0$a;

    invoke-virtual {p0}, Lm/e0;->F()Ln/d;

    move-result-object v1

    invoke-direct {p0}, Lm/e0;->f()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm/e0$a;-><init>(Ln/d;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lm/e0;->a:Ljava/io/Reader;

    :cond_0
    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lm/e0;->F()Ln/d;

    move-result-object v0

    invoke-static {v0}, Lm/h0/d;->j(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract j()J
.end method

.method public abstract l()Lm/x;
.end method
