.class public abstract Lj/d/c/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lj/d/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lj/d/c/c;
    .locals 1

    sget-object v0, Lj/d/c/c;->a:Lj/d/c/c;

    if-nez v0, :cond_0

    new-instance v0, Lj/d/c/d;

    invoke-direct {v0}, Lj/d/c/d;-><init>()V

    sput-object v0, Lj/d/c/c;->a:Lj/d/c/c;

    :cond_0
    sget-object v0, Lj/d/c/c;->a:Lj/d/c/c;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
.end method

.method public abstract b(Ljava/lang/CharSequence;)I
.end method
