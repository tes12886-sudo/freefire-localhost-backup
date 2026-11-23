package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class b extends a {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f455k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new h.f.a(), new h.f.a(), new h.f.a());
    }

    private b(Parcel parcel, int i2, int i3, String str, h.f.a<String, Method> aVar, h.f.a<String, Method> aVar2, h.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.d = new SparseIntArray();
        this.f453i = -1;
        this.f454j = 0;
        this.f455k = -1;
        this.e = parcel;
        this.f = i2;
        this.f451g = i3;
        this.f454j = i2;
        this.f452h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
        } else {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i2) {
        this.e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f453i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int iDataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(iDataPosition - i3);
            this.e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f454j;
        if (i2 == this.f) {
            i2 = this.f451g;
        }
        return new b(parcel, iDataPosition, i2, this.f452h + "  ", this.a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i2 = this.e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i2) {
        while (this.f454j < this.f451g) {
            int i3 = this.f455k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.f454j);
            int i4 = this.e.readInt();
            this.f455k = this.e.readInt();
            this.f454j += i4;
        }
        return this.f455k == i2;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i2) {
        a();
        this.f453i = i2;
        this.d.put(i2, this.e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }
}
