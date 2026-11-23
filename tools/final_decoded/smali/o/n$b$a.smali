.class Lo/n$b$a;
.super Ln/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/n$b;-><init>(Lm/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/n$b;


# direct methods
.method constructor <init>(Lo/n$b;Ln/x;)V
    .locals 0

    iput-object p1, p0, Lo/n$b$a;->b:Lo/n$b;

    invoke-direct {p0, p2}, Ln/g;-><init>(Ln/x;)V

    return-void
.end method


# virtual methods
.method public I(Ln/b;J)J
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ln/g;->I(Ln/b;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lo/n$b$a;->b:Lo/n$b;

    iput-object p1, p2, Lo/n$b;->e:Ljava/io/IOException;

    throw p1
.end method
