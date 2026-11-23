.class public Lcom/beetalk/sdk/b$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/b$e$a;
    }
.end annotation


# instance fields
.field final a:Lcom/beetalk/sdk/b$e$a;

.field final b:Lcom/beetalk/sdk/u/a;

.field final c:I

.field final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/b$e$a;Lcom/beetalk/sdk/u/a;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/beetalk/sdk/b$e;->a:Lcom/beetalk/sdk/b$e$a;

    iput-object p3, p0, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    iput p5, p0, Lcom/beetalk/sdk/b$e;->c:I

    iput-object p6, p0, Lcom/beetalk/sdk/b$e;->d:Ljava/lang/String;

    return-void
.end method

.method static a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0, v0, p1}, Lcom/beetalk/sdk/b$e;->b(Lcom/beetalk/sdk/b$c;Ljava/lang/String;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p0

    return-object p0
.end method

.method static b(Lcom/beetalk/sdk/b$c;Ljava/lang/String;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;
    .locals 9

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const-string p1, ": "

    invoke-static {p1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/beetalk/sdk/b$e;

    sget-object v3, Lcom/beetalk/sdk/b$e$a;->c:Lcom/beetalk/sdk/b$e$a;

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v2, p0

    move v6, p3

    invoke-direct/range {v1 .. v8}, Lcom/beetalk/sdk/b$e;-><init>(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/b$e$a;Lcom/beetalk/sdk/u/a;Ljava/lang/String;ILjava/lang/String;I)V

    return-object p1
.end method

.method static c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;
    .locals 9

    new-instance v8, Lcom/beetalk/sdk/b$e;

    sget-object v2, Lcom/beetalk/sdk/b$e$a;->a:Lcom/beetalk/sdk/b$e$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v3, p1

    move-object v6, p2

    move v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/beetalk/sdk/b$e;-><init>(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/b$e$a;Lcom/beetalk/sdk/u/a;Ljava/lang/String;ILjava/lang/String;I)V

    return-object v8
.end method

.method public static d(Lcom/beetalk/sdk/b$e$a;)Z
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/b$e$a;->a:Lcom/beetalk/sdk/b$e$a;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
