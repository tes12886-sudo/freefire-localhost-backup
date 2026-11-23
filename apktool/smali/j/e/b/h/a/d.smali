.class public final Lj/e/b/h/a/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/e/b/h/a/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/e/b/h/a/a/c<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj/e/b/h/a/d;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Lj/e/b/h/a/d;->a:Ljava/lang/Object;

    return-object p1
.end method
