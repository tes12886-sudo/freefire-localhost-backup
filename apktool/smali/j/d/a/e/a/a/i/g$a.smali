.class public Lj/d/a/e/a/a/i/g$a;
.super Ljava/lang/Exception;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput p1, p0, Lj/d/a/e/a/a/i/g$a;->a:I

    iput-object p2, p0, Lj/d/a/e/a/a/i/g$a;->b:Ljava/lang/String;

    return-void
.end method
