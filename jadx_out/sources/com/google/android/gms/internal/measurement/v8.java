package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.z8;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class v8<MessageType extends z8<MessageType, BuilderType>, BuilderType extends v8<MessageType, BuilderType>> extends k7<MessageType, BuilderType> {
    private final MessageType a;
    protected MessageType b;
    protected boolean c = false;

    protected v8(MessageType messagetype) {
        this.a = messagetype;
        this.b = (MessageType) messagetype.w(4, null, null);
    }

    private static final void o(MessageType messagetype, MessageType messagetype2) {
        la.a().b(messagetype.getClass()).e(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.measurement.ea
    public final /* bridge */ /* synthetic */ da h() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final /* bridge */ /* synthetic */ k7 k(byte[] bArr, int i2, int i3) throws i9 {
        r(bArr, 0, i3, l8.a());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final /* bridge */ /* synthetic */ k7 m(byte[] bArr, int i2, int i3, l8 l8Var) throws i9 {
        r(bArr, 0, i3, l8Var);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.k7
    protected final /* bridge */ /* synthetic */ k7 n(l7 l7Var) {
        q((z8) l7Var);
        return this;
    }

    public final MessageType p() {
        MessageType messagetype = (MessageType) T();
        boolean z = true;
        byte bByteValue = ((Byte) messagetype.w(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zA = la.a().b(messagetype.getClass()).a(messagetype);
                messagetype.w(2, true != zA ? null : messagetype, null);
                z = zA;
            }
        }
        if (z) {
            return messagetype;
        }
        throw new cb(messagetype);
    }

    public final BuilderType q(MessageType messagetype) {
        if (this.c) {
            s();
            this.c = false;
        }
        o(this.b, messagetype);
        return this;
    }

    public final BuilderType r(byte[] bArr, int i2, int i3, l8 l8Var) throws i9 {
        if (this.c) {
            s();
            this.c = false;
        }
        try {
            la.a().b(this.b.getClass()).f(this.b, bArr, 0, i3, new o7(l8Var));
            return this;
        } catch (i9 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw i9.a();
        }
    }

    protected void s() {
        MessageType messagetype = (MessageType) this.b.w(4, null, null);
        o(messagetype, this.b);
        this.b = messagetype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.a.w(5, null, null);
        buildertype.q(T());
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.ca
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public MessageType T() {
        if (this.c) {
            return this.b;
        }
        MessageType messagetype = this.b;
        la.a().b(messagetype.getClass()).c(messagetype);
        this.c = true;
        return this.b;
    }
}
