.class public final Lcom/facebook/j0/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "jsonString"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/j0/c$b;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/facebook/j0/c$b;->b:Z

    iput-boolean p3, p0, Lcom/facebook/j0/c$b;->c:Z

    iput-object p4, p0, Lcom/facebook/j0/c$b;->d:Ljava/lang/String;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lcom/facebook/j0/c;

    iget-object v1, p0, Lcom/facebook/j0/c$b;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/facebook/j0/c$b;->b:Z

    iget-boolean v3, p0, Lcom/facebook/j0/c$b;->c:Z

    iget-object v4, p0, Lcom/facebook/j0/c$b;->d:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/j0/c;-><init>(Ljava/lang/String;ZZLjava/lang/String;Ll/y/c/f;)V

    return-object v6
.end method
