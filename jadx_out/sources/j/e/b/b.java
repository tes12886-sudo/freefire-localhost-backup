package j.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public static final b c = new b(-1, "");
    private final int a;
    private final String b;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(int i2, Exception exc) {
        this(i2, a(exc));
    }

    public b(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    private b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public b(Exception exc) {
        this(-1, a(exc));
    }

    public b(String str) {
        this(-1, str);
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            String str = this.b;
            String str2 = bVar.b;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a * 31;
        String str = this.b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.a + ", message='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }
}
