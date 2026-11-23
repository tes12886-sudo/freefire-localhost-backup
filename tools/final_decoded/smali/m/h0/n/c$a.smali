.class public final Lm/h0/n/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/n/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lm/h0/n/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/X509TrustManager;)Lm/h0/n/c;
    .locals 1

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/h0/l/h;->c(Ljavax/net/ssl/X509TrustManager;)Lm/h0/n/c;

    move-result-object p1

    return-object p1
.end method
