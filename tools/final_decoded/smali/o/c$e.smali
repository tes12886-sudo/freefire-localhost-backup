.class final Lo/c$e;
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
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/h<",
        "Lm/e0;",
        "Ll/s;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lo/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/c$e;

    invoke-direct {v0}, Lo/c$e;-><init>()V

    sput-object v0, Lo/c$e;->a:Lo/c$e;

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

    invoke-virtual {p0, p1}, Lo/c$e;->b(Lm/e0;)Ll/s;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm/e0;)Ll/s;
    .locals 0

    invoke-virtual {p1}, Lm/e0;->close()V

    sget-object p1, Ll/s;->a:Ll/s;

    return-object p1
.end method
