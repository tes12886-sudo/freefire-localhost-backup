.class final Lj/d/a/c/f/g/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/i/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/i/d<",
        "Lj/d/a/c/f/g/k;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lj/d/a/c/f/g/i;

.field private static final b:Lcom/google/firebase/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/a/c/f/g/i;

    invoke-direct {v0}, Lj/d/a/c/f/g/i;-><init>()V

    sput-object v0, Lj/d/a/c/f/g/i;->a:Lj/d/a/c/f/g/i;

    const-string v0, "messagingClientEventExtension"

    invoke-static {v0}, Lcom/google/firebase/i/c;->d(Ljava/lang/String;)Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/i;->b:Lcom/google/firebase/i/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lj/d/a/c/f/g/k;

    check-cast p2, Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/i;->b:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lj/d/a/c/f/g/k;->b()Lcom/google/firebase/messaging/d1/b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    return-void
.end method
