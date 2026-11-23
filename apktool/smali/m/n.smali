.class public interface abstract Lm/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/n$a;
    }
.end annotation


# static fields
.field public static final a:Lm/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm/n$a;->a:Lm/n$a;

    new-instance v0, Lm/n$a$a;

    invoke-direct {v0}, Lm/n$a$a;-><init>()V

    sput-object v0, Lm/n;->a:Lm/n;

    return-void
.end method


# virtual methods
.method public abstract a(Lm/v;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/v;",
            ")",
            "Ljava/util/List<",
            "Lm/m;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lm/v;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/v;",
            "Ljava/util/List<",
            "Lm/m;",
            ">;)V"
        }
    .end annotation
.end method
