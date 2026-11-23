.class final Lj/d/a/c/f/g/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/i/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/i/d<",
        "Lcom/google/firebase/messaging/d1/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lj/d/a/c/f/g/a;

.field private static final b:Lcom/google/firebase/i/c;

.field private static final c:Lcom/google/firebase/i/c;

.field private static final d:Lcom/google/firebase/i/c;

.field private static final e:Lcom/google/firebase/i/c;

.field private static final f:Lcom/google/firebase/i/c;

.field private static final g:Lcom/google/firebase/i/c;

.field private static final h:Lcom/google/firebase/i/c;

.field private static final i:Lcom/google/firebase/i/c;

.field private static final j:Lcom/google/firebase/i/c;

.field private static final k:Lcom/google/firebase/i/c;

.field private static final l:Lcom/google/firebase/i/c;

.field private static final m:Lcom/google/firebase/i/c;

.field private static final n:Lcom/google/firebase/i/c;

.field private static final o:Lcom/google/firebase/i/c;

.field private static final p:Lcom/google/firebase/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj/d/a/c/f/g/a;

    invoke-direct {v0}, Lj/d/a/c/f/g/a;-><init>()V

    sput-object v0, Lj/d/a/c/f/g/a;->a:Lj/d/a/c/f/g/a;

    const-string v0, "projectNumber"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->b:Lcom/google/firebase/i/c;

    const-string v0, "messageId"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->c:Lcom/google/firebase/i/c;

    const-string v0, "instanceId"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->d:Lcom/google/firebase/i/c;

    const-string v0, "messageType"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->e:Lcom/google/firebase/i/c;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->f:Lcom/google/firebase/i/c;

    const-string v0, "packageName"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->g:Lcom/google/firebase/i/c;

    const-string v0, "collapseKey"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->h:Lcom/google/firebase/i/c;

    const-string v0, "priority"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->i:Lcom/google/firebase/i/c;

    const-string v0, "ttl"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->j:Lcom/google/firebase/i/c;

    const-string v0, "topic"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->k:Lcom/google/firebase/i/c;

    const-string v0, "bulkId"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->l:Lcom/google/firebase/i/c;

    const-string v0, "event"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->m:Lcom/google/firebase/i/c;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->n:Lcom/google/firebase/i/c;

    const-string v0, "campaignId"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->o:Lcom/google/firebase/i/c;

    const-string v0, "composerLabel"

    invoke-static {v0}, Lcom/google/firebase/i/c;->a(Ljava/lang/String;)Lcom/google/firebase/i/c$b;

    move-result-object v0

    new-instance v1, Lj/d/a/c/f/g/b0;

    invoke-direct {v1}, Lj/d/a/c/f/g/b0;-><init>()V

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lj/d/a/c/f/g/b0;->a(I)Lj/d/a/c/f/g/b0;

    invoke-virtual {v1}, Lj/d/a/c/f/g/b0;->b()Lj/d/a/c/f/g/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/i/c$b;->b(Ljava/lang/annotation/Annotation;)Lcom/google/firebase/i/c$b;

    invoke-virtual {v0}, Lcom/google/firebase/i/c$b;->a()Lcom/google/firebase/i/c;

    move-result-object v0

    sput-object v0, Lj/d/a/c/f/g/a;->p:Lcom/google/firebase/i/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/firebase/messaging/d1/a;

    check-cast p2, Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->b:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->c:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->d:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->e:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->i()Lcom/google/firebase/messaging/d1/a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->f:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->m()Lcom/google/firebase/messaging/d1/a$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->g:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->h:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->i:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->j:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->c(Lcom/google/firebase/i/c;I)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->k:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->l:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->m:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->f()Lcom/google/firebase/messaging/d1/a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->n:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->o:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lcom/google/firebase/i/e;->b(Lcom/google/firebase/i/c;J)Lcom/google/firebase/i/e;

    sget-object v0, Lj/d/a/c/f/g/a;->p:Lcom/google/firebase/i/c;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/d1/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/google/firebase/i/e;->f(Lcom/google/firebase/i/c;Ljava/lang/Object;)Lcom/google/firebase/i/e;

    return-void
.end method
