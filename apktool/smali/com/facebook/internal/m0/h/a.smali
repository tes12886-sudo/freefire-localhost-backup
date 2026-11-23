.class public final Lcom/facebook/internal/m0/h/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/m0/h/a$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;

.field private static c:Lcom/facebook/internal/m0/h/a;

.field public static final d:Lcom/facebook/internal/m0/h/a$a;


# instance fields
.field private final a:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/m0/h/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/m0/h/a$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/internal/m0/h/a;->d:Lcom/facebook/internal/m0/h/a$a;

    const-class v0, Lcom/facebook/internal/m0/h/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/m0/h/a;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/internal/m0/h/a;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/internal/m0/h/a;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public static final synthetic a()Lcom/facebook/internal/m0/h/a;
    .locals 1

    sget-object v0, Lcom/facebook/internal/m0/h/a;->c:Lcom/facebook/internal/m0/h/a;

    return-object v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/internal/m0/h/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic c(Lcom/facebook/internal/m0/h/a;)V
    .locals 0

    sput-object p0, Lcom/facebook/internal/m0/h/a;->c:Lcom/facebook/internal/m0/h/a;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "t"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/facebook/internal/m0/f;->f(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/facebook/internal/m0/a;->b(Ljava/lang/Throwable;)V

    sget-object v0, Lcom/facebook/internal/m0/b$c;->d:Lcom/facebook/internal/m0/b$c;

    invoke-static {p2, v0}, Lcom/facebook/internal/m0/b$a;->b(Ljava/lang/Throwable;Lcom/facebook/internal/m0/b$c;)Lcom/facebook/internal/m0/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/internal/m0/b;->g()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/m0/h/a;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
