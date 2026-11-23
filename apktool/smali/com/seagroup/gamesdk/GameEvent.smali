.class public Lcom/seagroup/gamesdk/GameEvent;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final data:Landroid/os/Parcelable;
    .annotation runtime Lj/d/d/y/c;
        value = "data"
    .end annotation
.end field

.field private final timestamp:J
    .annotation runtime Lj/d/d/y/c;
        value = "ts"
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation runtime Lj/d/d/y/c;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JLandroid/os/Parcelable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/seagroup/gamesdk/GameEvent;->type:Ljava/lang/String;

    iput-wide p2, p0, Lcom/seagroup/gamesdk/GameEvent;->timestamp:J

    iput-object p4, p0, Lcom/seagroup/gamesdk/GameEvent;->data:Landroid/os/Parcelable;

    return-void
.end method
