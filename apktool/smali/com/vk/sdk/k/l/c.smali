.class public abstract Lcom/vk/sdk/k/l/c;
.super Lcom/vk/sdk/k/h;
.source ""


# instance fields
.field protected F:[Ljava/io/File;

.field protected u:J

.field protected v:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/h;-><init>()V

    return-void
.end method


# virtual methods
.method protected H(Ljava/lang/String;)Lcom/vk/sdk/k/i/e;
    .locals 2

    new-instance v0, Lcom/vk/sdk/k/i/e;

    iget-object v1, p0, Lcom/vk/sdk/k/l/c;->F:[Ljava/io/File;

    invoke-static {p1, v1}, Lcom/vk/sdk/k/i/b;->e(Ljava/lang/String;[Ljava/io/File;)Lcom/vk/sdk/k/i/b$d;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/vk/sdk/k/i/e;-><init>(Lcom/vk/sdk/k/i/b$d;)V

    return-object v0
.end method
