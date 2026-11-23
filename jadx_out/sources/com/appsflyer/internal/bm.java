package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bm<Body> {
    final int AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public final Body AFKeystoreWrapper;

    public bm(Body body, int i2, boolean z) {
        this.AFKeystoreWrapper = body;
        this.AFInAppEventParameterName = i2;
        this.AFInAppEventType = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bm.class == obj.getClass()) {
            bm bmVar = (bm) obj;
            if (this.AFInAppEventParameterName != bmVar.AFInAppEventParameterName || this.AFInAppEventType != bmVar.AFInAppEventType) {
                return false;
            }
            Body body = this.AFKeystoreWrapper;
            Body body2 = bmVar.AFKeystoreWrapper;
            if (body != null) {
                return body.equals(body2);
            }
            if (body2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Body body = this.AFKeystoreWrapper;
        return ((((body != null ? body.hashCode() : 0) * 31) + this.AFInAppEventParameterName) * 31) + (this.AFInAppEventType ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{body=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", statusCode=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", isSuccessful=");
        sb.append(this.AFInAppEventType);
        sb.append('}');
        return sb.toString();
    }

    public final boolean valueOf() {
        return this.AFInAppEventType;
    }
}
