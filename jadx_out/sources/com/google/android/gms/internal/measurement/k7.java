package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l7;

/* JADX INFO: loaded from: classes.dex */
public abstract class k7<MessageType extends l7<MessageType, BuilderType>, BuilderType extends k7<MessageType, BuilderType>> implements ca {
    @Override // com.google.android.gms.internal.measurement.ca
    public final /* bridge */ /* synthetic */ ca F(byte[] bArr, l8 l8Var) {
        m(bArr, 0, bArr.length, l8Var);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final /* bridge */ /* synthetic */ ca O(byte[] bArr) {
        k(bArr, 0, bArr.length);
        return this;
    }

    public abstract BuilderType k(byte[] bArr, int i2, int i3);

    @Override // com.google.android.gms.internal.measurement.ca
    public final /* bridge */ /* synthetic */ ca l(da daVar) {
        if (!h().getClass().isInstance(daVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        n((l7) daVar);
        return this;
    }

    public abstract BuilderType m(byte[] bArr, int i2, int i3, l8 l8Var);

    protected abstract BuilderType n(MessageType messagetype);
}
