.class public interface abstract Lm/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/q$a;
    }
.end annotation


# static fields
.field public static final a:Lm/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm/q$a;->a:Lm/q$a;

    new-instance v0, Lm/q$a$a;

    invoke-direct {v0}, Lm/q$a$a;-><init>()V

    sput-object v0, Lm/q;->a:Lm/q;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end method
