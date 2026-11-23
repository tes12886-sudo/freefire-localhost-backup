.class public final Lm/w$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Lm/w$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/w$b;

    invoke-direct {v0}, Lm/w$b;-><init>()V

    sput-object v0, Lm/w$b;->a:Lm/w$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
