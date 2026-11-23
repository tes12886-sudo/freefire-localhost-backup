.class public Ll/y/c/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ll/y/c/n;

.field private static final b:[Ll/b0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/y/c/n;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ll/y/c/n;

    invoke-direct {v0}, Ll/y/c/n;-><init>()V

    :goto_1
    sput-object v0, Ll/y/c/m;->a:Ll/y/c/n;

    const/4 v0, 0x0

    new-array v0, v0, [Ll/b0/a;

    sput-object v0, Ll/y/c/m;->b:[Ll/b0/a;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Ll/b0/a;
    .locals 1

    sget-object v0, Ll/y/c/m;->a:Ll/y/c/n;

    invoke-virtual {v0, p0}, Ll/y/c/n;->a(Ljava/lang/Class;)Ll/b0/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ll/y/c/j;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ll/y/c/m;->a:Ll/y/c/n;

    invoke-virtual {v0, p0}, Ll/y/c/n;->c(Ll/y/c/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
