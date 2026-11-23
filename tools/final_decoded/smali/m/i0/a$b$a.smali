.class public final Lm/i0/a$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/i0/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/i0/a$b$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:Lm/i0/a$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/i0/a$b$a;

    invoke-direct {v0}, Lm/i0/a$b$a;-><init>()V

    sput-object v0, Lm/i0/a$b$a;->a:Lm/i0/a$b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
