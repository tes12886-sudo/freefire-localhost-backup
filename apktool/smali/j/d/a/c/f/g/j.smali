.class public final Lj/d/a/c/f/g/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/i/h/a;


# static fields
.field public static final a:Lcom/google/firebase/i/h/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/a/c/f/g/j;

    invoke-direct {v0}, Lj/d/a/c/f/g/j;-><init>()V

    sput-object v0, Lj/d/a/c/f/g/j;->a:Lcom/google/firebase/i/h/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/i/h/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/i/h/b<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Lj/d/a/c/f/g/k;

    sget-object v1, Lj/d/a/c/f/g/i;->a:Lj/d/a/c/f/g/i;

    invoke-interface {p1, v0, v1}, Lcom/google/firebase/i/h/b;->a(Ljava/lang/Class;Lcom/google/firebase/i/d;)Lcom/google/firebase/i/h/b;

    const-class v0, Lcom/google/firebase/messaging/d1/b;

    sget-object v1, Lj/d/a/c/f/g/h;->a:Lj/d/a/c/f/g/h;

    invoke-interface {p1, v0, v1}, Lcom/google/firebase/i/h/b;->a(Ljava/lang/Class;Lcom/google/firebase/i/d;)Lcom/google/firebase/i/h/b;

    const-class v0, Lcom/google/firebase/messaging/d1/a;

    sget-object v1, Lj/d/a/c/f/g/a;->a:Lj/d/a/c/f/g/a;

    invoke-interface {p1, v0, v1}, Lcom/google/firebase/i/h/b;->a(Ljava/lang/Class;Lcom/google/firebase/i/d;)Lcom/google/firebase/i/h/b;

    return-void
.end method
