.class public interface abstract Lm/i0/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/i0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/i0/a$b$a;
    }
.end annotation


# static fields
.field public static final a:Lm/i0/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm/i0/a$b$a;->a:Lm/i0/a$b$a;

    new-instance v0, Lm/i0/a$b$a$a;

    invoke-direct {v0}, Lm/i0/a$b$a$a;-><init>()V

    sput-object v0, Lm/i0/a$b;->a:Lm/i0/a$b;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)V
.end method
