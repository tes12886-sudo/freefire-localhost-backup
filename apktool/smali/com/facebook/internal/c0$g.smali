.class public final Lcom/facebook/internal/c0$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/c0$g$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/internal/c0$g$a;


# instance fields
.field private a:Lcom/facebook/internal/c0$f;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/c0$g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/c0$g$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/internal/c0$g;->c:Lcom/facebook/internal/c0$g$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/internal/c0$g;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/internal/c0$g;Lcom/facebook/internal/c0$f;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/c0$g;->a:Lcom/facebook/internal/c0$f;

    return-void
.end method

.method public static final synthetic b(Lcom/facebook/internal/c0$g;I)V
    .locals 0

    iput p1, p0, Lcom/facebook/internal/c0$g;->b:I

    return-void
.end method


# virtual methods
.method public final c()Lcom/facebook/internal/c0$f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/c0$g;->a:Lcom/facebook/internal/c0$f;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/facebook/internal/c0$g;->b:I

    return v0
.end method
