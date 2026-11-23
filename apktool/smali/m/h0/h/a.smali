.class public final Lm/h0/h/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/w;


# static fields
.field public static final a:Lm/h0/h/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/h0/h/a;

    invoke-direct {v0}, Lm/h0/h/a;-><init>()V

    sput-object v0, Lm/h0/h/a;->a:Lm/h0/h/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/w$a;)Lm/d0;
    .locals 10

    const-string v0, "chain"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm/h0/i/g;

    invoke-virtual {p1}, Lm/h0/i/g;->f()Lm/h0/h/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/h0/h/e;->w(Lm/h0/i/g;)Lm/h0/h/c;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3d

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lm/h0/i/g;->e(Lm/h0/i/g;ILm/h0/h/c;Lm/b0;IIIILjava/lang/Object;)Lm/h0/i/g;

    move-result-object v0

    invoke-virtual {p1}, Lm/h0/i/g;->j()Lm/b0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm/h0/i/g;->a(Lm/b0;)Lm/d0;

    move-result-object p1

    return-object p1
.end method
