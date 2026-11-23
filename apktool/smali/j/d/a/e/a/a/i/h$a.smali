.class public Lj/d/a/e/a/a/i/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:[[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0xd

    new-array v0, v0, [[Ljava/lang/String;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "INTEGER PRIMARY KEY"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    aput-object v2, v0, v4

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "FILEIDX"

    aput-object v3, v2, v4

    const-string v3, "INTEGER UNIQUE"

    aput-object v3, v2, v5

    aput-object v2, v0, v5

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "URI"

    aput-object v3, v2, v4

    const-string v3, "TEXT"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "FN"

    aput-object v6, v2, v4

    const-string v6, "TEXT UNIQUE"

    aput-object v6, v2, v5

    const/4 v6, 0x3

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "ETAG"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/4 v3, 0x4

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "TOTALBYTES"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    const/4 v6, 0x5

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "CURRENTBYTES"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/4 v6, 0x6

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "LASTMOD"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/4 v6, 0x7

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "STATUS"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/16 v6, 0x8

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "CONTROL"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/16 v6, 0x9

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "FAILCOUNT"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/16 v6, 0xa

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v6, "RETRYAFTER"

    aput-object v6, v2, v4

    aput-object v3, v2, v5

    const/16 v6, 0xb

    aput-object v2, v0, v6

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "REDIRECTCOUNT"

    aput-object v2, v1, v4

    aput-object v3, v1, v5

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sput-object v0, Lj/d/a/e/a/a/i/h$a;->a:[[Ljava/lang/String;

    return-void
.end method
