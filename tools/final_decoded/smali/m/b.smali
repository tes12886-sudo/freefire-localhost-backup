.class public interface abstract Lm/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/b$a;
    }
.end annotation


# static fields
.field public static final a:Lm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lm/b$a;->a:Lm/b$a;

    new-instance v0, Lm/b$a$a;

    invoke-direct {v0}, Lm/b$a$a;-><init>()V

    sput-object v0, Lm/b;->a:Lm/b;

    new-instance v0, Lm/h0/e/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lm/h0/e/a;-><init>(Lm/q;ILl/y/c/f;)V

    return-void
.end method


# virtual methods
.method public abstract a(Lm/f0;Lm/d0;)Lm/b0;
.end method
