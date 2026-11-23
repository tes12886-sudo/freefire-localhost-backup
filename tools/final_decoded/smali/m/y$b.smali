.class public final Lm/y$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/y$b$a;
    }
.end annotation


# static fields
.field public static final c:Lm/y$b$a;


# instance fields
.field private final a:Lm/u;

.field private final b:Lm/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm/y$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/y$b$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/y$b;->c:Lm/y$b$a;

    return-void
.end method

.method private constructor <init>(Lm/u;Lm/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/y$b;->a:Lm/u;

    iput-object p2, p0, Lm/y$b;->b:Lm/c0;

    return-void
.end method

.method public synthetic constructor <init>(Lm/u;Lm/c0;Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm/y$b;-><init>(Lm/u;Lm/c0;)V

    return-void
.end method


# virtual methods
.method public final a()Lm/c0;
    .locals 1

    iget-object v0, p0, Lm/y$b;->b:Lm/c0;

    return-object v0
.end method

.method public final b()Lm/u;
    .locals 1

    iget-object v0, p0, Lm/y$b;->a:Lm/u;

    return-object v0
.end method
