.class final Lj/e/a/a/a$d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/e/a/a/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:Ljavax/crypto/SecretKey;

.field final b:Ljavax/crypto/SecretKey;


# direct methods
.method constructor <init>(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e/a/a/a$d$a;->a:Ljavax/crypto/SecretKey;

    iput-object p2, p0, Lj/e/a/a/a$d$a;->b:Ljavax/crypto/SecretKey;

    return-void
.end method
