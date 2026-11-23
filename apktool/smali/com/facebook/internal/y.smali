.class public final Lcom/facebook/internal/y;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/internal/y;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static final b()Z
    .locals 6

    sget-object v0, Lcom/facebook/internal/y;->a:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "Unity."

    invoke-static {v0, v5, v2, v3, v4}, Ll/d0/g;->x(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
