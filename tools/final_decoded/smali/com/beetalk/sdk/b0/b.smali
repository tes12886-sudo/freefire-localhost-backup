.class public Lcom/beetalk/sdk/b0/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/b0/b$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:[B


# direct methods
.method private constructor <init>(Lcom/beetalk/sdk/b0/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/beetalk/sdk/b0/b$b;->a(Lcom/beetalk/sdk/b0/b$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/b0/b;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/b$b;->b(Lcom/beetalk/sdk/b0/b$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/b0/b;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/b$b;->c(Lcom/beetalk/sdk/b0/b$b;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/b0/b;->c:[B

    return-void
.end method

.method synthetic constructor <init>(Lcom/beetalk/sdk/b0/b$b;Lcom/beetalk/sdk/b0/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/b0/b;-><init>(Lcom/beetalk/sdk/b0/b$b;)V

    return-void
.end method
