.class public Lcom/beetalk/sdk/z/e$m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/z/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "m"
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/z/e$m;->b:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/beetalk/sdk/z/e$m;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLcom/beetalk/sdk/z/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/z/e$m;-><init>(Ljava/lang/String;Z)V

    return-void
.end method
