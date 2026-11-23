.class final Lo/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/h<",
        "Lm/e0;",
        "Lm/e0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lo/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/c$a;

    invoke-direct {v0}, Lo/c$a;-><init>()V

    sput-object v0, Lo/c$a;->a:Lo/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm/e0;

    invoke-virtual {p0, p1}, Lo/c$a;->b(Lm/e0;)Lm/e0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm/e0;)Lm/e0;
    .locals 1

    :try_start_0
    invoke-static {p1}, Lo/y;->a(Lm/e0;)Lm/e0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lm/e0;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lm/e0;->close()V

    throw v0
.end method
