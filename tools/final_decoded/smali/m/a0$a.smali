.class public final Lm/a0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lm/a0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lm/a0;
    .locals 2

    const-string v0, "protocol"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/a0;->c:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm/a0;->d:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lm/a0;->g:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lm/a0;->f:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Lm/a0;->e:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v0, Lm/a0;->h:Lm/a0;

    invoke-static {v0}, Lm/a0;->c(Lm/a0;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_0
    return-object v0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected protocol: "

    invoke-static {v1, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
