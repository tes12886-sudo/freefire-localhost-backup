.class abstract Lcom/google/android/datatransport/h/x/j/z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/h/x/j/z$a;
    }
.end annotation


# static fields
.field static final a:Lcom/google/android/datatransport/h/x/j/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/google/android/datatransport/h/x/j/z;->a()Lcom/google/android/datatransport/h/x/j/z$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    invoke-virtual {v0, v1, v2}, Lcom/google/android/datatransport/h/x/j/z$a;->f(J)Lcom/google/android/datatransport/h/x/j/z$a;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/google/android/datatransport/h/x/j/z$a;->d(I)Lcom/google/android/datatransport/h/x/j/z$a;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lcom/google/android/datatransport/h/x/j/z$a;->b(I)Lcom/google/android/datatransport/h/x/j/z$a;

    const-wide/32 v1, 0x240c8400

    invoke-virtual {v0, v1, v2}, Lcom/google/android/datatransport/h/x/j/z$a;->c(J)Lcom/google/android/datatransport/h/x/j/z$a;

    const v1, 0x14000

    invoke-virtual {v0, v1}, Lcom/google/android/datatransport/h/x/j/z$a;->e(I)Lcom/google/android/datatransport/h/x/j/z$a;

    invoke-virtual {v0}, Lcom/google/android/datatransport/h/x/j/z$a;->a()Lcom/google/android/datatransport/h/x/j/z;

    move-result-object v0

    sput-object v0, Lcom/google/android/datatransport/h/x/j/z;->a:Lcom/google/android/datatransport/h/x/j/z;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lcom/google/android/datatransport/h/x/j/z$a;
    .locals 1

    new-instance v0, Lcom/google/android/datatransport/h/x/j/w$b;

    invoke-direct {v0}, Lcom/google/android/datatransport/h/x/j/w$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method abstract b()I
.end method

.method abstract c()J
.end method

.method abstract d()I
.end method

.method abstract e()I
.end method

.method abstract f()J
.end method
