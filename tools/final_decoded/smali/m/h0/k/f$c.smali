.class public abstract Lm/h0/k/f$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# static fields
.field public static final a:Lm/h0/k/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/h0/k/f$c$a;

    invoke-direct {v0}, Lm/h0/k/f$c$a;-><init>()V

    sput-object v0, Lm/h0/k/f$c;->a:Lm/h0/k/f$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lm/h0/k/f;Lm/h0/k/m;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract c(Lm/h0/k/i;)V
.end method
