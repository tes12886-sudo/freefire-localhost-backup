.class final Lj/d/a/c/f/h/z;
.super Lj/d/a/c/f/h/v;
.source ""


# instance fields
.field private final c:Lj/d/a/c/f/h/b0;


# direct methods
.method constructor <init>(Lj/d/a/c/f/h/b0;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lj/d/a/c/f/h/v;-><init>(II)V

    iput-object p1, p0, Lj/d/a/c/f/h/z;->c:Lj/d/a/c/f/h/b0;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj/d/a/c/f/h/z;->c:Lj/d/a/c/f/h/b0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
