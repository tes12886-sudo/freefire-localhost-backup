.class public final Lcom/google/android/datatransport/h/z/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/datatransport/h/u/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/h/z/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/datatransport/h/u/a/b<",
        "Lcom/google/android/datatransport/h/z/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/datatransport/h/z/c;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/h/z/c$a;->a()Lcom/google/android/datatransport/h/z/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lcom/google/android/datatransport/h/z/a;
    .locals 2

    invoke-static {}, Lcom/google/android/datatransport/h/z/b;->a()Lcom/google/android/datatransport/h/z/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/google/android/datatransport/h/u/a/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/datatransport/h/z/a;

    return-object v0
.end method


# virtual methods
.method public c()Lcom/google/android/datatransport/h/z/a;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/h/z/c;->b()Lcom/google/android/datatransport/h/z/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/datatransport/h/z/c;->c()Lcom/google/android/datatransport/h/z/a;

    move-result-object v0

    return-object v0
.end method
