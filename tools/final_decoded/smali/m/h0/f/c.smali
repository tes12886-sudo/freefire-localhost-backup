.class public final Lm/h0/f/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/f/c$b;,
        Lm/h0/f/c$a;
    }
.end annotation


# static fields
.field public static final c:Lm/h0/f/c$a;


# instance fields
.field private final a:Lm/b0;

.field private final b:Lm/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm/h0/f/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/h0/f/c$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/h0/f/c;->c:Lm/h0/f/c$a;

    return-void
.end method

.method public constructor <init>(Lm/b0;Lm/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/f/c;->a:Lm/b0;

    iput-object p2, p0, Lm/h0/f/c;->b:Lm/d0;

    return-void
.end method


# virtual methods
.method public final a()Lm/d0;
    .locals 1

    iget-object v0, p0, Lm/h0/f/c;->b:Lm/d0;

    return-object v0
.end method

.method public final b()Lm/b0;
    .locals 1

    iget-object v0, p0, Lm/h0/f/c;->a:Lm/b0;

    return-object v0
.end method
