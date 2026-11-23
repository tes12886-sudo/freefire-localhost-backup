.class final Lo/c$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/h<",
        "Lm/c0;",
        "Lm/c0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lo/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/c$b;

    invoke-direct {v0}, Lo/c$b;-><init>()V

    sput-object v0, Lo/c$b;->a:Lo/c$b;

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

    check-cast p1, Lm/c0;

    invoke-virtual {p0, p1}, Lo/c$b;->b(Lm/c0;)Lm/c0;

    return-object p1
.end method

.method public b(Lm/c0;)Lm/c0;
    .locals 0

    return-object p1
.end method
