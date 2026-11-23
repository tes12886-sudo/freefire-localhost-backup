.class public final synthetic Lcom/google/firebase/components/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Map$Entry;

.field public final synthetic b:Lcom/google/firebase/events/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lcom/google/firebase/events/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/components/h;->a:Ljava/util/Map$Entry;

    iput-object p2, p0, Lcom/google/firebase/components/h;->b:Lcom/google/firebase/events/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/components/h;->a:Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/google/firebase/components/h;->b:Lcom/google/firebase/events/a;

    invoke-static {v0, v1}, Lcom/google/firebase/components/w;->g(Ljava/util/Map$Entry;Lcom/google/firebase/events/a;)V

    return-void
.end method
