.class final Lo/c$c;
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
    name = "c"
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
.field static final a:Lo/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/c$c;

    invoke-direct {v0}, Lo/c$c;-><init>()V

    sput-object v0, Lo/c$c;->a:Lo/c$c;

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

    invoke-virtual {p0, p1}, Lo/c$c;->b(Lm/e0;)Lm/e0;

    return-object p1
.end method

.method public b(Lm/e0;)Lm/e0;
    .locals 0

    return-object p1
.end method
