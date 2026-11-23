.class final Lj/e/b/h/a/c$b;
.super Lj/e/b/h/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/e/b/h/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/e/b/h/a/b<",
        "Lj/e/b/h/g;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/e/b/h/a/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lj/e/b/h/a/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic b(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lj/e/b/h/g;

    const-string v1, "otpId"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "otp"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lj/e/b/h/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
