.class public final Lj/d/d/z/n/j;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lj/d/d/x;


# instance fields
.field private final a:Lj/d/d/e;

.field private final b:Lj/d/d/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj/d/d/u;->a:Lj/d/d/u;

    invoke-static {v0}, Lj/d/d/z/n/j;->f(Lj/d/d/v;)Lj/d/d/x;

    move-result-object v0

    sput-object v0, Lj/d/d/z/n/j;->c:Lj/d/d/x;

    return-void
.end method

.method private constructor <init>(Lj/d/d/e;Lj/d/d/v;)V
    .locals 0

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/j;->a:Lj/d/d/e;

    iput-object p2, p0, Lj/d/d/z/n/j;->b:Lj/d/d/v;

    return-void
.end method

.method synthetic constructor <init>(Lj/d/d/e;Lj/d/d/v;Lj/d/d/z/n/j$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/d/d/z/n/j;-><init>(Lj/d/d/e;Lj/d/d/v;)V

    return-void
.end method

.method public static e(Lj/d/d/v;)Lj/d/d/x;
    .locals 1

    sget-object v0, Lj/d/d/u;->a:Lj/d/d/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Lj/d/d/z/n/j;->c:Lj/d/d/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Lj/d/d/z/n/j;->f(Lj/d/d/v;)Lj/d/d/x;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lj/d/d/v;)Lj/d/d/x;
    .locals 1

    new-instance v0, Lj/d/d/z/n/j$a;

    invoke-direct {v0, p0}, Lj/d/d/z/n/j$a;-><init>(Lj/d/d/v;)V

    return-object v0
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/z/n/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->d0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lj/d/d/z/n/j;->b:Lj/d/d/v;

    invoke-interface {v0, p1}, Lj/d/d/v;->a(Lj/d/d/b0/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lj/d/d/b0/a;->l0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v0, Lj/d/d/z/h;

    invoke-direct {v0}, Lj/d/d/z/h;-><init>()V

    invoke-virtual {p1}, Lj/d/d/b0/a;->c()V

    :goto_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/a;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lj/d/d/z/n/j;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->F()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lj/d/d/b0/a;->b()V

    :goto_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lj/d/d/z/n/j;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->u()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    return-void

    :cond_0
    iget-object v0, p0, Lj/d/d/z/n/j;->a:Lj/d/d/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/d/d/e;->n(Ljava/lang/Class;)Lj/d/d/w;

    move-result-object v0

    instance-of v1, v0, Lj/d/d/z/n/j;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj/d/d/b0/c;->j()Lj/d/d/b0/c;

    invoke-virtual {p1}, Lj/d/d/b0/c;->F()Lj/d/d/b0/c;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
