.class final synthetic Lcom/google/firebase/messaging/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/events/b;


# instance fields
.field private final a:Lcom/google/firebase/messaging/FirebaseMessaging$AutoInit;


# direct methods
.method constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging$AutoInit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/c0;->a:Lcom/google/firebase/messaging/FirebaseMessaging$AutoInit;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/events/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/c0;->a:Lcom/google/firebase/messaging/FirebaseMessaging$AutoInit;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging$AutoInit;->c(Lcom/google/firebase/events/a;)V

    return-void
.end method
