.class public final Ll/v/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll/v/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/v/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll/v/c$b<",
        "Ll/v/b;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Ll/v/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll/v/b$a;

    invoke-direct {v0}, Ll/v/b$a;-><init>()V

    sput-object v0, Ll/v/b$a;->a:Ll/v/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
