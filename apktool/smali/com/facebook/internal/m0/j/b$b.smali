.class final Lcom/facebook/internal/m0/j/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/m0/j/b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/internal/m0/j/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/internal/m0/j/b$b;

    invoke-direct {v0}, Lcom/facebook/internal/m0/j/b$b;-><init>()V

    sput-object v0, Lcom/facebook/internal/m0/j/b$b;->a:Lcom/facebook/internal/m0/j/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/internal/m0/j/a;Lcom/facebook/internal/m0/j/a;)I
    .locals 1

    const-string v0, "o2"

    invoke-static {p2, v0}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/internal/m0/j/a;->b(Lcom/facebook/internal/m0/j/a;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/facebook/internal/m0/j/a;

    check-cast p2, Lcom/facebook/internal/m0/j/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/internal/m0/j/b$b;->a(Lcom/facebook/internal/m0/j/a;Lcom/facebook/internal/m0/j/a;)I

    move-result p1

    return p1
.end method
