.class public Lj/g/a/a/a/y/k/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Object<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lj/g/a/a/a/y/k/a;

.field private final b:Lj/g/a/a/a/y/k/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/y/k/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj/g/a/a/a/y/k/a;Lj/g/a/a/a/y/k/d;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/y/k/a;",
            "Lj/g/a/a/a/y/k/d<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/g/a/a/a/y/k/c;->a:Lj/g/a/a/a/y/k/a;

    iput-object p2, p0, Lj/g/a/a/a/y/k/c;->b:Lj/g/a/a/a/y/k/d;

    iput-object p3, p0, Lj/g/a/a/a/y/k/c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/y/k/c;->a:Lj/g/a/a/a/y/k/a;

    invoke-interface {v0}, Lj/g/a/a/a/y/k/a;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lj/g/a/a/a/y/k/c;->b:Lj/g/a/a/a/y/k/d;

    iget-object v2, p0, Lj/g/a/a/a/y/k/c;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lj/g/a/a/a/y/k/d;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/y/k/c;->a:Lj/g/a/a/a/y/k/a;

    invoke-interface {v0}, Lj/g/a/a/a/y/k/a;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lj/g/a/a/a/y/k/c;->c:Ljava/lang/String;

    iget-object v3, p0, Lj/g/a/a/a/y/k/c;->b:Lj/g/a/a/a/y/k/d;

    invoke-interface {v3, p1}, Lj/g/a/a/a/y/k/d;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {v0, p1}, Lj/g/a/a/a/y/k/a;->b(Landroid/content/SharedPreferences$Editor;)Z

    return-void
.end method
