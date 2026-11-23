.class public Lcom/gamesafe/ano/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile d:Lcom/gamesafe/ano/h;


# instance fields
.field public a:Lcom/gamesafe/ano/g$a;

.field private b:Lcom/gamesafe/ano/g;

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/gamesafe/ano/i;

    invoke-direct {v0, p0}, Lcom/gamesafe/ano/i;-><init>(Lcom/gamesafe/ano/h;)V

    iput-object v0, p0, Lcom/gamesafe/ano/h;->a:Lcom/gamesafe/ano/g$a;

    return-void
.end method

.method static synthetic a(Lcom/gamesafe/ano/h;Lcom/gamesafe/ano/g;)Lcom/gamesafe/ano/g;
    .locals 0

    iput-object p1, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    return-object p1
.end method

.method public static a()Lcom/gamesafe/ano/h;
    .locals 2

    sget-object v0, Lcom/gamesafe/ano/h;->d:Lcom/gamesafe/ano/h;

    if-nez v0, :cond_1

    const-class v0, Lcom/gamesafe/ano/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/gamesafe/ano/h;->d:Lcom/gamesafe/ano/h;

    if-nez v1, :cond_0

    new-instance v1, Lcom/gamesafe/ano/h;

    invoke-direct {v1}, Lcom/gamesafe/ano/h;-><init>()V

    sput-object v1, Lcom/gamesafe/ano/h;->d:Lcom/gamesafe/ano/h;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/gamesafe/ano/h;->d:Lcom/gamesafe/ano/h;

    return-object v0
.end method

.method static synthetic a(Lcom/gamesafe/ano/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/gamesafe/ano/h;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Lcom/gamesafe/ano/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/gamesafe/ano/h;->c:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gamesafe/ano/g$a;)V
    .locals 7

    new-instance v6, Lcom/gamesafe/ano/k;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/gamesafe/ano/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gamesafe/ano/g$a;)V

    iput-object v6, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    invoke-interface {v6}, Lcom/gamesafe/ano/g;->a()V

    return-void
.end method

.method private a(Lcom/gamesafe/ano/g;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/gamesafe/ano/h;->c:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    invoke-interface {p1}, Lcom/gamesafe/ano/g;->c()V

    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/gamesafe/ano/h;)Lcom/gamesafe/ano/g;
    .locals 0

    iget-object p0, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    return-object p0
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gamesafe/ano/g$a;)V
    .locals 10

    const-string v0, ";"

    invoke-virtual {p4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_2

    array-length v0, p4

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-object v6, p4, v0

    const/4 v0, 0x1

    aget-object v0, p4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    aget-object p4, p4, v1

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    if-le v8, v7, :cond_1

    return-void

    :cond_1
    new-instance p4, Lcom/gamesafe/ano/d;

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v9, p5

    invoke-direct/range {v2 .. v9}, Lcom/gamesafe/ano/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/gamesafe/ano/g$a;)V

    iput-object p4, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    invoke-interface {p4}, Lcom/gamesafe/ano/g;->a()V

    return-void

    :cond_2
    :goto_0
    const-string p1, "*#07#:OnnNyfHznnvbzWjs.kvmnzViyNcjr xhy zmm"

    invoke-static {p1}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/gamesafe/ano/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    invoke-direct {p0, v0, p1}, Lcom/gamesafe/ano/h;->a(Lcom/gamesafe/ano/g;Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/gamesafe/ano/h;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 9

    const-string v0, "hnbwjs:"

    invoke-static {v0}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "\\|"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    array-length v1, p1

    const/16 v2, 0x8

    if-ge v1, v2, :cond_1

    goto :goto_3

    :cond_1
    const/4 v1, 0x0

    aget-object v1, p1, v1

    const/4 v2, 0x1

    aget-object v5, p1, v2

    const/4 v2, 0x2

    aget-object v6, p1, v2

    const/4 v2, 0x3

    aget-object v7, p1, v2

    const/4 v2, 0x4

    aget-object v2, p1, v2

    aget-object p1, p1, v0

    invoke-static {}, Lcom/gamesafe/ano/c;->d()Landroid/app/Activity;

    move-result-object v4

    if-nez v4, :cond_2

    const-string p1, "*#07#:bzoXpmmzioVxodqdot avdgzy"

    :goto_0
    invoke-static {p1}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/gamesafe/ano/b;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    if-eqz v0, :cond_4

    const-string v0, "1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/gamesafe/ano/h;->b:Lcom/gamesafe/ano/g;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/gamesafe/ano/h;->a(Lcom/gamesafe/ano/g;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    :goto_1
    iput-object v1, p0, Lcom/gamesafe/ano/h;->c:Ljava/lang/String;

    const-string p1, "1010"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object v8, p0, Lcom/gamesafe/ano/h;->a:Lcom/gamesafe/ano/g$a;

    move-object v3, p0

    move-object v7, v2

    invoke-direct/range {v3 .. v8}, Lcom/gamesafe/ano/h;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gamesafe/ano/g$a;)V

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/gamesafe/ano/h;->c:Ljava/lang/String;

    const-string v0, "1011"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object v8, p0, Lcom/gamesafe/ano/h;->a:Lcom/gamesafe/ano/g$a;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/gamesafe/ano/h;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gamesafe/ano/g$a;)V

    :cond_6
    :goto_2
    return-void

    :cond_7
    :goto_3
    const-string p1, "*#07#:OnnNyfHznnvbzWjs.kvmnzViyNcjr xhy zmm"

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "hnbwjs:"

    invoke-static {v0}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/gamesafe/ano/h;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "cdyz_hnbwjs:"

    invoke-static {v0}, Lcom/gamesafe/ano/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/gamesafe/ano/h;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
