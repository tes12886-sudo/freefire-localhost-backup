.class public final Lcom/facebook/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/d0$a;
    }
.end annotation


# static fields
.field private static volatile d:Lcom/facebook/d0;

.field public static final e:Lcom/facebook/d0$a;


# instance fields
.field private a:Lcom/facebook/b0;

.field private final b:Lh/q/a/a;

.field private final c:Lcom/facebook/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/d0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/d0$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/d0;->e:Lcom/facebook/d0$a;

    return-void
.end method

.method public constructor <init>(Lh/q/a/a;Lcom/facebook/c0;)V
    .locals 1

    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileCache"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/d0;->b:Lh/q/a/a;

    iput-object p2, p0, Lcom/facebook/d0;->c:Lcom/facebook/c0;

    return-void
.end method

.method public static final synthetic a()Lcom/facebook/d0;
    .locals 1

    sget-object v0, Lcom/facebook/d0;->d:Lcom/facebook/d0;

    return-object v0
.end method

.method public static final synthetic b(Lcom/facebook/d0;)V
    .locals 0

    sput-object p0, Lcom/facebook/d0;->d:Lcom/facebook/d0;

    return-void
.end method

.method private final e(Lcom/facebook/b0;Lcom/facebook/b0;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.facebook.sdk.EXTRA_OLD_PROFILE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "com.facebook.sdk.EXTRA_NEW_PROFILE"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/facebook/d0;->b:Lh/q/a/a;

    invoke-virtual {p1, v0}, Lh/q/a/a;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method private final g(Lcom/facebook/b0;Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/d0;->a:Lcom/facebook/b0;

    iput-object p1, p0, Lcom/facebook/d0;->a:Lcom/facebook/b0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/facebook/d0;->c:Lcom/facebook/c0;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lcom/facebook/c0;->c(Lcom/facebook/b0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/facebook/c0;->a()V

    :cond_1
    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/internal/h0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-direct {p0, v0, p1}, Lcom/facebook/d0;->e(Lcom/facebook/b0;Lcom/facebook/b0;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final c()Lcom/facebook/b0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/d0;->a:Lcom/facebook/b0;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/d0;->c:Lcom/facebook/c0;

    invoke-virtual {v0}, Lcom/facebook/c0;->b()Lcom/facebook/b0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/facebook/d0;->g(Lcom/facebook/b0;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final f(Lcom/facebook/b0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/d0;->g(Lcom/facebook/b0;Z)V

    return-void
.end method
