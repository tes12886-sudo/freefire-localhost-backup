.class public final Lj/d/d/z/n/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# instance fields
.field private final a:Lj/d/d/z/c;


# direct methods
.method public constructor <init>(Lj/d/d/z/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/e;->a:Lj/d/d/z/c;

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lj/d/d/y/b;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lj/d/d/y/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lj/d/d/z/n/e;->a:Lj/d/d/z/c;

    invoke-virtual {p0, v1, p1, p2, v0}, Lj/d/d/z/n/e;->b(Lj/d/d/z/c;Lj/d/d/e;Lj/d/d/a0/a;Lj/d/d/y/b;)Lj/d/d/w;

    move-result-object p1

    return-object p1
.end method

.method b(Lj/d/d/z/c;Lj/d/d/e;Lj/d/d/a0/a;Lj/d/d/y/b;)Lj/d/d/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/z/c;",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "*>;",
            "Lj/d/d/y/b;",
            ")",
            "Lj/d/d/w<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Lj/d/d/y/b;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lj/d/d/a0/a;->get(Ljava/lang/Class;)Lj/d/d/a0/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/d/d/z/c;->a(Lj/d/d/a0/a;)Lj/d/d/z/i;

    move-result-object p1

    invoke-interface {p1}, Lj/d/d/z/i;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lj/d/d/w;

    if-eqz v0, :cond_0

    check-cast p1, Lj/d/d/w;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lj/d/d/x;

    if-eqz v0, :cond_1

    check-cast p1, Lj/d/d/x;

    invoke-interface {p1, p2, p3}, Lj/d/d/x;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lj/d/d/r;

    if-nez v0, :cond_3

    instance-of v1, p1, Lj/d/d/j;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid attempt to bind an instance of "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lj/d/d/a0/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lj/d/d/r;

    move-object v3, v0

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    instance-of v0, p1, Lj/d/d/j;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Lj/d/d/j;

    :cond_5
    move-object v4, v1

    new-instance p1, Lj/d/d/z/n/l;

    const/4 v7, 0x0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lj/d/d/z/n/l;-><init>(Lj/d/d/r;Lj/d/d/j;Lj/d/d/e;Lj/d/d/a0/a;Lj/d/d/x;)V

    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p4}, Lj/d/d/y/b;->nullSafe()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lj/d/d/w;->a()Lj/d/d/w;

    move-result-object p1

    :cond_6
    return-object p1
.end method
