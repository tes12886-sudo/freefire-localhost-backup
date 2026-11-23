package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class cl extends Observable {
    private long AFInAppEventParameterName;
    public final String AFInAppEventType;
    final Runnable AFKeystoreWrapper;
    public final Map<String, Object> values = new HashMap();
    public a valueOf = a.NOT_STARTED;

    public enum a {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public cl(String str, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.AFInAppEventType = str;
    }

    public final void AFInAppEventType() {
        this.AFInAppEventParameterName = System.currentTimeMillis();
        this.valueOf = a.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.cl.2
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                cl.this.AFKeystoreWrapper.run();
            }
        });
    }

    public final void AFKeystoreWrapper() {
        this.values.put("source", this.AFInAppEventType);
        this.values.putAll(new ci());
        this.values.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName));
        this.valueOf = a.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void AFKeystoreWrapper(Context context);
}
