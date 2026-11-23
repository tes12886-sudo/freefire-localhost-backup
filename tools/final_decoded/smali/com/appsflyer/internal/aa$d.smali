.class final Lcom/appsflyer/internal/aa$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field final valueOf:Ljava/lang/String;

.field private final values:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/aa$d;->valueOf:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/appsflyer/internal/aa$d;->values:Z

    return-void
.end method


# virtual methods
.method final valueOf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appsflyer/internal/aa$d;->values:Z

    return v0
.end method
