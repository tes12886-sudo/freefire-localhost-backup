.class public abstract Lm/c0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/c0$a;
    }
.end annotation


# static fields
.field public static final a:Lm/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/c0$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/c0;->a:Lm/c0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Lm/x;Ljava/lang/String;)Lm/c0;
    .locals 1

    sget-object v0, Lm/c0;->a:Lm/c0$a;

    invoke-virtual {v0, p0, p1}, Lm/c0$a;->b(Lm/x;Ljava/lang/String;)Lm/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lm/x;Ln/e;)Lm/c0;
    .locals 1

    sget-object v0, Lm/c0;->a:Lm/c0$a;

    invoke-virtual {v0, p0, p1}, Lm/c0$a;->c(Lm/x;Ln/e;)Lm/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lm/x;[B)Lm/c0;
    .locals 1

    sget-object v0, Lm/c0;->a:Lm/c0$a;

    invoke-virtual {v0, p0, p1}, Lm/c0$a;->d(Lm/x;[B)Lm/c0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public abstract b()Lm/x;
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract h(Ln/c;)V
.end method
