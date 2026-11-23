.class public final Lcom/google/android/datatransport/h/x/j/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/datatransport/h/u/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/datatransport/h/u/a/b<",
        "Lcom/google/android/datatransport/h/x/j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/z;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lk/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/h0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/z;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/h0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/datatransport/h/x/j/g0;->a:Lk/a/a;

    iput-object p2, p0, Lcom/google/android/datatransport/h/x/j/g0;->b:Lk/a/a;

    iput-object p3, p0, Lcom/google/android/datatransport/h/x/j/g0;->c:Lk/a/a;

    iput-object p4, p0, Lcom/google/android/datatransport/h/x/j/g0;->d:Lk/a/a;

    return-void
.end method

.method public static a(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)Lcom/google/android/datatransport/h/x/j/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/z/a;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/z;",
            ">;",
            "Lk/a/a<",
            "Lcom/google/android/datatransport/h/x/j/h0;",
            ">;)",
            "Lcom/google/android/datatransport/h/x/j/g0;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/datatransport/h/x/j/g0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/datatransport/h/x/j/g0;-><init>(Lk/a/a;Lk/a/a;Lk/a/a;Lk/a/a;)V

    return-object v0
.end method

.method public static c(Lcom/google/android/datatransport/h/z/a;Lcom/google/android/datatransport/h/z/a;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/datatransport/h/x/j/f0;
    .locals 1

    new-instance v0, Lcom/google/android/datatransport/h/x/j/f0;

    check-cast p2, Lcom/google/android/datatransport/h/x/j/z;

    check-cast p3, Lcom/google/android/datatransport/h/x/j/h0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/datatransport/h/x/j/f0;-><init>(Lcom/google/android/datatransport/h/z/a;Lcom/google/android/datatransport/h/z/a;Lcom/google/android/datatransport/h/x/j/z;Lcom/google/android/datatransport/h/x/j/h0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/google/android/datatransport/h/x/j/f0;
    .locals 4

    iget-object v0, p0, Lcom/google/android/datatransport/h/x/j/g0;->a:Lk/a/a;

    invoke-interface {v0}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/datatransport/h/z/a;

    iget-object v1, p0, Lcom/google/android/datatransport/h/x/j/g0;->b:Lk/a/a;

    invoke-interface {v1}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/datatransport/h/z/a;

    iget-object v2, p0, Lcom/google/android/datatransport/h/x/j/g0;->c:Lk/a/a;

    invoke-interface {v2}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/datatransport/h/x/j/g0;->d:Lk/a/a;

    invoke-interface {v3}, Lk/a/a;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/datatransport/h/x/j/g0;->c(Lcom/google/android/datatransport/h/z/a;Lcom/google/android/datatransport/h/z/a;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/datatransport/h/x/j/f0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/datatransport/h/x/j/g0;->b()Lcom/google/android/datatransport/h/x/j/f0;

    move-result-object v0

    return-object v0
.end method
