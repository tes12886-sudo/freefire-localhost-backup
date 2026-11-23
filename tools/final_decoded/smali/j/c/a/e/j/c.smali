.class public Lj/c/a/e/j/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/c/a/e/j/c$b;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private a:Lj/c/a/e/j/a$a;

.field private b:Lj/c/a/e/j/c$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj/c/a/e/j/c$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/c/a/e/j/c$a;

    invoke-direct {v0, p0}, Lj/c/a/e/j/c$a;-><init>(Lj/c/a/e/j/c;)V

    iput-object v0, p0, Lj/c/a/e/j/c;->a:Lj/c/a/e/j/a$a;

    sput-object p1, Lj/c/a/e/j/c;->c:Landroid/content/Context;

    iput-object p2, p0, Lj/c/a/e/j/c;->b:Lj/c/a/e/j/c$b;

    return-void
.end method

.method static synthetic a(Lj/c/a/e/j/c;)Lj/c/a/e/j/c$b;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/j/c;->b:Lj/c/a/e/j/c$b;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 3

    new-instance v0, Lj/c/a/e/j/b;

    iget-object v1, p0, Lj/c/a/e/j/c;->a:Lj/c/a/e/j/a$a;

    invoke-direct {v0, v1}, Lj/c/a/e/j/b;-><init>(Lj/c/a/e/j/a$a;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fire strategy by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lj/c/a/e/j/c;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    sget-object v1, Lj/c/a/e/j/c;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lj/c/a/e/j/a;->a(Landroid/content/Context;)V

    return-void
.end method
