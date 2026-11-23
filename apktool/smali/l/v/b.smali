.class public interface abstract Ll/v/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll/v/c$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll/v/b$a;
    }
.end annotation


# static fields
.field public static final a:Ll/v/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ll/v/b$a;->a:Ll/v/b$a;

    sput-object v0, Ll/v/b;->a:Ll/v/b$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ll/v/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/v/a<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract b(Ll/v/a;)Ll/v/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ll/v/a<",
            "-TT;>;)",
            "Ll/v/a<",
            "TT;>;"
        }
    .end annotation
.end method
