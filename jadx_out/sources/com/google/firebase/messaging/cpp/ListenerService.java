package com.google.firebase.messaging.cpp;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: loaded from: classes.dex */
public class ListenerService extends FirebaseMessagingService {
    private final c a;

    public ListenerService() {
        this(c.a());
    }

    public ListenerService(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        b.a("FIREBASE_LISTENER", "onDeletedMessages");
        this.a.f(this, null, "deleted_messages", null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        this.a.e(this, remoteMessage, false, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageSent(String str) {
        b.a("FIREBASE_LISTENER", String.format("onMessageSent messageId=%s", str));
        this.a.f(this, str, "send_event", null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        b.a("FIREBASE_LISTENER", String.format("onNewToken token=%s", str));
        RegistrationIntentService.writeTokenToInternalStorage(this, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onSendError(String str, Exception exc) {
        b.a("FIREBASE_LISTENER", String.format("onSendError messageId=%s exception=%s", str, exc.toString()));
        this.a.f(this, str, "send_error", exc.toString());
    }
}
