.class public final Lm/n$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/n$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:Lm/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/n$a;

    invoke-direct {v0}, Lm/n$a;-><init>()V

    sput-object v0, Lm/n$a;->a:Lm/n$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
