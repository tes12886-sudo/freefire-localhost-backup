.class public final Lm/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/b$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:Lm/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/b$a;

    invoke-direct {v0}, Lm/b$a;-><init>()V

    sput-object v0, Lm/b$a;->a:Lm/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
