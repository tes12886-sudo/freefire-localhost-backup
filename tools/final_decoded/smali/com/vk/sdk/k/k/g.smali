.class public abstract Lcom/vk/sdk/k/k/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 0

    invoke-static {p0, p1}, Lcom/vk/sdk/k/k/b;->d(Ljava/lang/Object;Lorg/json/JSONObject;)Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lcom/vk/sdk/k/k/g;

    return-object p1
.end method
