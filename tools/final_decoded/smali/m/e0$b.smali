.class public final Lm/e0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lm/e0$b;-><init>()V

    return-void
.end method

.method public static synthetic d(Lm/e0$b;[BLm/x;ILjava/lang/Object;)Lm/e0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lm/e0$b;->c([BLm/x;)Lm/e0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lm/x;JLn/d;)Lm/e0;
    .locals 1

    const-string v0, "content"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p2, p3}, Lm/e0$b;->b(Ln/d;Lm/x;J)Lm/e0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ln/d;Lm/x;J)Lm/e0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/e0$b$a;

    invoke-direct {v0, p2, p3, p4, p1}, Lm/e0$b$a;-><init>(Lm/x;JLn/d;)V

    return-object v0
.end method

.method public final c([BLm/x;)Lm/e0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    invoke-virtual {v0, p1}, Ln/b;->w0([B)Ln/b;

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lm/e0$b;->b(Ln/d;Lm/x;J)Lm/e0;

    move-result-object p1

    return-object p1
.end method
