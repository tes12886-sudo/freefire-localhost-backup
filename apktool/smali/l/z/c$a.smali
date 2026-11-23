.class public final Ll/z/c$a;
.super Ll/z/c;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/z/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/z/c$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll/z/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Ll/z/c$a;-><init>()V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ll/z/c$a$a;->a:Ll/z/c$a$a;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    invoke-static {}, Ll/z/c;->a()Ll/z/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/z/c;->b(I)I

    move-result p1

    return p1
.end method

.method public c()I
    .locals 1

    invoke-static {}, Ll/z/c;->a()Ll/z/c;

    move-result-object v0

    invoke-virtual {v0}, Ll/z/c;->c()I

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 1

    invoke-static {}, Ll/z/c;->a()Ll/z/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/z/c;->d(I)I

    move-result p1

    return p1
.end method

.method public e(II)I
    .locals 1

    invoke-static {}, Ll/z/c;->a()Ll/z/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/z/c;->e(II)I

    move-result p1

    return p1
.end method
