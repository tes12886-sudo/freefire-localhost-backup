.class final synthetic Lcom/google/firebase/messaging/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/google/firebase/messaging/FirebaseMessaging;

.field private final d:Lcom/google/firebase/installations/FirebaseInstallationsApi;

.field private final e:Lcom/google/firebase/messaging/Metadata;

.field private final f:Lcom/google/firebase/messaging/GmsRpc;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/messaging/Metadata;Lcom/google/firebase/messaging/GmsRpc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/u0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/messaging/u0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/firebase/messaging/u0;->c:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p4, p0, Lcom/google/firebase/messaging/u0;->d:Lcom/google/firebase/installations/FirebaseInstallationsApi;

    iput-object p5, p0, Lcom/google/firebase/messaging/u0;->e:Lcom/google/firebase/messaging/Metadata;

    iput-object p6, p0, Lcom/google/firebase/messaging/u0;->f:Lcom/google/firebase/messaging/GmsRpc;

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/messaging/u0;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/firebase/messaging/u0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/google/firebase/messaging/u0;->c:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v3, p0, Lcom/google/firebase/messaging/u0;->d:Lcom/google/firebase/installations/FirebaseInstallationsApi;

    iget-object v4, p0, Lcom/google/firebase/messaging/u0;->e:Lcom/google/firebase/messaging/Metadata;

    iget-object v5, p0, Lcom/google/firebase/messaging/u0;->f:Lcom/google/firebase/messaging/GmsRpc;

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/messaging/TopicsSubscriber;->i(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/messaging/Metadata;Lcom/google/firebase/messaging/GmsRpc;)Lcom/google/firebase/messaging/TopicsSubscriber;

    move-result-object v0

    return-object v0
.end method
