.class public final Ll/z/b;
.super Ll/z/a;
.source ""


# instance fields
.field private final c:Ll/z/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll/z/a;-><init>()V

    new-instance v0, Ll/z/b$a;

    invoke-direct {v0}, Ll/z/b$a;-><init>()V

    iput-object v0, p0, Ll/z/b;->c:Ll/z/b$a;

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Ll/z/b;->c:Ll/z/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
