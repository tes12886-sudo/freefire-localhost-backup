.class public abstract Lj/d/a/c/f/g/k;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj/d/a/c/f/g/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/c/f/g/e;

    invoke-direct {v0}, Lj/d/a/c/f/g/e;-><init>()V

    sget-object v1, Lj/d/a/c/f/g/j;->a:Lcom/google/firebase/i/h/a;

    invoke-interface {v1, v0}, Lcom/google/firebase/i/h/a;->a(Lcom/google/firebase/i/h/b;)V

    invoke-virtual {v0}, Lj/d/a/c/f/g/e;->b()Lj/d/a/c/f/g/f;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/k;->a:Lj/d/a/c/f/g/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 2

    sget-object v0, Lj/d/a/c/f/g/k;->a:Lj/d/a/c/f/g/f;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v0, p0, v1}, Lj/d/a/c/f/g/f;->a(Ljava/lang/Object;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lcom/google/firebase/messaging/d1/b;
.end method
