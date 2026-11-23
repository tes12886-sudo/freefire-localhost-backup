.class public final Ll/a0/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/a0/d;
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

    invoke-direct {p0}, Ll/a0/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Ll/a0/d;
    .locals 1

    new-instance v0, Ll/a0/d;

    invoke-direct {v0, p1, p2, p3}, Ll/a0/d;-><init>(III)V

    return-object v0
.end method
