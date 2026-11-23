.class public final Lcom/google/firebase/messaging/d1/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/d1/b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/messaging/d1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/messaging/d1/b$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/d1/b$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/firebase/messaging/d1/b$a;->a()Lcom/google/firebase/messaging/d1/b;

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/messaging/d1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/d1/b;->a:Lcom/google/firebase/messaging/d1/a;

    return-void
.end method

.method public static b()Lcom/google/firebase/messaging/d1/b$a;
    .locals 1

    new-instance v0, Lcom/google/firebase/messaging/d1/b$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/d1/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/firebase/messaging/d1/a;
    .locals 1
    .annotation build Lj/d/a/c/f/g/f0;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/d1/b;->a:Lcom/google/firebase/messaging/d1/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lj/d/a/c/f/g/k;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
